public class Vip extends Ingresso {

    public Double adicional;
    public String tipoDeBebida;

    public Double getAdicional() {
        return valor + 200;
    }

    public void setAdicional(Double adicional) {
        this.adicional = adicional;
    }

    public String getTipoDeBebida() {
        return tipoDeBebida;
    }

    public void setTipoDeBebida(String tipoDeBebida) {
        this.tipoDeBebida = tipoDeBebida;
    }

    @Override
    public String toString() {
        return "VIP{" +
                "evento='" + evento + '\'' +
                ", dia='" + dia + '\'' +
                ", adicional=" + 200 +
                ", valor total=" + getAdicional() +
                ", tipoDeBebida='" + tipoDeBebida + '\'' +
                '}';
    }
}
