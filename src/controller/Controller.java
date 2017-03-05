package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.ImagePositions;

/**
 * class Controller in controller
 */
public class Controller implements ActionListener{
	private ImagePositions imagePositions;

	/*
	 * default constructor
	 */
	public Controller(ImagePositions nIP) {
		this.imagePositions = nIP;
	}

	/*
	 * gets imagePositions
	 */
	public ImagePositions getIP(){
		return this.imagePositions;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonUnknown = (JButton) e.getSource();
		String name = buttonUnknown.getName();
		switch(name){
		case "jbuttonLBoat":
			imagePositions.moveBoatLeft();
			break;
		case "jbuttonRBoat":
			imagePositions.moveBoatRight();
			break;
		case "jbuttonLFox":
			imagePositions.moveFoxLeft();
			break;
		case "jbuttonRFox":
			imagePositions.moveFoxRight();
			break;
		case "jbuttonLGoose":
			imagePositions.moveGooseLeft();
			break;
		case "jbuttonRGoose":
			imagePositions.moveGooseRight();
			break;
		case "jbuttonLBeans":
			imagePositions.moveBeansLeft();
			break;
		case "jbuttonRBeans":
			imagePositions.moveBeansRight();
			break;
		case "jbuttonLFarmer":
			imagePositions.moveFarmerLeft();
			break;
		case "jbuttonRFarmer":
			imagePositions.moveFarmerRight();
			break;
		}
	}
}
