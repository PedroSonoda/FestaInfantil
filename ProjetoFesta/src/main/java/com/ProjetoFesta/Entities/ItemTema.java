package com.ProjetoFesta.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "ItemTema")
public class ItemTema {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "Nome")
	    private String nome;

	    @Column(name = "Descrição")
	    private String descricao;

	   
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }


	    public String getdescricao() {
	        return descricao;
	    }

	    public void setdescricao(String descricao) {
	        this.descricao = descricao;
	    }
}
