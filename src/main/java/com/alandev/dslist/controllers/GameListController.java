package com.alandev.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alandev.dslist.dto.GameListDto;
import com.alandev.dslist.dto.GameMinDto;
import com.alandev.dslist.services.GameListService;
import com.alandev.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;

	@GetMapping
	public List<GameListDto> findAll() {
		List<GameListDto> result = gameListService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDto> findbyList(@PathVariable Long listId) {
		List<GameMinDto> result = gameService.findByList(listId);
		return result;
	}
}
