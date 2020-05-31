package com.snl.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Board {
	private int id;
	private int size;
	private List<Ladder> ladder;
	private List<Snake> snake;
	
	private HashMap<Long , Integer> playerPieces;
	
	
	
	public Board(int size) {
		this.size = size;
		ladder = new ArrayList<>();
		snake = new ArrayList<>();
		playerPieces = new HashMap<>();
	}



	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	public List<Ladder> getLadders() {
		return ladder;
	}



	public void setLadders(List<Ladder> ladder) {
		this.ladder = ladder;
	}



	public List<Snake> getSnakes() {
		return snake;
	}



	public void setSnakes(List<Snake> snake) {
		this.snake = snake;
	}



	public HashMap<Long, Integer> getPlayerPieces() {
		return playerPieces;
	}



	public void setPlayerPieces(HashMap<Long, Integer> playerPieces) {
		this.playerPieces = playerPieces;
	}
	
	
	

}
