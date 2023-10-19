package ListaStrings.Ex17;

public class Fibonacci {
    public static int numero(int n){
        int fibonacci = 0;

        if (n <= 0){
            return -1;
        }
        else{
            if(n == 1){
                return 0;
            }
            else if(n == 2){
                return 1;
            }

            else{
                return numero(n - 1) + numero(n - 2);
            }
        }
    }
    public static boolean pertence(int n){
        int x,i = 1;
        do{
            x = numero(i);
            if (x == n){
                return true;
            }
            i++;
        }while(x < n);
        return false;

    }

    public static void imprime(int n){
        for ( int i = 1; i <= n; i++){
            System.out.println(numero(i));
        }
    }

}
