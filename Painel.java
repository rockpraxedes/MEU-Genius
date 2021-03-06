import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
import javax.swing.ImageIcon;
import java.lang.*;
import java.util.Random;

public class Painel extends JFrame implements ActionListener{

	// DECLARANDO VARIAVEIS;
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JPanel pan_botoes,pan_menu,pan_total;
	private botao[][] bot_jogo = new botao[6][6];
	private botao[] bot_menu = new botao[10];
	private int opcao = 0 ;
	

	//INSTANCIANDO OS OBJETOS;

	
	//MTD. CONSTRUTOR;
	public Painel(){
		
		//INICIANDO SUPER CLASS
		super("Tela jogo");
		
		//INSTANCIANDO OBJETOS;
		JFrame frame = new JFrame("Genius");  
		Icon b1 = new ImageIcon("b1.gif");  
		Icon b2 = new ImageIcon("b2.gif");  
		Icon b3 = new ImageIcon("b3.gif");  
		Icon b4 = new ImageIcon("b4.gif");  
		
		//Setando configs da janela 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocation(100,100);
		frame.setSize(350,420);
		frame.setResizable(false);	
		
		//INSTANCIANDO LABELS C/ LAYOUTS DEFINIDOS; 
		
		JPanel pan_total = new JPanel(new BorderLayout());
		JPanel pan_menu = new JPanel(new FlowLayout());
		JPanel pan_botoes = new JPanel(new GridLayout(2,2));
		
		//ADICIONANDO OBJETOS AO FRAME;
		
		frame.add(pan_total);
		pan_total.add(pan_menu,BorderLayout.NORTH);
		pan_total.add(pan_botoes,BorderLayout.CENTER);
		pan_menu.setBackground(Color.BLACK); //Definindo cor para preto *
		pan_botoes.setBackground(Color.BLACK); 
		
		
		// INSTANCIANDO E ADICIONANDO BOTOES:
		
		
		//MENU;
		for(int x=1;x<5;x++){ 
			bot_menu[x]= new botao();
			pan_menu.add(bot_menu[x]);
			//bot_menu[x].addActionListener(this);
		}	//bot_menu[x].setText(x);
		bot_menu[1].setText("NOVO");
		bot_menu[2].setText("OPCAO");
		bot_menu[3].setText("RANKING");
		bot_menu[4].setText("SAIR");
		
		//JOGO;
		for(int x=1;x<=2;x++){
			for(int y=1;y<=2;y++){
				bot_jogo[x][y] = new botao();
				pan_botoes.add(bot_jogo[x][y]);
				bot_jogo[x][y].setPreferredSize(new Dimension(130,130));
				//Botao[x][y].addActionListener(this);
				bot_jogo[x][y].setBorderPainted(false);
				bot_jogo[x][y].setBackground(Color.BLACK);
			}
		}
	bot_jogo [1][1].setIcon(b1); 
	bot_jogo [1][2].setIcon(b2); 
	bot_jogo [2][1].setIcon(b3); 
	bot_jogo [2][2].setIcon(b4); 
	}
	public void actionPerformed(ActionEvent e) {	
		
		if (e.getSource() == bot_jogo [1][1]){
			opcao = 1;
			pisca pisca = new pisca();
			pisca.setOp(opcao);
			
		
		}
	}
}
