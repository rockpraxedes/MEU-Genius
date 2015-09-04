import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
import java.lang.*;


public class Opcao extends JFrame {

	// DECLARANDO VARIAVEIS;
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	//private JPanel ;
	private botao[] bot_menu = new botao[10];
	

	//INSTANCIANDO OS OBJETOS;

	
	//MTD. CONSTRUTOR;
	public Opcao(){
		
		//INICIANDO SUPER CLASS
		super("MENU");
		
		//INSTANCIANDO OBJETOS;
		JFrame frame = new JFrame("Genius - Opcoes");  
		
		//Setando configs da janela 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocation(100,100);
		frame.setSize(350,420);
		frame.setResizable(false);	
		
		//INSTANCIANDO LABELS C/ LAYOUTS DEFINIDOS; 
		
		JPanel pan_total = new JPanel(new BorderLayout());
		JPanel pan_menu = new JPanel(new FlowLayout());

		
		//ADICIONANDO OBJETOS AO FRAME;
		
		frame.add(pan_total);
		pan_total.add(pan_menu,BorderLayout.NORTH);
		pan_menu.setBackground(Color.BLACK);


		
		
		// INSTANCIANDO E ADICIONANDO BOTOES:
		
		//MENU;
		for(int x=1;x<5;x++){ 
			bot_menu[x]= new botao();
			pan_menu.add(bot_menu[x]);
			//bot_menu[x].addActionListener(this);
		}
		bot_menu[1].setText("NOVO");
		bot_menu[2].setText("SALVAR");
		bot_menu[3].setText("RANKING");
		bot_menu[4].setText("SAIR");
		
		//OPCOES
		
		
		

	}
	
}
