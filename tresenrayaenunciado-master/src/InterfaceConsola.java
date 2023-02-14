import java.util.Scanner;
import motor3R.TresEnRaya;
import java.util.random.*;

public class InterfaceConsola extends TresEnRaya {
    private char simbolo;
    private char simboloO;
    private int casillaX;
    private int casillaY;
    // private char casillaM;
    Scanner sc = new Scanner(System.in);
    TresEnRaya a = new TresEnRaya();

    public void PreguntarCosas() {
        System.out.println("Jugador ,escribe el símbolo con el que quieres jugar X o O.");
        simbolo = sc.next().charAt(0);
        if (simbolo == 'O') {
            simboloO = 'X';
        } else {
            simboloO = 'O';
        }
        System.out.println("Vale, jugaras con "+ simbolo+" contra "+simboloO);
    }

    public void imprimirTablero() {
        System.out.println("El tablero sera el siguiente");
        for (int i = 0; i < a.getTablero().length; i++) {
            for (int j = 0; j < a.getTablero()[0].length; j++) {
                System.out.print(" "+a.getTablero()[i][j]);
            }
            System.out.println("");
        }
    }

    public void MeterValores() {
        System.out.println("Jugador , donde deseas poner tu " + simbolo);
        int casilla=sc.nextInt();
        if(casilla==1){
            a.getTablero()[0][0]=simbolo;
        }else if (casilla==2) {
            a.getTablero()[0][1]=simbolo;
        }else if (casilla==3) {
            a.getTablero()[0][2]=simbolo;
        }else if (casilla==4) {
            a.getTablero()[1][0]=simbolo;
        }else if (casilla==5) {
            a.getTablero()[1][1]=simbolo;
        }else if (casilla==6) {
            a.getTablero()[1][2]=simbolo;
        }else if (casilla==7) {
            a.getTablero()[2][0]=simbolo;
        }else if (casilla==8) {
            a.getTablero()[2][1]=simbolo;
        }else if (casilla==9) {
            a.getTablero()[2][2]=simbolo;
        }
    }

    public void meterValoresMaquina() {
        int casillaXo=(int)(Math.random()*2-0);
        int casillaYo=(int)(Math.random()*2-0);
        while(a.getTablero()[casillaXo][casillaYo]==simbolo){
            casillaXo=(int)(Math.random()*2-0);
            casillaYo=(int)(Math.random()*2-0);
        }
        System.out.println("El tablero sera el siguiente:");
        a.getTablero()[casillaXo][casillaYo]=simboloO;
        for (int i = 0; i < a.getTablero().length; i++) {
            for (int j = 0; j < a.getTablero()[0].length; j++) {
                System.out.print(" "+a.getTablero()[i][j]);
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        InterfaceConsola a1=new InterfaceConsola();
        a1.PreguntarCosas();
        a1.imprimirTablero();
        a1.MeterValores();
        a1.imprimirTablero();
        a1.meterValoresMaquina();
        a1.MeterValores();
        a1.imprimirTablero();
        a1.meterValoresMaquina();

    }
}
