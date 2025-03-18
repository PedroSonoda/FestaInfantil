package com.ProjetoFesta.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ProjetoFesta.Entities.Endereco;
import com.ProjetoFesta.Repository.EnderecoRepository;

@Service
public class EnderecoService {

	 @Autowired
	    private final  EnderecoRepository EnderecoRepository;

	    public EnderecoService(EnderecoRepository EnderecoRepository) {
	        this.EnderecoRepository= EnderecoRepository;
	    }
	    public Endereco saveEndereco(Endereco Endereco) {
	        return EnderecoRepository.save(Endereco);
	    }
	    public  Endereco getEnderecoById(Long id) {
	        return EnderecoRepository.findById(id).orElse(null);

	    }
	    public List<Endereco> getAllEndereco(){
	        return EnderecoRepository.findAll();
	    }
	    public void deleteEndereco(Long id) {
	    	EnderecoRepository.deleteById(id);
	    }
}
