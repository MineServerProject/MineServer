package org.mineserver;

public class Player {
	
	private String username;
	private String displayName;
	
	private double health = 20;
	private int experience = 0;
	
	private boolean connected = false;
	private boolean spawned = false;
	
	public double getHealth(){
		return this.health;
	}
	
	public int getExperience(){
		return this.experience;
	}
	
	public boolean isConnected(){
		return this.connected;
	}
	
	public boolean isSpawned(){
		return this.spawned;
	}
	
	public String getName(){
		return this.username;
	}
	
	public String getDisplayName(){
		return this.displayName;
	}
	
	public void setDisplayName(String name){
		this.displayName = name;
	}
	
}