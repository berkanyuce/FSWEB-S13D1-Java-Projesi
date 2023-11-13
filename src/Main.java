import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Havlayan Köpeğimiz
        System.out.println("Havlayan Köpek: " + shouldWakeUp(true, -1));

        //Yaş Tespiti
        System.out.println("Yaş Tespiti: " + hasTeen(22, 23, 34));

        //Oyuncu Kedi
        System.out.println("Oyuncu Kedi: " + isCatPlaying(false, 35));

        //Dikdörtgenin Alanı
        Scanner myObj = new Scanner(System.in);

        System.out.print("Kenar1 : ");
        double kenar1 = myObj.nextDouble();

        System.out.print("Kenar2 : ");
        double kenar2 = myObj.nextDouble();

        System.out.println("Dikdörtgenin Alanı = " + area(kenar1, kenar2));

        //Dairenin Alanı
        System.out.print("Yarıçap : ");
        double radius = myObj.nextDouble();
        System.out.println("Dairenin Alanı = " + area(radius));

    }

    // Havlayan Köpeimiz
    public static boolean shouldWakeUp(boolean par1, int par2) {
        if (par1 == true && ((par2 > 20 && par2 <= 23) || (par2 >=0 && par2 < 8))) {
            return true;
        }
        else return false;
    }
    //

    // Yaş tespiti
    public static boolean hasTeen(int par1, int par2, int par3) {
        return isTeen(par1) || isTeen(par2) || isTeen(par3);
    }

    public static boolean isTeen(int num) {
        return num >=13 && num <= 19;
    }
    //

    // Oyuncu Kedi
    public static boolean isCatPlaying(boolean session, int temp) {
        if (session) {
            return temp >= 25 && temp <= 45;
        }
        else {
            return temp >= 25 && temp <= 35;
        }
    }

    // Alan hesaplama
    public static double area(double kenar1, double kenar2) {
        return kenar1 < 0 || kenar2 < 0 ? -1 : kenar1 * kenar2;
    }
    public static double area(double radius) {
        return radius < 0 ? -1 : radius * radius * Math.PI;
    }
}