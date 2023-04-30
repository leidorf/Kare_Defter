import java.util.Scanner;

public class Kare_Defter {
    static int sayac=1;

    //CALISTIRMA
    public static void main(String[] args) {
        Oyun_Tahtasi oyun_tahtasi = new Oyun_Tahtasi();
        oyun_tahtasi.tahtayiOlustur();
        Hareket();
    }

    public static void Hareket(){
        Scanner input = new Scanner(System.in);
        Oyun_Tahtasi oyun_tahtasi = new Oyun_Tahtasi();
        Yazdir yazdir = new Yazdir();
        int ilk; int ikinci;

        //ILK HAREKET
        System.out.println("\nLütfen hareket ediceğiniz kareyi giriniz:");
        ilk = input.nextInt(); ikinci = input.nextInt();
        oyun_tahtasi.OyunTahtasiHareket(ilk-1,ikinci-1);
        oyun_tahtasi.oyunTahtasi[ilk-1][ikinci-1] = sayac;
        yazdir.yazdir(oyun_tahtasi.oyunTahtasi);
        sayac++;

        //HAREKET DONGUSU
        do{
            System.out.println("\nLütfen hareket ediceğiniz kareyi giriniz:");
            ilk = input.nextInt(); ikinci = input.nextInt();

            //L SEKLINDE HAREKET KISITLAMASI
            if (oyun_tahtasi.oyunTahtasi[ilk-1][ikinci-1]!=-1){
                System.out.println("Lütfen oynanabilir kareleri seçiniz.");
            }
            else{
                //AYNI YERE HAREKETI ENGELLEME
                if(oyun_tahtasi.oyunTahtasi[ilk-1][ikinci-1]>=1){
                    System.out.println("Daha önce oynadığınız kareye hareket edemezsiniz.");
                }
                //ISTENEN HAREKETLER
                else {
                    oyun_tahtasi.OyunTahtasiHareket(ilk-1,ikinci-1);
                    oyun_tahtasi.oyunTahtasi[ilk-1][ikinci-1] = sayac;
                    yazdir.yazdir(oyun_tahtasi.oyunTahtasi);
                    sayac++;
                }
            }
        }while (Oyun_Tahtasi.oynanabilirYerler>0);
    }

}