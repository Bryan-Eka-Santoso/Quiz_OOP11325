public class Empat extends Tanaman {
    public Empat() {
        maxUmur = 10;
        umur = 0;
        tinggi = 0;
        tinggiPanen = 10;
        boolean siapJual = false;
    }
    public void cek(){
        if(tinggi >= tinggiPanen){
            siapJual = true;
        }
    }
    public void printInfo() {
        System.out.println("Tanaman Jenis Empat (Umur, Tinggi, Siap Jual): (" + umur + ", " + tinggi + ", " + siapJual + ")");
    }
}
