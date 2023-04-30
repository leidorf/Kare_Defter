public class Oyun_Tahtasi {
    int[][] oyunTahtasi = new int[9][9];
    static int puan=0;
    static int oynanabilirHamleSayisi=0;

    //OYUN TAHTASINI OLUSTURUR
    public void TahtayiOlustur(){
        for(int i =0; i<9;i++){
            for(int j=0;j<9;j++){
                oyunTahtasi[i][j] = 0;
            }
        }
    }

    //L SEKLINDE HAREKETI SAGLAR
    private void LHareketAtama(int x, int y) {
        int[] xDegerleri = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] yDegerleri = {1, 2, 2, 1, -1, -2, -2, -1};
        for (int i = 0; i < xDegerleri.length; i++) {
            int yeniX = x + xDegerleri[i];
            int yeniY = y + yDegerleri[i];
            if (yeniX >= 0 && yeniX < oyunTahtasi.length && yeniY >= 0 && yeniY < oyunTahtasi[0].length && oyunTahtasi[yeniX][yeniY]<=0) {
                oyunTahtasi[yeniX][yeniY] = -1;
            }
        }
    }

    //TAHTAYI SIFIRLAR
    private void TahtayiSifirla(){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(oyunTahtasi[i][j]==-1){
                    oyunTahtasi[i][j]=0;
                }
            }
        }
    }

    //OYNANABILIR HAREKET SAYISI ATAMA
    private void OynanabilecekHamleSayisiAtama(){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(oyunTahtasi[i][j]==-1){
                    oynanabilirHamleSayisi++;
                }
            }
        }
    }

    //ANA OYUN MEKANIGI
    public void OyunTahtasiHareket(int x, int y){
        oynanabilirHamleSayisi=0;
        TahtayiSifirla();
        LHareketAtama(x,y);
        OynanabilecekHamleSayisiAtama();
        puan++;
    }
}
