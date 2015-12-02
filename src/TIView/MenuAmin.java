package TIView;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MenuAmin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAmin frame = new MenuAmin();
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
	public MenuAmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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

}
