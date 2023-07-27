package conversor.modelo;



public class ConversorApp extends Conversor {
	
	@Override
	public void conversion(String moneda, double valorOtraMoneda, double valorColombia) {
		super.resultadoConversion = (Math.round((valorColombia * valorOtraMoneda)*10.0))/10.0;
	}
	
	@Override
	public void conversorDbvAVoltios(String unidad, double valor) {
    	super.Dbvvoltios = (Math.round((Math.pow(10, valor/20) * 100))) / 100d;
    }
    
	@Override
    public void conversorDbuAVoltios(String unidad, double valor) {
    	super.Dbuvoltios = (Math.round((Math.pow(10, valor/20) * 0.775) * 100)) / 100d;
    }
    
	@Override
    public void conversorVoltiosADbv(String unidad, double valor) {
    	super.voltiosDbv = Math.round(20 * (Math.log10(valor)) * 100) / 100d;
    }
	
	@Override
    public void conversorVoltiosADbu(String unidad, double valor) {
    	super.voltiosDbu = (Math.round(20 * (Math.log10(valor/0.775)) * 100)) / 100d;
    }
}
