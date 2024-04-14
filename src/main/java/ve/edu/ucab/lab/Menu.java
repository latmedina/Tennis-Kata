package ve.edu.ucab.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public void menu() {
        int op = 0;


        while (true) {
            System.out.print("\f");
            System.out.println("Bienvenidos !");
            System.out.println("1. Anadir Jugadores");
            System.out.println("2. Ver Jugadores");
            System.out.println("3. Partido");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    Player.agregarJugadores();
                    break;
                case 2:
                    Player.verJugadores();
                    break;
                case 3:
                    iniciarPartido();
                    System.out.println();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Numero no reconocido");
                    break;
            }
        }
    }


    public void iniciarPartido() {
        //Menu2(); // Permite agregar jugadores antes de iniciar el partido
        if (Player.getListaJugadores().size() >= 2) { // Verificar si hay al menos dos jugadores
            System.out.println("Iniciando Partido...");
            // Crear una instancia de Points con los jugadores seleccionados
            Points puntos = new Points(Player.getListaJugadores().get(0), Player.getListaJugadores().get(1));
            // Llamar al método Matches() en la instancia de Points
            puntos.Partido();
        } else {
            System.out.println("No hay suficientes jugadores para iniciar el partido.");
        }
    }
}
