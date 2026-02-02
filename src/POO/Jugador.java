package POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jugador extends Personaje{
    private Mochila objetosSeleccionado;
    private List<Mochila> mochila = new ArrayList<>();

    public Jugador(String name, int live) {
        super(name, live);
        mochila.add(Mochila.ESPADA);
        mochila.add(Mochila.ESCUDO);
        mochila.add(Mochila.POCION);
    }

    public void seleccionarObjeto(int opcion){
        objetosSeleccionado = mochila.get(opcion -1);
        System.out.println("Objeto seleccionado: "+objetosSeleccionado);
    }

    public int calcularDanio(int maximo){
        return new Random().nextInt(maximo) + 1;
    }

    public static String calcularEstado(String name, int live){
        return "El estado del Jugador.\nNombre: "+name+"\nVida:"+live;
    }

    public void atacar(Personaje enemigo){
        int danio = calcularDanio(20);

        switch (objetosSeleccionado){
            case ESPADA -> {
                enemigo.recibirDanio(danio + 5);
                System.out.println("Atacaste con la espada");
            }
            case ESCUDO -> {
                enemigo.recibirDanio(danio);
                System.out.println("Atacaste con defensa");
            }
            case POCION -> {
                enemigo.recibirDanio(danio);
                curar(2);
                System.out.println("Atacaste al enemigo");
            }
        }
    }
}
