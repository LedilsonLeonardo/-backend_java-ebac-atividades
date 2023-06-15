package listaSimples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class listaSimples {

    public static void main (String[] args){
        System.out.println("**lista Ordenada**");
        List<String> lista = new ArrayList<>();
        lista.add("Jonas");
        lista.add("Maria");
        lista.add("Ana");
        lista.add("Marcos");
        Collections.sort(lista);
        System.out.println(lista);
    }
}
