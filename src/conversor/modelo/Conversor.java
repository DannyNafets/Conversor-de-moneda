package conversor.modelo;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Conversor {
	
	protected double resultadoConversion;
	protected double Dbvvoltios;
	protected double Dbuvoltios;
	protected double voltiosDbv;
	protected double voltiosDbu;
    
    public double conversion(String moneda, double valorOtraMoneda, double valorColombia) {
        this.resultadoConversion = valorColombia * valorOtraMoneda;
        JOptionPane.showMessageDialog(null, formatearResultado(resultadoConversion) + " " + moneda );
        return this.resultadoConversion;
    }
    
    public double getResultadoConversion() {
		return resultadoConversion;
	}
    
    public void conversorDbvAVoltios(String unidad, double valor) {
    	this.Dbvvoltios = (Math.round((Math.pow(10, valor/20) * 100))) / 100d;
    	JOptionPane.showMessageDialog(null, Dbvvoltios + " " + unidad );
    }
    
    public double getDbvvoltios() {
		return Dbvvoltios;
	}
    
    public void conversorDbuAVoltios(String unidad, double valor) {
    	this.Dbuvoltios = (Math.round((Math.pow(10, valor/20) * 0.775) * 100)) / 100d;
    	JOptionPane.showMessageDialog(null, Dbuvoltios + " " + unidad );
    }
    
    public double getDbuvoltios() {
		return Dbuvoltios;
	}
    
    public void conversorVoltiosADbv(String unidad, double valor) {
    	this.voltiosDbv = Math.round(20 * (Math.log10(valor)) * 100) / 100d;
    	JOptionPane.showMessageDialog(null, voltiosDbv + " " + unidad );
    }
    
    public double getVoltiosDbv() {
		return voltiosDbv;
	}
    
    public void conversorVoltiosADbu(String unidad, double valor) {
    	this.voltiosDbu = (Math.round(20 * (Math.log10(valor/0.775)) * 100)) / 100d;
    	JOptionPane.showMessageDialog(null, voltiosDbu + " " + unidad );
    }
    
    public double getVoltiosDbu() {
		return voltiosDbu;
	}
    
    public String formatearResultado(double resultado) {
		DecimalFormat formato = new DecimalFormat("#.##");
		return formato.format(resultado);
	}
}
