package conversor.modelo;

public class EsNumero {
	
	int control = 0;
	private String inputValue;

	public EsNumero(Object[] opcionesConversiones, CuadroOpciones conversiones) {

        while (control == 0){
            
            conversiones.ingresarValor();
            this.inputValue = conversiones.getInputValue();

            if (inputValue.matches("[^0-9]+")){
                conversiones.cuadroDialogoMsg("Solo se permiten datos numéricos");
            }else{
                control += 1;
            }
            
        }
	}
	
	public String getInputValue() {
		return this.inputValue;
	}
}
