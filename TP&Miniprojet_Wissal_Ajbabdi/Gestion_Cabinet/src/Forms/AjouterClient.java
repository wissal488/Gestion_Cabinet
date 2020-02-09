package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import my.projet.connection.Connexion;
import my.projet.service.ClientService;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AjouterClient extends JFrame {

	private JPanel contentPane;


	Connection con=null;
	PreparedStatement ps=null;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_5;
	private JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjouterClient frame = new AjouterClient();
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
	public AjouterClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		con=Connexion.getConnection();

		JLabel lblNewLabel_1 = new JLabel("Nom :");
		lblNewLabel_1.setBounds(68, 110, 144, 46);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(231, 108, 226, 54);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(231, 184, 226, 54);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(231, 261, 226, 54);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(231, 340, 226, 54);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Pr\u00E9nom :");
		lblNewLabel_2.setBounds(44, 187, 168, 45);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Titre :");
		lblNewLabel_3.setBounds(53, 268, 168, 37);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Version :");
		lblNewLabel_4.setBounds(59, 346, 153, 38);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Ajouter un client");
		lblNewLabel_5.setBounds(139, 5, 421, 54);
		lblNewLabel_5.setFont(new Font("SansSerif", Font.BOLD, 27));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_5);
		
		
		btnNewButton = new JButton("Ajouter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql="insert into clients(VERSION, TITRE, NOM, PRENOM) values(?,?,?,?)"; 
				try {
					ps=con.prepareStatement(sql);
					ps.setString(1, textField.getText().toString());
					ps.setString(2, textField_1.getText().toString());
					ps.setString(3, textField_2.getText().toString());
					ps.setString(4, textField_3.getText().toString());
					
					JOptionPane.showMessageDialog(null, "Client ajouté.");
				}catch(SQLException e1) {
					e1.printStackTrace();
				}
			
			}
		});
		btnNewButton.setBounds(298, 423, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Wissal\\Pictures\\Images\\Lenovo P2894.jpg"));
		lblNewLabel.setBounds(10, 5, 679, 556);
		contentPane.add(lblNewLabel);
		
		
	
	}

}
