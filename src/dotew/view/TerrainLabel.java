package dotew.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import dotew.model.TerrainCell;
import dotew.resources.Dummy;

public class TerrainLabel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TerrainCell tCell;

	public TerrainLabel(TerrainCell tCell) {
		this.setPreferredSize(new Dimension(90, 90));
		this.tCell = tCell;
	}


	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		Image img = null;
		try {
			img = ImageIO.read(new Dummy().getClass().getResource(this.tCell.getIconName()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		g.drawImage(img, 0, 0, new Color(0,true), this);
		;
		if(this.tCell.getGameObject() != null){
			img = null;
			try {
				img = ImageIO.read(new Dummy().getClass().getResource(this.tCell.getGameObject().getIconName()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			g.drawImage(img, 0, 0,new Color(0,true), this);
			
		}
	}

	public TerrainCell gettCell() {
		return tCell;
	}

	public void settCell(TerrainCell tCell) {
		this.tCell = tCell;
	}
	

}
