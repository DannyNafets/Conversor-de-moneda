package app;
// ESTE CODIGO FUNCIONA

import conversor.modelo.Conversor;
import conversor.modelo.CuadroOpciones;
import conversor.modelo.EsNumero;
import conversor.modelo.Menus;

public class App {
    public static void main(String[] args) {
        System.out.println("Iniciando Programa...");

        String inputValue = "";
        int contador = 0;
        CuadroOpciones opcionConversor = null;
        Menus menus = new Menus();
        Object[] opciones = menus.MenuDeConversores();
        CuadroOpciones conversiones = null;
        Conversor conversion = new Conversor();
        
        while (contador == 0){

            // Menus menuConversores = new Menus();
            // System.out.println(menuConversores.getOpciones());

            // INICIA EL PROGRAMA CON EL CUADRO DE DIALOGO PARA ESCOGER EL CONVERSOR
        	
        
            opcionConversor = new CuadroOpciones(opciones, "Seleccione una opción de conversión");
            
            contador += 1;

            
        
	        while (contador == 1){
	        	
	        	// INICIO DEL CONVERSOR DE MONEDAS
	
	            if (opcionConversor.getSelectedValue() == opciones[1]) { // se activa si la opcion escogida es "Conversor de Moneda"
	             
	                    Object[] opcionesConversiones = menus.ConversoresDeMoneda(); // llama el menu de conversor de Moneda
	
	                    conversiones = new CuadroOpciones(opcionesConversiones,
	                            "Elija la moneda a la que deseas convertir");
	                    
	                    /**
	                     * llamamos a la clase EsNumero para evaluar si el dato es numérico
	                     */
	                    
	                    EsNumero esNumero = new EsNumero(opcionesConversiones, conversiones);
	                	inputValue = esNumero.getInputValue();
	
	                    double valor = Double.parseDouble(inputValue); // Convertimos el valor a Double
	                    
	                    /**
	                     * Convierte en 5 tipos de Moneda a pesos Colombianos y viceverse segun la opcion
	                     */
	                    
	
	                    if (conversiones.getSelectedValue() == opcionesConversiones[1]) {
	                        conversion.conversion("Dolares", 0.00024, valor);
	                    } else if (conversiones.getSelectedValue() == opcionesConversiones[2]){
	                        conversion.conversion("Euros", 0.00022, valor);
	                    } else if (conversiones.getSelectedValue() == opcionesConversiones[3]){
	                    	conversion.conversion("Libras Esterlinas", 0.00019, valor);
	                    } else if (conversiones.getSelectedValue() == opcionesConversiones[4]){
	                    	conversion.conversion("Yen Japonés", 0.036, valor);
	                    } else if (conversiones.getSelectedValue() == opcionesConversiones[5]){
	                    	conversion.conversion("Won Sur-Coreano", 0.32, valor);
	                    } else if (conversiones.getSelectedValue() == opcionesConversiones[6]){
	                    	conversion.conversion("Pesos Colombianos", 3976.46, valor);
	                    } else if (conversiones.getSelectedValue() == opcionesConversiones[7]){
	                    	conversion.conversion("Pesos Colombianos", 4423.82, valor);
	                    } else if (conversiones.getSelectedValue() == opcionesConversiones[8]){
	                    	conversion.conversion("Pesos Colombianos", 5112.74, valor);
	                    } else if (conversiones.getSelectedValue() == opcionesConversiones[9]){
	                    	conversion.conversion("Pesos Colombianos", 28.04, valor);
	                    } else if (conversiones.getSelectedValue() == opcionesConversiones[10]){
	                    	conversion.conversion("Pesos Colombianos", 3.09, valor);
	                    }
	                    
	                 // INICIO DEL CONVERSOR DE Dbv y dbu a Voltios y viceversa   
	                    
	                } else if (opcionConversor.getSelectedValue() == opciones[2]) {
	                	
	                	Object[] opcionesDbv = menus.MenuConversorDbv();
	                	
	                	conversiones = new CuadroOpciones(opcionesDbv,
	                            "Elija la Conversión que desea realizar");
	                	
	                	EsNumero esNumero = new EsNumero(opcionesDbv, conversiones);
	                	inputValue = esNumero.getInputValue();
	
	                    double valor = Double.parseDouble(inputValue);
	                    System.out.println(valor);
	                    
	                    
	                    if (conversiones.getSelectedValue() == opcionesDbv[1]) {
	                    	conversion.conversorDbvAVoltios("Voltios", valor);
	                    } else if (conversiones.getSelectedValue() == opcionesDbv[2]){
	                    	conversion.conversorDbuAVoltios("Voltios", valor);
	                    } else if (conversiones.getSelectedValue() == opcionesDbv[3]){
	                    	conversion.conversorVoltiosADbv("dBv", valor);
	                    } else if (conversiones.getSelectedValue() == opcionesDbv[4]){
	                    	conversion.conversorVoltiosADbu("dBu", valor);
	                    }
	                    
	                }
	            /**
	             * seleccionamos si continuamos o no en el programa
	             */
	
	            conversiones.deseaContinuar();
	            System.out.println(conversiones.getOpcion());
	
	            switch (conversiones.getOpcion()) {
	                case 0:
	                    contador = 0;
	                    break;
	                case 1:
	                    contador = 1;
	                    break;
	                case 2:
	                    contador = 2;
	                    conversiones.cuadroDialogoMsg("Programa Finalizado");
	                    break;    
	                default:
	                    break;
	                }
	            }
        }
        
        
        
        System.out.println("Programa Finalizado");
    }   
}
