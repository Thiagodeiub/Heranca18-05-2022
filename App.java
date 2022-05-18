import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Camarote camarote = new Camarote();
        Ingresso ingresso = new Ingresso();
        Vip vip = new Vip();


        System.out.println("Evento");
        camarote.setEvento(scan.nextLine());
        System.out.println("Data");
        camarote.setDia(scan.nextLine());
        System.out.println("Entre com o valor do ingresso sem o acréscimo. Ele será calculado automaticamente");
        camarote.setValor(scan.nextDouble());

        System.out.println(camarote);


    }

}


//Crie uma classe Ingresso com os atributos: evento, data, valor;
// Uma classe Camarote, que recebe os atributos de Ingresso e tem mais um adicional no valor de 150,00;
// Uma classe VIP que recebe os atributos de Ingresso e tem mais um adicional de 200,00 e ainda o atributo tipo de bebida;