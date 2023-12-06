import java.awt.EventQueue;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.ComponentOrientation;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;

public class Quiz extends JFrame {

	private JPanel contentPane;
	public JLabel lblNewLabel_2;
	public JLabel lblNewLabel_3;
	public JLabel lblNewLabel_4,lblNewLabel_5;
	public String ch ;
	public ArrayList<String> Quest_rep_j1 = new ArrayList<String>();
	public ArrayList<String> Quest_rep_j2 = new ArrayList<String>();
	public String sh1 ,sh2 ,sh3,sh4,sh5,sh6,sh7,sh8,sh9,sh10;
	private JTextField textField;
	private JTextField textField_1;
	public int score_J1,score_J2;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	public String rp1,rp2,rp3,rp4,rp5,rp6,rp7,rp8,rp9,rp10 ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz frame = new Quiz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	//_____________________ Fonction qui Prend un element aleatoire d'une liste donné en paramétre_________________
	
		public static<T> T getRandomElement(List<T> list) {
		        Random random = new Random();
		        int randomIndex = random.nextInt(list.size());
		        return list.get(randomIndex);				}
		
	
	
	
	/**
	 * Create the frame.
	 */
	// Pour reccuperer les noms de joueurs :
	
	public JLabel getLblNewLabel_2() {
		return lblNewLabel_2;
	}
	public JLabel getLblNewLabel_3() {
		return lblNewLabel_3;
	}
	
