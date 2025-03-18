package com.ProjetoFesta.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjetoFesta.Entities.ItemTema;
import com.ProjetoFesta.Repository.ItemTemaRepository;

@Service
public class ItemTemaService {
	
	@Autowired
    private ItemTemaRepository ItemTemaRepository;

    public ItemTemaService(ItemTemaRepository ItemTemaRepository) {
        this.ItemTemaRepository = ItemTemaRepository;
    }
    public ItemTema saveItemTema(ItemTema ItemTema) {
        return ItemTemaRepository.save(ItemTema);
    }
    public  ItemTema getItemTemaById(Long id) {
        return ItemTemaRepository.findById(id).orElse(null);

    }
    public List<ItemTema> getAllItemTema(){
        return ItemTemaRepository.findAll();
    }
    public void deletetItemTema(Long id) {
    	ItemTemaRepository.deleteById(id);
    }

}
