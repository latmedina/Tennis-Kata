package ve.edu.ucab.lab;
import java.util.Random;
public class Points {
    static Random rand = new Random();
    public int score1;
    public int score2;
    public Player player1;
    public Player player2;
    public String puntaje;


    public Points(Player player1, Player player2) {
        this.score1 = 0;
        this.score2 = 0;
        this.player1 = player1;
        this.player2 = player2;
        this.puntaje= "0-0";
    }

    public void Matches() {
        while(score1 != 4 && score2 != 4) {
            System.out.println("Juego Iniciado!");
            int Jug1 = rand.nextInt(1000);
            int Jug2 = rand.nextInt(1000);

            if (Jug1 > Jug2) {
                this.score1++;
                actualizarJuego();
            } else if (Jug1 < Jug2) {
                this.score2++;
                actualizarJuego();
            }

            System.out.println("Juego Finalizado!");
            System.out.println(player1.username + ": " + score1);
            System.out.println(player2.username + ": " + score2);
            System.out.println(puntaje);
        }
    }
        public void actualizarJuego() {
            String scoreJuga1 = convertirPuntaje(score1);
            String scoreJuga2 = convertirPuntaje(score2);

            this.puntaje = scoreJuga1 + "-" + scoreJuga2;

             if (this.puntaje.equals("40-40")) {
                   Deuce();
                }
        }

        public String convertirPuntaje(int puntaje){
            switch (puntaje) {
                case 0:
                    return "0";
                case 1:
                    return "15";
                case 2:
                    return "30";
                case 3:
                    return "40";
                case 4:
                    return "Game";
                default:
                    return "Error";
            }
        }

        public void Deuce(){
            if (this.score1 > this.score2) {
                this.puntaje = "A-" + "40";
            } else {
                this.puntaje = "40-" + "A";
            }
        }

        public boolean verificarGanadorJuego() {
        // Un jugador gana cuando tiene una ventaja de dos puntos y ha anotado al menos cuatro puntos
        if (Math.abs(this.score1 - this.score2) >= 2 && this.score1 >= 4) {
            return true;
        } else return Math.abs(this.score2 - this.score1) >= 2 && this.score2 >= 4;
    }
}

