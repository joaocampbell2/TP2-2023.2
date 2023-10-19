package Ex2;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);

        ArrayList a = new ArrayList(),b = new ArrayList<>(),c;
        int x,i = 0;

        do{
            System.out.println("Insira numeros na lista A (caso 0, programa encerra) : ");
            x = ent.nextInt();
            if (!a.contains(x)){
                a.add(x);
            }



        }while(x != 0);

        do{
            System.out.println("Insira numeros na lista B (caso 0, programa encerra) : ");
            x = ent.nextInt();
            if (!b.contains(x)){
                b.add(x);
            }


        }while(x != 0);

        c = new ArrayList<>(a);


        for (Object obj : b){
            if (!c.contains(obj)){
                c.add(obj);
            }

        }

        for (Object obj : c){
            System.out.println(obj);
        }




    }
}
