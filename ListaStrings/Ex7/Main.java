package ListaStrings.Ex7;

public class Main {
    public static void main(String[] args){
    String palavra = "A torre da derrota";
    String pal = "";

    palavra = palavra.replaceAll(" ", "");

    for (int i = palavra.length() - 1;i>= 0; i--){
        pal += palavra.charAt(i);
    }

    if(pal.equalsIgnoreCase(palavra)){
        System.out.println("É palindromo");
    }
    else{
        System.out.println("Num é");
    }


    System.out.println(palavra);
    System.out.println(pal);
    }
}
