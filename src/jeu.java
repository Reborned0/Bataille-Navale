import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class jeu extends JFrame implements ActionListener {

	private JPanel pan = new JPanel();
	private JPanel panHost = new JPanel();
	private JPanel panClient = new JPanel();
	private JLabel[][] tabHost = new JLabel[16][16];
	private JLabel[][] tabClient = new JLabel[16][16];
	private GridLayout batailleNavale = new GridLayout(16, 16);
	private ImageIcon bleu = new ImageIcon("images/bleu.jpg");
	private ImageIcon violet = new ImageIcon("images/violet.jpg");
	
	public jeu(){
		
		this.setTitle("Bataille Navale");
		this.setSize(1600,800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pan.setLayout(null);
		pan.setBackground(Color.darkGray);
		
		panHost.setLayout(null);
		panHost.setBounds(150, 100, 600, 600);
		panHost.setLayout(batailleNavale);
		
		panClient.setLayout(null);
		panClient.setBounds(850, 100, 600, 600);
		panClient.setLayout(batailleNavale);
		
		for(int i=0;i<16;i++){
			for (int j=0;j<16;j++){
				JButton button = new JButton(bleu);
				panHost.add(button);
			}
		}
		
		for(int i=0;i<16;i++){
			for (int j=0;j<16;j++){
				JButton button = new JButton(violet);
				panClient.add(button);
			}
		}
		
		pan.add(panHost);
		pan.add(panClient);
		
		this.setContentPane(pan);
		this.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		
	}

}
