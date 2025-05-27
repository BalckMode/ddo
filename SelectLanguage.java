package project;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class SelectLanguage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton tamilButton, englishButton;
	private JLabel lblSelectLanguage;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				SelectLanguage frame = new SelectLanguage();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		});
	}

	public SelectLanguage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblSelectLanguage = new JLabel("SELECT LANGUAGE");
		lblSelectLanguage.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblSelectLanguage.setBounds(180, 30, 300, 40);
		contentPane.add(lblSelectLanguage);

		tamilButton = new JButton("தமிழ்");
		tamilButton.setFont(new Font("Lohit Tamil", Font.BOLD, 26));
		tamilButton.setBounds(150, 100, 300, 80);
		contentPane.add(tamilButton);

		englishButton = new JButton("ENGLISH");
		englishButton.setFont(new Font("Tahoma", Font.BOLD, 26));
		englishButton.setBounds(150, 200, 300, 80);
		contentPane.add(englishButton);

		// Add Action Listeners
		tamilButton.addActionListener(e -> openLoginPage("தமிழ்"));
		englishButton.addActionListener(e -> openLoginPage("English"));
	}

	private void openLoginPage(String language) {
		 JOptionPane.showMessageDialog(this,"You Selected" + language + "Language"));
	}
}
