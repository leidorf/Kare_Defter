public class Oyun_Tahtasi {
    int[][] oyunTahtasi = new int[9][9];
    static int puan=0;
    static int oynanabilirYerler=0;

    public void tahtayiOlustur(){
        for(int i =0; i<9;i++){
            for(int j=0;j<9;j++){
                oyunTahtasi[i][j] = 0;
            }
        }
    }
    public void OyunTahtasiHareket(int x, int y){
        oynanabilirYerler=0;
        TahtayiSifirla();
        HareketYerleri(x,y);
        OynanabilirHareketSayisiAtama();
        oyunTahtasi[x][y] = 1;
        puan++;
    }
    //TAHTAYI SIFIRLAR
    private void TahtayiSifirla(){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(oyunTahtasi[i][j]!=1){
                    oyunTahtasi[i][j]=0;
                }
            }
        }
    }
    //OYNANABILIR HAREKET SAYISI ATAMA
    private void OynanabilirHareketSayisiAtama(){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(oyunTahtasi[i][j]==3){
                    oynanabilirYerler++;
                }
            }
        }
    }
    //L SEKLINDE HAREKETI SAGLAR
    public void HareketYerleri(int x, int y) {
        if (x > 2 && y > 1) {
            oyunTahtasi[x - 2][y - 2] = 3;
        }
        if (x > 1 && y > 2) {
            oyunTahtasi[x - 2][y - 2] = 3;
        }
        if (x < 7 && y > 2) {
            oyunTahtasi[x + 1][y - 2] = 3;
        }
        if (x < 6 && y > 1) {
            oyunTahtasi[x + 2][y - 2] = 3;
        }
        if (x < 6 && y < 7) {
            oyunTahtasi[x + 2][y + 1] = 3;
        }
        if (x < 7 && y < 6) {
            oyunTahtasi[x + 1][y + 2] = 3;
        }
        if (x > 1 && y < 6) {
            oyunTahtasi[x - 2][y + 1] = 3;
        }
        if (x > 2 && y < 7) {
            oyunTahtasi[x - 2][y + 2] = 3;
        }
    }
}
