public class Yazdir {
    public void yazdir(int[][] Tahta) {
        System.out.println("Puanınız:  " + Oyun_Tahtasi.puan + "\nOynanabilecek hamle sayısı:\t" + Oyun_Tahtasi.oynanabilirYerler);
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
                //OYNANMAMIS KARELER
                if (Tahta[i][j] == 0) {
                    System.out.print("-  ");
                }
                //L HAREKETE UYGUN OYNANABILIR KARELER
                if (Tahta[i][j] == -1) {
                    System.out.print("#  ");
                }
                //DAHA ONCEDEN OYNANMIS, SIMDI OYNANAMAZ KARELER
                if (Tahta[i][j] >= 1 ){
                    System.out.print(Tahta[i][j]+"  ");
                }

            }
            System.out.println();
        }
    }
}
