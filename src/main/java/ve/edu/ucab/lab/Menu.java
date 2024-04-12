package ve.edu.ucab.lab;

import ve.edu.ucab.lab.Player;
import ve.edu.ucab.lab.Points;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    static List<Player> listaJugadores = new ArrayList<>();
    public void menu()
    {
        int op = 0;

        while (true) {
            System.out.println("Bienvenidos !");
            System.out.println("1. Iniciar Juego");
            System.out.println("2. Resultados");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    Menu2();
                    break;
                case 2:
                    Menu3();
                    break;
                case 3:
                    System.out.println("Adios!");
                    System.exit(0);
                default:
                    System.out.println("Numero no reconocido");
                    break;
            }
        }
    }

    public void Menu2(){

        int op = 0;

            while (true) {
                System.out.println("Bienvenidos !");
                System.out.println("1. Jugadores");
                System.out.println("2. Ver Jugadores");
                System.out.println("3. Salir");
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
                        return;
                    default:
                        System.out.println("Numero no reconocido");
                        break;
                }
            }
        }

    public void Menu3(){

        int op = 0;

        while (true) {
            System.out.println("Bienvenidos !");
            System.out.println("1. Iniciar Partido");
            System.out.println("2. Ver Jugadores");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    iniciarPartido();
                    break;
                case 2:
                    Player.verJugadores();
                    break;
                case 3:
                    System.out.println("Adios!");
                    break;
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
            puntos.Matches();
        } else {
            System.out.println("No hay suficientes jugadores para iniciar el partido.");
        }
    }


}
