package ListaStrings.Ex1;

public class Retangulo {
    private int x, y, a, l;

    public Retangulo(int x, int y, int a, int l){
        this.x = x;
        this.y = y;
        this.a = a;
        this.l = l;
    }

    public void desenhar(){
        System.out.printf("Retângulo (%d, %d, %d, %d)\n", x, y, a, l);
    }

    public boolean intersecao(Retangulo r){
        if (r.x >= this.l + this.x){
            return true;
        }
        if (r.y >= this.a + this.y){
            return true;
        }
        return false;
    }
}
