package TIView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TICadastro extends JFrame {

	private JPanel contentPane;
	private JTextField campoLogin;
	private JPasswordField campoSenha;
	private JPasswordField campoRepeteSenha;
	private JTextField campoChave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TICadastro frame = new TICadastro();
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
	public TICadastro() {
		setTitle("Sistema de cinemas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);//fixar tamanho tela 
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/GuilhermeDuarte/Documents/Algoritmos/AlgoritmosJava/Trabalho/img/logo.png"));
		lblNewLabel.setBounds(160, 6, 176, 190);
		contentPane.add(lblNewLabel);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(23, 226, 61, 16);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(23, 254, 61, 16);
		contentPane.add(lblSenha);
		
		JLabel lblRepitaASenha = new JLabel("Repita a senha");
		lblRepitaASenha.setBounds(23, 282, 112, 16);
		contentPane.add(lblRepitaASenha);
		
		JLabel lblNewLabel_1 = new JLabel("Chave para obter senha");
		lblNewLabel_1.setBounds(23, 310, 170, 16);
		contentPane.add(lblNewLabel_1);
		
		campoLogin = new JTextField();
		campoLogin.setBounds(73, 221, 344, 26);
		contentPane.add(campoLogin);
		campoLogin.setColumns(10);
		
		campoSenha = new JPasswordField();
		campoSenha.setBounds(73, 249, 344, 26);
		contentPane.add(campoSenha);
		
		campoRepeteSenha = new JPasswordField();
		campoRepeteSenha.setBounds(120, 277, 297, 26);
		contentPane.add(campoRepeteSenha);
		
		campoChave = new JTextField();
		campoChave.setBounds(23, 333, 394, 26);
		contentPane.add(campoChave);
		campoChave.setColumns(10);
		
		JButton cadastrar = new JButton("Cadastrar");
		cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TILogin().setVisible(true);
				setVisible(false);
			}
		});
		cadastrar.setBounds(23, 394, 117, 29);
		contentPane.add(cadastrar);
		setLocationRelativeTo(null);// fixar no centro da tela
	}
}
