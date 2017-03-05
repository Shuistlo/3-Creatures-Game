package model;

import java.util.ArrayList;
import java.util.Observable;

/**
 * class Imagepositions part of Model 
 */
public class ImagePositions extends Observable{
	private Character farmer;
	private Character fox;
	private Character beans;
	private Character goose;
	private Character[] creatureList;
	private int boat;
	private int boatCapacity;
	private boolean gameFailed;
    private ArrayList<Character> leftGrass = new ArrayList<>();
    private ArrayList<Character> rightGrass = new ArrayList<>();

    /*
     * default constructor
     */
	public ImagePositions() {
		creatureList = new Character[4];
        farmer = new Character();
        beans = new Character();
        fox = new Character();
        goose = new Character();
        creatureList[0] = farmer;
        creatureList[1] = beans;
        creatureList[2] = fox;
        creatureList[3] = goose;
        for(Character c : creatureList) {
            rightGrass.add(c);
        }
		
		this.boat = 2;
		this.gameFailed = false;
	}
	
	/*
	 * moves boat and passengers left
	 */
	public void moveBoatRight(){
		if(farmer.isOnBoat()&& boat == 1){
			for(int i =0; i<4; i++){
				if(creatureList[i].isOnBoat()){
					creatureList[i].setPosition(2);

				}
			}
			boat = 2;
			gameFailed();
			setChanged();
			notifyObservers();
		}
	}
	
	/*
	 * moves boat and passengers right
	 */
	public void moveBoatLeft(){
		if(farmer.isOnBoat() && boat == 2){
			for(int i =0; i<4; i++){
				if(creatureList[i].isOnBoat()){
					creatureList[i].setPosition(1);
				}
			}
			boat = 1;
			gameFailed();
			setChanged();
			notifyObservers();
		}
	}
	
	/*
	 * gets character on boat
	 */
	public void getOnBoat(Character newChar){
		if(!newChar.isOnBoat()){
			int distance = Math.abs(boat - newChar.getPosition());
			if((isBoatFull() == false) && (distance ==1)){
				if(rightGrass.contains(newChar)){
					newChar.changeBoatStatus(true);
					rightGrass.remove(newChar);
					newChar.setPosition(boat);
					boatCapacity = boatCapacity +1;
					setChanged();
					notifyObservers();
				}
				if(leftGrass.contains(newChar)){
					newChar.changeBoatStatus(true);
					leftGrass.remove(newChar);
					newChar.setPosition(boat);
					boatCapacity = boatCapacity +1;
					setChanged();
					notifyObservers();
				}
				newChar.setPosition(boat);	
			}
		}
	}
	
	/*
	 * gets character off boat
	 */
	public void getOffBoat(Character newChar){
		if(newChar.isOnBoat()){
			newChar.changeBoatStatus(false);
			if(boat == 2){
				rightGrass.add(newChar);
				newChar.setPosition(3);
				boatCapacity = boatCapacity -1;
				setChanged();
				notifyObservers();
			}
			if(boat == 1){
				leftGrass.add(newChar);
				newChar.setPosition(0);
				boatCapacity = boatCapacity -1;
				setChanged();
				notifyObservers();
			}
		}
	}
	
	/*
	 * returns if the boat is full
	 */
	public boolean isBoatFull(){
		if(this.boatCapacity == 2){
			return true;
		}
		return false;
	}

	/*
	 * returns if the game has failed
	 */
    public void gameFailed(){
        if(leftGrass.contains(goose) && !leftGrass.contains(farmer)){
            if (leftGrass.contains(fox) || leftGrass.contains(beans)){
                gameFailed = true;
            }
        } else
        if(rightGrass.contains(goose) && !rightGrass.contains(farmer)){
            if (rightGrass.contains(fox) || rightGrass.contains(beans)){
                gameFailed = true;
            }
        }
    }
	
    /*
     * gets boat
     */
	public int getBoat(){
		return this.boat;
	}
	
	/*
	 * gets fox
	 */
	public Character getFox(){
		return this.fox;
	}
	
	/*
	 * gets farmer
	 */
	public Character getFarmer(){
		return this.farmer;
	}
	
	/*
	 * gets goose
	 */
	public Character getGoose(){
		return this.goose;
	}
	
	/*
	 * gets beans
	 */
	public Character getBeans(){
		return this.beans;
	}
	
	/*
	 * returns if the game has failed
	 */
	public boolean getGameFailed(){
		return gameFailed;
	}
	
	/*
	 * moves a character left
	 */
	public void moveCharLeft(Character c){
    	if(c.getPosition() == 3){
    		getOnBoat(c);
    	}
    	if(c.getPosition() == 1){
    		getOffBoat(c);
    	}
	}
	
	/*
	 * moves a character right
	 */
	public void moveCharRight(Character c){
    	if(c.getPosition() == 0){
    		getOnBoat(c);
    	}
    	if(c.getPosition() == 2){
    		getOffBoat(c);
    	}
	}

	/*
	 * moves the farmer left
	 */
    public void moveFarmerLeft(){
    	moveCharLeft(farmer);
    }
    
    /*
     * moves beans left
     */
    public void moveBeansLeft(){
    	moveCharLeft(beans);
    }
    
    /*
     * moves fox left
     */
    public void moveFoxLeft(){
    	moveCharLeft(fox);
    }
    
    /*
     * moves goose left
     */
    public void moveGooseLeft(){
    	moveCharLeft(goose);
    }
    
    /*
     * moves farmer right
     */
    public void moveFarmerRight(){
    	moveCharRight(farmer);
    }
    
    /*
     * moves beans right
     */
    public void moveBeansRight(){
    	moveCharRight(beans);
    }
    
    /*
     * moves fox right
     */
    public void moveFoxRight(){
    	moveCharRight(fox);
    }
    
    /*
     * move goose right
     */
    public void moveGooseRight(){
    	moveCharRight(goose);
    }
}
