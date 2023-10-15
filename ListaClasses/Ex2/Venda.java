package ListaClasses.Ex2;

public class Venda {
    private float valor, desconto;

    public Venda(float valor, float desconto){
        this.valor = valor;
        this.desconto = desconto/100;

    }

    public float getValor(){
        return valor;
    }
    public void setValor(float valor){
        this.valor = valor;
    }

    public float valorMensalidade(int parcelas){
        float mensalidade;

        mensalidade = (valor - (valor * desconto)) / parcelas;

        return mensalidade;
    }

}
