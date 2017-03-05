package model;

/**
 * class Character part of model
 */
public class Character {
	private int position;
	private boolean onBoat;

	/*
	 * default constructor
	 */
	public Character() {
		this.position = 3;
		this.onBoat = false;
	}
	
	/*
	 * gets position
	 */
	public int getPosition(){
		return this.position;
	}
	
	/*
	 * sets position
	 */
	public void setPosition(int pos){
		if(checkBounds(pos)){
			this.position = pos;
		}
	}
	
	/*
	 * changes boat status
	 */
	public void changeBoatStatus(boolean newStatus){
		this.onBoat = newStatus;
	}
	
	/*
	 * returns if on boat
	 */
	public boolean isOnBoat(){
		return this.onBoat;
	}
	
	/*
	 * checks if requested position is in bounds
	 */
	public boolean checkBounds(int bounds){
		if((bounds <4) && (bounds > -1)){
			return true;
		}
		else{
			return false;
		}
	}
}
