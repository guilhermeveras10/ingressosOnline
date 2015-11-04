package TIView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TIListaFilmes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TIListaFilmes frame = new TIListaFilmes();
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
	public TIListaFilmes() {
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
		lblNewLabel.setIcon(new ImageIcon("/Users/GuilhermeDuarte/Dropbox/Capturas de tela/Captura de tela 2015-10-13 17.09.57.png"));
		lblNewLabel.setBounds(54, 53, 159, 212);
		contentPane.add(lblNewLabel);
		
		JLabel lblFilmes = new JLabel("Filmes");
		lblFilmes.setBounds(44, 23, 61, 16);
		contentPane.add(lblFilmes);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TICompra().setVisible(true);  
			    setVisible(false);  
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setIcon(new ImageIcon("/Users/GuilhermeDuarte/Dropbox/Capturas de tela/Captura de tela 2015-10-13 17.15.46.png"));
		btnNewButton.setBounds(54, 267, 61, 30);
		contentPane.add(btnNewButton);
		setLocationRelativeTo(null);// fixar no centro da tela
	}

}
