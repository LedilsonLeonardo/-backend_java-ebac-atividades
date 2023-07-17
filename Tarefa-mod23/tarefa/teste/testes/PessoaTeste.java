package testes;

import JunitTeste.Pessoa;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PessoaTeste {

    @Test
    public void testeUnitPessoa() {

        String pessoaSexo = " ";
        List<Pessoa> pessoas = new Pessoa().listPessoas();
        for (Pessoa p : pessoas) {
            if (p.getSexo().equals("Femenino")) {
                pessoaSexo = p.getSexo();
                System.out.println("Nome da Pessoa do sexo F " + p.getNome() + " ID: " + p.getId());
            }
        }
        Assert.assertEquals("Femenino", pessoaSexo);
    }

}
