package com.ProjetoFesta.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjetoFesta.Entities.Tema;
import com.ProjetoFesta.Repository.TemaRepository;

@Service
public class TemaService {
	 @Autowired
	    private TemaRepository TemaRepository;

	    public TemaService(TemaRepository TemaRepository) {
	        this.TemaRepository = TemaRepository;
	    }
	    public Tema saveTema(Tema Tema) {
	        return TemaRepository.save(Tema);
	    }
	    public  Tema getTemaById(Long id) {
	        return TemaRepository.findById(id).orElse(null);

	    }
	    public List<Tema> getAllTema(){
	        return TemaRepository.findAll();
	    }
	    public void deletetTema(Long id) {
	        TemaRepository.deleteById(id);
	    }
	
}
