package ve.edu.ucab.lab;

public class Set {
    // Otros atributos de la clase

    private int setsJugador1;
    private int setsJugador2;
    private int matchesGanadosJugador1;
    private int matchesGanadosJugador2;
    private Match match; // Asegúrate de tener el objeto Match como atributo de la clase Set

    public Set(Match match) {
        this.match = match;
    }

    public void jugador1GanaMatch() {
        matchesGanadosJugador1++;
        if (matchesGanadosJugador1 == 6) {
            verificarGanadorSet();
        }
    }

    public void jugador2GanaMatch() {
        matchesGanadosJugador2++;
        if (matchesGanadosJugador2 == 6) {
            verificarGanadorSet();
        }
    }

    private void verificarGanadorSet() {
        if (Math.abs(matchesGanadosJugador1 - matchesGanadosJugador2) >= 2) {
            if (matchesGanadosJugador1 > matchesGanadosJugador2) {
                jugador1GanaSet();
            } else {
                jugador2GanaSet();
            }
        }
    }

    private void jugador1GanaSet() {
        setsJugador1++;
        reiniciarMarcadorMatches();
    }

    private void jugador2GanaSet() {
        setsJugador2++;
        reiniciarMarcadorMatches();
    }

    private void reiniciarMarcadorMatches() {
        matchesGanadosJugador1 = 0;
        matchesGanadosJugador2 = 0;
        match.reiniciarMarcadorMatches(); // Reinicia el marcador de matches utilizando el método del objeto Match asociado
    }

    public int getSetsJugador1() {
        return setsJugador1;
    }

    public int getSetsJugador2() {
        return setsJugador2;
    }
}