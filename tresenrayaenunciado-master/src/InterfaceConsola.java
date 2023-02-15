import java.util.Scanner;
import motor3R.TresEnRaya;
import java.util.random.*;

public class InterfaceConsola extends TresEnRaya {
    
    private char simboloO;
    private int casillaX;
    private int casillaY;
    // private char casillaM;
    TresEnRaya a = new TresEnRaya();

    public static char PreguntarCosas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jugador ,escribe el símbolo con el que quieres jugar X o O.");
        char simbolo = sc.next().charAt(0);       
        return simbolo;
    }

    public static void imprimirTablero(TresEnRaya b, char simbolo) {
        System.out.println("El tablero sera el siguiente");
        for (int i = 0; i < b.getTablero().length; i++) {
            for (int j = 0; j < b.getTablero()[0].length; j++) {
                System.out.print(" " + b.getTablero()[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Jugador , donde deseas poner tu " + simbolo);
    }
    public static void main(String[] args) {
        char simbolo;
        char simboloO;
        Scanner sc = new Scanner(System.in);
        InterfaceConsola a1 = new InterfaceConsola();
        TresEnRaya b = new TresEnRaya();
        simbolo = PreguntarCosas();
        if (simbolo == 'O') {
            simboloO = 'X';
        } else {
            simboloO = 'O';
        }
        //primer turno
        System.out.println("Vale, jugaras con " + simbolo + " contra " + simboloO);
        imprimirTablero(b, simbolo);
        int casilla = sc.nextInt();
        b.MeterValores(casilla,simbolo);
        b.meterValoresMaquina(simbolo,simboloO);
        imprimirTablero(b, simbolo);
        //seegundo turno
        casilla = sc.nextInt();
        b.MeterValores(casilla,simbolo);
        b.meterValoresMaquina(simbolo,simboloO);
        imprimirTablero(b, simbolo);
        //Tercer turno
        casilla = sc.nextInt();
        b.MeterValores(casilla,simbolo);
        //////////metodo comprobar ganador
        b.meterValoresMaquina(simbolo,simboloO);
        imprimirTablero(b, simbolo);

    }
}
