import javax.swing.*;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 12;
        int y = 18;
        Menu m = new Menu();
        m.mostrar(sc,
                new String[]{ "Sumar", "Restar", "Multiplicar"} ,
                new Runnable[]{
                        () -> System.out.println(x + y),
                        () -> System.out.println(x - y),
                        () -> System.out.println(x * y)
                }
        );

    }


}