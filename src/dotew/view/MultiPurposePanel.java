package dotew.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import dotew.controller.GameEngine;
import dotew.model.TerrainCell;

public class MultiPurposePanel extends JPanel {
	
	   final static boolean shouldFill = true;
	    final static boolean shouldWeightX = true;
	    final static boolean RIGHT_TO_LEFT = false;
	
	TerrainCell [][]tCellList;

	public MultiPurposePanel(TerrainCell [][]tCellList) {
		this.tCellList = tCellList;
		GridBagLayout layoutMain = new GridBagLayout();
		

		System.out.println("multiPurpose");
		
		this.setLayout(layoutMain);
		this.setPreferredSize(new Dimension(540,540));
		TerrainLabel lblT;
		GridBagConstraints gbcBtn = new GridBagConstraints();
		
	

		for (int i = 0; i < 6; i++) {

			for (int j = 0; j < 6; j++) {
				lblT = new TerrainLabel(this.tCellList[i][j]);
				gbcBtn.weightx = 0.5;
				gbcBtn.fill = GridBagConstraints.HORIZONTAL;
				gbcBtn.gridx =j;
				gbcBtn.gridy = i;
				
				
				this.add(lblT, gbcBtn);
				

			}
		}
	
	 
		
	}
	
	public void updateLabels(){
		
//		GridBagLayout layoutMain = new GridBagLayout();
//		this.setLayout(layoutMain);
//		this.setPreferredSize(new Dimension(540,540));
		
		TerrainLabel lblT;
		GridBagConstraints gbcBtn = new GridBagConstraints();
		
	

		for (int i = 0; i < 6; i++) {

			for (int j = 0; j < 6; j++) {
				lblT = new TerrainLabel(this.tCellList[i][j]);
				gbcBtn.weightx = 0.5;
				gbcBtn.fill = GridBagConstraints.HORIZONTAL;
				gbcBtn.gridx =j;
				gbcBtn.gridy = i;
				
				this.remove((i*j) + j);
				this.add(lblT, gbcBtn,(i*j) + j);
				

			}
		}
	}

	public MultiPurposePanel(LayoutManager arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public MultiPurposePanel(boolean arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public MultiPurposePanel(LayoutManager arg0, boolean arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		//this.settCellList(GameEngine.getInstance().getMapManager().getCurrentMap().getTerrainCellList());
		
		super.paint(g);
		
	}
	
	public void enterWar(){
		this.settCellList(GameEngine.getInstance().getMapManager().getCurrentMap().getTerrainCellList());
		this.updateLabels();
		this.repaint();
	}
	
	@Override
	public void repaint() {
		// TODO Auto-generated method stub
//		this.settCellList(GameEngine.getInstance().getMapManager().getCurrentMap().getTerrainCellList());
//		this.updateLabels();
		super.repaint();
	}
	

	public TerrainCell[][] gettCellList() {
		return tCellList;
	}

	public void settCellList(TerrainCell[][] tCellList) {
		this.tCellList = tCellList;
	}

}
