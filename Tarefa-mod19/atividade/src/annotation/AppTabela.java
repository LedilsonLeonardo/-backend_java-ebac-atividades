package annotation;

import javax.swing.*;

public class AppTabela {
    public static void main(String[] args) throws NoSuchFieldException {
        TabelaEndereco tabela = new TabelaEndereco();

        Class<?> tabelaClass = tabela.getClass();
        String nomeTabela = tabelaClass.getSimpleName();

        System.out.println("Nome da tabela: " + nomeTabela);

        AnotacaoTabela anotacao = tabela.getClass().getDeclaredField("nome").getAnnotation(AnotacaoTabela.class);
        String valorNome = anotacao.nome();
        String cidade = anotacao.cidade();
        long numeroApartamento = anotacao.numeroApartamento();

        System.out.println("Valor do nome: " + valorNome);
        System.out.println("Cidade: " + cidade);
        System.out.println("Número do apartamento: " + numeroApartamento);
    }
}