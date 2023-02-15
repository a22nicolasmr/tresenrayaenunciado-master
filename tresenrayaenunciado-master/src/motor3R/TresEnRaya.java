package motor3R;

import java.util.Scanner;

public class TresEnRaya {
    private int casilla;
    Scanner sc = new Scanner(System.in);

    public TresEnRaya() {
    }

    private char[][] tablero = {
            { '1', '2', '3' },
            { '4', '5', '6' },
            { '7', '8', '9' },
    };

    public char[][] getTablero() {
        return tablero;
    }

    public void MeterValores(int casilla,char simbolo) {
        if (casilla == 1) {
            this.tablero[0][0] = simbolo;
        } else if (casilla == 2) {
            this.tablero[0][1] = simbolo;
        } else if (casilla == 3) {
            this.tablero[0][2] = simbolo;
        } else if (casilla == 4) {
            this.tablero[1][0] = simbolo;
        } else if (casilla == 5) {
            this.tablero[1][1] = simbolo;
        } else if (casilla == 6) {
            this.tablero[1][2] = simbolo;
        } else if (casilla == 7) {
            this.tablero[2][0] = simbolo;
        } else if (casilla == 8) {
            this.tablero[2][1] = simbolo;
        } else if (casilla == 9) {
            this.tablero[2][2] = simbolo;
        }
    }
    public void meterValoresMaquina(char simbolo,char simboloO) {
        int casillaXo = (int) (Math.random() * 2 - 0);
        int casillaYo = (int) (Math.random() * 2 - 0);
        while (this.tablero[casillaXo][casillaYo] == simbolo || this.tablero[casillaXo][casillaYo] ==simboloO ) {
            casillaXo = (int) (Math.random() * 2 - 0);
            casillaYo = (int) (Math.random() * 2 - 0);
        }
        this.tablero[casillaXo][casillaYo]=simboloO;
    }
    public void comprobarGanador(int casilla,char simbolo,char simboloO){
       for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if(tablero[i][j]==simbolo){
                    if(tablero[i][j]==simbolo){
                        
                    }
                }
            }
       }
    }
}
