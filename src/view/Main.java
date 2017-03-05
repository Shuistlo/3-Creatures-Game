package view;

import controller.Controller;
import model.ImagePositions;

/*
 * tests model view and controller 
 */
public class Main {

	public static void main(String[] args) {
		ImagePositions iP = new ImagePositions();
		Controller controller = new Controller(iP);
		
		Puzzle puzzle = new Puzzle(iP, controller);
		iP.addObserver(puzzle);
		puzzle.setVisible(true);
	}

}
