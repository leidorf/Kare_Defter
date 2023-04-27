public class Oyun_Tahtasi {
    int[][] oyunTahtasi = new int[9][9];
    int[][] hareketYeri = new int[9][9];
    static int puan=0;
    int oynanabilirYerler=10;

    public void tahtayiOlustur(){
        for(int i =0; i<9;i++){
            for(int j=0;j<9;j++){
                oyunTahtasi[i][j] = 0;
            }
        }
    }
    public void OyunTahtasiHareket(int x, int y){
        oyunTahtasi[x][y] = 1;
        puan++;
    }

    public void HareketYerleri(int[][] hareketKaresi,int x, int y){

    }


}
