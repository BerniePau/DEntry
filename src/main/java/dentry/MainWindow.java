package dentry;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Color;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JTextField txtFechaPractica;
	private JTextField txtNumAfiliado;
	private JTextField txtCodPractica;
	private JTextField txtCantidad;
	private JTextField txtNumRecepcion;
	private JTextField txtMonto;
	private JTextField txtPath;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 399);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		txtFechaPractica = new JTextField();
		txtFechaPractica.setColumns(10);
		
		JLabel lblFechaPrctica = new JLabel("Fecha Pr\u00E1ctica");
		
		txtNumAfiliado = new JTextField();
		txtNumAfiliado.setColumns(10);
		
		txtCodPractica = new JTextField();
		txtCodPractica.setColumns(10);
		
		JLabel lblCdigoPrctica = new JLabel("C\u00F3digo Pr\u00E1ctica");
		
		JLabel lblNmeroAfiliado = new JLabel("N\u00FAmero Afiliado");
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		
		txtNumRecepcion = new JTextField();
		txtNumRecepcion.setColumns(10);
		
		JLabel lblNmDeRecepcin = new JLabel("N\u00FAm. de Recepci\u00F3n");
		
		txtMonto = new JTextField();
		txtMonto.setColumns(10);
		
		JLabel lblMonto = new JLabel("Monto");
		
		JButton btnAceptar = new JButton("Aceptar >");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO evaluar txtFields por argumento
				actionAceptar();
			}
		});
		
		txtPath = new JTextField();
		txtPath.setColumns(10);
		
		JLabel lblRuta = new JLabel("Ruta");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblCdigoPrctica)
						.addComponent(lblFechaPrctica)
						.addComponent(lblNmDeRecepcin)
						.addComponent(lblRuta))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtPath, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(txtCodPractica, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtFechaPractica, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
									.addGap(45)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblMonto)
										.addComponent(lblNmeroAfiliado)
										.addComponent(lblCantidad)))
								.addComponent(txtNumRecepcion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAceptar))
							.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtMonto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNumAfiliado, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(96))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(54)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFechaPrctica)
						.addComponent(txtFechaPractica, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNmeroAfiliado)
						.addComponent(txtNumAfiliado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtCodPractica, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCdigoPrctica)
						.addComponent(txtCantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCantidad))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNumRecepcion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNmDeRecepcin)
						.addComponent(txtMonto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMonto))
					.addGap(55)
					.addComponent(btnAceptar)
					.addGap(36)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtPath, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRuta))
					.addContainerGap(52, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		
		rellenarPrueba();
	}
	
	public void actionAceptar(){
		
		Registro registro = new Registro(Dominio.getNumeroLinea());
		
		Dominio.setFilePath(txtPath.getText());
		
		registro.setFechaPractica(txtFechaPractica.getText());
		registro.setNumeroAfiliado(txtNumAfiliado.getText());
		registro.setCodigoPractica(txtCodPractica.getText());
		registro.setCantidad(Integer.parseInt(txtCantidad.getText()));
		registro.setNumeroRecepcion(Integer.parseInt(txtNumRecepcion.getText()));
		registro.setMonto(Float.parseFloat(txtMonto.getText()));
		
		try {
			registro.armar();
			Dominio.addRegistro(registro);
			Dominio.autoGuardado();
			
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		
		limpiarPantalla();
		rellenarPrueba();
	}

	private void limpiarPantalla() {
		
		txtFechaPractica.setText("");
		txtNumAfiliado.setText("");
		txtCodPractica.setText("");
		txtCantidad.setText("");
		txtNumRecepcion.setText("");
		txtMonto.setText("");
	
	}
	
	// TODDO ELIMINAR
	public void rellenarPrueba(){
		txtFechaPractica.setText("25062017");
		txtNumAfiliado.setText("1234567899");
		txtCodPractica.setText("101");
		txtCantidad.setText("22");
		txtNumRecepcion.setText("333");
		txtMonto.setText("1000");
		
		txtPath.setText("C:\\Users\\Usuario\\AppData\\Local\\Temp\\DEntry_TMP.txt");
	}
}
