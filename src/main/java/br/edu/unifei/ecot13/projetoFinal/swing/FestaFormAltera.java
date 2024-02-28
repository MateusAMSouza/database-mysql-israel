package br.edu.unifei.ecot13.projetoFinal.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import br.edu.unifei.ecot13.projetoFinal.Festa;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JButton;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FestaFormAltera {

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
					FestaFormAltera window = new FestaFormAltera();
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
	public FestaFormAltera() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 375, 190);
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
		txtMes.setEnabled(false);
		txtMes.setBounds(100, 33, 80, 20);
		frame.getContentPane().add(txtMes);
		txtMes.setColumns(10);
		
		txtMotivo = new JTextField();
		txtMotivo.setEnabled(false);
		txtMotivo.setBounds(100, 83, 150, 20);
		frame.getContentPane().add(txtMotivo);
		txtMotivo.setColumns(10);
		
		final JSpinner spnDuracaoDias = new JSpinner();
		spnDuracaoDias.setEnabled(false);
		spnDuracaoDias.setBounds(100, 58, 80, 20);
		frame.getContentPane().add(spnDuracaoDias);
		
		final JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				festa.setNome(txtNome.getText());
				txtNome.setEnabled(false);
				festa.setMes(txtMes.getText());;
				txtMes.setEnabled(false);
				festa.setDuracaoDias((Integer)spnDuracaoDias.getValue());
				spnDuracaoDias.setEnabled(false);
				festa.setMotivo(txtMotivo.getText());
				txtMotivo.setEnabled(false);
				txtNome.setEnabled(true);

				em.getTransaction().begin();
				em.merge(festa);
				em.getTransaction().commit();	
			}
		});
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(100, 114, 80, 23);
		frame.getContentPane().add(btnAlterar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				festa=em.find(Festa.class, txtNome.getText());
				if(festa != null)
				{
					txtNome.setEnabled(false);
					txtMes.setEnabled(true);
					txtMes.setText(festa.getMes());
					spnDuracaoDias.setEnabled(true);
					spnDuracaoDias.setValue((Integer)festa.getDuracaoDias());
					txtMotivo.setEnabled(true);
					txtMotivo.setText(festa.getMotivo());
					btnAlterar.setEnabled(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Festa não existe");
				}			
			}
		});
		btnBuscar.setBounds(260, 7, 80, 23);
		frame.getContentPane().add(btnBuscar);
		
	}
}
