import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();

        SAXParser saxParser = saxParserFactory.newSAXParser();

        File file = new File("localidad_38023.xml");

        Manejador manejoncito = new Manejador();

        saxParser.parse(file, manejoncito);

        ArrayList<Dias> dias = manejoncito.getDias();


        for (Dias d : dias) {

            System.out.println(d);

            if (d.getDia().equals("2018-12-12")) {

                System.out.println("El miércoles " + d.getDia() + " lo encontraremos " + d.getEstadoCielo());

            }


        }
    }
}
