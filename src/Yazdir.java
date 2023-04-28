public class Yazdir {
    public void yazdir(int[][] oyunTahtasi) {
        Oyun_Tahtasi oyun_tahtasi = new Oyun_Tahtasi();
        System.out.println("Puanınız:  " + oyun_tahtasi.puan + "\nOynanabilecek hamle sayısı:\t" + oyun_tahtasi.oynanabilirYerler);
        System.out.print("  Y| ");
        //KENARDAKI SAYILARI YAZDIRMA
        for (int q = 0; q < 2; q++) {
            if (q == 1) {
                System.out.println();
                System.out.print("X | ---------------------------");
            } else {
                for (int k = 0; k < 9; k++) {
                    System.out.print(k + 1 + "  ");
                }
            }
        }
        System.out.println();
        //OYUN TAHTASINI YAZDIRMA
        for (int i = 0; i < 9; i++) {
            System.out.print(i + 1 + " |  ");
            for (int j = 0; j < 9; j++) {
                //DAHA ONCEDEN OYNANMIS, SIMDI OYNANAMAZ KARELER
                if(oyunTahtasi[i][j]==1){
                    System.out.print(Kare_Defter.kapaliGrid[i][j]+"  ");
                }
                //OYNANMAMIS KARELER
                if (oyunTahtasi[i][j]==0) {
                    System.out.print("-  ");
                }
                //L HAREKETE UYGUN OYNANABILIR KARELER
                if (oyunTahtasi[i][j] == 3) {
                    System.out.print("#  ");
                }
            }
            System.out.println();
        }
    }
}
