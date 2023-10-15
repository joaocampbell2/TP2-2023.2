package ListaStrings.Ex1;

public class Main {
    public static void main(String[] args){
    int x = 3,y =2 ,a= 1,l = 5;
    int x2 = 6,y2 = 9,a2 = 10,l2 = 4;

    Retangulo julia = new Retangulo(x,y,a,l);
    Retangulo joao = new Retangulo(x2,y2,a2,l2);

    boolean b;

    b = julia.intersecao(joao);

    b = joao.intersecao(julia);


    }


// To fix






}
