package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Controller;
import model.ImagePositions;
import model.Character;

import javax.swing.ImageIcon;

/**
 * puzzle class part of view
 */
public class Puzzle extends JFrame implements Observer{
	private ImagePositions imagePositions;
	private Controller controller;
	private JLabel jLabelIconBoatLeft;
    private JLabel jLabelIconFoxLeft;
    private JLabel jLabelIconGooseLeft;
    private JLabel jLabelIconBeanLeft;
    private JLabel jLabelIconFarmerLeft;
    private JLabel jLabelIconBoatRight;
    private JLabel jLabelIconFoxRight;
    private JLabel jLabelIconGooseRight;
    private JLabel jLabelIconBeanRight;
    private JLabel jLabelIconFarmerRight;
    private JLabel jLabelIconFoxRightWater;
    private JLabel jLabelIconGooseRightWater;
    private JLabel jLabelIconBeanRightWater;
    private JLabel jLabelIconFarmerRightWater;
    private JLabel jLabelIconFoxLeftWater;
    private JLabel jLabelIconGooseLeftWater;
    private JLabel jLabelIconBeanLeftWater;
    private JLabel jLabelIconFarmerLeftWater;
	
    /*
     * default constructor
     */
	public Puzzle(ImagePositions nIP, Controller nC){
		super("Fox, Goose and Bag of Beans");
		this.imagePositions = nIP;
		this.controller = nC;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(2000, 900);
		initWidgets();	
	}
	
