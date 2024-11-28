package com.generation.codigo4;

import java.util.Scanner;

public class codigo4 {

    private String j1;
    private String j2;

    public static void main(String[] args) {
        codigo4 juego = new codigo4();
        juego.jugar();
    }

    public void jugar() {
        Scanner s = new Scanner(System.in);//agregar System.in

        // Entrada del jugador 1
        System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        j1 = s.nextLine().toLowerCase();//agregar toLowerCase

        // Entrada del jugador 2
        System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        j2 = s.nextLine().toLowerCase();

        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int g = 2;
            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {//Se cambio a equals
                        g = 1;
                    }
                    break;
                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1;
                    }
                    break;
                case "tijeras":
                    if (j2.equals("papel")) {
                        g = 1;
                    }//se cerro }
                    break;
                default:
                    System.out.println("Elección inválida por parte del jugador 1.");
                    return;
            }
            System.out.println("Gana el jugador " + g);
        }
        s.close(); // Cerramos el Scanner
    }
}