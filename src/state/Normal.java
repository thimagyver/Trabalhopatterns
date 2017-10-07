package state;

public class Normal implements Estado {

    @Override
    public void modoGps() {
        System.out.println("Modo Gps Ativado");
    }

    @Override
    public void modoAtt() {
        System.out.println("Modo Att Ativado");
    }

    @Override
    public String getNome() {
        return "NORMAL";
    }

}
