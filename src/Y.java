public class Y extends Pupuk {
    public void Use(Tanaman tanaman){
        if(tanaman instanceof Satu){
            tanaman.tinggi -= 1;
        } else if (tanaman instanceof Dua){
            tanaman.tinggi += 2;
        } else if (tanaman instanceof Tiga){
            tanaman.tinggi += 2;
        } else if (tanaman instanceof Empat){
            tanaman.tinggi -= 2;
        } else if (tanaman instanceof Lima){
            tanaman.tinggi -= 2;
        }
    }
}
