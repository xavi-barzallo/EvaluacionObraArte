package ec.ups.edu.eva.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.namespace.QName;

import ec.ups.edu.eva.EVA_Barzallo_Xavier_CLI.Obra;
import ec.ups.edu.eva.EVA_Barzallo_Xavier_CLI.ObrasServiceSOAP;
import ec.ups.edu.eva.EVA_Barzallo_Xavier_CLI.ObrasServiceSOAPService;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VistaObraArte extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtAltura;
	private JTextField txtDescripcion;
	private static ObrasServiceSOAP port;
	JTextArea textArea;
	/**
	 * Launch the application.
	 */
	
	
	private static final QName SERVICE_NAME = new QName("http://bean.eva.edu.ups.ec/", "ObrasServiceSOAPService");


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
        URL wsdlURL = ObrasServiceSOAPService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        ObrasServiceSOAPService ss = new ObrasServiceSOAPService(wsdlURL, SERVICE_NAME);
         port = ss.getObrasServiceSOAPPort();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaObraArte frame = new VistaObraArte();
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
	public VistaObraArte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Codigo = new JLabel("Codigo");
		Codigo.setBounds(10, 32, 45, 13);
		contentPane.add(Codigo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 64, 45, 13);
		contentPane.add(lblNombre);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(10, 107, 45, 13);
		contentPane.add(lblAltura);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(10, 152, 45, 13);
		contentPane.add(lblDescripcion);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(72, 29, 96, 19);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(72, 61, 96, 19);
		contentPane.add(txtNombre);
		
		txtAltura = new JTextField();
		txtAltura.setColumns(10);
		txtAltura.setBounds(72, 104, 96, 19);
		contentPane.add(txtAltura);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(72, 149, 96, 19);
		contentPane.add(txtDescripcion);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ObtenerDatos();
			}
		});
		btnGuardar.setBounds(53, 199, 85, 21);
		contentPane.add(btnGuardar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ListarObras();
			}
		});
		btnListar.setBounds(263, 199, 85, 21);
		contentPane.add(btnListar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(233, 46, 193, 119);
		contentPane.add(scrollPane);
		
		 textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
	public void ObtenerDatos() {
		Obra o = new Obra();
		
		String codigo = txtCodigo.getText();
		String nombre = txtNombre.getText();
		String altura = txtAltura.getText();
		String descripcion = txtDescripcion.getText();
		int Alt = Integer.parseInt(altura);
		
		o.setCodigo(descripcion);
		o.setCodigo(codigo);
		o.setNombreOb(nombre);
		o.setAltura(Alt);
		
        java.lang.String _crearContacto__return = port.crearContacto(o);
		
	}
	public void ListarObras() {
        java.util.List<ec.ups.edu.eva.EVA_Barzallo_Xavier_CLI.Obra> getContactos= port.getContactos();
        
        for(int i=0;i<getContactos.size();i++) {
        	textArea.append(getContactos.toString()+"\n");
        }
	}
}
