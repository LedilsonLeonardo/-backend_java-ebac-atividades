package pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Genero {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String espaco = "-,";
        String nomeL;
        List <Pessoa> lista = new ArrayList<>();

        Pessoa pessoa;

        System.out.println("Digite os nome e sexo da pessoa ");

       nomeL = s.nextLine();

       String nomeG [] = nomeL.split("[" + Pattern.quote(espaco)+"]");

       for (int i =0; i< nomeG.length; i++){
           pessoa = new Pessoa();
           pessoa.setNome(nomeG[i]);
           pessoa.setSexo(nomeG[i +1]);
           lista.add(pessoa);
           i++;
       }
        lista.stream()
                .filter
                        (p -> p.getSexo().equalsIgnoreCase("F"))
                .map(Pessoa::getNome)
                .forEach( System.out::println);

    }
}
