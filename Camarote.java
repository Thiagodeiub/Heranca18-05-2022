public class Camarote extends Ingresso {

    public Double adicional;

    public Double getAdicional() {
        return valor+150;
    }

    @Override
    public String toString() {
        return "CAMAROTE{" +
                "adicional=" + 150 +
                ", evento='" + evento + '\'' +
                ", dia='" + dia + '\'' +
                ", valor total=" + getAdicional() +
                '}';
    }
}
