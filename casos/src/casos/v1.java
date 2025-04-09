package casos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.parser.Parser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class v1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblSegundoNmero;
	private JLabel lblTercerNmero;
	private JTextField txtprimer;
	private JTextField txtsegundo;
	private JTextField txttercer;
	private JButton btnSumarTresEnteros;
	private JButton btnSumarDosReales;
	private JButton btnSumarDosEnteros;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					v1 frame = new v1();
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
	public v1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Primer número: ");
			lblNewLabel.setBounds(10, 11, 101, 21);
			contentPane.add(lblNewLabel);
		}
		{
			lblSegundoNmero = new JLabel("Segundo número: ");
			lblSegundoNmero.setBounds(10, 43, 164, 21);
			contentPane.add(lblSegundoNmero);
		}
		{
			lblTercerNmero = new JLabel("Tercer número: ");
			lblTercerNmero.setBounds(10, 80, 101, 21);
			contentPane.add(lblTercerNmero);
		}
		{
			txtprimer = new JTextField();
			txtprimer.setBounds(121, 11, 86, 20);
			contentPane.add(txtprimer);
			txtprimer.setColumns(10);
		}
		{
			txtsegundo = new JTextField();
			txtsegundo.setColumns(10);
			txtsegundo.setBounds(121, 43, 86, 20);
			contentPane.add(txtsegundo);
		}
		{
			txttercer = new JTextField();
			txttercer.setColumns(10);
			txttercer.setBounds(121, 80, 86, 20);
			contentPane.add(txttercer);
		}
		{
			btnSumarTresEnteros = new JButton("Sumar tres enteros");
			btnSumarTresEnteros.addActionListener(this);
			btnSumarTresEnteros.setBounds(251, 42, 173, 23);
			contentPane.add(btnSumarTresEnteros);
		}
		{
			btnSumarDosReales = new JButton("Sumar dos reales");
			btnSumarDosReales.addActionListener(this);
			btnSumarDosReales.setBounds(251, 79, 173, 23);
			contentPane.add(btnSumarDosReales);
		}
		{
			btnSumarDosEnteros = new JButton("Sumar dos enteros");
			btnSumarDosEnteros.addActionListener(this);
			btnSumarDosEnteros.setBounds(251, 10, 173, 23);
			contentPane.add(btnSumarDosEnteros);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 112, 414, 138);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSumarDosReales) {
			do_btnSumarDosReales_actionPerformed(e);
		}
		if (e.getSource() == btnSumarTresEnteros) {
			do_btnSumarTresEnteros_actionPerformed(e);
		}
		if (e.getSource() == btnSumarDosEnteros) {
			do_btnSumarDosEnteros_actionPerformed(e);
		}
	}
	
	protected void do_btnSumarDosEnteros_actionPerformed(ActionEvent e) {
		try {
			int num1=Integer.parseInt(txtprimer.getText());
			int num2= Integer.parseInt(txtsegundo.getText());
			calculadora c=new calculadora(num1, num2);
			txtS.append("La suma es: "+c.sumar(num1, num2)+"\n");
		}catch (Exception e2) {
			Mostrarerror();
		}
	}
	private void Mostrarerror() {
		JOptionPane.showMessageDialog(this, "Inserte número(s) válidos(s)");
	}
	protected void do_btnSumarTresEnteros_actionPerformed(ActionEvent e) {
		try {
			int num1=Integer.parseInt(txtprimer.getText());
			int num2= Integer.parseInt(txtsegundo.getText());
			int num3=Integer.parseInt(txttercer.getText());
			calculadora c=new calculadora(num1, num2,num3);
			txtS.append("La suma es: "+c.sumar(num1, num2,num3)+"\n");
		}catch (Exception e2) {
			Mostrarerror();
		}
	}
	protected void do_btnSumarDosReales_actionPerformed(ActionEvent e) {
		try {
			double n1=Double.parseDouble(txtprimer.getText());
			double n2=Double.parseDouble(txtsegundo.getText());
			calculadora c=new calculadora(n1, n2);
			txtS.append("La suma es: "+c.sumar(n1, n2)+"\n");
		}catch (Exception e2) {
			Mostrarerror();
		}

	}
}
