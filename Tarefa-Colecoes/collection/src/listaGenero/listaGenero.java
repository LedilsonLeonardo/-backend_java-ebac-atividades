package listaGenero;

public class listaGenero {
    public static  void main (String[]args){
        String nomes = "Joao, Ana, Marcos, Julia";
        String separarNomes [] = nomes.split(",");
        System.out.println("*Nomes*");
        System.out.println(nomes);
        System.out.println("*Femeninos*");

        System.out.println(separarNomes[1]);
        System.out.println(separarNomes[3]);

        System.out.println("*Masculinos*");

        System.out.println(separarNomes[0]);
        System.out.println(separarNomes[2]);

    }
}
