package Pessoas;

public class PessoFisica {
    private String nomePessoa;
    private String pessoaCpf;

    public String getNomePessoa() {
        return nomePessoa;
    }
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getPessoaCpf() {
        return pessoaCpf;
    }
    public void setPessoaCpf(String pessoaCpf) {
        this.pessoaCpf = pessoaCpf;
    }
    public void imprimirPessoaFisica(){
        System.out.println("\nPessoa Física é : " + this.nomePessoa);
    }
    public  void imprimirPessoaFisicaCpf(){
        System.out.println("Cpf é: "+ this.pessoaCpf);
    }
}
