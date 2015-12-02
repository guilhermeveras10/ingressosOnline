package TIView;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import TIDao.FilmeDAO;

import java.awt.GridLayout;
import java.awt.Color;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Filmes extends JFrame {

	private static final int String = 0;

	private JPanel MainPane;

	/**
	 * Launch the application.
	 */
	FilmeDAO filmeDAO = new FilmeDAO();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Filmes frame = new Filmes();
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
	public Filmes() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		MainPane = new JPanel();
		MainPane.setBackground(Color.DARK_GRAY);
		MainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(MainPane);
		MainPane.setLayout(new GridLayout(1, 0, 0, 0));

		JPanel div1_MainPane = new JPanel();
		div1_MainPane.setBackground(Color.GRAY);
		MainPane.add(div1_MainPane);
		div1_MainPane.setLayout(null);
		
		JButton imagemFilme = new JButton("");
		imagemFilme.setIcon(new ImageIcon("/Users/GuilhermeDuarte/Downloads/ImageResizer.net - yz9pythpg5i87zr.png"));
		imagemFilme.setBounds(160, 26, 125, 180);
		div1_MainPane.add(imagemFilme);
		
		JButton botaoSobre = new JButton("Sobre");
		botaoSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new InformacoesFilmes().setVisible(true);
				setVisible(false);
			}
		});
		botaoSobre.setBounds(182, 210, 88, 38);
		div1_MainPane.add(botaoSobre);
		
		JLabel lblFilme = new JLabel("Titulo");
		lblFilme.setBounds(53, 38, 61, 16);
		div1_MainPane.add(lblFilme);
		
		JLabel lblNewLabel = new JLabel("classificacao");
		lblNewLabel.setBounds(53, 62, 98, 16);
		div1_MainPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Diretor");
		lblNewLabel_1.setBounds(53, 90, 61, 16);
		div1_MainPane.add(lblNewLabel_1);
		
		
	
	}
}
