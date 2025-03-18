package com.ProjetoFesta.Controller;


import java.util.List;
import com.ProjetoFesta.Entities.Cliente;
import com.ProjetoFesta.Service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Cliente")
public class ClienteController {

	 @Autowired
	    private final ClienteService clienteService;

	    public ClienteController(ClienteService ClienteService) {
	        this.clienteService = ClienteService;
	    }
	    @PostMapping
	    public Cliente createCliente(@RequestBody Cliente Cliente) {
	        return clienteService.saveCliente(Cliente);
	    }
	    @GetMapping("/{id}")
	    public Cliente getCliente(@PathVariable Long id) {
	        return clienteService.getClienteById(id);
	    }
	    @GetMapping
	    public List<Cliente> getAllCliente() {
	        return clienteService.getAllCliente();
	    }
	    @DeleteMapping("/{id}")
	    public void deleteCliente(@PathVariable Long id) {
	        clienteService.deleteCliente(id);
	    }
}
