package View;
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
		MainPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel div1_MainPane = new JPanel();
		MainPane.add(div1_MainPane);
		div1_MainPane.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel div1_div1_MainPane = new JPanel();
		div1_div1_MainPane.setBackground(Color.GRAY);
		div1_MainPane.add(div1_div1_MainPane);
		div1_div1_MainPane.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel div1_div1_div1_MainPane = new JPanel();
		div1_div1_div1_MainPane.setBackground(Color.GRAY);
		div1_div1_MainPane.add(div1_div1_div1_MainPane);
		
		JPanel div2_div1_div1_MainPane = new JPanel();
		div1_div1_MainPane.add(div2_div1_div1_MainPane);
		
		JPanel div3_div1_div1_MainPane = new JPanel();
		div3_div1_div1_MainPane.setBackground(Color.GRAY);
		div1_div1_MainPane.add(div3_div1_div1_MainPane);
		div3_div1_div1_MainPane.setLayout(new GridLayout(4, 2, 0, 0));
		
		JPanel conteinerSala1 = new JPanel();
		conteinerSala1.setBorder(new MatteBorder(5, 3, 1, 1, (Color) new Color(128, 128, 128)));
		conteinerSala1.setBackground(Color.RED);
		div3_div1_div1_MainPane.add(conteinerSala1);
		conteinerSala1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel conteinerHorario1 = new JPanel();
		conteinerHorario1.setBackground(Color.GRAY);
		div3_div1_div1_MainPane.add(conteinerHorario1);
		conteinerHorario1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel conteinerSala2 = new JPanel();
		conteinerSala2.setBorder(new MatteBorder(5, 3, 1, 1, (Color) new Color(128, 128, 128)));
		conteinerSala2.setBackground(Color.RED);
		div3_div1_div1_MainPane.add(conteinerSala2);
		conteinerSala2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel conteinerHorario2 = new JPanel();
		conteinerHorario2.setBackground(Color.GRAY);
		div3_div1_div1_MainPane.add(conteinerHorario2);
		conteinerHorario2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel conteinerSala3 = new JPanel();
		conteinerSala3.setBackground(Color.RED);
		conteinerSala3.setBorder(new MatteBorder(5, 3, 1, 1, (Color) Color.GRAY));
		div3_div1_div1_MainPane.add(conteinerSala3);
		conteinerSala3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel conteinerHorario3 = new JPanel();
		conteinerHorario3.setBackground(Color.GRAY);
		div3_div1_div1_MainPane.add(conteinerHorario3);
		conteinerHorario3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel conteinerSala4 = new JPanel();
		conteinerSala4.setBorder(new MatteBorder(5, 3, 1, 1, (Color) Color.GRAY));
		conteinerSala4.setBackground(Color.RED);
		div3_div1_div1_MainPane.add(conteinerSala4);
		conteinerSala4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel conteinerHorario4 = new JPanel();
		conteinerHorario4.setBackground(Color.GRAY);
		div3_div1_div1_MainPane.add(conteinerHorario4);
		conteinerHorario4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel div2_div1_MainPane = new JPanel();
		div2_div1_MainPane.setBackground(Color.GRAY);
		div1_MainPane.add(div2_div1_MainPane);
		div2_div1_MainPane.setLayout(null);
		
		JButton botaoComprar = new JButton("Comprar Ingresso");
		botaoComprar.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		botaoComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botaoComprar.setBounds(6, 99, 117, 29);
		div2_div1_MainPane.add(botaoComprar);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		botaoVoltar.setBounds(323, 99, 117, 29);
		div2_div1_MainPane.add(botaoVoltar);
		
		JTextPane areaTextoDescricao = new JTextPane();
		areaTextoDescricao.setBackground(Color.LIGHT_GRAY);
		areaTextoDescricao.setBounds(34, 24, 382, 63);
		div2_div1_MainPane.add(areaTextoDescricao);
		
		JLabel textoDescricaodoFilme = new JLabel("Descrição do Filme:");
		textoDescricaodoFilme.setBounds(34, 6, 164, 16);
		div2_div1_MainPane.add(textoDescricaodoFilme);
	}
}
