package com.devsuperior.ds_list.dto;

import com.devsuperior.ds_list.entities.GameList;

public class GameListDto {
	
	private long id;
	private String name;
	
	public GameListDto(GameList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
}
