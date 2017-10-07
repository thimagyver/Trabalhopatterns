package dronegirassol;

import observer.Celular;
import observer.MonitorBateria;
import state.Falseife;
import strategy.ModoGps;

public class DroneGirassol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Drone drone = new Drone();
        drone.setModoVoar(new ModoGps());
        drone.voar();
        drone.chaveEstado();
        drone.voar();

    }

}
