package com.alandev.dslist.dto;

import com.alandev.dslist.entities.GameList;

public class GameListDto {

	private long id;
	private String name;

	public GameListDto() {
	}
	
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
