import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.awt.*;
import java.util.ArrayList;

public class Manejador extends DefaultHandler {

    private ArrayList<Dias> dias = new ArrayList<Dias>();
    private Dias dia;
    private StringBuilder buffer = new StringBuilder();

    boolean tempMax = false;

    public ArrayList<Dias> getDias() {
        return dias;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);

        buffer.delete(0, buffer.length());

        switch (qName) {

            case "dia":

                dia = new Dias();
                dias.add(dia);
                dia.setDia(attributes.getValue("fecha"));

                break;

            case "temperatura":

            tempMax = true;


                break;





            case "estado_cielo":

                dia.setEstadoCielo(attributes.getValue("descripcion"));

                break;


        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);


        switch (qName) {


            case "dia":

                //   dia.setDia(buffer.toString());


                break;

            case "maxima":

            if (tempMax) {

                dia.setTemperatura(Byte.parseByte(buffer.toString()));

              //  System.out.println(buffer.toString());

            }

                break;

            case "temperatura":

                tempMax = false;

                //          dia.setTemperatura(Byte.parseByte(buffer.toString()));

                break;


            case "estado_cielo":


                //  dia.setEstadoCielo(buffer.toString());


                break;
        }


    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);

        buffer.append(ch, start, length);
    }
}
