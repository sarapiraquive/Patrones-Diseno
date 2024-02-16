package sistemaEnvios.implementacion;

import sistemaEnvios.interfaz.TipoEnvio;

public class EnvioTerrestre implements TipoEnvio {
    @Override
    public String realizarEnvio() {
        return "Envio terrestre succesfull";
    }
}
