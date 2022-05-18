public class Ingresso {

    public String evento;
    public String dia;
    public Double valor;

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Ingresso{" +
                "evento='" + evento + '\'' +
                ", dia='" + dia + '\'' +
                ", valor=" + valor +
                '}';
    }
//Crie uma classe Ingresso com os atributos: evento, data, valor;
    // Uma classe Camarote, que recebe os atributos de Ingresso e tem mais um adicional no valor de 150,00;
    // Uma classe VIP que recebe os atributos de Ingresso e tem mais um adicional de 200,00 e ainda o atributo tipo de bebida;
}
