package ve.edu.ucab.lab;

public class Match {

    private int matchesGanadosJugador1;
    private int matchesGanadosJugador2;

    // Constructor y otros métodos de la clase

    public void jugador1GanaMatch() {
        matchesGanadosJugador1++;
    }

    public void jugador2GanaMatch() {
        matchesGanadosJugador2++;
    }

    public void reiniciarMarcadorMatches() {
        matchesGanadosJugador1 = 0;
        matchesGanadosJugador2 = 0;
    }

    public int getMatchesGanadosJugador1() {
        return matchesGanadosJugador1;
    }

    public int getMatchesGanadosJugador2() {
        return matchesGanadosJugador2;
    }
}