	/*
	 * initialize widgets
	 */
	public void initWidgets(){		
		JButton jbuttonLBoat = new JButton("<");
		jbuttonLBoat.setName("jbuttonLBoat");
		jbuttonLBoat.addActionListener(controller);
		JButton jbuttonRBoat = new JButton(">");
		jbuttonRBoat.setName("jbuttonRBoat");
		jbuttonRBoat.addActionListener(controller);
		
		JButton jbuttonLFox = new JButton("<");
		jbuttonLFox.setName("jbuttonLFox");
		jbuttonLFox.addActionListener(controller);
		JButton jbuttonRFox = new JButton(">");
		jbuttonRFox.setName("jbuttonRFox");
		jbuttonRFox.addActionListener(controller);
		
		JButton jbuttonLGoose = new JButton("<");
		jbuttonLGoose.setName("jbuttonLGoose");
		jbuttonLGoose.addActionListener(controller);
		JButton jbuttonRGoose = new JButton(">");
		jbuttonRGoose.setName("jbuttonRGoose");
		jbuttonRGoose.addActionListener(controller);
		
		JButton jbuttonLBeans = new JButton("<");
		jbuttonLBeans.setName("jbuttonLBeans");
		jbuttonLBeans.addActionListener(controller);
		JButton jbuttonRBeans = new JButton(">");
		jbuttonRBeans.setName("jbuttonRBeans");
		jbuttonRBeans.addActionListener(controller);
		
		JButton jbuttonLFarmer = new JButton("<");
		jbuttonLFarmer.setName("jbuttonLFarmer");
		jbuttonLFarmer.addActionListener(controller);
		JButton jbuttonRFarmer = new JButton(">");
		jbuttonRFarmer.setName("jbuttonRFarmer");
		jbuttonRFarmer.addActionListener(controller);
			
			JLabel jLabelBoat = new JLabel();
			JLabel jLabelFox = new JLabel();
			JLabel jLabelGoose = new JLabel();
			JLabel jLabelBeans = new JLabel();
			JLabel jLabelFarmer = new JLabel();
			
			jLabelBoat.setText("Boat:");
			jLabelFox.setText("Fox:");
			jLabelGoose.setText("Goose:");
			jLabelBeans.setText("Beans:");
			jLabelFarmer.setText("Farmer:");
			
			ImageIcon water = new ImageIcon("src/resource/water.png");
			ImageIcon grass = new ImageIcon("src/resource/grass.png");
			ImageIcon boat = new ImageIcon("src/resource/boat.png");
			ImageIcon farmer = new ImageIcon("src/resource/farmer.png");
			ImageIcon beans = new ImageIcon("src/resource/beans.png");
			ImageIcon fox = new ImageIcon("src/resource/fox.png");
			ImageIcon goose = new ImageIcon("src/resource/goose.png");
			
			JLabel jLabelIconWater = new JLabel(water);
			JLabel jLabelIconLGrass = new JLabel(grass);
			JLabel jLabelIconRGrass = new JLabel(grass);
			jLabelIconBoatLeft = new JLabel(boat);
			jLabelIconFoxLeft = new JLabel(fox);
			jLabelIconGooseLeft = new JLabel(goose);
			jLabelIconBeanLeft = new JLabel(beans);
			jLabelIconFarmerLeft = new JLabel(farmer);
			
			jLabelIconBoatRight = new JLabel(boat);
			jLabelIconFoxRight = new JLabel(fox);
			jLabelIconGooseRight = new JLabel(goose);
			jLabelIconBeanRight = new JLabel(beans);
			jLabelIconFarmerRight = new JLabel(farmer);
			
			this.setLayout(new BorderLayout());
			
			JPanel jpCenter = new JPanel();
			JPanel jpEast = new JPanel();
			JPanel jpWest = new JPanel();
			JPanel jpSouth = new JPanel();
			
			jpCenter.add(jLabelIconWater);
			
			jpEast.add(jLabelIconRGrass);
			jpEast.add(jLabelIconFoxRight);
			jpEast.add(jLabelIconGooseRight);
			jpEast.add(jLabelIconBeanRight);
			jpEast.add(jLabelIconFarmerRight);
			
			jpWest.add(jLabelIconLGrass);
			jpWest.add(jLabelIconFoxLeft);
			jpWest.add(jLabelIconGooseLeft);
			jpWest.add(jLabelIconBeanLeft);
			jpWest.add(jLabelIconFarmerLeft);
			
			jpSouth.setLayout(new GridLayout(1, 15));
			
			jpSouth.add(jLabelBoat);
			jpSouth.add(jbuttonLBoat);
			jpSouth.add(jbuttonRBoat);
			
			jpSouth.add(jLabelFox);
			jpSouth.add(jbuttonLFox);
			jpSouth.add(jbuttonRFox);
			
			jpSouth.add(jLabelGoose);
			jpSouth.add(jbuttonLGoose);
			jpSouth.add(jbuttonRGoose);
			
			jpSouth.add(jLabelBeans);
			jpSouth.add(jbuttonLBeans);
			jpSouth.add(jbuttonRBeans);
			
			jpSouth.add(jLabelFarmer);
			jpSouth.add(jbuttonLFarmer);
			jpSouth.add(jbuttonRFarmer);
			
			jLabelIconRGrass.setLayout(new GridLayout(4,1));
			jLabelIconLGrass.setLayout(new GridLayout(4,1));
			
			jLabelIconWater.setLayout(new GridLayout(5,2));
			
			jLabelIconRGrass.add(jLabelIconFoxRight);
			jLabelIconRGrass.add(jLabelIconGooseRight);
			jLabelIconRGrass.add(jLabelIconBeanRight);
			jLabelIconRGrass.add(jLabelIconFarmerRight);
			
			jLabelIconLGrass.add(jLabelIconFoxLeft);
			jLabelIconLGrass.add(jLabelIconGooseLeft);
			jLabelIconLGrass.add(jLabelIconBeanLeft);
			jLabelIconLGrass.add(jLabelIconFarmerLeft);
			
			jLabelIconFoxLeft.setVisible(false);
			jLabelIconGooseLeft.setVisible(false);
			jLabelIconBeanLeft.setVisible(false);
			jLabelIconFarmerLeft.setVisible(false);
			
			jLabelIconFoxRightWater = new JLabel(fox);
			jLabelIconGooseRightWater = new JLabel(goose);
			jLabelIconBeanRightWater = new JLabel(beans);
			jLabelIconFarmerRightWater = new JLabel(farmer);
			
			jLabelIconFoxRightWater.setVisible(false);
			jLabelIconGooseRightWater.setVisible(false);
			jLabelIconBeanRightWater.setVisible(false);
			jLabelIconFarmerRightWater.setVisible(false);
			
			jLabelIconFoxLeftWater = new JLabel(fox);
			jLabelIconGooseLeftWater = new JLabel(goose);
			jLabelIconBeanLeftWater = new JLabel(beans);
			jLabelIconFarmerLeftWater = new JLabel(farmer);
			
			jLabelIconFoxLeftWater.setVisible(false);
			jLabelIconGooseLeftWater.setVisible(false);
			jLabelIconBeanLeftWater.setVisible(false);
			jLabelIconFarmerLeftWater.setVisible(false);
			jLabelIconBoatLeft.setVisible(false);
			
			jLabelIconWater.add(jLabelIconBoatLeft);
			jLabelIconWater.add(jLabelIconBoatRight);
			
			jLabelIconWater.add(jLabelIconFoxLeftWater);
			jLabelIconWater.add(jLabelIconFoxRightWater);
			
			jLabelIconWater.add(jLabelIconGooseLeftWater);
			jLabelIconWater.add(jLabelIconGooseRightWater);
			
			jLabelIconWater.add(jLabelIconBeanLeftWater);
			jLabelIconWater.add(jLabelIconBeanRightWater);
			
			jLabelIconWater.add(jLabelIconFarmerLeftWater);
			jLabelIconWater.add(jLabelIconFarmerRightWater);
			
			add(jpCenter, BorderLayout.CENTER);
			add(jpEast, BorderLayout.EAST);
			add(jpWest, BorderLayout.WEST);
			add(jpSouth, BorderLayout.SOUTH);
		}
	