	public Quiz() {
		setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1093, 607);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(233, 233, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Definir les icons de chaque joueur : 
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\programmation java\\Bioman-Avatar-3-Blue-icon.png"));
		lblNewLabel.setBounds(28, 10, 128, 139);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\programmation java\\Bioman-Avatar-1-Red-icon.png"));
		lblNewLabel_1.setBounds(755, 16, 138, 139);
		contentPane.add(lblNewLabel_1);
		
		// afficher les noms des joueurs a partir des entrés dans la fentre d'accuille :  
		
		lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(623, 64, 122, 36);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(173, 64, 112, 36);
		contentPane.add(lblNewLabel_2);
		
		//____________________________________Donnez le question de chaque joueur :_________________________________________
		
		
		
		try {
			// on met les question reponse dans des liste pour les parcourir est assure ques le meme question ne se 
			//repéte pas pour un meme joueur 
			
			
			
			int p=0 ; //longueur de la liste question reponse de joueur 1
			int s =0; //longueur de la liste question reponse de joueur 2
			
			
			// Tous les lignes de fichier seront transformés en des elements de une Liste 
			List<String> allLines = Files.readAllLines(Paths.get("Jeux.txt"));
			// File sous forme d une liste : 
			// System.out.println(allLines);	
			
			
			// Liste de questions reponse pour le joueur 1 :
			
			for (int i=0;i<=allLines.size();i++)
			{
				ch=getRandomElement(allLines);
				Quest_rep_j1.add(ch);
				allLines.remove(ch);
				p=p+1;
				if(p==5)
					break ; 
			}
			// Liste de questions reponse pour le joueur 2 :
			
			for (int i=0;i<=allLines.size();i++)
			{
				ch=getRandomElement(allLines);
				Quest_rep_j2.add(ch);
				allLines.remove(ch);
				s=s+1;
				if(s==5)
					break ; 
			}
			//System.out.println(Quest_rep_j1);
			//System.out.println(Quest_rep_j2);
			//System.out.println(ch);
			
			
			
			// Prendre juste le question : 	
			//System.out.println(ch.substring(0, ch.indexOf(':')));
			// Prendre juste la reponse :
			//System.out.println(ch.substring(ch.indexOf(':')+1));	
			} catch (IOException e) {
			e.printStackTrace();
			}
		//_______________________________________________________________________________________________________________________________
		

		
		
		
		
		
		JButton btnNewButton = new JButton("Lancez le Defi ! ");
		//Action de lancement de defi : 
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// ____________________________________________ Question 1 ____________________________________________ :
				
				
				JLabel lblNewLabel_6 = new JLabel("Question 1 :");
				lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6.setBounds(10, 145, 90, 27);
				contentPane.add(lblNewLabel_6);
				
				JLabel lblNewLabel_6_1 = new JLabel("Question 1 :");
				lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_1.setBounds(556, 145, 90, 27);
				contentPane.add(lblNewLabel_6_1);
				
				// Affichage des questions pour chaque joueur :  
								
				JLabel lblNewLabel_7 = new JLabel(Quest_rep_j1.get(0).substring(0, Quest_rep_j1.get(0).indexOf(':')));
				lblNewLabel_7.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_7.setBounds(127, 145, 419, 27);
				contentPane.add(lblNewLabel_7);
				
				JLabel lblNewLabel_7_1 = new JLabel(Quest_rep_j2.get(0).substring(0, Quest_rep_j2.get(0).indexOf(':')));
				lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_7_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_7_1.setBounds(642, 145, 419, 27);
				contentPane.add(lblNewLabel_7_1);
				
				// les Reponses : 
				
				JLabel lblNewLabel_6_2 = new JLabel("Reponse 1 :");
				lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_2.setBounds(10, 182, 90, 27);
				contentPane.add(lblNewLabel_6_2);				
				
				// aide pour la solution : 
				
				rp1=Quest_rep_j1.get(0).substring(Quest_rep_j1.get(0).indexOf(':')+1);
				
				
				int L=rp1.length();
				
				switch(L) {
				case 6:
					sh1=rp1.charAt(0)+"-----";
					break;
				case 7:
					sh1=rp1.charAt(0)+"------";
					break;
				case 8:
					sh1=rp1.charAt(0)+"-------";
					break;
				case 9:
					sh1=rp1.charAt(0)+"----"+rp1.charAt(5)+"---";
					break;
				case 10:
					sh1=rp1.charAt(0)+"-----"+rp1.charAt(6)+"---";
					break;
				case 11:
					sh1=rp1.charAt(0)+"-----"+rp1.charAt(7)+"----";
					break;
				case 12:
					sh1=rp1.charAt(0)+"-----"+rp1.charAt(8)+"----"+rp1.charAt(11);
					break;
				case 13:
					sh1=rp1.charAt(0)+"------"+rp1.charAt(9)+"----"+rp1.charAt(12);
					break;
				case 14:
					sh1=rp1.charAt(0)+"------"+rp1.charAt(10)+"-----"+rp1.charAt(13);
					break;
				case 15:
					sh1=rp1.charAt(0)+"-------"+rp1.charAt(11)+"-----"+rp1.charAt(14);
					break;
						}
				
				JLabel lblNewLabel_6_2_1 = new JLabel(sh1);
				lblNewLabel_6_2_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_2_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_2_1.setBounds(112, 182, 128, 27);
				contentPane.add(lblNewLabel_6_2_1);
				
				//_______________________________________________________________________________________________________
				
	
				
				JLabel lblNewLabel_6_3 = new JLabel("Reponse 1 :");
				lblNewLabel_6_3.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_3.setBounds(556, 182, 90, 27);
				contentPane.add(lblNewLabel_6_3);
				
				
				// aide pour la solution : 
				
				rp2=Quest_rep_j2.get(0).substring(Quest_rep_j2.get(0).indexOf(':')+1);
				
				//___________________________________________________________________
				
				//___________________________________________________________________
				
				int L2=rp2.length();
				
				switch(L2) {
				case 6:
					sh2=rp2.charAt(0)+"-----";
					break;
				case 7:
					sh2=rp2.charAt(0)+"------";
					break;
				case 8:
					sh2=rp2.charAt(0)+"-------";
					break;
				case 9:
					sh2=rp2.charAt(0)+"----"+rp1.charAt(5)+"---";
					break;
				case 10:
					sh2=rp2.charAt(0)+"-----"+rp1.charAt(6)+"---";
					break;
				case 11:
					sh2=rp2.charAt(0)+"-----"+rp1.charAt(7)+"----";
					break;
				case 12:
					sh2=rp2.charAt(0)+"-----"+rp1.charAt(8)+"----"+rp1.charAt(11);
					break;
				case 13:
					sh2=rp2.charAt(0)+"------"+rp1.charAt(9)+"----"+rp1.charAt(12);
					break;
				case 14:
					sh2=rp2.charAt(0)+"------"+rp1.charAt(10)+"-----"+rp1.charAt(13);
					break;
				case 15:
					sh2=rp2.charAt(0)+"-------"+rp1.charAt(11)+"-----"+rp1.charAt(14);
					break;
						}
				
				
				JLabel lblNewLabel_6_2_1_1 = new JLabel(sh2);
				lblNewLabel_6_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_2_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_2_1_1.setBounds(656, 182, 128, 27);
				contentPane.add(lblNewLabel_6_2_1_1);
				
				// l affichage des zone de textes pour les reponses : 
				
				textField_2 = new JTextField();
				textField_2.setBounds(250, 182, 158, 27);
				contentPane.add(textField_2);
				textField_2.setColumns(10);
				
				textField_3 = new JTextField();
				textField_3.setColumns(10);
				textField_3.setBounds(794, 182, 158, 27);
				contentPane.add(textField_3);
				

				
				
				// ____________________________________________ Question 2 ____________________________________________ :
				
				
				JLabel lblNewLabel_6_4 = new JLabel("Question 2 :");
				lblNewLabel_6_4.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_4.setBounds(10, 223, 90, 27);
				contentPane.add(lblNewLabel_6_4);
				
				JLabel lblNewLabel_6_5 = new JLabel("Question 2 :");
				lblNewLabel_6_5.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_5.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_5.setBounds(556, 219, 90, 27);
				contentPane.add(lblNewLabel_6_5);
				
				// Affichage des questions pour chaque joueur :  
				
				JLabel lblNewLabel_7_2 = new JLabel(Quest_rep_j1.get(1).substring(0, Quest_rep_j1.get(1).indexOf(':')));
				lblNewLabel_7_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_7_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_7_2.setBounds(125, 219, 419, 27);
				contentPane.add(lblNewLabel_7_2);
				
				JLabel lblNewLabel_7_3 = new JLabel(Quest_rep_j2.get(1).substring(0, Quest_rep_j2.get(1).indexOf(':')));
				lblNewLabel_7_3.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_7_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_7_3.setBounds(642, 219, 419, 27);
				contentPane.add(lblNewLabel_7_3);
				
				// la reponse : 
				
				JLabel lblNewLabel_6_2_2 = new JLabel("Reponse 2 :");
				lblNewLabel_6_2_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_2_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_2_2.setBounds(10, 252, 90, 27);
				contentPane.add(lblNewLabel_6_2_2);
				
				// aide pour la solution : 
				
				
				rp3=Quest_rep_j1.get(1).substring(Quest_rep_j1.get(1).indexOf(':')+1);
				
				
				int L1=rp3.length();
				
				switch(L1) {
				case 6:
					sh3=rp3.charAt(0)+"-----";
					break;
				case 7:
					sh3=rp3.charAt(0)+"------";
					break;
				case 8:
					sh3=rp3.charAt(0)+"-------";
					break;
				case 9:
					sh3=rp3.charAt(0)+"----"+rp3.charAt(5)+"---";
					break;
				case 10:
					sh3=rp3.charAt(0)+"-----"+rp3.charAt(6)+"---";
					break;
				case 11:
					sh3=rp3.charAt(0)+"-----"+rp3.charAt(7)+"----";
					break;
				case 12:
					sh3=rp3.charAt(0)+"-----"+rp3.charAt(8)+"----"+rp3.charAt(11);
					break;
				case 13:
					sh3=rp3.charAt(0)+"------"+rp3.charAt(9)+"----"+rp3.charAt(12);
					break;
				case 14:
					sh3=rp3.charAt(0)+"------"+rp3.charAt(10)+"-----"+rp3.charAt(13);
					break;
				case 15:
					sh3=rp3.charAt(0)+"-------"+rp3.charAt(11)+"-----"+rp3.charAt(14);
					break;
						}
				
				JLabel lblNewLabel_6_2_1_2 = new JLabel(sh3);
				lblNewLabel_6_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_2_1_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_2_1_2.setBounds(112, 252, 128, 27);
				contentPane.add(lblNewLabel_6_2_1_2);
				
				// zone d ecriture :
			
				textField_4 = new JTextField();
				textField_4.setColumns(10);
				textField_4.setBounds(250, 256, 158, 27);
				contentPane.add(textField_4);
				
				JLabel lblNewLabel_6_2_3 = new JLabel("Reponse 2 :");
				lblNewLabel_6_2_3.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_2_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_2_3.setBounds(556, 256, 90, 27);
				contentPane.add(lblNewLabel_6_2_3);
				
				// La solution : 
				
				// aide pour la solution : 
			
				rp4=Quest_rep_j2.get(1).substring(Quest_rep_j2.get(1).indexOf(':')+1);
				
				//___________________________________________________________________
				
				//___________________________________________________________________
				
				int L3=rp4.length();
				
				switch(L3) {
				case 6:
					sh4=rp4.charAt(0)+"-----";
					break;
				case 7:
					sh4=rp4.charAt(0)+"------";
					break;
				case 8:
					sh4=rp4.charAt(0)+"-------";
					break;
				case 9:
					sh4=rp4.charAt(0)+"----"+rp4.charAt(5)+"---";
					break;
				case 10:
					sh4=rp4.charAt(0)+"-----"+rp4.charAt(6)+"---";
					break;
				case 11:
					sh4=rp4.charAt(0)+"-----"+rp4.charAt(7)+"----";
					break;
				case 12:
					sh4=rp4.charAt(0)+"-----"+rp4.charAt(8)+"----"+rp4.charAt(11);
					break;
				case 13:
					sh4=rp4.charAt(0)+"------"+rp4.charAt(9)+"----"+rp4.charAt(12);
					break;
				case 14:
					sh4=rp4.charAt(0)+"------"+rp4.charAt(10)+"-----"+rp4.charAt(13);
					break;
				case 15:
					sh4=rp4.charAt(0)+"-------"+rp4.charAt(11)+"-----"+rp4.charAt(14);
					break;
						}
				
				// l aide de solution :
				
				JLabel lblNewLabel_6_2_1_3 = new JLabel(sh4);
				lblNewLabel_6_2_1_3.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_2_1_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_2_1_3.setBounds(656, 256, 128, 27);
				contentPane.add(lblNewLabel_6_2_1_3);
				
				// la zone de reponse  :
				
				textField_5 = new JTextField();
				textField_5.setColumns(10);
				textField_5.setBounds(794, 256, 158, 27);
				contentPane.add(textField_5);
				


				// ____________________________________________ Question 3 ______________________________________________ :
				
				JLabel lblNewLabel_6_4_1 = new JLabel("Question 3 :");
				lblNewLabel_6_4_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_4_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_4_1.setBounds(10, 289, 90, 27);
				contentPane.add(lblNewLabel_6_4_1);
				
				JLabel lblNewLabel_6_4_2 = new JLabel("Question 3 :");
				lblNewLabel_6_4_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_4_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_4_2.setBounds(556, 293, 90, 27);
				contentPane.add(lblNewLabel_6_4_2);
				
				// Affichage des questions pour chaque joueur :  
				
				
				JLabel lblNewLabel_7_2_1 = new JLabel(Quest_rep_j1.get(2).substring(0, Quest_rep_j1.get(2).indexOf(':')));
				lblNewLabel_7_2_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_7_2_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_7_2_1.setBounds(125, 289, 419, 27);
				contentPane.add(lblNewLabel_7_2_1);
				
				JLabel lblNewLabel_7_2_2 = new JLabel(Quest_rep_j2.get(2).substring(0, Quest_rep_j2.get(2).indexOf(':')));
				lblNewLabel_7_2_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_7_2_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_7_2_2.setBounds(656, 293, 419, 27);
				contentPane.add(lblNewLabel_7_2_2);
				
				// la reponse : 
				
				JLabel lblNewLabel_6_2_2_1 = new JLabel("Reponse 3 :");
				lblNewLabel_6_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_2_2_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_2_2_1.setBounds(10, 322, 90, 27);
				contentPane.add(lblNewLabel_6_2_2_1);
				
				// aide pour la solution : 
				
			
				rp5=Quest_rep_j1.get(2).substring(Quest_rep_j1.get(2).indexOf(':')+1);
				
				
				int L4=rp5.length();
				
				switch(L4) {
				case 6:
					sh5=rp5.charAt(0)+"-----";
					break;
				case 7:
					sh5=rp5.charAt(0)+"------";
					break;
				case 8:
					sh5=rp5.charAt(0)+"-------";
					break;
				case 9:
					sh5=rp5.charAt(0)+"----"+rp5.charAt(5)+"---";
					break;
				case 10:
					sh5=rp5.charAt(0)+"-----"+rp5.charAt(6)+"---";
					break;
				case 11:
					sh5=rp5.charAt(0)+"-----"+rp5.charAt(7)+"----";
					break;
				case 12:
					sh5=rp5.charAt(0)+"-----"+rp5.charAt(8)+"----"+rp5.charAt(11);
					break;
				case 13:
					sh5=rp5.charAt(0)+"------"+rp5.charAt(9)+"----"+rp5.charAt(12);
					break;
				case 14:
					sh5=rp5.charAt(0)+"------"+rp5.charAt(10)+"-----"+rp5.charAt(13);
					break;
				case 15:
					sh5=rp5.charAt(0)+"-------"+rp5.charAt(11)+"-----"+rp5.charAt(14);
					break;
						}
				JLabel lblNewLabel_6_2_1_2_1 = new JLabel(sh5);
				lblNewLabel_6_2_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_2_1_2_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_2_1_2_1.setBounds(112, 322, 128, 27);
				contentPane.add(lblNewLabel_6_2_1_2_1);
				
				// la zone de texte :
				
				
				textField_6 = new JTextField();
				textField_6.setColumns(10);
				textField_6.setBounds(250, 326, 158, 27);
				contentPane.add(textField_6);
				// la reponse : 
				
				JLabel lblNewLabel_6_2_2_2 = new JLabel("Reponse 3 :");
				lblNewLabel_6_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_2_2_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_2_2_2.setBounds(556, 330, 90, 27);
				contentPane.add(lblNewLabel_6_2_2_2);
				
				// aide pour la solution : 
				
				rp6=Quest_rep_j2.get(2).substring(Quest_rep_j2.get(2).indexOf(':')+1);
				
				
				int L5=rp6.length();
				
				switch(L5) {
				case 6:
					sh6=rp6.charAt(0)+"-----";
					break;
				case 7:
					sh6=rp6.charAt(0)+"------";
					break;
				case 8:
					sh6=rp6.charAt(0)+"-------";
					break;
				case 9:
					sh6=rp6.charAt(0)+"----"+rp5.charAt(5)+"---";
					break;
				case 10:
					sh6=rp6.charAt(0)+"-----"+rp5.charAt(6)+"---";
					break;
				case 11:
					sh6=rp6.charAt(0)+"-----"+rp5.charAt(7)+"----";
					break;
				case 12:
					sh6=rp6.charAt(0)+"-----"+rp5.charAt(8)+"----"+rp5.charAt(11);
					break;
				case 13:
					sh6=rp6.charAt(0)+"------"+rp5.charAt(9)+"----"+rp5.charAt(12);
					break;
				case 14:
					sh6=rp6.charAt(0)+"------"+rp5.charAt(10)+"-----"+rp5.charAt(13);
					break;
				case 15:
					sh6=rp6.charAt(0)+"-------"+rp5.charAt(11)+"-----"+rp5.charAt(14);
					break;
						}
				// l aide : 
				
				JLabel lblNewLabel_6_2_1_2_2 = new JLabel(sh6);
				lblNewLabel_6_2_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_2_1_2_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_2_1_2_2.setBounds(656, 330, 128, 27);
				contentPane.add(lblNewLabel_6_2_1_2_2);
				
				// la zone de texte :
				
				textField_7 = new JTextField();
				textField_7.setColumns(10);
				textField_7.setBounds(794, 330, 158, 27);
				contentPane.add(textField_7);
				

				//____________________________________________Question 4 _____________________________________________________________________
				
				JLabel lblNewLabel_6_6 = new JLabel("Question 4 :");
				lblNewLabel_6_6.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_6.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_6.setBounds(10, 359, 90, 27);
				contentPane.add(lblNewLabel_6_6);
				
				JLabel lblNewLabel_6_6_1 = new JLabel("Question 4 :");
				lblNewLabel_6_6_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_6_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_6_1.setBounds(556, 367, 90, 27);
				contentPane.add(lblNewLabel_6_6_1);
				
				JLabel lblNewLabel_7_2_1_1 = new JLabel(Quest_rep_j1.get(3).substring(0, Quest_rep_j1.get(3).indexOf(':')));
				lblNewLabel_7_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_7_2_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_7_2_1_1.setBounds(112, 359, 419, 27);
				contentPane.add(lblNewLabel_7_2_1_1);
				
				JLabel lblNewLabel_7_2_1_2 = new JLabel(Quest_rep_j2.get(3).substring(0, Quest_rep_j2.get(3).indexOf(':')));
				lblNewLabel_7_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_7_2_1_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_7_2_1_2.setBounds(642, 367, 419, 27);
				contentPane.add(lblNewLabel_7_2_1_2);
				
				// la reponse :
				
				
				JLabel lblNewLabel_6_2_2_1_1 = new JLabel("Reponse 4 :");
				lblNewLabel_6_2_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_2_2_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_2_2_1_1.setBounds(10, 395, 90, 27);
				contentPane.add(lblNewLabel_6_2_2_1_1);
				
				// l aide :
				
				rp7=Quest_rep_j1.get(3).substring(Quest_rep_j1.get(3).indexOf(':')+1);
				
				
				int L6=rp7.length();
				
				switch(L6) {
				case 6:
					sh7=rp7.charAt(0)+"-----";
					break;
				case 7:
					sh7=rp7.charAt(0)+"------";
					break;
				case 8:
					sh7=rp7.charAt(0)+"-------";
					break;
				case 9:
					sh7=rp7.charAt(0)+"----"+rp7.charAt(5)+"---";
					break;
				case 10:
					sh7=rp7.charAt(0)+"-----"+rp7.charAt(6)+"---";
					break;
				case 11:
					sh7=rp7.charAt(0)+"-----"+rp7.charAt(7)+"----";
					break;
				case 12:
					sh7=rp7.charAt(0)+"-----"+rp7.charAt(8)+"----"+rp7.charAt(11);
					break;
				case 13:
					sh7=rp7.charAt(0)+"------"+rp7.charAt(9)+"----"+rp7.charAt(12);
					break;
				case 14:
					sh7=rp7.charAt(0)+"------"+rp7.charAt(10)+"-----"+rp7.charAt(13);
					break;
				case 15:
					sh7=rp7.charAt(0)+"-------"+rp7.charAt(11)+"-----"+rp7.charAt(14);
					break;
						}
				// l aide : 
				
				JLabel lblNewLabel_6_2_1_2_1_1 = new JLabel(sh7);
				lblNewLabel_6_2_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_2_1_2_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_2_1_2_1_1.setBounds(112, 396, 128, 27);
				contentPane.add(lblNewLabel_6_2_1_2_1_1);
				
				// la zone de texte :
				
				textField_8 = new JTextField();
				textField_8.setColumns(10);
				textField_8.setBounds(250, 396, 158, 27);
				contentPane.add(textField_8);
				
				// la reponse : 
				
				JLabel lblNewLabel_6_2_2_1_2 = new JLabel("Reponse 4 :");
				lblNewLabel_6_2_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_2_2_1_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_2_2_1_2.setBounds(556, 404, 90, 27);
				contentPane.add(lblNewLabel_6_2_2_1_2);
				
				// l aide  :
				
				rp8=Quest_rep_j2.get(3).substring(Quest_rep_j2.get(3).indexOf(':')+1);
				
				
				int L7=rp7.length();
				
				switch(L7) {
				case 6:
					sh8=rp8.charAt(0)+"-----";
					break;
				case 7:
					sh8=rp8.charAt(0)+"------";
					break;
				case 8:
					sh8=rp8.charAt(0)+"-------";
					break;
				case 9:
					sh8=rp8.charAt(0)+"----"+rp8.charAt(5)+"---";
					break;
				case 10:
					sh8=rp8.charAt(0)+"-----"+rp8.charAt(6)+"---";
					break;
				case 11:
					sh8=rp8.charAt(0)+"-----"+rp8.charAt(7)+"----";
					break;
				case 12:
					sh8=rp8.charAt(0)+"-----"+rp8.charAt(8)+"----"+rp8.charAt(11);
					break;
				case 13:
					sh8=rp8.charAt(0)+"------"+rp8.charAt(9)+"----"+rp8.charAt(12);
					break;
				case 14:
					sh8=rp8.charAt(0)+"------"+rp8.charAt(10)+"-----"+rp8.charAt(13);
					break;
				case 15:
					sh8=rp8.charAt(0)+"-------"+rp8.charAt(11)+"-----"+rp8.charAt(14);
					break;
						}
				
				// l aide : 
				
				JLabel lblNewLabel_6_2_1_2_1_2 = new JLabel(sh8);
				lblNewLabel_6_2_1_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_2_1_2_1_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_2_1_2_1_2.setBounds(656, 404, 128, 27);
				contentPane.add(lblNewLabel_6_2_1_2_1_2);
				
				// la zone de texte :
				
				textField_9 = new JTextField();
				textField_9.setColumns(10);
				textField_9.setBounds(794, 404, 158, 27);
				contentPane.add(textField_9);
				

				
				//____________________________________________Question 5 _____________________________________________________________________
				
				JLabel lblNewLabel_6_6_2 = new JLabel("Question 5 :");
				lblNewLabel_6_6_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_6_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_6_2.setBounds(10, 432, 90, 27);
				contentPane.add(lblNewLabel_6_6_2);
				
				JLabel lblNewLabel_6_6_3 = new JLabel("Question 5 :");
				lblNewLabel_6_6_3.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_6_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_6_3.setBounds(556, 441, 90, 27);
				contentPane.add(lblNewLabel_6_6_3);
				
				
				
				JLabel lblNewLabel_7_2_1_1_1 = new JLabel(Quest_rep_j1.get(4).substring(0, Quest_rep_j1.get(4).indexOf(':')));
				lblNewLabel_7_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_7_2_1_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_7_2_1_1_1.setBounds(112, 432, 419, 27);
				contentPane.add(lblNewLabel_7_2_1_1_1);
				
				JLabel lblNewLabel_7_2_1_1_2 = new JLabel(Quest_rep_j1.get(4).substring(0, Quest_rep_j1.get(4).indexOf(':')));
				lblNewLabel_7_2_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_7_2_1_1_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_7_2_1_1_2.setBounds(642, 441, 419, 27);
				contentPane.add(lblNewLabel_7_2_1_1_2);
				
				// la reponse :
				
				JLabel lblNewLabel_6_2_2_1_1_1 = new JLabel("Reponse 5 :");
				lblNewLabel_6_2_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_2_2_1_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_2_2_1_1_1.setBounds(10, 474, 90, 27);
				contentPane.add(lblNewLabel_6_2_2_1_1_1);
				
				// l aide :
				
				rp9=Quest_rep_j1.get(4).substring(Quest_rep_j1.get(4).indexOf(':')+1);
				
				
				int L8=rp9.length();
				
				switch(L8) {
				case 6:
					sh9=rp9.charAt(0)+"-----";
					break;
				case 7:
					sh9=rp9.charAt(0)+"------";
					break;
				case 8:
					sh9=rp9.charAt(0)+"-------";
					break;
				case 9:
					sh9=rp9.charAt(0)+"----"+rp9.charAt(5)+"---";
					break;
				case 10:
					sh9=rp9.charAt(0)+"-----"+rp9.charAt(6)+"---";
					break;
				case 11:
					sh9=rp9.charAt(0)+"-----"+rp9.charAt(7)+"----";
					break;
				case 12:
					sh9=rp9.charAt(0)+"-----"+rp9.charAt(8)+"----"+rp9.charAt(11);
					break;
				case 13:
					sh9=rp9.charAt(0)+"------"+rp9.charAt(9)+"----"+rp9.charAt(12);
					break;
				case 14:
					sh9=rp9.charAt(0)+"------"+rp9.charAt(10)+"-----"+rp9.charAt(13);
					break;
				case 15:
					sh9=rp9.charAt(0)+"-------"+rp9.charAt(11)+"-----"+rp9.charAt(14);
					break;
						}
				
				//l aide :
				
				JLabel lblNewLabel_6_2_1_2_1_1_1 = new JLabel(sh9);
				lblNewLabel_6_2_1_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_2_1_2_1_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_2_1_2_1_1_1.setBounds(112, 474, 128, 27);
				contentPane.add(lblNewLabel_6_2_1_2_1_1_1);
				
				// la zone de texte : 
				
				
				textField_10 = new JTextField();
				textField_10.setColumns(10);
				textField_10.setBounds(250, 480, 158, 27);
				contentPane.add(textField_10);
				
				// la reponse :
				
				
				JLabel lblNewLabel_6_2_2_1_1_2 = new JLabel("Reponse 5 :");
				lblNewLabel_6_2_2_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_2_2_1_1_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_2_2_1_1_2.setBounds(556, 480, 90, 27);
				contentPane.add(lblNewLabel_6_2_2_1_1_2);
				
				// l aide :
				
				rp10=Quest_rep_j1.get(4).substring(Quest_rep_j1.get(4).indexOf(':')+1);
				
				
				int L9=rp10.length();
				
				switch(L9) {
				case 6:
					sh10=rp10.charAt(0)+"-----";
					break;
				case 7:
					sh10=rp10.charAt(0)+"------";
					break;
				case 8:
					sh10=rp10.charAt(0)+"-------";
					break;
				case 9:
					sh10=rp10.charAt(0)+"----"+rp10.charAt(5)+"---";
					break;
				case 10:
					sh10=rp10.charAt(0)+"-----"+rp10.charAt(6)+"---";
					break;
				case 11:
					sh10=rp10.charAt(0)+"-----"+rp10.charAt(7)+"----";
					break;
				case 12:
					sh10=rp10.charAt(0)+"-----"+rp10.charAt(8)+"----"+rp10.charAt(11);
					break;
				case 13:
					sh10=rp10.charAt(0)+"------"+rp10.charAt(9)+"----"+rp10.charAt(12);
					break;
				case 14:
					sh10=rp10.charAt(0)+"------"+rp10.charAt(10)+"-----"+rp10.charAt(13);
					break;
				case 15:
					sh10=rp10.charAt(0)+"-------"+rp10.charAt(11)+"-----"+rp10.charAt(14);
					break;
						}
				
				//l aide :
				
				JLabel lblNewLabel_6_2_1_2_1_1_2 = new JLabel(sh10);
				lblNewLabel_6_2_1_2_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_6_2_1_2_1_1_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
				lblNewLabel_6_2_1_2_1_1_2.setBounds(656, 480, 128, 27);
				contentPane.add(lblNewLabel_6_2_1_2_1_1_2);

				
				// la zone de texte : 
				
				textField_11 = new JTextField();
				textField_11.setColumns(10);
				textField_11.setBounds(794, 480, 158, 27);
				contentPane.add(textField_11);
				
	
				
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		btnNewButton.setBounds(339, 62, 205, 45);
		contentPane.add(btnNewButton);
		
		
		
		JButton btnNewButton_1 = new JButton("Valider\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField_2.getText()==rp1)
				{
					score_J1=score_J1+1;
				}
				if(textField_3.getText()==rp2)
				{
					score_J2=score_J2+1;
				}
				if(textField_4.getText()==rp3)
				{
					score_J1=score_J1+1;
				}
				if(textField_5.getText()==rp4)
				{
					score_J2=score_J2+1;
				}
				if(textField_6.getText()==rp5)
				{
					score_J1=score_J1+1;
				}
				if(textField_7.getText()==rp6)
				{
					score_J2=score_J2+1;
				}
				if(textField_8.getText()==rp7)
				{
					score_J1=score_J1+1;
				}
				if(textField_9.getText()==rp8)
				{
					score_J2=score_J2+1;
				}
				if(textField_10.getText()==rp9)
				{
					score_J1=score_J1+1;
				}
				if(textField_11.getText()==rp10)
				{
					score_J2=score_J2+1;
				}
			
				JOptionPane.showMessageDialog(null, "Jouer 1 est gagant (score: 3 PTS )");
			
			}
		});
		btnNewButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		btnNewButton_1.setBounds(387, 525, 157, 45);
		contentPane.add(btnNewButton_1);
		
	}	
}
