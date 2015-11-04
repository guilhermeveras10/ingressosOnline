package TIView;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TILogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TILogin frame = new TILogin();
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
	public TILogin() {
		setTitle("Sistema de cinemas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);//fixar tamanho tela 
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);// fixar no centro da tela
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/GuilhermeDuarte/Desktop/logo.png"));
		lblNewLabel.setBounds(152, 6, 187, 152);
		contentPane.add(lblNewLabel);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(16, 179, 61, 16);
		contentPane.add(lblLogin);
		
		textField = new JTextField();
		textField.setBounds(89, 174, 370, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(16, 207, 37, 16);
		contentPane.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(89, 202, 370, 26);
		contentPane.add(passwordField);
		
		JButton btnAcessar = new JButton("Acessar");
		btnAcessar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "acesso garantido");
				new TIListaFilmes().setVisible(true);  
			    setVisible(false); 
			}
		});
		btnAcessar.setBounds(42, 235, 117, 29);
		contentPane.add(btnAcessar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TICadastro().setVisible(true);  
			    setVisible(false);  
			}
		});
		btnCadastrar.setBounds(42, 276, 117, 29);
		contentPane.add(btnCadastrar);
		
		JButton btnEsqueci = new JButton("Esqueci");
		btnEsqueci.setBounds(194, 235, 117, 29);
		contentPane.add(btnEsqueci);
	}
}
