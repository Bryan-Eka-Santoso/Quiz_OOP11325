public class Satu extends Tanaman {
    public Satu() {
        maxUmur = 10;
        umur = 0;
        tinggi = 0;
        tinggiPanen = 5;
        boolean siapJual = false;
    }

    public void cek(){
        if(tinggi >= tinggiPanen){
            siapJual = true;
        }
    }

    public void printInfo() {
        System.out.println("Tanaman Jenis Satu (Umur, Tinggi, Siap Jual): (" + umur + ", " + tinggi + ", " + siapJual + ")");
    }
}
