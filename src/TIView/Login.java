package TIView;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import TIDao.UsuarioDAO;
import TIModel.TIUsuario;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author barbaraperina
 *
 */

public class Login extends JFrame {
	private JPasswordField textoSenha;
	private JTextField textoLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel MainPane = new JPanel();
		MainPane.setBackground(Color.DARK_GRAY);
		MainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(MainPane);
		MainPane.setLayout(new GridLayout(3, 0, 0, 0));

		JPanel div1_MainPane = new JPanel();
		div1_MainPane.setBackground(Color.GRAY);
		MainPane.add(div1_MainPane);

		JLabel lblIngressosOnline = new JLabel("INGRESSOS ONLINE");
		div1_MainPane.add(lblIngressosOnline);

		JPanel div2_MainPane = new JPanel();
		div2_MainPane.setBackground(Color.GRAY);
		MainPane.add(div2_MainPane);
		div2_MainPane.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel div1_div2_MainPane = new JPanel();
		div1_div2_MainPane.setBackground(Color.GRAY);
		div2_MainPane.add(div1_div2_MainPane);
		div1_div2_MainPane.setLayout(new GridLayout(2, 0, 0, 0));

		JPanel div1_div1_div2_MainPane = new JPanel();
		div1_div1_div2_MainPane.setBackground(Color.GRAY);
		div1_div2_MainPane.add(div1_div1_div2_MainPane);
		div1_div1_div2_MainPane.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));

		JLabel login = new JLabel("Login");
		div1_div1_div2_MainPane.add(login);

		JPanel div2_div1_div2_MainPane = new JPanel();
		div2_div1_div2_MainPane.setBackground(Color.GRAY);
		div1_div2_MainPane.add(div2_div1_div2_MainPane);
		div2_div1_div2_MainPane.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));

		JLabel senha = new JLabel("Senha");
		div2_div1_div2_MainPane.add(senha);

		JPanel div2_div2_MainPane = new JPanel();
		div2_div2_MainPane.setBackground(Color.GRAY);
		div2_MainPane.add(div2_div2_MainPane);
		div2_div2_MainPane.setLayout(new GridLayout(2, 0, 0, 0));

		textoLogin = new JTextField();
		div2_div2_MainPane.add(textoLogin);
		textoLogin.setColumns(10);

		textoSenha = new JPasswordField();
		div2_div2_MainPane.add(textoSenha);

		JPanel div3_MainPane = new JPanel();
		div3_MainPane.setBackground(Color.GRAY);
		MainPane.add(div3_MainPane);
		div3_MainPane.setLayout(new GridLayout(3, 0, 0, 0));

		JPanel div1_div3_MainPane = new JPanel();
		div1_div3_MainPane.setBackground(Color.GRAY);
		div3_MainPane.add(div1_div3_MainPane);
		div1_div3_MainPane.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel div1_div1_div3_MainPane = new JPanel();
		div1_div1_div3_MainPane.setBackground(Color.GRAY);
		div1_div3_MainPane.add(div1_div1_div3_MainPane);

		JPanel div2_div1_div3_MainPane = new JPanel();
		div2_div1_div3_MainPane.setBackground(Color.GRAY);
		div1_div3_MainPane.add(div2_div1_div3_MainPane);
		div2_div1_div3_MainPane.setLayout(new GridLayout(0, 2, 0, 0));

		JButton botaoEntrar = new JButton("Entrar");
		botaoEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsuarioDAO dao = new UsuarioDAO();
				String senha = String.valueOf(textoSenha.getPassword());
				TIUsuario usuario = dao.login(textoLogin.getText(), senha);
				if (usuario != null) {
					new Filmes().setVisible(true);
					setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "acesso negado");
				}
			}
		});
		botaoEntrar.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		div2_div1_div3_MainPane.add(botaoEntrar);

		JButton botaoRecuperarSenha = new JButton("Recuperar Senha");
		botaoRecuperarSenha.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		div2_div1_div3_MainPane.add(botaoRecuperarSenha);

		JPanel div2_div3_MainPane = new JPanel();
		div2_div3_MainPane.setBackground(Color.GRAY);
		div3_MainPane.add(div2_div3_MainPane);

		JPanel div3_div3_MainPane = new JPanel();
		div3_div3_MainPane.setBackground(Color.GRAY);
		div3_MainPane.add(div3_div3_MainPane);
		div3_div3_MainPane.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 10));

		JLabel desenvolvidoBy = new JLabel("Desenvolvido por Bárbara Perina e Guilherme Veras.");
		div3_div3_MainPane.add(desenvolvidoBy);
	}

}
