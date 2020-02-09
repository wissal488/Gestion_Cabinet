package Forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import my.projet.connection.Connexion;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Authentification extends JFrame {

	private JFrame frame;
	private JTextField textField;
	private JLabel loginfeild;
	private JLabel passwordfeild;
	private JLabel lblNewLabel_3;
	private JPasswordField passwordfield;
	
	Connection con=null;
	ResultSet resultat=null;
	PreparedStatement ps=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Authentification window = new Authentification();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Authentification() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		con=Connexion.getConnection();
		
		
		textField = new JTextField();
		textField.setBounds(203, 135, 177, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		loginfeild = new JLabel("Login");
		loginfeild.setFont(new Font("SansSerif", Font.BOLD, 13));
		loginfeild.setBounds(127, 134, 60, 29);
		frame.getContentPane().add(loginfeild);
		
		passwordfield = new JPasswordField();
		passwordfield.setBounds(203, 172, 177, 29);
		frame.getContentPane().add(passwordfield);
		
		
		passwordfeild = new JLabel("Password");
		passwordfeild.setFont(new Font("SansSerif", Font.BOLD, 13));
		passwordfeild.setBounds(127, 176, 77, 25);
		frame.getContentPane().add(passwordfeild);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Wissal\\Downloads\\I-Grande-18224-plaquette-gravee-cabinet-medical-h-80-x-l-200-mm-gamme-couleur.net-ConvertImage.jpg"));
		lblNewLabel_3.setBounds(67, 0, 584, 124);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Se connecter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String login=loginfeild.getText().toString();
				String password=passwordfield.getText().toString();
				
				String req="select login,password from users";
				try {
					
					ps = con.prepareStatement(req);
					resultat=ps.executeQuery();
					int i=0;
					if(login.equals("") || password.equals("")) {
						JOptionPane.showMessageDialog(null, "Remplissez les champs vides!");
					}
					else {
						while(resultat.next()) {
						String login1=resultat.getString("login");
						String password1=resultat.getString("password");
						
						if(!login1.equals(login) && !password1.equals(password))
						{
							JOptionPane.showMessageDialog(null, "Connexion échouée!! Informations incorrectes!!");
							i=0;
						}
						else { 
							i=1;
						}
						if(i!=0) 
						{
							JOptionPane.showMessageDialog(null, "Connexion réussie.");
							MenuClient obj=new MenuClient();
							obj.setVisible(true);
						}
					}
					}
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.err.println("Ereur SQL!");
				}
			}
		});
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 13));
		btnNewButton.setBounds(244, 215, 112, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Wissal\\Pictures\\Images\\Lenovo P2894.jpg"));
		lblNewLabel.setBounds(0, 0, 584, 361);
		frame.getContentPane().add(lblNewLabel);	
		
	}
}
