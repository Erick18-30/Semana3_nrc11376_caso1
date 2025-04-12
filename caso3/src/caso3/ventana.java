package caso3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtnombre;
	private JScrollPane scrollPane;
	private JButton btnNewButton;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
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
	public ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 429, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Ingrese un nombre: ");
			lblNewLabel.setBounds(10, 10, 141, 21);
			contentPane.add(lblNewLabel);
		}
		{
			txtnombre = new JTextField();
			txtnombre.setBounds(134, 11, 96, 19);
			contentPane.add(txtnombre);
			txtnombre.setColumns(10);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(20, 41, 369, 227);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			btnNewButton = new JButton("Ingresar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(279, 10, 85, 21);
			contentPane.add(btnNewButton);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		String nom=txtnombre.getText();
		if(nom.isBlank()) {
			JOptionPane.showMessageDialog(this, "No se permiten espacios vacíos");
		}
		else {	
		contador con=new contador(nom);
		txtS.setText("");
		txtS.append("Se han ingresado: "+con.cantidad()+" nombres");
	}}
}
