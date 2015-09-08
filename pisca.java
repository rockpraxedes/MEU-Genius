import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
 
 public class pisca extends JButton{
	
	public int op;
	private botao[][] bot_jogo = new botao[6][6];
	private int tempo = 250;
	Icon b1 = new ImageIcon("b1.gif");  
	Icon b2 = new ImageIcon("b2.gif");  
	Icon b3 = new ImageIcon("b3.gif");  
	Icon b4 = new ImageIcon("b4.gif");  
	Icon pb1 = new ImageIcon("pb1.gif");  
	Icon pb2 = new ImageIcon("pb2.gif");  
	Icon pb3 = new ImageIcon("pb3.gif");  
	Icon pb4 = new ImageIcon("pb4.gif");  
		
	public void setOp(int op){
		this.op = op;
	}	
	
	
	public pisca(){

		switch(op){
			case 1:{
					bot_jogo [1][1].setIcon(pb1); 
					java.awt.EventQueue.invokeLater(new Runnable() {                 
						public void run() {     
							try    
							{ Thread.sleep(tempo);}    
							catch (InterruptedException ie) {}    
							bot_jogo [1][1].setIcon(b1);    
						  }    
					});    
				
				break;
			}
			case 2:{
			    
					bot_jogo [1][2].setIcon(pb2); 
					java.awt.EventQueue.invokeLater(new Runnable() {                 
						public void run() {     
							try    
							{ Thread.sleep(tempo);}    
							catch (InterruptedException ie) {}    
							bot_jogo [1][2].setIcon(b2);    
						  }    
					});    
				
				break;
			}
			case 3:{
				
					bot_jogo [2][1].setIcon(pb3); 
					java.awt.EventQueue.invokeLater(new Runnable() {                 
						public void run() {     
							try    
							{ Thread.sleep(tempo);}    
							catch (InterruptedException ie) {}    
							bot_jogo [2][1].setIcon(b3);    
						  }    
					});    
				
				break;
			}
			case 4:{
		 
					bot_jogo [2][2].setIcon(pb4); 
					java.awt.EventQueue.invokeLater(new Runnable() {                 
						public void run() {     
							try    
							{ Thread.sleep(tempo);}    
							catch (InterruptedException ie) {}    
							bot_jogo [2][2].setIcon(b4);    
						  }    
					});    
				
				break;
			}
		}
	}		
 }	
