package com.ProjetoFesta.Repository;

import com.ProjetoFesta.Entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}