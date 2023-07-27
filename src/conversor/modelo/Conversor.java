package conversor.modelo;

import javax.swing.JOptionPane;

public class Conversor {
	
	protected double resultadoConversion;
	protected double Dbvvoltios;
	protected double Dbuvoltios;
	protected double voltiosDbv;
	protected double voltiosDbu;
    
    public void conversion(String moneda, double valorOtraMoneda, double valorColombia) {
        this.resultadoConversion = (Math.round((valorColombia * valorOtraMoneda) * 100)) / 100d;
        JOptionPane.showMessageDialog(null, resultadoConversion + " " + moneda );

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
}
