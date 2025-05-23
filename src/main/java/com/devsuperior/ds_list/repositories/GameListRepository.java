package com.devsuperior.ds_list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.ds_list.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
