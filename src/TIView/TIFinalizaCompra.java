package TIView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class TIFinalizaCompra extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TIFinalizaCompra frame = new TIFinalizaCompra();
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
	public TIFinalizaCompra() {
		setTitle("Sistema de cinemas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);//fixar tamanho tela 
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblA = new JLabel("A");
		lblA.setBounds(37, 37, 61, 16);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("B");
		lblB.setBounds(37, 80, 61, 16);
		contentPane.add(lblB);
		
		JButton btnAssento = new JButton("assento");
		btnAssento.setBounds(110, 32, 78, 29);
		contentPane.add(btnAssento);
		setLocationRelativeTo(null);// fixar no centro da tela
	}

}
