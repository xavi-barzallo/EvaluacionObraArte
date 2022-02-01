package ec.ups.edu.eva.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.namespace.QName;

import ec.ups.edu.eva.EVA_Barzallo_Xavier_CLI.ObrasServiceSOAP;
import ec.ups.edu.eva.EVA_Barzallo_Xavier_CLI.ObrasServiceSOAPService;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CrearObra extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtAltura;
	private JTextField txtDescripcion;

	/**
	 * Launch the application.
	 */
	
	private static final QName SERVICE_NAME = new QName("http://bean.eva.edu.ups.ec/", "ObrasServiceSOAPService");
	
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
        ObrasServiceSOAP port = ss.getObrasServiceSOAPPort();

        {
        System.out.println("Invoking getContactos...");
        java.util.List<ec.ups.edu.eva.EVA_Barzallo_Xavier_CLI.Obra> _getContactos__return = port.getContactos();
        System.out.println("getContactos.result=" + _getContactos__return);


        }
        {
        System.out.println("Invoking crearContacto...");
        ec.ups.edu.eva.EVA_Barzallo_Xavier_CLI.Obra _crearContacto_arg0 = null;
        
       
        
        java.lang.String _crearContacto__return = port.crearContacto(_crearContacto_arg0);
        System.out.println("crearContacto.result=" + _crearContacto__return);


        }

        System.exit(0);
	}

	/**
	 * Create the frame.
	 */
	public CrearObra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo");
		lblNewLabel.setBounds(33, 31, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(33, 71, 45, 13);
		contentPane.add(lblNombre);
		
		JLabel lblNewLabel_1_1 = new JLabel("Altura");
		lblNewLabel_1_1.setBounds(33, 119, 45, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Descripcion");
		lblNewLabel_1_1_1.setBounds(33, 160, 45, 13);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(94, 28, 96, 19);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(94, 68, 96, 19);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(88, 116, 96, 19);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(88, 157, 96, 19);
		contentPane.add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(87, 201, 85, 21);
		contentPane.add(btnGuardar);
	}
}
