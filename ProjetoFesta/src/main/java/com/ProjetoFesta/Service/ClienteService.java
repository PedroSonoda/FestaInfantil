package com.ProjetoFesta.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjetoFesta.Entities.Cliente;
import com.ProjetoFesta.Repository.ClienteRepository;

@Service
public class ClienteService {

	   @Autowired
	    private ClienteRepository ClienteRepository;

	    public ClienteService(ClienteRepository ClienteRepository) {
	        this.ClienteRepository = ClienteRepository;
	    }
	    public Cliente saveCliente(Cliente cliente) {
	        return ClienteRepository.save(cliente);
	    }
	    public  Cliente getClienteById(Long id) {
	        return ClienteRepository.findById(id).orElse(null);

	    }
	    public List<Cliente> getAllCliente(){
	        return ClienteRepository.findAll();
	    }
	    public void deleteCliente(Long id) {
	        ClienteRepository.deleteById(id);
	    }
	}

