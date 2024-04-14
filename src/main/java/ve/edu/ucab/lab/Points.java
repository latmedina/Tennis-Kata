package ve.edu.ucab.lab;
import java.util.Random;
public class Points {

    static Random rand = new Random();
    public int score1;
    public int score2;
    public Player player1;
    public Player player2;
    public static String puntaje;
    public static int Macthscore1 =0 ;
    public static int Macthscore2 =0 ;
    public static int Setscore1 =0 ;
    public static int Setscore2 =0 ;

    public Points(Player player1, Player player2) {
        this.score1 = 0;
        this.score2 = 0;
        this.player1 = player1;
        this.player2 = player2;
        puntaje= "0-0";

    }

    public void Partido() {

            double probabilidadJugador1 = 0.5; // Cambiar según la habilidad del jugador 1
            double probabilidadJugador2 = 0.5; // Cambiar según la habilidad del jugador 2

            while (!verificarGanadorJuego() && (Macthscore1 < 6 && Macthscore2 < 6) && (Setscore1 < 3 && Setscore2 < 3)){
                double exitoJugador1 = rand.nextDouble();
                double exitoJugador2 = rand.nextDouble();

                if (exitoJugador1 < probabilidadJugador1) {
                    this.score1++;
                    actualizarJuego();
                } else if (exitoJugador2 < probabilidadJugador2) {
                    this.score2++;
                    actualizarJuego();
                }
                System.out.println();
                System.out.println(player1.username + " " + puntaje + " " + player2.username);
                informacion();
            }
            System.out.println();
            if(Setscore1 < 3){
                System.out.println("Ganador del Juego: " + player2.username);
            }else if(Setscore2 < 3){
                System.out.println("Ganador del Juego: " + player1.username);
            }

        }

    public void actualizarJuego() {
            String scoreJuga1 = convertirPuntaje(score1);
            String scoreJuga2 = convertirPuntaje(score2);

            puntaje = scoreJuga1 + "-" + scoreJuga2;

             if (verificarGanadorJuego()) {
                   actualizarMatches();
                 if (this.score1 > this.score2) {
                     System.out.println("Ganador: " + player1.username);
                 } else if (this.score2 > this.score1) {
                     System.out.println("Ganador: " + player2.username);
                 } else {
                     System.out.println("El partido terminó en empate.");
                 }
                   reiniciarPuntaje();

                   actualizarSets();
                }
        }

    public void actualizarMatches() {
        if (this.score1 > this.score2) {
            Macthscore1++;
        }
        else if (this.score2 > this.score1) {
            Macthscore2++;
        }
    }

    public void reiniciarPuntaje() {
        puntaje = "0-0";
        this.score1 = 0;
        this.score2 = 0;
    }

    private void reiniciarmarcadorMatches(){
        Macthscore1 = 0;
        Macthscore2 = 0;
    }

    private void actualizarSets() {
        if (Macthscore1 >= 6 || Macthscore2 >= 6) {
            if (Math.abs(Macthscore1 - Macthscore2) >= 2) {
                if (Macthscore1 > Macthscore2) {
                    Setscore1++;
                } else {
                    Setscore2++;
                }
                reiniciarmarcadorMatches(); // Reiniciar el marcador de matches después de ganar un set
            }
        }
    }

        public String convertirPuntaje(int puntaje){
            return switch (puntaje) {
                case 0 -> "0";
                case 1 -> "15";
                case 2 -> "30";
                case 3 -> "40";
                case 4 -> "Game";
                default -> "Error";
            };
        }

    public boolean verificarGanadorJuego() {
        return (this.score1 >= 4 || this.score2 >= 4) && Math.abs(this.score1 - this.score2) >= 2;
    }

    public static int getSetsGanadosPlayer1() {
        return Setscore1;
    }

    public static int getSetsGanadosPlayer2() {
        return Setscore2;
    }

    public static void informacion() {
        System.out.println("El puntaje actual del juego es: " + puntaje);
        System.out.println("Sets ganados por Jugador 1: " + Setscore1);
        System.out.println("Sets ganados por Jugador 2: " + Setscore2);
        System.out.println("Matches ganados por Jugador 1: " + Macthscore1);
        System.out.println("Matches ganados por Jugador 2: " + Macthscore2);
    }
}


