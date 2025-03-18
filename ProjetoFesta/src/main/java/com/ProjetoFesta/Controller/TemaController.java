package com.ProjetoFesta.Controller;

import java.util.List;

import com.ProjetoFesta.Entities.Tema;
import com.ProjetoFesta.Service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Tema")
public class TemaController {

	  @Autowired
	    private final TemaService temaService;

	    public TemaController(TemaService temaService) {
	        this.temaService = temaService;
	    }
	    @PostMapping
	    public Tema createTema(@RequestBody Tema tema) {
	        return temaService.saveTema(tema);
	    }
	    @GetMapping("/{id}")
	    public Tema getTema(@PathVariable Long id) {
	        return temaService.getTemaById(id);
	    }
	    @GetMapping
	    public List<Tema> getAllTema() {
	        return temaService.getAllTema();
	    }
	    @DeleteMapping("/{id}")
	    public void deleteTema(@PathVariable Long id) {
	        temaService.deletetTema(id);
	    }
	}


