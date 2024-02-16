package sistemaEnvios.abstracto;

import sistemaEnvios.interfaz.TipoEnvio;

public abstract class ServicioEnvio {
    protected TipoEnvio tipoEnvio;

    public ServicioEnvio(TipoEnvio tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public abstract String enviarPaquete();
}
