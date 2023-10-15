package ListaClasses.Ex10;

public class Piramide {
    int n;

    public Piramide(int n){
        this.n = n;
    }

    public void setN(int n){
        this.n = n;
    }

    public void desenhar(){
        for(int i = 0; i <= 4; i++) {
            for(int l = 0; l < n-i; l++){
                System.out.print(" ");
            }
            for(int j = 1; j < i; j++){
                System.out.print(j);
            }
            for(int k = i; k >= 1; k--){
                System.out.printf("%d", k);
            }
            System.out.println();
        }
    }
}