	/*
	 * updates which fox icons are visible
	 */
	public void updateFox() {
	    Character fox = imagePositions.getFox();
	    if (fox.getPosition() == 0) {
	        jLabelIconFoxLeft.setVisible(true);
	        jLabelIconFoxLeftWater.setVisible(false);
	        jLabelIconFoxRightWater.setVisible(false);
	        jLabelIconFoxRight.setVisible(false);
	    } else if (fox.getPosition() == 1) {
	        jLabelIconFoxLeft.setVisible(false);
	        jLabelIconFoxLeftWater.setVisible(true);
	        jLabelIconFoxRightWater.setVisible(false);
	        jLabelIconFoxRight.setVisible(false);
	    } else if (fox.getPosition() == 2) {
	        jLabelIconFoxLeft.setVisible(false);
	        jLabelIconFoxLeftWater.setVisible(false);
	        jLabelIconFoxRightWater.setVisible(true);
	        jLabelIconFoxRight.setVisible(false);
	    } else if (fox.getPosition() == 3) {
	        jLabelIconFoxLeft.setVisible(false);
	        jLabelIconFoxLeftWater.setVisible(false);
	        jLabelIconFoxRightWater.setVisible(false);
	        jLabelIconFoxRight.setVisible(true);
	    }
	}
	
	/*
	 * updates which farmer icons are visible
	 */
	public void updateFarmer() {
	    Character farmer = imagePositions.getFarmer();
	    if (farmer.getPosition() == 0) {
	        jLabelIconFarmerLeft.setVisible(true);
	        jLabelIconFarmerLeftWater.setVisible(false);
	        jLabelIconFarmerRightWater.setVisible(false);
	        jLabelIconFarmerRight.setVisible(false);
	    } else if (farmer.getPosition() == 1) {
	        jLabelIconFarmerLeft.setVisible(false);
	        jLabelIconFarmerLeftWater.setVisible(true);
	        jLabelIconFarmerRightWater.setVisible(false);
	        jLabelIconFarmerRight.setVisible(false);
	    } else if (farmer.getPosition() == 2) {
	        jLabelIconFarmerLeft.setVisible(false);
	        jLabelIconFarmerLeftWater.setVisible(false);
	        jLabelIconFarmerRightWater.setVisible(true);
	        jLabelIconFarmerRight.setVisible(false);
	    } else if (farmer.getPosition() == 3) {
	        jLabelIconFarmerLeft.setVisible(false);
	        jLabelIconFarmerLeftWater.setVisible(false);
	        jLabelIconFarmerRightWater.setVisible(false);
	        jLabelIconFarmerRight.setVisible(true);
	    }
	}
	
