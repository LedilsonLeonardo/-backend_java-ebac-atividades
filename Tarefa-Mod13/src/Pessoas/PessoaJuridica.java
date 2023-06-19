package Pessoas;

public class PessoaJuridica {
    private String nomeJuridica;

    private String pessoaCnpj;

    public String getNomeJuridica() {
        return nomeJuridica;
    }
    public void setNomeJuridica(String nomeJuridica) {
        this.nomeJuridica = nomeJuridica;
    }

    public String getPessoaCnpj() {
        return pessoaCnpj;
    }
    public void setPessoaCnpj(String pessoaCnpj) {
        this.pessoaCnpj = pessoaCnpj;
    }
    public void imprimirPessoaJuridica(){
        System.out.println("\nPessoa Juridica é : " + this.nomeJuridica);
    }
    public void imprimirPessoaJuridicaCnpj(){
        System.out.println("Cnpj é : " + this.pessoaCnpj);
    }
}
