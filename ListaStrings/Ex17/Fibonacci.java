package ListaStrings.Ex17;

public class Fibonacci {
    public static int numero(int n){
        int fibonacci = 0;

        if(n == 1 ){
            return 0;
        }
        else if( n== 2){
            return 1;
        }

        else{
            return numero(n - 1) + numero(n - 2);
        }
    }
    boolean pertence(int n){
    return true;
    }
    void imprime(int n){
    }

}
