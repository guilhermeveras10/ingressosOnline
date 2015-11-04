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

public class TIEscolhe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TIEscolhe frame = new TIEscolhe();
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
	public TIEscolhe() {
		setTitle("Sistema de cinemas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);//fixar tamanho tela 
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSessoes = new JLabel("Sessoes");
		lblSessoes.setBounds(23, 18, 61, 16);
		contentPane.add(lblSessoes);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/GuilhermeDuarte/Dropbox/Capturas de tela/Captura de tela 2015-10-13 17.22.07.png"));
		lblNewLabel.setBounds(43, 54, 173, 150);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TIFinalizaCompra().setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(124, 93, 61, 29);
		contentPane.add(btnNewButton);
		setLocationRelativeTo(null);// fixar no centro da tela
	}

}
