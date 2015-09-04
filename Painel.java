import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
import javax.swing.ImageIcon;
import java.lang.*;
import java.util.Random;

public class Painel extends JFrame {

	// DECLARANDO VARIAVEIS;
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JPanel pan_botoes,pan_menu,pan_total;
	private JLabel lab_lvl;
	private botao[][] bot_jogo = new botao[6][6];
	private botao[] bot_menu = new botao[10];
	

	//INSTANCIANDO OS OBJETOS;

	
	//MTD. CONSTRUTOR;
	public Painel(){
		
		//INICIANDO SUPER CLASS
		super("Tela jogo");
		
		//INSTANCIANDO OBJETOS;
		JFrame frame = new JFrame("Genius");  
		
		//Setando configs da janela 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocation(100,100);
		frame.setSize(400,390);
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
		bot_menu[1].setText("NOVO JOGO");
		bot_menu[2].setText("OPCOES");
		bot_menu[3].setText("ESTATISTICAS");
		bot_menu[4].setText("SAIR");
		
		//JOGO;
		for(int x=1;x<=2;x++){
			for(int y=1;y<=2;y++){
				bot_jogo[x][y] = new botao();
				pan_botoes.add(bot_jogo[x][y]);
				//Botao[x][y].setPreferredSize(new Dimension(130,130));
				//Botao[x][y].addActionListener(this);
				//bot_jogo[x][y].setBorderPainted(false);
				bot_jogo[x][y].setBackground(Color.BLACK);
				
			}
		}
		
	}
	
}
