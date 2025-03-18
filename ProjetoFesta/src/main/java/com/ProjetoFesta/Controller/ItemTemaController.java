package com.ProjetoFesta.Controller;

import java.util.List;
import com.ProjetoFesta.Entities.ItemTema;
import com.ProjetoFesta.Service.ItemTemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ItemTema")
public class ItemTemaController {

	 @Autowired
	    private final ItemTemaService itemtemaService;

	    public ItemTemaController(ItemTemaService itemtemaService) {
	        this.itemtemaService = itemtemaService;
	    }
	    @PostMapping
	    public ItemTema createItemTema(@RequestBody ItemTema itemtema) {
	        return itemtemaService.saveItemTema(itemtema);
	    }
	    @GetMapping("/{id}")
	    public ItemTema getItemTema(@PathVariable Long id) {
	        return itemtemaService.getItemTemaById(id);
	    }
	    @GetMapping
	    public List<ItemTema> getAllItemTema() {
	        return itemtemaService.getAllItemTema();
	    }
	    @DeleteMapping("/{id}")
	    public void deleteItemTema(@PathVariable Long id) {
	        itemtemaService.deletetItemTema(id);
	    }
}
