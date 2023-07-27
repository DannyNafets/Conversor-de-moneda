package conversor.modelo;

import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {
        double opcion = JOptionPane.showConfirmDialog(null,
            "choose one", "choose one", JOptionPane.YES_NO_CANCEL_OPTION);

            System.out.println(opcion);

            Object[] options = { "OK", "CANCEL", "MENU" };
            int opc = JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]);

            System.out.println(opc);            
    }
}
