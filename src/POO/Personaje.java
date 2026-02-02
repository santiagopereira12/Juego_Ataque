package POO;

public class Personaje {
    private String name;
    private int live;

    public Personaje(String name, int live) {
        this.name = name;
        this.live = live;
    }

    public void recibirDanio(int danio){
        this.live -= danio;
        System.out.print(name+" Recibio "+danio+" de daño.\nDaño recibido: "+danio);
    }

    public void curar(int curar){
        live += curar;
    }

    public boolean estanVivos(){
        return this.live > 0;
    }

    public String getName() {
        return name;
    }

    public int getLive() {
        return live;
    }
}