	/*
	 * updates which goose icons are visible
	 */
	public void updateGoose() {
	    Character goose = imagePositions.getGoose();
	    if (goose.getPosition() == 0) {
	        jLabelIconGooseLeft.setVisible(true);
	        jLabelIconGooseLeftWater.setVisible(false);
	        jLabelIconGooseRightWater.setVisible(false);
	        jLabelIconGooseRight.setVisible(false);
	    } else if (goose.getPosition() == 1) {
	        jLabelIconGooseLeft.setVisible(false);
	        jLabelIconGooseLeftWater.setVisible(true);
	        jLabelIconGooseRightWater.setVisible(false);
	        jLabelIconGooseRight.setVisible(false);
	    } else if (goose.getPosition() == 2) {
	        jLabelIconGooseLeft.setVisible(false);
	        jLabelIconGooseLeftWater.setVisible(false);
	        jLabelIconGooseRightWater.setVisible(true);
	        jLabelIconGooseRight.setVisible(false);
	    } else if (goose.getPosition() == 3) {
	        jLabelIconGooseLeft.setVisible(false);
	        jLabelIconGooseLeftWater.setVisible(false);
	        jLabelIconGooseRightWater.setVisible(false);
	        jLabelIconGooseRight.setVisible(true);
	    }
	}
	
	/*
	 * updates which bean icons are visible
	 */
	public void updateBeans() {
	    Character beans = imagePositions.getBeans();
	    if (beans.getPosition() == 0) {
	        jLabelIconBeanLeft.setVisible(true);
	        jLabelIconBeanLeftWater.setVisible(false);
	        jLabelIconBeanRightWater.setVisible(false);
	        jLabelIconBeanRight.setVisible(false);
	    } else if (beans.getPosition() == 1) {
	        jLabelIconBeanLeft.setVisible(false);
	        jLabelIconBeanLeftWater.setVisible(true);
	        jLabelIconBeanRightWater.setVisible(false);
	        jLabelIconBeanRight.setVisible(false);
	    } else if (beans.getPosition() == 2) {
	        jLabelIconBeanLeft.setVisible(false);
	        jLabelIconBeanLeftWater.setVisible(false);
	        jLabelIconBeanRightWater.setVisible(true);
	        jLabelIconBeanRight.setVisible(false);
	    } else if (beans.getPosition() == 3) {
	        jLabelIconBeanLeft.setVisible(false);
	        jLabelIconBeanLeftWater.setVisible(false);
	        jLabelIconBeanRightWater.setVisible(false);
	        jLabelIconBeanRight.setVisible(true);
	    }
	}
	
	/*
	 * updates boat icon
	 */
	public void updateBoat() {
	    int boat = imagePositions.getBoat();
	    if (boat == 1) {
	        jLabelIconBoatLeft.setVisible(true);
	        jLabelIconBoatRight.setVisible(false);
	    } else if (boat == 2) {
	        jLabelIconBoatLeft.setVisible(false);
	        jLabelIconBoatRight.setVisible(true);
	    }
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if(!imagePositions.getGameFailed() && !(jLabelIconFoxLeft.isVisible() && jLabelIconGooseLeft.isVisible() && jLabelIconFarmerLeft.isVisible() && jLabelIconBeanLeft.isVisible())){
			updateFox();
			updateBoat();
			updateFarmer();
			updateGoose();
			updateBeans();
		}
		if(imagePositions.getGameFailed()){
			setTitle("Game Failed!");
		}
		if(jLabelIconFoxLeft.isVisible() && jLabelIconGooseLeft.isVisible() && jLabelIconFarmerLeft.isVisible() && jLabelIconBeanLeft.isVisible()){
			setTitle("Game Won!");
		}
	}
}

