package sistemaEnvios.concreto;

import sistemaEnvios.abstracto.ServicioEnvio;
import sistemaEnvios.interfaz.TipoEnvio;

public class ServicioExpress extends ServicioEnvio {

    public ServicioExpress(TipoEnvio tipoEnvio) {
        super(tipoEnvio);
    }

    @Override
    public String enviarPaquete() {
        return "Servicio express" + tipoEnvio.realizarEnvio();
    }
}
