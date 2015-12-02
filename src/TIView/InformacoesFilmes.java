package TIView;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.border.MatteBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class InformacoesFilmes extends JFrame {

	private JPanel MainPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InformacoesFilmes frame = new InformacoesFilmes();
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
	public InformacoesFilmes() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		MainPane = new JPanel();
		MainPane.setBackground(Color.DARK_GRAY);
		MainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(MainPane);
		MainPane.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel divEsquerdaDaMainPane = new JPanel();
		divEsquerdaDaMainPane.setBackground(Color.GRAY);
		MainPane.add(divEsquerdaDaMainPane);
		divEsquerdaDaMainPane.setLayout(null);

		JButton button = new JButton("");
		button.setIcon(new ImageIcon("/Users/GuilhermeDuarte/Downloads/ImageResizer.net - yz9pythpg5i87zr.png"));
		button.setBounds(6, 6, 125, 180);
		divEsquerdaDaMainPane.add(button);

		JButton button_1 = new JButton("Voltar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Filmes().setVisible(true);
				setVisible(false);
			}
		});
		button_1.setBounds(6, 222, 88, 38);
		divEsquerdaDaMainPane.add(button_1);

		JPanel divEsquerdaDaMain = new JPanel();
		divEsquerdaDaMain.setBackground(Color.GRAY);
		MainPane.add(divEsquerdaDaMain);
		divEsquerdaDaMain.setLayout(new GridLayout(2, 0, 0, 0));

		JPanel divSuperior = new JPanel();
		divSuperior.setBackground(Color.GRAY);
		divEsquerdaDaMain.add(divSuperior);
		divSuperior.setLayout(null);

		JLabel lblSesses = new JLabel("SESSÕES");
		lblSesses.setForeground(Color.WHITE);
		lblSesses.setBounds(85, 112, 61, 16);
		divSuperior.add(lblSesses);

		JLabel lblDescrioDoFilme = new JLabel("Descrição do Filme:");
		lblDescrioDoFilme.setBounds(6, 6, 140, 16);
		divSuperior.add(lblDescrioDoFilme);

		JPanel divInferior = new JPanel();
		divEsquerdaDaMain.add(divInferior);
		divInferior.setLayout(new GridLayout(2, 0, 0, 0));

		JPanel panel = new JPanel();
		divInferior.add(panel);
		panel.setLayout(new GridLayout(1, 4, 0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 1, 0, 0));

		JPanel sessao01a = new JPanel();
		sessao01a.setBackground(Color.RED);
		panel_1.add(sessao01a);
		sessao01a.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblNewLabel = new JLabel("12:30");
		sessao01a.add(lblNewLabel);

		JPanel sessao01b = new JPanel();
		sessao01b.setBackground(Color.RED);
		panel_1.add(sessao01b);
		sessao01b.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JRadioButton sessao01 = new JRadioButton("");
		sessao01b.add(sessao01);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.RED);
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(2, 0, 0, 0));

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.RED);
		panel_2.add(panel_6);
		panel_6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel label = new JLabel("16:00");
		panel_6.add(label);

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.RED);
		panel_2.add(panel_7);
		panel_7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JRadioButton sessao02 = new JRadioButton("");
		panel_7.add(sessao02);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 0, 0));
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(2, 0, 0, 0));

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.RED);
		panel_3.add(panel_8);
		panel_8.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel label_1 = new JLabel("18:30");
		panel_8.add(label_1);

		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.RED);
		panel_3.add(panel_9);
		panel_9.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JRadioButton sessao03 = new JRadioButton("");
		panel_9.add(sessao03);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.RED);
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(2, 0, 0, 0));

		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.RED);
		panel_4.add(panel_10);
		panel_10.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel label_2 = new JLabel("20:00");
		panel_10.add(label_2);

		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.RED);
		panel_4.add(panel_11);
		panel_11.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JRadioButton sessao04 = new JRadioButton("");
		panel_11.add(sessao04);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.GRAY);
		divInferior.add(panel_5);
		panel_5.setLayout(null);

		JButton botaoComprar = new JButton("Comprar");
		botaoComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int contSessaoSelecionada = 0;

				if (sessao01.isSelected())
					contSessaoSelecionada++;
				if (sessao02.isSelected())
					contSessaoSelecionada++;
				if (sessao03.isSelected())
					contSessaoSelecionada++;
				if (sessao04.isSelected())
					contSessaoSelecionada++;

				if (contSessaoSelecionada == 1) {
					new Compra().setVisible(true);
					setVisible(false);
				} else {
					if (contSessaoSelecionada > 1) {
						JOptionPane.showMessageDialog(null, "Mais de uma sessão selecionada.");
					} else {
						JOptionPane.showMessageDialog(null, "Selecione uma sessão.");

					}
				}

			}
		});
		botaoComprar.setBounds(126, 23, 88, 38);
		panel_5.add(botaoComprar);
	}
}
