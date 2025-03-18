package com.ProjetoFesta.Controller;

import java.util.List;
import com.ProjetoFesta.Entities.Endereco;
import com.ProjetoFesta.Service.EnderecoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Endereço")
public class EnderecoController {

	@Autowired
    private final EnderecoService enderecoService;

    public EnderecoController(EnderecoService EnderecoService) {
        this.enderecoService = EnderecoService;
    }
    @PostMapping
    public Endereco createEndereco(@RequestBody Endereco Endereco) {
        return enderecoService.saveEndereco(Endereco);
    }
    @GetMapping("/{id}")
    public Endereco getEndereco(@PathVariable Long id) {
        return enderecoService.getEnderecoById(id);
    }
    @GetMapping
    public List<Endereco> getAllEndereco() {
        return enderecoService.getAllEndereco();
    }
    @DeleteMapping("/{id}")
    public void deleteEndereco(@PathVariable Long id) {
        enderecoService.deleteEndereco(id);
    }
}
