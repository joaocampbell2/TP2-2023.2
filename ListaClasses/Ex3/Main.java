package ListaClasses.Ex3;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);

        float n, fatorial, potencia, decimal, inverso;
        int inteiro;

        System.out.println("Insira seu numero: ");
        n = ent.nextFloat();

        Numero numero = new Numero(n);

        fatorial = numero.fatorial();
        potencia = numero.potencia(3);
        inteiro = numero.parteInteira();
        decimal = numero.parteDecimal();
        inverso = numero.inverte();

        System.out.println("Fatorial: " + fatorial);
        System.out.println("Potencia: " + potencia);
        System.out.println("Parte inteira: " + inteiro);
        System.out.println("Parte decimal: " + decimal);
        System.out.println("Inverso: " + inverso);
    }

}
