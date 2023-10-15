package ListaClasses.Ex1;
public class Aluno{
    private int matricula, quantCred;
    private float valorCred, desconto;
    private boolean bolsista;

    public Aluno(int mat, int cred, float valor, float desc, boolean bolsista){
        matricula = mat;
        quantCred = cred;
        valorCred = valor;
        desconto = desc / 100;
        this.bolsista = bolsista;

    }

    public int getMatricula(){

        return matricula;
    }

    public void setMatricula(int mat){

        matricula = mat;
    }


    public float valorMensalidade(){
        float total;

        total = quantCred * valorCred;

        if (bolsista){
            total *= desconto/100;
        }

        return total;
    }



}