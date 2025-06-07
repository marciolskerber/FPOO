package ticTacToe.component.button;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import ticTacToe.gui.Paintable;
import ticTacToe.gui.util.MouseListenerAdapter;

public class Button implements Paintable{
	
	private Point position = null;     
    private Dimension dimension = null;
    
    public Button() {
        this.position = new Point(0, 0);
        this.dimension = new Dimension(20, 20);
    }
    
    public Button(int x, int y) {
    	this();
    	setPosition(x, y);
    }
    
    public Button(int x, int y, int width, int height) {
    	this(x, y);
    	setSize(width, height);
    }
    
    public void setPosition(int x, int y) {
    	this.position = new Point(x, y);
    }
    
    public Point getPosition() {
    	return (Point) this.position.clone();
    }
    
    public void setSize(int width, int height) {
    	this.dimension = new Dimension(width, height);
    }
    
    public Dimension getSize() {
    	return (Dimension) this.dimension.clone();   
    	
    }
    
    public int width() {
    	return this.dimension.width;
    }
    
    public int height() {
    	return this.dimension.height;
    }
    
    @Override
    public void paint(Graphics g) {
    	
    	g.drawRect(position.x, position.y, dimension.width, dimension.height);
    }
    
    public boolean isOver(Point point) {
    	//-- Este método isOver verifica se um determinado ponto (Point point) está dentro dos limites de um componente.
    	
    	int xLeft = this.position.x;
    	int yTop = this.position.y;
    	int xRight = xLeft + this.width();
    	int yBotton = yTop + this.height();
    	
    	return ( (point.x > xLeft && point.x < xRight) &&
    			(point.y > yTop && point.y < yBotton) );
    }
    
    public MouseListener mouseListener() {
    	//-- O método mouseListener() retorna um objeto MouseListener. 
    	
    	return new MouseListenerAdapter() {
    		//-- Está sendo retornada uma nova instância de uma classe anônima que implementa MouseListenerAdapter.
    		
    	
    		@Override
    		//-- O evento de interesse é o mouseClicked
    		public void mouseClicked( MouseEvent me ) {
    			
    			if( !isOver( me.getPoint() ))
    				return;
    			
    			onMouseClick(me);
    			
    		}

			protected void onMouseClick(MouseEvent me) {
				// TODO Auto-generated method stub
				
			}
			
			
			
			
    		
    	};
    	
    } 

}
