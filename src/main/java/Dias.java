public class Dias {

    private String dia;
    private String estadoCielo;
    private byte temperatura;

    public Dias() {


    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getEstadoCielo() {
        return estadoCielo;
    }

    public void setEstadoCielo(String estadoCielo) {
        this.estadoCielo = estadoCielo;
    }

    public byte getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(byte temperatura) {
        this.temperatura = temperatura;
    }

    @Override

    public String toString() {
        return "Dias{" +
                "dia='" + dia + '\'' +
                ", estadoCielo='" + estadoCielo + '\'' +
                ", temperatura=" + temperatura +
                '}';
    }
}
