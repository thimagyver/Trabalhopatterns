package dronegirassol;

import strategy.ModoGps;
import strategy.ModoAtt;
import state.FailSafe;

public class DroneGirassol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Drone drone = new Drone();
        drone.setModoVoar(new ModoGps());
        drone.voandoEm();
        drone.setModoVoar(new ModoAtt());
        drone.voandoEm();
        drone.setEstado(new FailSafe());
        drone.voandoEm();

    }

}
