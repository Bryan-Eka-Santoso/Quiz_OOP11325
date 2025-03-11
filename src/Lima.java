public class Lima extends Tanaman {
    public Lima() {
        maxUmur = 10;
        umur = 0;
        tinggi = 0;
        tinggiPanen = 15;
        boolean siapJual = false;
    }
    public void cek(){
        if(tinggi >= tinggiPanen){
            siapJual = true;
        }
    }
    public void printInfo() {
        System.out.println("Tanaman Jenis Lima (Umur, Tinggi, Siap Jual): (" + umur + ", " + tinggi + ", " + siapJual + ")");
    }
}
