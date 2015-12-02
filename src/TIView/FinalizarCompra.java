package TIView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FinalizarCompra extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinalizarCompra frame = new FinalizarCompra();
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
	public FinalizarCompra() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel MainPane = new JPanel();
		MainPane.setBackground(Color.DARK_GRAY);
		MainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(MainPane);
		MainPane.setLayout(new GridLayout(1, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		MainPane.add(panel);
		panel.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblInformaesDaCompra = new JLabel("INFORMAÇÕES DA COMPRA");
		lblInformaesDaCompra.setForeground(Color.WHITE);
		panel_1.add(lblInformaesDaCompra);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.GRAY);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton botaoFinalizar = new JButton("Gerar Relatório");
		botaoFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Relatório Gerado");

			}
		});
		botaoFinalizar.setBounds(292, 50, 142, 38);
		panel_3.add(botaoFinalizar);
		
		JButton button = new JButton("Finalizar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Compra Finalizada.");
				setVisible(false);
			}
		});
		button.setBounds(203, 50, 88, 38);
		panel_3.add(button);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Compra().setVisible(true);
				setVisible(false);
			}
		});
		btnVoltar.setBounds(6, 50, 88, 38);
		panel_3.add(btnVoltar);
	}
}
