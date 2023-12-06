import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Jeux extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jeux frame = new Jeux();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Jeux() {
		setTitle("Jeux de Ala Khmiri Hiba Koubaa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 946, 605);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(223, 223, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenue dans le Quiz !");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 49));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(119, 37, 578, 66);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\programmation java\\jeux.png"));
		lblNewLabel_1.setBounds(707, 10, 133, 120);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\programmation java\\Bioman-Avatar-3-Blue-icon.png"));
		lblNewLabel_2.setBounds(134, 195, 133, 160);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\programmation java\\Bioman-Avatar-1-Red-icon.png"));
		lblNewLabel_3.setBounds(604, 206, 133, 147);
		contentPane.add(lblNewLabel_3);
		
		// Donnez les des Nom pour les icons des deux joueurs : 
		
		JLabel lblNewLabel_4 = new JLabel("Joueur 1");
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 26));
		lblNewLabel_4.setBounds(144, 341, 107, 33);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Joueur 2");
		lblNewLabel_4_1.setForeground(Color.BLACK);
		lblNewLabel_4_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 26));
		lblNewLabel_4_1.setBounds(614, 341, 107, 33);
		contentPane.add(lblNewLabel_4_1);
		
		// Chaque joueur doit tapez son nom dans la zone de Text :
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(new Color(240, 240, 240));
		textField.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(134, 383, 133, 33);
		contentPane.add(textField);
		
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBackground(new Color(240, 240, 240));
		textField_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(604, 383, 133, 33);
		contentPane.add(textField_1);
		
		// L ajout d un boutton pour commencer le jeux : 
		
		JButton btnNewButton = new JButton("commencer");
		// on fait une action pour passer de fenetre de l accuiel de jeux pour commencer le Quiz : 
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quiz f= new Quiz();
				f.lblNewLabel_2.setText(textField.getText());
				f.lblNewLabel_3.setText(textField_1.getText());
				f.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 24));
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.setBounds(345, 455, 179, 53);
		contentPane.add(btnNewButton);
	}
}
