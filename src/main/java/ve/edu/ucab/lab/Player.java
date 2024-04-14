package ve.edu.ucab.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private static List<Player> listaJugadores = new ArrayList<>();
    public int userId;
    public String username;

    public Player(int userId, String username) {
        this.userId = userId;
        this.username = username;
    }
    public static void agregarJugadores() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del jugador 1: ");
        String username1 = sc.nextLine();
        System.out.println("Ingrese el ID del jugador 1: ");
        int userId1 = sc.nextInt();
        Player Jugador1 = new Player(userId1, username1);

        sc.nextLine();
        System.out.println("Ingrese el nombre del jugador 2: ");
        String username2 = sc.nextLine();
        System.out.println("Ingrese el ID del jugador 2: ");
        int userId2 = sc.nextInt();
        Player Jugador2 = new Player(userId2, username2);


        listaJugadores.add(Jugador1);
        listaJugadores.add(Jugador2);

    }

    public static List<Player> getListaJugadores() {
        return listaJugadores;
    }

    public static void verJugadores() {
        List<Player> jugadores = Player.getListaJugadores();
        System.out.println("Lista de Jugadores:");
        for (Player jugador : jugadores) {
            System.out.println("ID: " + jugador.userId + ", Nombre: " + jugador.username);
        }

    }
}
