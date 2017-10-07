package observer;

public class Celular implements Observador {

    @Override
    public void notificar() {
        System.out.println("Sou celular e fui notificado pelo Drone sua carga de Bateria esta baixa");
    }

}
