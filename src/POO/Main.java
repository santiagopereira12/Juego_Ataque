package POO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vencedor = "";
        System.out.println("Bienvenido al Juego de Ataque.");
        String nombre = scanner.nextLine().trim().toUpperCase();

        Jugador jugador = new Jugador(nombre,100);
        Monstruo monstruo = new Monstruo("Monstruo",100);

        System.out.println("""
                Escoja una opción de la Mochila.
                1. ESPADA.
                2. ESCUDO.
                3. POCIÓN.
                """);
        int opc = scanner.nextInt();
        scanner.nextLine();
        jugador.seleccionarObjeto(opc);
        System.out.println("\n"+jugador.calcularEstado(nombre, jugador.getLive())+"\n");

        while (jugador.estanVivos() && monstruo.estanVivos()){
            System.out.println("¿Quien va atacar? (JUGADOR/MONSTRUO)");
            String turno = scanner.nextLine().trim().toUpperCase();

            if (jugador.equals("JUGADOR")){
                jugador.atacar(monstruo);
            }else {
                monstruo.atacar(jugador);
            }

            System.out.println("\n"+jugador.calcularEstado(nombre, jugador.getLive())+"\n");
        }

        if (jugador.estanVivos()){
            vencedor = jugador.getName();
        }else {
            vencedor = monstruo.getName();
        }

        System.out.println("La Victoria es para: "+vencedor);
    }
}
