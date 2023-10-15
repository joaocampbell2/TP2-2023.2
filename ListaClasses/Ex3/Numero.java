package ListaClasses.Ex3;

public class Numero {
    private float n;

    public Numero(float n){
        this.n = n;
    }
    public float fatorial(){
        float fatorial = 1;

        for(int i = (int) n; i > 1; i--){
            fatorial *= i;
        }

        return fatorial;
    }

    public float potencia(int x){
        float potencia;

        if (x == 0){
            potencia = 0;
        }
        else{
            potencia = n;
            for(int i = 1; i < x;i++){
                potencia *= n;
            }
        }

        return potencia;
    }

    public int parteInteira(){

        return (int)n;
    }

    public float parteDecimal(){
        float decimal;

        decimal = n %  (int) n;

        return decimal;
    }

    public float inverte(){
        float inverso;

        inverso = 1 / n;

        return inverso;
    }

}
