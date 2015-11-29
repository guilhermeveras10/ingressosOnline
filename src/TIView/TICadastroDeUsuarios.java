package TIView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import TIDao.UsuarioDAO;
import TIModel.TIUsuario;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TICadastroDeUsuarios extends JFrame {

	private JPanel contentPane;
	private JTextField campoNome;
	private JTextField campoCpf;
	private JTextField campoEmail;
	private JPasswordField campoSenha;
	
	UsuarioDAO usuarioDAO = new UsuarioDAO();
	TIUsuario usuarioMODEL = new TIUsuario();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TICadastroDeUsuarios frame = new TICadastroDeUsuarios();
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
	public TICadastroDeUsuarios() {
		setTitle("Sistema de cinemas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);// fixar tamanho tela
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/guilhermeverasteixeiraduarte/Documents/Codigos/Trabalho/img/logo.png"));
		lblNewLabel.setBounds(149, 22, 196, 169);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setBounds(28, 212, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(28, 252, 61, 16);
		contentPane.add(lblCpf);
		
		JLabel lblE = new JLabel("E-mail:");
		lblE.setBounds(28, 292, 61, 16);
		contentPane.add(lblE);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(28, 334, 61, 16);
		contentPane.add(lblSenha);
		
		campoNome = new JTextField();
		campoNome.setBounds(101, 203, 290, 26);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		campoCpf = new JTextField();
		campoCpf.setColumns(10);
		campoCpf.setBounds(101, 247, 290, 26);
		contentPane.add(campoCpf);
		
		campoEmail = new JTextField();
		campoEmail.setColumns(10);
		campoEmail.setBounds(101, 287, 290, 26);
		contentPane.add(campoEmail);
		
		campoSenha = new JPasswordField();
		campoSenha.setBounds(101, 329, 290, 26);
		contentPane.add(campoSenha);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = campoNome.getText();
				String email = campoEmail.getText();
				String senha = String.valueOf(campoSenha.getPassword());
				int cpf = Integer.parseInt(campoCpf.getText());
				
				usuarioMODEL.setCPF(cpf);
				usuarioMODEL.setEmail(email);
				usuarioMODEL.setNome(nome);
				usuarioMODEL.setSenha(senha);
				
				usuarioDAO.cadastrar(usuarioMODEL);
				
			}
		});
		btnCadastrar.setBounds(28, 378, 117, 29);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TICadastroDeUsuarios().setVisible(true);  
			    setVisible(false); 

			}
		});
		btnCancelar.setBounds(209, 378, 117, 29);
		contentPane.add(btnCancelar);

		
	}
}
