package TIView;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Compra extends JFrame {

	private JPanel MainPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Compra frame = new Compra();
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
	public Compra() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		MainPane = new JPanel();
		MainPane.setBackground(Color.DARK_GRAY);
		MainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(MainPane);
		MainPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel salaDeCinema = new JPanel();
		salaDeCinema.setBackground(Color.GRAY);
		MainPane.add(salaDeCinema);
		salaDeCinema.setLayout(new GridLayout(7, 0, 0, 0));
		
		JPanel texto = new JPanel();
		texto.setBackground(Color.GRAY);
		salaDeCinema.add(texto);
		
		JPanel fileiraE = new JPanel();
		fileiraE.setBackground(Color.GREEN);
		salaDeCinema.add(fileiraE);
		fileiraE.setLayout(new GridLayout(0, 5, 0, 0));
		
		JPanel linha01e = new JPanel();
		linha01e.setBackground(Color.GREEN);
		fileiraE.add(linha01e);
		linha01e.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton assentoE1 = new JButton("E1");
		assentoE1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assentoE1.setEnabled(false);
				linha01e.setBackground(Color.RED);
			}
		});
		linha01e.add(assentoE1);
		
		JPanel linha02e = new JPanel();
		linha02e.setBackground(Color.GREEN);
		fileiraE.add(linha02e);
		linha02e.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton assentoE2 = new JButton("E2");
		assentoE2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assentoE2.setEnabled(false);
				linha02e.setBackground(Color.RED);
			}
		});
		linha02e.add(assentoE2);
		
		JPanel linha03e = new JPanel();
		linha03e.setBackground(Color.GREEN);
		fileiraE.add(linha03e);
		linha03e.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton assentoE3 = new JButton("E3");
		assentoE3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assentoE3.setEnabled(false);
				linha03e.setBackground(Color.RED);
			}
		});
		linha03e.add(assentoE3);
		
		JPanel linha04e = new JPanel();
		linha04e.setBackground(Color.GREEN);
		fileiraE.add(linha04e);
		linha04e.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton assentoE4 = new JButton("E4");
		assentoE4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assentoE4.setEnabled(false);
				linha04e.setBackground(Color.RED);
			}
		});
		linha04e.add(assentoE4);
		
		JPanel linha05e = new JPanel();
		linha05e.setBackground(Color.GREEN);
		fileiraE.add(linha05e);
		linha05e.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton assentoE5 = new JButton("E5");
		assentoE5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assentoE5.setEnabled(false);
				linha05e.setBackground(Color.RED);
			}
		});
		linha05e.add(assentoE5);
		
		JPanel fileiraD = new JPanel();
		fileiraD.setBackground(Color.GREEN);
		salaDeCinema.add(fileiraD);
		fileiraD.setLayout(new GridLayout(0, 5, 0, 0));
		
		JPanel linha01d = new JPanel();
		linha01d.setBackground(Color.GREEN);
		fileiraD.add(linha01d);
		linha01d.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton assentoD1 = new JButton("D1");
		assentoD1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assentoD1.setEnabled(false);
				linha01d.setBackground(Color.RED);
			}
		});
		linha01d.add(assentoD1);
		
		JPanel linha02d = new JPanel();
		linha02d.setBackground(Color.GREEN);
		fileiraD.add(linha02d);
		linha02d.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton assentoD2 = new JButton("D2");
		assentoD2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assentoD2.setEnabled(false);
				linha02d.setBackground(Color.RED);
			}
		});
		linha02d.add(assentoD2);
		
		JPanel linha03d = new JPanel();
		linha03d.setBackground(Color.GREEN);
		fileiraD.add(linha03d);
		linha03d.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton assentoD3 = new JButton("D3");
		assentoD3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assentoD3.setEnabled(false);
				linha03d.setBackground(Color.RED);
			}
		});
		linha03d.add(assentoD3);
		
		JPanel linha04d = new JPanel();
		linha04d.setBackground(Color.GREEN);
		fileiraD.add(linha04d);
		linha04d.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton assentoD4 = new JButton("D4");
		assentoD4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assentoD4.setEnabled(false);
				linha04d.setBackground(Color.RED);
			}
		});
		linha04d.add(assentoD4);
		
		JPanel linha05d = new JPanel();
		linha05d.setBackground(Color.GREEN);
		fileiraD.add(linha05d);
		linha05d.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton assentoD5 = new JButton("D5");
		assentoD5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assentoD5.setEnabled(false);
				linha05d.setBackground(Color.RED);
			}
		});
		linha05d.add(assentoD5);
		
		JPanel fileiraC = new JPanel();
		fileiraC.setBackground(Color.GREEN);
		salaDeCinema.add(fileiraC);
		fileiraC.setLayout(new GridLayout(0, 5, 0, 0));
		
		JPanel linha01c = new JPanel();
		linha01c.setBackground(Color.GREEN);
		fileiraC.add(linha01c);
		linha01c.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton assentoC1 = new JButton("C1");
		assentoC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assentoC1.setEnabled(false);
				linha01c.setBackground(Color.RED);
			}
		});
		linha01c.add(assentoC1);
		
		JPanel linha02c = new JPanel();
		linha02c.setBackground(Color.GREEN);
		fileiraC.add(linha02c);
		linha02c.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton assentoC2 = new JButton("C2");
		assentoC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assentoC2.setEnabled(false);
				linha02c.setBackground(Color.RED);
			}
		});
		linha02c.add(assentoC2);
		
		JPanel linha03c = new JPanel();
		linha03c.setBackground(Color.GREEN);
		fileiraC.add(linha03c);
		linha03c.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton assentoC3 = new JButton("C3");
		assentoC3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assentoC3.setEnabled(false);
				linha03c.setBackground(Color.RED);
			}
		});
		linha03c.add(assentoC3);
		
		JPanel linha04c = new JPanel();
		linha04c.setBackground(Color.GREEN);
		fileiraC.add(linha04c);
		linha04c.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton assentoC4 = new JButton("C4");
		assentoC4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assentoC4.setEnabled(false);
				linha04c.setBackground(Color.RED);
			}
		});
		linha04c.add(assentoC4);
		
		JPanel linha05c = new JPanel();
		linha05c.setBackground(Color.GREEN);
		fileiraC.add(linha05c);
		linha05c.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton assentoC5 = new JButton("C5");
		assentoC5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assentoC5.setEnabled(false);
				linha05c.setBackground(Color.RED);
			}
		});
		linha05c.add(assentoC5);
		
		JPanel fileiraB = new JPanel();
		fileiraB.setBackground(Color.GREEN);
		salaDeCinema.add(fileiraB);
		fileiraB.setLayout(new GridLayout(0, 5, 0, 0));
		
		JPanel linha01b = new JPanel();
		linha01b.setBackground(Color.GREEN);
		fileiraB.add(linha01b);
		linha01b.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton assentoB1 = new JButton("B1");
		assentoB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assentoB1.setEnabled(false);
				linha01b.setBackground(Color.RED);
			}
		});
		linha01b.add(assentoB1);
		
		JPanel linha02b = new JPanel();
		linha02b.setBackground(Color.GREEN);
		fileiraB.add(linha02b);
		linha02b.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton assentoB2 = new JButton("B2");
		assentoB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assentoB2.setEnabled(false);
				linha02b.setBackground(Color.RED);
			}
		});
		linha02b.add(assentoB2);
		
		JPanel linha03b = new JPanel();
		linha03b.setBackground(Color.GREEN);
		fileiraB.add(linha03b);
		linha03b.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton assentoB3 = new JButton("B3");
		assentoB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assentoB3.setEnabled(false);
				linha03b.setBackground(Color.RED);
			}
		});
		linha03b.add(assentoB3);
		
		JPanel linha04b = new JPanel();
		linha04b.setBackground(Color.GREEN);
		fileiraB.add(linha04b);
		linha04b.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton assentoB4 = new JButton("B4");
		assentoB4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assentoB4.setEnabled(false);
				linha04b.setBackground(Color.RED);
			}
		});
		linha04b.add(assentoB4);
		
		JPanel linha05b = new JPanel();
		linha05b.setBackground(Color.GREEN);
		fileiraB.add(linha05b);
		linha05b.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton assentoB5 = new JButton("B5");
		assentoB5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assentoB5.setEnabled(false);
				linha05b.setBackground(Color.RED);
			}
		});
		linha05b.add(assentoB5);
		
		JPanel fileiraA = new JPanel();
		fileiraA.setBackground(Color.GREEN);
		salaDeCinema.add(fileiraA);
		fileiraA.setLayout(new GridLayout(0, 5, 0, 0));
		
		JPanel voltar = new JPanel();
		voltar.setBackground(Color.GRAY);
		fileiraA.add(voltar);
		voltar.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new InformacoesFilmes().setVisible(true);
				setVisible(false);
			}
		});
		voltar.add(btnNewButton);
		
		JPanel linha01a = new JPanel();
		linha01a.setBackground(Color.GREEN);
		fileiraA.add(linha01a);
		linha01a.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton assentoA1 = new JButton("A1");
		assentoA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assentoA1.setEnabled(false);
				linha01a.setBackground(Color.RED);
			}
		});
		linha01a.add(assentoA1);
		
		JPanel linha02a = new JPanel();
		linha02a.setBackground(Color.GREEN);
		fileiraA.add(linha02a);
		linha02a.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton assentoA2 = new JButton("A2");
		assentoA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assentoA2.setEnabled(false);
				linha02a.setBackground(Color.RED);
			}
		});
		linha02a.add(assentoA2);
		
		JPanel linha03a = new JPanel();
		linha03a.setBackground(Color.GREEN);
		fileiraA.add(linha03a);
		linha03a.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton assentoA3 = new JButton("A3");
		assentoA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assentoA3.setEnabled(false);
				linha03a.setBackground(Color.RED);
			}
		});
		linha03a.add(assentoA3);
		
		JPanel comprar = new JPanel();
		comprar.setBackground(Color.GRAY);
		fileiraA.add(comprar);
		comprar.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int contAssentosMarcados=0;
				if(linha01a.getBackground()==Color.RED)
					contAssentosMarcados++;
				if(linha02a.getBackground()==Color.RED)
					contAssentosMarcados++;
				if(linha03a.getBackground()==Color.RED)
					contAssentosMarcados++;
				if(linha01b.getBackground()==Color.RED)
					contAssentosMarcados++;
				if(linha02b.getBackground()==Color.RED)
					contAssentosMarcados++;
				if(linha03b.getBackground()==Color.RED)
					contAssentosMarcados++;
				if(linha04b.getBackground()==Color.RED)
					contAssentosMarcados++;
				if(linha05b.getBackground()==Color.RED)
					contAssentosMarcados++;
				if(linha01c.getBackground()==Color.RED)
					contAssentosMarcados++;
				if(linha02c.getBackground()==Color.RED)
					contAssentosMarcados++;
				if(linha03c.getBackground()==Color.RED)
					contAssentosMarcados++;
				if(linha04c.getBackground()==Color.RED)
					contAssentosMarcados++;
				if(linha05c.getBackground()==Color.RED)
					contAssentosMarcados++;
				if(linha01d.getBackground()==Color.RED)
					contAssentosMarcados++;
				if(linha02d.getBackground()==Color.RED)
					contAssentosMarcados++;
				if(linha03d.getBackground()==Color.RED)
					contAssentosMarcados++;
				if(linha04d.getBackground()==Color.RED)
					contAssentosMarcados++;
				if(linha05d.getBackground()==Color.RED)
					contAssentosMarcados++;
				if(linha01e.getBackground()==Color.RED)
					contAssentosMarcados++;
				if(linha02e.getBackground()==Color.RED)
					contAssentosMarcados++;
				if(linha03e.getBackground()==Color.RED)
					contAssentosMarcados++;
				if(linha04e.getBackground()==Color.RED)
					contAssentosMarcados++;
				if(linha05e.getBackground()==Color.RED)
					contAssentosMarcados++;
				
				
				if(contAssentosMarcados>0){
					System.out.println(contAssentosMarcados);
					new FinalizarCompra().setVisible(true);
					setVisible(false);
				} else {
					System.out.println(contAssentosMarcados);
					JOptionPane.showMessageDialog(null, "Nenhum assento selecionado");
				}
				
				
				
				
			}
		});
		comprar.add(btnComprar);
		
		JPanel tela = new JPanel();
		tela.setBackground(Color.GRAY);
		salaDeCinema.add(tela);
		tela.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(152, 6, 134, 27);
		tela.add(panel);
		
		JLabel lblTela = new JLabel("TELA");
		lblTela.setForeground(Color.WHITE);
		panel.add(lblTela);
		texto.setLayout(null);
		texto.setLayout(null);
		
		JLabel lblSelecioneAasCadeiraas = new JLabel("SELECIONE A(AS) CADEIRA(AS)");
		lblSelecioneAasCadeiraas.setForeground(Color.WHITE);
		lblSelecioneAasCadeiraas.setBounds(118, 6, 200, 16);
		texto.add(lblSelecioneAasCadeiraas);
	}
}
