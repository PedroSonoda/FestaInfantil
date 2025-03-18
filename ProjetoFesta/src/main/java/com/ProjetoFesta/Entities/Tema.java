package com.ProjetoFesta.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Tema")

public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nome")
    private String nome;


    @Column(name = "ValorAluguel")
    private  double valoraluguel;

    @Column(name = "CorToalha")
    private String cortoalha;

   
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

    public double getvaloraluguel() {
        return valoraluguel;
    }

    public void setvaloraluguel(double valoraluguel) {
        this.valoraluguel = valoraluguel;
    }

    public String getcortoalha() {
        return cortoalha;
    }

    public void setcortoalha(String cortoalha) {
        this.cortoalha = cortoalha;
    }
}
