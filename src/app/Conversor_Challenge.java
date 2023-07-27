package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import conversor.modelo.ConversorApp;
import conversor.modelo.Menus;

import java.awt.Button;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.DropMode;

public class Conversor_Challenge extends JFrame {

	private JPanel contentPane;
	private JTextField textoDeEntrada;
	private JTextField textoDeSalida;
	private JComboBox listaConversiones;
	private JLabel lblNewLabel_1;
	int contador = 0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor_Challenge frame = new Conversor_Challenge();
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
	public Conversor_Challenge() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(33, 130, 186));
		contentPane.setBorder(new EmptyBorder(100, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/**
		 * Instancia del Menu de Conversiones
		 */
		
		Menus menuConversores = new Menus();
		
		Object[] menuPrincipal = menuConversores.MenuDeConversores();
		
		Object[] menuConverorDeMonedas = menuConversores.ConversoresDeMoneda();
		
		Object[] menuConversordBAV = menuConversores.MenuConversorDbv();
		
		JLabel titulo = new JLabel("CONVERSOR");
		titulo.setFont(new Font("Gujarati MT", Font.PLAIN, 16));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(89, 14, 269, 26);
		contentPane.add(titulo);
		
		JLabel nombreEspacio1 = new JLabel("");
		nombreEspacio1.setFont(new Font("Menlo", Font.PLAIN, 13));
		nombreEspacio1.setHorizontalAlignment(SwingConstants.CENTER);
		nombreEspacio1.setBounds(46, 154, 166, 16);
		contentPane.add(nombreEspacio1);
		
		JLabel nombreEspacio2 = new JLabel("");
		nombreEspacio2.setHorizontalAlignment(SwingConstants.CENTER);
		nombreEspacio2.setBounds(255, 154, 123, 16);
		contentPane.add(nombreEspacio2);
		
		
		/**
		 * Creacion del componente que contiene una lista de Conversiones
		 */
		
		JComboBox listaPrincipal = new JComboBox(menuPrincipal);
		listaPrincipal.setBounds(119, 44, 208, 27);
		contentPane.add(listaPrincipal);
		
		/**
		 * Eleccion de Conversores y Control de la lista del JComboBox1
		 */
		
		listaPrincipal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if (listaPrincipal.getSelectedItem() == menuPrincipal[1]){
					nombreEspacio1.setText("");
					nombreEspacio2.setText("");
					listaConversiones.removeAllItems(); // quita los elementos de la lista 
					listaConversiones.setEnabled(true);
					for (int i = 0; i < menuConverorDeMonedas.length; i++) {
						listaConversiones.addItem(menuConverorDeMonedas[i]);
					}
					titulo.setText("CONVERSOR DE MONEDAS");
				} else if(listaPrincipal.getSelectedItem() == menuPrincipal[2]) {
					nombreEspacio1.setText("");
					nombreEspacio2.setText("");
					listaConversiones.removeAllItems();
					listaConversiones.setEnabled(true);
					for (int i = 0; i < menuConversordBAV.length; i++) {
						listaConversiones.addItem(menuConversordBAV[i]);
					}
					titulo.setText("CONVERSOR DE VOLTIOS A dBv & dBu");
				}
				
			}
		});
		
		
		// Control de la lista del JComboBox2
		
		listaConversiones = new JComboBox();
		listaConversiones.setToolTipText("hola");
		listaConversiones.setEnabled(false);
		listaConversiones.setBounds(119, 73, 208, 27);
		contentPane.add(listaConversiones);
		
		listaConversiones.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// limpia los editores al cambiar de opcion 
				
				while (contador == 0) {
					textoDeEntrada.setText("");
					textoDeSalida.setText("");
					contador++;
				}
					
				if (listaConversiones.getSelectedItem() == menuConverorDeMonedas[1]) {
					nombreEspacio1.setText("Pesos Colombianos");
					nombreEspacio2.setText("Dolares");
					contador = 0;
				} else if (listaConversiones.getSelectedItem() == menuConverorDeMonedas[2]) {
					nombreEspacio1.setText("Pesos Colombianos");
					nombreEspacio2.setText("Euros");
					contador = 0;
				} else if (listaConversiones.getSelectedItem() == menuConverorDeMonedas[3]) {
					nombreEspacio1.setText("Pesos Colombianos");
					nombreEspacio2.setText("Libras Esterlinas");
					contador = 0;
				} else if (listaConversiones.getSelectedItem() == menuConverorDeMonedas[4]) {
					nombreEspacio1.setText("Pesos Colombianos");
					nombreEspacio2.setText("Yenes");
					contador = 0;
				} else if (listaConversiones.getSelectedItem() == menuConverorDeMonedas[5]) {
					nombreEspacio1.setText("Pesos Colombianos");
					nombreEspacio2.setText("Won");
					contador = 0;
				} else if (listaConversiones.getSelectedItem() == menuConverorDeMonedas[6]) {
					nombreEspacio1.setText("Dolares");
					nombreEspacio2.setText("Pesos Colombianos");
					contador = 0;
				} else if (listaConversiones.getSelectedItem() == menuConverorDeMonedas[7]) {
					nombreEspacio1.setText("Euros");
					nombreEspacio2.setText("Pesos Colombianos");
					contador = 0;
				} else if (listaConversiones.getSelectedItem() == menuConverorDeMonedas[8]) {
					nombreEspacio1.setText("Libras Esterlinas");
					nombreEspacio2.setText("Pesos Colombianos");
					contador = 0;
				} else if (listaConversiones.getSelectedItem() == menuConverorDeMonedas[9]) {
					nombreEspacio1.setText("Yenes");
					nombreEspacio2.setText("Pesos Colombianos");
					contador = 0;
				} else if (listaConversiones.getSelectedItem() == menuConverorDeMonedas[10]) {
					nombreEspacio1.setText("Won");
					nombreEspacio2.setText("Pesos Colombianos");
					contador = 0;
				}
		
				
				if (listaConversiones.getSelectedItem() == menuConversordBAV[1]) {
					nombreEspacio1.setText("dBv");
					nombreEspacio2.setText("Voltios");
				} else if (listaConversiones.getSelectedItem() == menuConversordBAV[2]) {
					nombreEspacio1.setText("dBu");
					nombreEspacio2.setText("Voltios");
				} else if (listaConversiones.getSelectedItem() == menuConversordBAV[3]) {
					nombreEspacio1.setText("Voltios");
					nombreEspacio2.setText("dBv");
				} else if (listaConversiones.getSelectedItem() == menuConversordBAV[4]) {
					nombreEspacio1.setText("Voltios");
					nombreEspacio2.setText("dBu");
				}
			
				
				
			}
		});
		
		
		/**
		 * Creacion del boton donde damos la orden de realizar la Conversion.
		 */
		
		JButton convertir = new JButton("CONVERTIR");
		convertir.setFont(new Font("Malayalam MN", Font.PLAIN, 13));
		convertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valor = Double.parseDouble(textoDeEntrada.getText());
				
				ConversorApp conversor = new ConversorApp();
				
				if (listaConversiones.getSelectedItem() == menuConverorDeMonedas[1]) {
					conversor.conversion("Dolares", 0.00024, valor);
					double resultado = conversor.getResultadoConversion();
					textoDeSalida.setText(Double.toString(resultado));
				} else if (listaConversiones.getSelectedItem() == menuConverorDeMonedas[2]){
					conversor.conversion("Euros", 0.00022, valor);
					double resultado = conversor.getResultadoConversion();
					textoDeSalida.setText(Double.toString(resultado));
                } else if (listaConversiones.getSelectedItem() == menuConverorDeMonedas[3]){
                	conversor.conversion("Libras Esterlinas", 0.00019, valor);
                	double resultado = conversor.getResultadoConversion();
					textoDeSalida.setText(Double.toString(resultado));
                } else if (listaConversiones.getSelectedItem() == menuConverorDeMonedas[4]){
                	conversor.conversion("Yen Japonés", 0.036, valor);
                	double resultado = conversor.getResultadoConversion();
					textoDeSalida.setText(Double.toString(resultado));
                } else if (listaConversiones.getSelectedItem() == menuConverorDeMonedas[5]){
                	conversor.conversion("Won Sur-Coreano", 0.32, valor);
                	double resultado = conversor.getResultadoConversion();
					textoDeSalida.setText(Double.toString(resultado));
                } else if (listaConversiones.getSelectedItem() == menuConverorDeMonedas[6]){
                	conversor.conversion("Pesos Colombianos", 3976.46, valor);
                	double resultado = conversor.getResultadoConversion();
					textoDeSalida.setText(Double.toString(resultado));
                } else if (listaConversiones.getSelectedItem() == menuConverorDeMonedas[7]){
                	conversor.conversion("Pesos Colombianos", 4423.82, valor);
                	double resultado = conversor.getResultadoConversion();
					textoDeSalida.setText(Double.toString(resultado));
                } else if (listaConversiones.getSelectedItem() == menuConverorDeMonedas[8]){
                	conversor.conversion("Pesos Colombianos", 5112.74, valor);
                	double resultado = conversor.getResultadoConversion();
					textoDeSalida.setText(Double.toString(resultado));
                } else if (listaConversiones.getSelectedItem() == menuConverorDeMonedas[9]){
                	conversor.conversion("Pesos Colombianos", 28.04, valor);
                	double resultado = conversor.getResultadoConversion();
					textoDeSalida.setText(Double.toString(resultado));
                } else if (listaConversiones.getSelectedItem() == menuConverorDeMonedas[10]){
                	conversor.conversion("Pesos Colombianos", 3.09, valor);
                	double resultado = conversor.getResultadoConversion();
					textoDeSalida.setText(Double.toString(resultado));
                }
				
				
				if (listaConversiones.getSelectedItem() == menuConversordBAV[1]) {
					conversor.conversorDbvAVoltios("Voltios", valor);
					double resultado = conversor.getDbvvoltios();
					textoDeSalida.setText(Double.toString(resultado));
				} else if (listaConversiones.getSelectedItem() == menuConversordBAV[2]){
					conversor.conversorDbuAVoltios("Voltios", valor);
					double resultado = conversor.getDbuvoltios();
					textoDeSalida.setText(Double.toString(resultado));
                } else if (listaConversiones.getSelectedItem() == menuConversordBAV[3]){
                	conversor.conversorVoltiosADbv("dBv", valor);
                	double resultado = conversor.getVoltiosDbv();
					textoDeSalida.setText(Double.toString(resultado));
                } else if (listaConversiones.getSelectedItem() == menuConversordBAV[4]){
                	conversor.conversorVoltiosADbu("dBu", valor);
                	double resultado = conversor.getVoltiosDbu();
					textoDeSalida.setText(Double.toString(resultado));
                }
			}
		});
		convertir.setBounds(122, 190, 208, 29);
		contentPane.add(convertir);
		
		/**
		 * Ingresamos el valor a convertir
		 */
		
		textoDeEntrada = new JTextField();
		textoDeEntrada.setHorizontalAlignment(SwingConstants.TRAILING);
		textoDeEntrada.setBounds(64, 128, 130, 26);
		contentPane.add(textoDeEntrada);
		textoDeEntrada.setColumns(10);
		
		/**
		 * Imprimimos el resultado
		 */
		
		textoDeSalida = new JTextField();
		textoDeSalida.setHorizontalAlignment(SwingConstants.TRAILING);
		textoDeSalida.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		textoDeSalida.setToolTipText("");
		textoDeSalida.setEnabled(false);
		textoDeSalida.setEditable(false);
		textoDeSalida.setColumns(10);
		textoDeSalida.setBounds(251, 128, 130, 26);
		contentPane.add(textoDeSalida);
		
		
		
		
		
	}
}
