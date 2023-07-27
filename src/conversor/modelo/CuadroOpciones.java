package conversor.modelo;

import javax.swing.JOptionPane;

public class CuadroOpciones {

    private Object selectedValue;
    private String inputValue;
    private int opcion;

    // El constructor nos permite crear un cuadro de dialogo con diferentes opciones

    public CuadroOpciones(Object[] opciones, String msg) {
        this.selectedValue = JOptionPane.showInputDialog(null, msg, "Input", JOptionPane.INFORMATION_MESSAGE, null,
                opciones, opciones[0]);

    }
    
    public Object getSelectedValue() {
        return selectedValue;
    }
    

    // Cuadro de dialogo para mostrar un mensaje

    public void cuadroDialogoMsg(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }

    
    // Cuadro de dialogo para ingresar un valor 

    public void ingresarValor() {
        this.inputValue = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir");
        
    }

    public String getInputValue() {
        return inputValue;
    }
    

    // Cuadro de dialogo que pregunta si se desea continuar en el programa

    public void deseaContinuar(){
        Object[] options = { "Conversores", "Menu Anterior", "Salir" };
            this.opcion = JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]);    
    }

    public int getOpcion() {
        return opcion;
    }
}
