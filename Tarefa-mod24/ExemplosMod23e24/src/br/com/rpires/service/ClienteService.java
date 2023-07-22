package br.com.rpires.service;

import br.com.rpires.dao.ClienteDao;
import br.com.rpires.dao.ClienteDaoMock;
import br.com.rpires.dao.IClienteDao;

/**
 * @author rodrigo.pires
 */
public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        //clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }


    public String salvar() {

        return null;
    }

    public String buscar() {
        return null;
    }
    public String atualizar() {
        return null;
    }
    public String excluir() {
        return null;
    }
}
