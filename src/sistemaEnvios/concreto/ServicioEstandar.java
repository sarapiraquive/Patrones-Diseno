package sistemaEnvios.concreto;

import sistemaEnvios.abstracto.ServicioEnvio;
import sistemaEnvios.interfaz.TipoEnvio;

public class ServicioEstandar extends ServicioEnvio {

    public ServicioEstandar(TipoEnvio tipoEnvio) {
        super(tipoEnvio);
    }

    @Override
    public String enviarPaquete() {
        return "Servicio estandar" + tipoEnvio.realizarEnvio();
    }
}
