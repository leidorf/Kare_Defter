public class Yazdir {

    public void yazdir(int[][] oyunTahtasi){
        Oyun_Tahtasi oyun_tahtasi = new Oyun_Tahtasi();
        System.out.println("Puanınız:  "+oyun_tahtasi.puan+"\nOynanabilecek hamle sayısı:\t"+oyun_tahtasi.oynanabilirYerler);
        System.out.print("     ");
        for (int q=0;q<2;q++){
            if(q==1){
                System.out.println();
                    System.out.print("   ----------------------------");
            }
            else {
                for (int k=0;k<9;k++){
                    System.out.print(k+1+"  ");
                }
            }
        }
        System.out.println();

        for (int i=0;i<9;i++){
            System.out.print(i+1+" |  ");
            for (int j=0;j<9;j++){
                if(oyunTahtasi[i][j]==1){           //Daha onceden oynanmis, simdi oynanamaz kareler
                    System.out.print(Kare_Defter.kapaliGrid[i][j]+"  ");
                }
                else if (oyunTahtasi[i][j]==0) {    //Oynanmamis kareler
                    System.out.print("Y  ");
                }

            }
            System.out.println();
        }
    }
}
