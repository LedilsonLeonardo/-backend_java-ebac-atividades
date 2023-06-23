package dao;

import domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ClienteMapDAO implements IClienteDAO {

    //Chave do Long vai ser o Cpf é o valor Clinete
    private Map<Long, Cliente> map;

    //Criação de um construtor nome da class ClienteMapDAO

    public ClienteMapDAO() {
        this.map = new HashMap<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {

        if (this.map.containsKey(cliente.getCpf())) { // se tiver a chave no map não preciso inserir chave = cpf
            return false;
        }
        this.map.put(cliente.getCpf(), cliente);
        return true; // se não tiver a chave no map preciso inserir chave = cpf
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteCadastrado = this.map.get(cpf);
        if (clienteCadastrado != null) { //Se o cliente for diferente de Nulo tenho que remover ele do cadastro
            this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado); // chave que é CPF  (clienteCadastrado.getCpf() valor clienteCadastrado
        }
    }

    @Override
    public void alterar(Cliente cliente) { //|Cliente da tela = clienteCadastrado vem do mapa
        Cliente clienteCadastrado = this.map.get(cliente.getCpf());

        if (clienteCadastrado != null ){
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setRg(cliente.getRg());
            clienteCadastrado.setCel(cliente.getCel());
            clienteCadastrado.setEndereco(cliente.getEndereco());
            clienteCadastrado.setNumero(cliente.getNumero());
            clienteCadastrado.setCidade(cliente.getCidade());
            clienteCadastrado.setUf(cliente.getUf());
        }

    }

    @Override
    public Cliente consultar(Long cpf) { // se tiver no mapa ele retorna o cliente se não ele retorna nulo

       return this.map.get(cpf);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.map.values(); //pegar todos os valores do mapa
    }
}
