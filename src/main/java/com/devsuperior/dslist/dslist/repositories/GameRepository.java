package com.devsuperior.dslist.dslist.repositories;

import com.devsuperior.dslist.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
