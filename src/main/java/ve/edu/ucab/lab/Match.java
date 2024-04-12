package ve.edu.ucab.lab;

import java.util.LinkedList;
import java.util.Scanner;


public class Match {


    public int matchId;
    public Player player1;
    public Player player2;
    public int matchScorePlayer1 = 0;
    public int matchScorePlayer2 = 0;
    public Set currentSet;

    public Match(int matchId, Player player1, int matchScorePlayer1, int matchScorePlayer2, Set currentSet) {
        this.matchId = matchId;
        this.player1 = player1;
        this.player2 = player2;
        this.matchScorePlayer1 = matchScorePlayer1;
        this.matchScorePlayer2 = matchScorePlayer2;
        this.currentSet = currentSet;
    }

}

