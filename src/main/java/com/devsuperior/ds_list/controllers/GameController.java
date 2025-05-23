package com.devsuperior.ds_list.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.ds_list.dto.GameDto;
import com.devsuperior.ds_list.dto.GameMinDto;
import com.devsuperior.ds_list.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	@Autowired
	private GameService gameService;
	
	
	@GetMapping(value = "/{id}")
	public GameDto findById(@PathVariable Long id){
		GameDto result = gameService.findById(id);
		return result;
	}
	
	@GetMapping
	public List<GameMinDto> findAll(){
		List<GameMinDto> result = gameService.findAll();
		return result;
	}
	
	

}
