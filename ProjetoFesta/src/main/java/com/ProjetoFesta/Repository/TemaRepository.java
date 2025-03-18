package com.ProjetoFesta.Repository;

import com.ProjetoFesta.Entities.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository extends JpaRepository<Tema,Long> {
}