package Pessoas;

public class Programa {

    public static void main(String args[]) {

        PessoFisica pf = new PessoFisica();

        pf.setNomePessoa("Pires Física");

        pf.setPessoaCpf("1010");

        imprimirFisica(pf);

        PessoaJuridica pj = new PessoaJuridica();

        pj.setNomeJuridica("Pires Jurídica");

        pj.setPessoaCnpj("2020");

        imprimirJuridica(pj);
    }
    public static void imprimirFisica(PessoFisica pf) {

        pf.imprimirPessoaFisica();
        pf.imprimirPessoaFisicaCpf();
    }
    public  static  void imprimirJuridica(PessoaJuridica pj ){

        pj.imprimirPessoaJuridica();
        pj.imprimirPessoaJuridicaCnpj();
    }

}
