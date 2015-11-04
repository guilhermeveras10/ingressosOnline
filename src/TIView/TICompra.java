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

public class TICompra extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TICompra frame = new TICompra();
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
	public TICompra() {
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
		lblNewLabel.setBounds(36, 47, 178, 214);
		contentPane.add(lblNewLabel);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TIEscolhe().setVisible(true);
				setVisible(false);
			}
		});
		btnComprar.setBounds(50, 389, 117, 29);
		contentPane.add(btnComprar);
		
		JLabel lblNewLabel_1 = new JLabel("Teste");
		lblNewLabel_1.setBounds(249, 63, 228, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("Teste");
		label.setBounds(249, 91, 228, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Teste");
		label_1.setBounds(249, 146, 228, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Teste");
		label_2.setBounds(249, 119, 228, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Teste");
		label_3.setBounds(249, 175, 228, 16);
		contentPane.add(label_3);
		setLocationRelativeTo(null);// fixar no centro da tela
	}
}
