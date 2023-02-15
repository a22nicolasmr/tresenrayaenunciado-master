package motor3R;

import java.util.Scanner;

public class TresEnRaya {
    private int cont=0;
    private int contO=0;
    Scanner sc = new Scanner(System.in);

    public TresEnRaya() {
    }
    public int getCont(){
        return this.cont;
    }
    public int getContO(){
        return this.contO;
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
    public char comprobarGanador(char simbolo,char simboloO){
        //horizontal | izquierda
        if(this.tablero[0][0]==simbolo){
            if(this.tablero[0][1]==simbolo){
                if(this.tablero[0][2]==simbolo){
                    //indicar que gana xogador
                    return 'j';
                }
            }
        }else if(this.tablero[0][0]==simboloO){
            if (this.tablero[0][1]==simboloO) {
                if (this.tablero[0][2]==simboloO) {
                    //indicar que gana pc
                    return 'm';
                }
            }

        }
        //horizontal | medio
        if(this.tablero[1][0]==simbolo){
            if(this.tablero[1][1]==simbolo){
                if(this.tablero[1][2]==simbolo){
                    //indicar que gana xogador
                    return 'j';
                }
            }
        }else if(this.tablero[1][0]==simboloO){
            if (this.tablero[1][1]==simboloO) {
                if (this.tablero[1][2]==simboloO) {
                    //indicar que gana pc
                    return 'm';
                }
            }
        }
        //horizontal | derecha
        if(this.tablero[2][0]==simbolo){
            if(this.tablero[2][1]==simbolo){
                if(this.tablero[2][2]==simbolo){
                    //indicar que gana xogador
                    return 'j';
                }
            }
        }else if(this.tablero[2][0]==simboloO){
            if (this.tablero[2][1]==simboloO) {
                if (this.tablero[2][2]==simboloO) {
                    //indicar que gana pc
                    return 'm';
                }
            }

        }
        //vertical - de arriba
        if(this.tablero[0][0]==simbolo){
            if(this.tablero[1][0]==simbolo){
                if(this.tablero[2][0]==simbolo){
                    //indicar que gana xogador
                    return 'j';
                }
            }
        }else if(this.tablero[0][0]==simboloO){
            if (this.tablero[1][0]==simboloO) {
                if (this.tablero[2][0]==simboloO) {
                    //indicar que gana pc
                    return 'm';
                }
            }

        }
        //vertical - do medio
        if(this.tablero[1][0]==simbolo){
            if(this.tablero[1][1]==simbolo){
                if(this.tablero[1][2]==simbolo){
                    //indicar que gana xogador
                    return 'j';
                }
            }
        }else if(this.tablero[1][0]==simboloO){
            if (this.tablero[1][1]==simboloO) {
                if (this.tablero[1][2]==simboloO) {
                    //indicar que gana pc
                    return 'm';
                }
            }
        }
        // vertical _ de abajo del todo
        if(this.tablero[2][0]==simbolo){
            if(this.tablero[2][1]==simbolo){
                if(this.tablero[2][2]==simbolo){
                    //indicar que gana xogador
                    return 'j';
                }
            }
        }else if(this.tablero[2][0]==simboloO){
            if (this.tablero[2][1]==simboloO) {
                if (this.tablero[2][2]==simboloO) {
                    //indicar que gana pc
                    return 'm';
                }
            }
        }
        //diagonal \
        if(this.tablero[0][0]==simbolo){
            if(this.tablero[1][1]==simbolo){
                if(this.tablero[2][2]==simbolo){
                    //indicar que gana xogador
                    return 'j';
                }
            }
        }else if(this.tablero[0][0]==simboloO){
            if (this.tablero[1][1]==simboloO) {
                if (this.tablero[2][2]==simboloO) {
                    //indicar que gana pc
                    return 'm';
                }
            }
        }
        //diagonal /
        if(this.tablero[2][0]==simbolo){
            if(this.tablero[1][1]==simbolo){
                if(this.tablero[0][2]==simbolo){
                    //indicar que gana xogador
                    return 'j';
                }
            }
        }else if(this.tablero[2][0]==simboloO){
            if (this.tablero[1][1]==simboloO) {
                if (this.tablero[0][2]==simboloO) {
                    //indicar que gana pc
                    return 'm';
                }
            }
        }
        return ' ';
    }
}
