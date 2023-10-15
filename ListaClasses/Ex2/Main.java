package ListaClasses.Ex2;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float valor, desconto,mensalidade;
        int parcelas;

        System.out.println("Insira valor da venda: ");
        valor = ent.nextFloat();

        System.out.println("Insira desconto: ");
        desconto = ent.nextFloat();

        System.out.println("Insira parcelas: ");
        parcelas = ent.nextInt();

        Venda cadeira = new Venda(valor,desconto);



        mensalidade = cadeira.valorMensalidade(parcelas);

        System.out.println("O valor da mensalidade é " + mensalidade);

    }
}