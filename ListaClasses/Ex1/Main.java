package ListaClasses.Ex1;


import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner ent = new Scanner(System.in);

        int matricula, creditos, b;
        float valor,desconto;
        boolean bolsista;

        System.out.println("Insira matrícula: ");
        matricula = ent.nextInt();
        System.out.println("Insira quantidade de créditos: ");
        creditos = ent.nextInt();
        System.out.println("Insira valor dos créditos: ");
        valor = ent.nextFloat();

        System.out.println("Insira 1 para bolsista e 2 para nao bolsista");

        b = ent.nextInt();

        if (b == 1){
            bolsista = true;
            System.out.println("Insira porcentagem de desconto do bolsista: ");
            desconto     = ent.nextFloat();
        }
        else {
            bolsista = false;
            desconto = 0;
        }

        Aluno Joao = new Aluno(matricula,creditos,valor,desconto,bolsista);

        Joao.setMatricula(123);

        System.out.println("Matrícula: " + Joao.getMatricula());



        float mensalidade = Joao.valorMensalidade();


        System.out.println("O valor da mensalidade é: " + mensalidade);




    }
}
