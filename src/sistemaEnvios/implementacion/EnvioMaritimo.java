package sistemaEnvios.implementacion;

import sistemaEnvios.interfaz.TipoEnvio;

public class EnvioMaritimo implements TipoEnvio {
    @Override
    public String realizarEnvio() {
        return "Envio maritimo succesfull";
    }
}
