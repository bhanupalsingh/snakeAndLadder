package com.snl.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Player {
	private long id;
	private String name;
	private static AtomicInteger UID = new AtomicInteger(0);
	
	
	public Player(String name) {
		setId();
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId() {
		this.id = UID.incrementAndGet();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
