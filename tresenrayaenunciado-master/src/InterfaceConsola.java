import java.util.Scanner;
import motor3R.TresEnRaya;
public class InterfaceConsola {
    private char simbolo;
    Scanner sc=new Scanner(System.in);
    private char casilla;
    public void PreguntarCosas(char simbolo,char empieza){
        System.out.println("Jugador ,escribe el símbolo con el que quieres jugar X o O.");
        simbolo=sc.next().charAt(0);
        System.out.println("Quien empieza (M) maquina (J) jugador.");
        empieza=sc.next().charAt(0);
    }
    public void imprimirTablero(){
        for (int i = 0; i <tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println("");
        }
        
    }
    public void MeterValores(){
        System.out.println("Jugador , donde deseas poner tu "+simbolo);
        casilla=sc.next().charAt(0);
        switch (casilla) {
            case 1:
                
                break;
        }
    }
    
    public static void main(String[] args) {
    }
}
