package Media;

public class boletimAluno {
    public static void main (String args []){
       mediaAluno();
    }

    private static void mediaAluno() {
        System.out.println("***Media dos Alunos***");

        double nota1 = 5.5;
        double nota2 = 6.5;
        double nota3 = 7.5;
        double nota4 = 8.5;

        double media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("Media final:" + media);
    }
}
