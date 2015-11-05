package TIView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.transform.sax.SAXTransformerFactory;

import TIDao.sessaoDAO;
import TIModel.TISala;
import TIModel.TISessao;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.awt.event.ActionEvent;

public class TICadastroDeSessao extends JFrame {

	private JPanel contentPane;
	private JTextField campoHorario;
	private JTextField campoSala;

	sessaoDAO sessionDAO = new sessaoDAO();
	TISessao sessaoMODEL = new TISessao();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TICadastroDeSessao frame = new TICadastroDeSessao();
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
	public TICadastroDeSessao() {
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
		lblNewLabel.setBounds(145, 6, 190, 151);
		contentPane.add(lblNewLabel);
		
		JLabel lblHorario = new JLabel("Horario:");
		lblHorario.setBounds(22, 215, 61, 16);
		contentPane.add(lblHorario);
		
		JLabel lblSala = new JLabel("Sala:");
		lblSala.setBounds(22, 261, 61, 16);
		contentPane.add(lblSala);
		
		campoHorario = new JTextField();
		campoHorario.setBounds(95, 210, 279, 26);
		contentPane.add(campoHorario);
		campoHorario.setColumns(10);
		
		campoSala = new JTextField();
		campoSala.setColumns(10);
		campoSala.setBounds(95, 256, 279, 26);
		contentPane.add(campoSala);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				Time horario = Time.valueOf(campoHorario.getText());
				int salaInt = Integer.parseInt(campoSala.getText());
			
				TISala salaID = new TISala();
				salaID.setIdSala(salaInt);
				
				sessaoMODEL.setHorario(horario);
				sessaoMODEL.setSala(salaID);
				
				sessionDAO.inserir(sessaoMODEL);
				
				
			}
		});
		btnCadastrar.setBounds(57, 331, 117, 29);
		contentPane.add(btnCadastrar);
		
		JButton cancelar = new JButton("Cancerlar");
		cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TICadastroDeUsuarios().setVisible(true);  
			    setVisible(false); 
			}
		});
		cancelar.setBounds(258, 331, 117, 29);
		contentPane.add(cancelar);
		
	}

}
