package sistemaEnvios;

import sistemaEnvios.abstracto.ServicioEnvio;
import sistemaEnvios.concreto.ServicioEstandar;
import sistemaEnvios.concreto.ServicioExpress;
import sistemaEnvios.implementacion.EnvioAereo;
import sistemaEnvios.implementacion.EnvioTerrestre;
import sistemaEnvios.interfaz.TipoEnvio;

public class Main {
    public static void main(String[] args) {
        TipoEnvio envioTerrestre = new EnvioTerrestre();
        ServicioEnvio servicioEstandar = new ServicioEstandar(envioTerrestre);

        System.out.println(servicioEstandar.enviarPaquete());

        TipoEnvio envioAereo = new EnvioAereo();
        ServicioEnvio servicioExpress = new ServicioExpress(envioAereo);

        System.out.println(servicioExpress.enviarPaquete());
    }
}
