package JunitTeste;

import java.util.List;
import java.util.Objects;

public class Pessoa {
    private  Long id;

    private String nome;

    private String sexo;

    private  Integer idade;

    public Pessoa(){}
    private Pessoa(Long id, String nome, String sexo, Integer idade){
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public List<Pessoa> listPessoas(){
        Pessoa pessoa1 = new Pessoa(1L, "Bianca", "Femenino", 28);
        Pessoa pessoa2 = new Pessoa(2L, "Alice", "Femenino", 16);
        Pessoa pessoa3 = new Pessoa(3L, "Marcos", "Masculino", 23);
        Pessoa pessoa4 = new Pessoa(4L, "Bruno", "Masculino", 55);
        Pessoa pessoa5 = new Pessoa(5L, "Juliana", "Femenino", 21);
        Pessoa pessoa6 = new Pessoa(6L, "Isabel", "Femenino", 22);
        Pessoa pessoa7 = new Pessoa(7L, "Jennifer", "Femenino", 28);

        return List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6, pessoa7);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }
}
