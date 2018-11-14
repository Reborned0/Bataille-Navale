import javax.print.attribute.standard.JobOriginatingUserName;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class accueil extends JFrame implements ActionListener {
	
	private JPanel pan = new JPanel();
	private JButton jouer = new JButton("Jouer");
	private JButton regle = new JButton("Règles");
	private ImageIcon image = new ImageIcon("images/fondAccueil.jpg");
	private JLabel fond = new JLabel(image,JLabel.CENTER);
	private Font comic = new Font("Comic sans MS",Font.BOLD,18);
	
	public accueil() {
		
		this.setTitle("Accueil");
		this.setSize(800,800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pan.setLayout(null);
		fond.setBounds(0, 0, 800, 800);
		
		jouer.setFont(comic);
		jouer.setBackground(Color.gray);
		jouer.setBounds(300, 250, 200, 100);
		jouer.addActionListener(this);
		
		regle.setFont(comic);
		regle.setBackground(Color.gray);
		regle.setBounds(300, 450, 200, 100);
		regle.addActionListener(this);
		
		pan.add(jouer);
		pan.add(regle);
		pan.add(fond);
		
		this.setContentPane(pan);
		this.setVisible(true);
		jouer.setVisible(true);
		jouer.setBounds(0, 0, 20, 20);
	}

	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== jouer){
			this.setVisible(false);
			jeu f2 = new jeu();
		}
		
	}
}
