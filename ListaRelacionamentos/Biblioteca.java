package Ex9;
import java.util.ArrayList;
public class Biblioteca {
    private Livro[] livros = new Livro[1000];
    private Revista[] revistas = new Revista[1000];

    private void addAcervo(Revista r){

    }

    private void addAcervo(Livro r){

    }

    private void emprestar(){

    }

    private void listar(){
        for (Object livro : this.livros){
            System.out.print("Título: " + livro.titulo + "\nCondição: ");
            if(livro.emprestado){
                System.out.println("Emprestado");
            }
            else{
                System.out.println("Não Emprestado");

            }

        }
        System.out.println();
        for (Object revista : this.revistas){
            System.out.print("Título: " + revista.titulo + "\nCondição: ");
            if(revista.emprestado){
                System.out.println("Emprestado");
            }
            else{
                System.out.println("Não Emprestado");

            }

        }
    }











}
