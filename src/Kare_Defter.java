import java.util.Scanner;

public class Kare_Defter {
    static int sayac=1;
    static int[][] kapaliGrid = new int[9][9];
    public static void main(String[] args) {
        Oyun_Tahtasi oyun_tahtasi = new Oyun_Tahtasi();
        oyun_tahtasi.tahtayiOlustur();
        Hareket();

    }

    public static void Hareket(){
        Scanner input = new Scanner(System.in);
        Oyun_Tahtasi oyun_tahtasi = new Oyun_Tahtasi();
        Yazdir yazdir = new Yazdir();
        int ilk=0; int ikinci=0;
        do{
            System.out.println("\nLütfen hareket ediceğiniz kareyi giriniz:");
            ilk = input.nextInt(); ikinci = input.nextInt();
            oyun_tahtasi.OyunTahtasiHareket(ilk-1,ikinci-1);
            kapaliGrid[ilk-1][ikinci-1] = sayac;
            yazdir.yazdir(oyun_tahtasi.oyunTahtasi);
            sayac++;
        }while (oyun_tahtasi.oynanabilirYerler>0);
    }

}