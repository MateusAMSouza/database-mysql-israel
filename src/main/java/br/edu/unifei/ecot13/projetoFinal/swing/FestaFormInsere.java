package br.edu.unifei.ecot13.projetoFinal.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import br.edu.unifei.ecot13.projetoFinal.Festa;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JButton;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FestaFormInsere {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtMes;
	private JTextField txtMotivo;
	private EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("israelPU");
			private EntityManager em = emf.createEntityManager();
	private Festa festa;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FestaFormInsere window = new FestaFormInsere();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FestaFormInsere() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 330, 190);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNomeFesta = new JLabel("Nome da Festa:");
		lblNomeFesta.setBounds(10, 11, 80, 14);
		frame.getContentPane().add(lblNomeFesta);
		
		JLabel lblMes = new JLabel("Mês:");
		lblMes.setBounds(10, 36, 46, 14);
		frame.getContentPane().add(lblMes);
		
		JLabel lblDuracaoDias = new JLabel("Duração (dias):");
		lblDuracaoDias.setBounds(10, 61, 80, 14);
		frame.getContentPane().add(lblDuracaoDias);
		
		JLabel lblMotivo = new JLabel("Motivo:");
		lblMotivo.setBounds(10, 86, 46, 14);
		frame.getContentPane().add(lblMotivo);
		
		txtNome = new JTextField();
		txtNome.setBounds(100, 8, 150, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtMes = new JTextField();
		txtMes.setBounds(100, 33, 80, 20);
		frame.getContentPane().add(txtMes);
		txtMes.setColumns(10);
		
		txtMotivo = new JTextField();
		txtMotivo.setBounds(100, 83, 150, 20);
		frame.getContentPane().add(txtMotivo);
		txtMotivo.setColumns(10);
		
		final JSpinner spnDuracaoDias = new JSpinner();
		spnDuracaoDias.setBounds(100, 58, 80, 20);
		frame.getContentPane().add(spnDuracaoDias);
		
		final JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				festa = new Festa();
				festa.setNome(txtNome.getText());
				festa.setMes(txtMes.getText());;
				festa.setDuracaoDias((Integer)spnDuracaoDias.getValue());
				festa.setMotivo(txtMotivo.getText());
				txtNome.setEnabled(true);
				em.getTransaction().begin();
				em.persist(festa);
				em.getTransaction().commit();	
			}
		});
		btnInserir.setBounds(100, 114, 80, 23);
		frame.getContentPane().add(btnInserir);
		
	}
}
