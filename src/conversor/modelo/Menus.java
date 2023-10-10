package conversor.modelo;

public class Menus {

    private String[] opciones = { "Seleccionar...", "Conversor de Moneda", "Conversor De Voltios a dBs" };
    
    public static String[] opcionesConversionMonedas = { "Seleccionar...", "Pesos Colombiano a Dolar", "Pesos Colombiano a Euros",
            "Pesos Colombiano a Libras esterlinas", "Pesos Colombiano a Yen Japonés",
            "Pesos Colombiano a Won Sur-Coreano", "Dolar a Pesos Colombianos", "Euros a Pesos Colombianos",
            "Libras esterlinas a Pesos Colombianos", "Yen Japonés a Pesos Colombianos",
            "Won Sur-Coreano a Pesos Colombianos" };
    
    public static String[] opcionesConversionDbV = {"Seleccionar...", "dBv a Voltios", "dBu a Voltios", "Voltios a dBv", "Voltios a dBu"};

    public String[] MenuDeConversores(){
    	return this.opciones;
    }
    
  
    
    

}
