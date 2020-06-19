package tictactoe;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.next();
        System.out.println("---------");
        System.out.println("| "+input.charAt(0) + " " + input.charAt(1) + " " + input.charAt(2) + " |");
        System.out.println("| "+input.charAt(3) + " " + input.charAt(4) + " " + input.charAt(5) + " |");
        System.out.println("| "+input.charAt(6) + " " + input.charAt(7) + " " + input.charAt(8) + " |");
        System.out.println("---------");
        int xCount = 0, yCount=0;
        for (int i = 0; i<9;i++) {
            if (input.toUpperCase().charAt(i)=='X')
                xCount ++;
            else if (input.toUpperCase().charAt(i)=='O')
                yCount ++;
            else
                continue;
        }
        if (Math.abs(xCount-yCount) >=2)
            System.out.println("Impossible");
        else if (((input.charAt(0) == input.charAt(1)) && (input.charAt(0) == input.charAt(2)) )&&((input.charAt(3) == input.charAt(4)) && (input.charAt(3) == input.charAt(5))))
            System.out.println("Impossible");
        else if (((input.charAt(0) == input.charAt(1)) && (input.charAt(0) == input.charAt(2)) )&&((input.charAt(6) == input.charAt(7)) && (input.charAt(7) == input.charAt(8))))
            System.out.println("Impossible");
        else if (((input.charAt(3) == input.charAt(4)) && (input.charAt(3) == input.charAt(5)) )&&((input.charAt(0) == input.charAt(1)) && (input.charAt(1) == input.charAt(2))))
            System.out.println("Impossible");
        else if (((input.charAt(3) == input.charAt(4)) && (input.charAt(3) == input.charAt(5)) )&&((input.charAt(6) == input.charAt(7)) && (input.charAt(7) == input.charAt(8))))
            System.out.println("Impossible");
        else if (((input.charAt(6) == input.charAt(7)) && (input.charAt(6) == input.charAt(8)) )&&((input.charAt(0) == input.charAt(1)) && (input.charAt(1) == input.charAt(2))))
            System.out.println("Impossible");
        else if (((input.charAt(6) == input.charAt(7)) && (input.charAt(7) == input.charAt(8)) )&&((input.charAt(3) == input.charAt(4)) && (input.charAt(3) == input.charAt(5))))
            System.out.println("Impossible");
        else if (((input.charAt(0) == input.charAt(3)) && (input.charAt(3) == input.charAt(6)) )&&((input.charAt(1) == input.charAt(4)) && (input.charAt(4) == input.charAt(7))))
            System.out.println("Impossible");
        else if (((input.charAt(0) == input.charAt(3)) && (input.charAt(0) == input.charAt(6)) )&&((input.charAt(2) == input.charAt(5)) && (input.charAt(5) == input.charAt(8))))
            System.out.println("Impossible");
        else if (((input.charAt(1) == input.charAt(4)) && (input.charAt(7) == input.charAt(1)) )&&((input.charAt(0) == input.charAt(3)) && (input.charAt(3) == input.charAt(6))))
            System.out.println("Impossible");
        else if (((input.charAt(1) == input.charAt(4)) && (input.charAt(7) == input.charAt(4)) )&&((input.charAt(2) == input.charAt(5)) && (input.charAt(5) == input.charAt(8))))
            System.out.println("Impossible");
        else if (((input.charAt(2) == input.charAt(5)) && (input.charAt(5) == input.charAt(8)) )&&((input.charAt(0) == input.charAt(3)) && (input.charAt(3) == input.charAt(6))))
            System.out.println("Impossible");
        else if (((input.charAt(2) == input.charAt(5)) && (input.charAt(5) == input.charAt(8)) )&&((input.charAt(1) == input.charAt(4)) && (input.charAt(4) == input.charAt(7))))
            System.out.println("Impossible");
        else if ((input.charAt(0) == input.charAt(1)) && (input.charAt(0) == input.charAt(2)) )
            System.out.println(input.charAt(0) + " wins");
        else if ((input.charAt(3) == input.charAt(4)) && (input.charAt(3) == input.charAt(5)) )
            System.out.println(input.charAt(3) + " wins");
        else if ((input.charAt(6) == input.charAt(7)) && (input.charAt(7) == input.charAt(8)) )
            System.out.println(input.charAt(6) + " wins");
        else if ((input.charAt(0) == input.charAt(3)) && (input.charAt(3) == input.charAt(6)) )
            System.out.println(input.charAt(0) + " wins");
        else if ((input.charAt(1) == input.charAt(4)) && (input.charAt(4) == input.charAt(7)) )
            System.out.println(input.charAt(1) + " wins");
        else if ((input.charAt(2) == input.charAt(5)) && (input.charAt(5) == input.charAt(8)) )
            System.out.println(input.charAt(2) + " wins");
        else if ((input.charAt(0) == input.charAt(4)) && (input.charAt(4) == input.charAt(8)) )
            System.out.println(input.charAt(0) + " wins");
        else if ((input.charAt(2) == input.charAt(4)) && (input.charAt(4) == input.charAt(6)) )
            System.out.println(input.charAt(2) + " wins");
        else if (input.contains(" ") || input.contains("_")) {
            System.out.println("Game not finished");
        }
        else
            System.out.println("Draw");
    }
}
