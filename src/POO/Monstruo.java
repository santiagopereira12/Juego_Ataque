package POO;

import java.util.Random;

public class Monstruo extends Personaje{
    public Monstruo(String name, int live) {
        super(name, live);
    }

    public int calcularDanio(int maximo){
        return new Random().nextInt(maximo)+1;
    }

    public void atacar(Personaje enemigo){
        int danio = calcularDanio(20);

        enemigo.recibirDanio(danio);
        System.out.println("Atacaste al Jugaor");
    }
}
