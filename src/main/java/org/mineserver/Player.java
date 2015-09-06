package org.mineserver;

public class Player {
	
	private String username;
	private String displayName;
	
	public String getName(){
		return username;
	}
	
	public String getDisplayName(){
		return displayName;
	}
	
	public void setDisplayName(String name){
		this.displayName = name;
	}
	
}