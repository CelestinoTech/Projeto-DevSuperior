package com.devsuperior.ds_list.dto;

import com.devsuperior.ds_list.entities.Game;

public class GameMinDto {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	String shortDescription;
	
	public GameMinDto(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
}
