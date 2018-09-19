import java.util.Scanner;


public class Binaari {

    public static void main(String args[]) {
        int luku1, luku2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Anna kaksi binaarilukua\nAnna ensimmäinen binaariluku:");
        luku1 = sc.nextInt();
        System.out.println("Anna toinen binaariluku:");
        luku2 = sc.nextInt();
        System.out.println("Binaarilukujen summa on:");
        System.out.println(Integer.toBinaryString(luku1 + luku2));
    }
}


