package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import my.projet.connection.Connexion;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuClient extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuClient frame = new MenuClient();
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
	public MenuClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
	
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Gestion des clients");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 24));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 584, 73);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				AjouterClient obj=new AjouterClient();
				obj.setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Wissal\\Pictures\\t\u00E9l\u00E9charg\u00E9.jpg"));
		btnNewButton.setBounds(10, 64, 185, 205);
		contentPane.add(btnNewButton);
			
		JLabel lblNewLabel_2 = new JLabel("Cr\u00E9er un client");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(20, 280, 175, 29);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Wissal\\Pictures\\images.jpg"));
		btnNewButton_1.setBounds(237, 64, 185, 205);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Supprimer un client");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(247, 280, 175, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Chercher un client");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(475, 282, 177, 27);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Wissal\\Pictures\\moteur-de-recherche.png"));
		btnNewButton_2.setBounds(465, 64, 187, 205);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Wissal\\Downloads\\raphael_pensil-edit_flat-circle-white-on-aqua_512x512-ConvertImage.png"));
		btnNewButton_3.setBounds(68, 320, 185, 167);
		contentPane.add(btnNewButton_3);
	
		JLabel lblNewLabel_5 = new JLabel("Modifier un client");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(68, 499, 185, 27);
		contentPane.add(lblNewLabel_5);
		
	
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\Wissal\\Downloads\\liste-ConvertImage.png"));
		btnNewButton_4.setBounds(379, 320, 175, 167);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_6 = new JLabel("Liste des clients");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(379, 499, 175, 22);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Wissal\\Pictures\\Images\\Lenovo P2894.jpg"));
		lblNewLabel.setBounds(0, 0, 684, 561);
		contentPane.add(lblNewLabel);
		
		
		
		
	}

}
