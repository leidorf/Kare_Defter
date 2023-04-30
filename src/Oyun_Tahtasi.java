public class Oyun_Tahtasi {
    int[][] oyunTahtasi = new int[9][9];
    static int puan=0;
    static int oynanabilirYerler=0;

    //OYUN TAHTASINI OLUSTURUR
    public void tahtayiOlustur(){
        for(int i =0; i<9;i++){
            for(int j=0;j<9;j++){
                oyunTahtasi[i][j] = 0;
            }
        }
    }
    //ANA OYUN MEKANIGI
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
                if(oyunTahtasi[i][j]==-1){
                    oyunTahtasi[i][j]=0;
                }
            }
        }
    }
    //OYNANABILIR HAREKET SAYISI ATAMA
    private void OynanabilirHareketSayisiAtama(){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(oyunTahtasi[i][j]==-1){
                    oynanabilirYerler++;
                }
            }
        }
    }

    //L SEKLINDE HAREKETI SAGLAR
    private void HareketYerleri(int x, int y) {
        int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
        for (int i = 0; i < dx.length; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if (newX >= 0 && newX < oyunTahtasi.length && newY >= 0 && newY < oyunTahtasi[0].length && oyunTahtasi[newX][newY]<=0) {
                oyunTahtasi[newX][newY] = -1;
            }
        }
    }
}
