package Pessoas;

public class Programa {
    public static void main(String[] args) {
        infoPessoaFisica();
        infoPessoaJuridica();
    }

    private static void infoPessoaFisica() {
        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Peres");
        pf.setCelular("1234-6789");
        pf.setEndereco("Rua x ");
        pf.setPessoaCpf("101.045.789-00");

        imprimirPf(pf);
    }

    private static void infoPessoaJuridica() {

        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Ana");
        pj.setCelular("3465-6789");
        pj.setEndereco("Rua Z ");
        pj.setPessoaCnpj("32.333.444-7");

        imprimirPj(pj);
    }

    public static void imprimirPf(PessoaFisica pf) {
        System.out.println("Nome: " + pf.getNome());
        System.out.println("Cpf: " + pf.getPessoaCpf());
        System.out.println("Cel: " + pf.getCelular());
        System.out.println("Endereço: " + pf.getEndereco());
        System.out.println("--------------------------------");
    }

    private static void imprimirPj(PessoaJuridica pj) {
        System.out.println("Nome: " + pj.getNome());
        System.out.println("Cnpj: " + pj.getPessoaCnpj());
        System.out.println("Cel: " + pj.getCelular());
        System.out.println("Endereço: " + pj.getEndereco());

    }
}

