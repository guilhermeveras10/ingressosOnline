	package TIView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import TIDao.IngressoDAO;
import TIModel.TIIngresso;
import TIModel.TISessao;
import TIModel.TIUsuario;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TICadastroDeIngressos extends JFrame {

	private JPanel contentPane;
	private JTextField campoSessao;
	private JTextField campoUsuario;
	private JTextField campoData;
	
	
	TIIngresso ingressoMODEL = new TIIngresso();
	IngressoDAO ingressoDAO = new IngressoDAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TICadastroDeIngressos frame = new TICadastroDeIngressos();
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
	public TICadastroDeIngressos() {
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
		lblNewLabel.setBounds(156, 6, 211, 173);
		contentPane.add(lblNewLabel);
		
		JLabel lblSessao = new JLabel("Sessao:");
		lblSessao.setBounds(64, 199, 61, 16);
		contentPane.add(lblSessao);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setBounds(64, 280, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		campoSessao = new JTextField();
		campoSessao.setBounds(143, 194, 303, 26);
		contentPane.add(campoSessao);
		campoSessao.setColumns(10);
		
		campoUsuario = new JTextField();
		campoUsuario.setColumns(10);
		campoUsuario.setBounds(143, 275, 303, 26);
		contentPane.add(campoUsuario);
		
		JLabel lblData = new JLabel("data:");
		lblData.setBounds(64, 361, 61, 16);
		contentPane.add(lblData);
		
		campoData = new JTextField();
		campoData.setColumns(10);
		campoData.setBounds(137, 356, 303, 26);
		contentPane.add(campoData);
		
		JButton btnCadastrar = new JButton("cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sessao = Integer.parseInt(campoSessao.getText());
				int usuario = Integer.parseInt(campoUsuario.getText());
				String data = campoData.getText();
				
				TISessao sessaoID = new TISessao();
				sessaoID.setIdSessao(sessao);
				
				TIUsuario usuarioID =new TIUsuario();
				usuarioID.setIdUsuario(usuario);
				
				ingressoMODEL.setSessao(sessaoID);
				ingressoMODEL.setUsuario(usuarioID);
				ingressoMODEL.setData(data);
				
				ingressoDAO.inserir(ingressoMODEL);
				
			}
		});
		btnCadastrar.setBounds(103, 427, 117, 29);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TICadastroDeUsuarios().setVisible(true);  
			    setVisible(false); 
			}
		});
		btnCancelar.setBounds(300, 427, 117, 29);
		contentPane.add(btnCancelar);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenuAmin().setVisible(true);
				setVisible(false);
			}
		});
		btnMenu.setBounds(8, 6, 117, 29);
		contentPane.add(btnMenu);
		
	}

}
