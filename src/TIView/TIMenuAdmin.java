package TIView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import TIDao.FilmeDAO;
import TIModel.TIFilme;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TIMenuAdmin extends JFrame {
	public TIMenuAdmin() {
		getContentPane().setLayout(null);
		
		JButton cadastroSessao = new JButton("cadastro sessao");
		cadastroSessao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TICadastroDeSessao().setVisible(true);
				setVisible(false);
			}
		});
		cadastroSessao.setBounds(37, 6, 389, 29);
		getContentPane().add(cadastroSessao);
		
		JButton cadastroIngressos = new JButton("cadastro ingressos");
		cadastroIngressos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TICadastroDeIngressos().setVisible(true);
				setVisible(false);
			}
		});
		cadastroIngressos.setBounds(37, 34, 389, 29);
		getContentPane().add(cadastroIngressos);
		
		JButton cadastroFilmes = new JButton("cadastro filmes");
		cadastroFilmes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TICdastroDeFilmes().setVisible(true);
				setVisible(false);
			}
		});
		cadastroFilmes.setBounds(37, 62, 389, 29);
		getContentPane().add(cadastroFilmes);
		
		JButton cadastroUsuario = new JButton("cadastro usuario");
		cadastroUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TICadastroDeUsuarios().setVisible(true);
				setVisible(false);
			}
		});
		cadastroUsuario.setBounds(37, 91, 389, 29);
		getContentPane().add(cadastroUsuario);
	}

	private JPanel contentPane;
	private JTextField campoTitulo;
	private JTextField campoDiretor;
	private JTextField campoClassificacao;
	
	FilmeDAO filmeDAO = new FilmeDAO();
	TIFilme filmeModel = new TIFilme();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TICdastroDeFilmes frame = new TICdastroDeFilmes();
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
	public TICdastroDeFilmes() {
		setTitle("Sistema de cinemas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);// fixar tamanho tela
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitulo = new JLabel("Titulo:");
		lblTitulo.setBounds(16, 44, 61, 16);
		contentPane.add(lblTitulo);

		JLabel lblDiretor = new JLabel("Diretor:");
		lblDiretor.setBounds(16, 72, 61, 16);
		contentPane.add(lblDiretor);

		JLabel lblClassificacao = new JLabel("Classificacao:");
		lblClassificacao.setBounds(16, 100, 87, 16);
		contentPane.add(lblClassificacao);

		campoTitulo = new JTextField();
		campoTitulo.setBounds(79, 39, 279, 26);
		contentPane.add(campoTitulo);
		campoTitulo.setColumns(10);

		campoDiretor = new JTextField();
		campoDiretor.setBounds(79, 67, 279, 26);
		contentPane.add(campoDiretor);
		campoDiretor.setColumns(10);

		campoClassificacao = new JTextField();
		campoClassificacao.setBounds(115, 95, 243, 26);
		contentPane.add(campoClassificacao);
		campoClassificacao.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String titulo = campoTitulo.getText();
				String diretor = campoDiretor.getText();
				String classificacao = campoClassificacao.getText();
		
				
					filmeModel.setClassificacao(classificacao);
					filmeModel.setDiretor(diretor);
					filmeModel.setTitulo(titulo);
					
					filmeDAO.inserir(filmeModel);
					

			}
		});
		btnCadastrar.setBounds(175, 172, 117, 29);
		contentPane.add(btnCadastrar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idFilme = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o codigo do cliente "));

				filmeDAO.excluir(idFilme);
			}
		});
		btnExcluir.setBounds(46, 172, 117, 29);
		contentPane.add(btnExcluir);


		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campoClassificacao.setText("");
				campoDiretor.setText("");
				campoTitulo.setText("");
				
			}
		});
		btnCancelar.setBounds(185, 213, 117, 29);
		contentPane.add(btnCancelar);
	}
}
