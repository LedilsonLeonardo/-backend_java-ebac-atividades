package MediaAluno;

import java.util.Scanner;

public class Boletim {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media;
        String resposta;

       do { System.out.println("Digite a nota 1 ");
           nota1 = scanner.nextDouble();

           System.out.println("Digite a nota 2 ");
           nota2 = scanner.nextDouble();

           System.out.println("Digite a nota 3 ");
           nota3 = scanner.nextDouble();

           System.out.println("Digite a nota 4 ");
           nota4 = scanner.nextDouble();

           media = (nota1 + nota2 + nota3 + nota4) / 4;

           if (media >= 7) {
               System.out.println("Aluno Aprovado");
           } else if (media >= 4 && media <= 6) {
               System.out.println("Aluno em recuperação");
           } else {
               System.out.println("Aluno Reprovado.");
           }
           System.out.println("Deseja calcular o boletim de outro aluno?(Sim/Não) ");
           resposta = scanner.next();
       }while (resposta.equalsIgnoreCase("Sim"));
       System.out.println("Encerrado o programa");
    }

}
