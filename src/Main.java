import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int acilisFiyat=10;
        double km,kmFiyat=2.2,fiyat;
        System.out.print("Kaç kilometre gidilecek: ");
        km= input.nextDouble();
        fiyat=(km*kmFiyat)+acilisFiyat;
        double acilis= fiyat<20?20:fiyat;
        System.out.println(acilis);
    }
}