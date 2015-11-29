package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Color;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Filmes extends JFrame {

	private JPanel MainPane;

	/**
	 * Launch the application.
	 */
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
		div1_MainPane.setLayout(new GridLayout(2, 3, 0, 0));

		JPanel conteinerFilme1 = new JPanel();
		conteinerFilme1.setBackground(Color.GRAY);
		div1_MainPane.add(conteinerFilme1);
		conteinerFilme1.setLayout(null);

		JPanel bannerFilme1 = new JPanel();
		bannerFilme1.setBounds(38, 5, 76, 88);
		conteinerFilme1.add(bannerFilme1);
		bannerFilme1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton sobre = new JButton("Sobre");
		sobre.setBounds(38, 97, 76, 23);
		conteinerFilme1.add(sobre);

		JPanel conteinerFilme2 = new JPanel();
		conteinerFilme2.setBackground(Color.GRAY);
		div1_MainPane.add(conteinerFilme2);
		conteinerFilme2.setLayout(null);

		JPanel bannerFilme2 = new JPanel();
		bannerFilme2.setBounds(38, 6, 76, 88);
		conteinerFilme2.add(bannerFilme2);
		
		JButton sobre2 = new JButton("Sobre");
		sobre2.setBounds(38, 97, 76, 23);
		conteinerFilme2.add(sobre2);

		JPanel conteinerFilme3 = new JPanel();
		conteinerFilme3.setBackground(Color.GRAY);
		div1_MainPane.add(conteinerFilme3);
		conteinerFilme3.setLayout(null);

		JPanel bannerFilme3 = new JPanel();
		bannerFilme3.setBounds(38, 6, 76, 88);
		conteinerFilme3.add(bannerFilme3);
		
		JButton btnNewButton = new JButton("Sobre");
		btnNewButton.setBounds(38, 97, 76, 23);
		conteinerFilme3.add(btnNewButton);

		JPanel conteinerFilme4 = new JPanel();
		conteinerFilme4.setBackground(Color.GRAY);
		div1_MainPane.add(conteinerFilme4);
		conteinerFilme4.setLayout(null);

		JPanel bannerFilme4 = new JPanel();
		bannerFilme4.setBounds(38, 5, 76, 88);
		conteinerFilme4.add(bannerFilme4);
		
		JButton sobre4 = new JButton("Sobre");
		sobre4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		sobre4.setBounds(38, 97, 76, 23);
		conteinerFilme4.add(sobre4);

		JPanel conteinerFilme5 = new JPanel();
		conteinerFilme5.setBackground(Color.GRAY);
		div1_MainPane.add(conteinerFilme5);
		conteinerFilme5.setLayout(null);

		JPanel bannerFilme5 = new JPanel();
		bannerFilme5.setBounds(38, 5, 76, 88);
		conteinerFilme5.add(bannerFilme5);
		
		JButton sobre5 = new JButton("Sobre");
		sobre5.setBounds(38, 97, 76, 23);
		conteinerFilme5.add(sobre5);

		JPanel conteinerFilme6 = new JPanel();
		conteinerFilme6.setBackground(Color.GRAY);
		div1_MainPane.add(conteinerFilme6);
		conteinerFilme6.setLayout(null);

		JPanel bannerFilme6 = new JPanel();
		bannerFilme6.setBounds(38, 6, 76, 88);
		conteinerFilme6.add(bannerFilme6);
		
		JButton sobre6 = new JButton("Sobre");
		sobre6.setBounds(38, 97, 76, 23);
		conteinerFilme6.add(sobre6);
	}
}
