package sistemaEnvios.implementacion;

import sistemaEnvios.interfaz.TipoEnvio;

public class EnvioAereo implements TipoEnvio {
    @Override
    public String realizarEnvio() {
        return "Envio aereo succesfull";
    }
}
