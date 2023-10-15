package ListaStrings.Ex3;

public class Ponto {
    private float x,y;


    public Ponto( float x, float y){
        this.x = x;
        this.y = y;
    }

    public float distancia(Ponto p){
        float distancia;

        distancia = (float)Math.sqrt(Math.pow(this.x - p.x,2) + Math.pow(this.y - p.y,2));
        return distancia;
    }
}
