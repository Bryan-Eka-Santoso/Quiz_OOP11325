import java.util.*;

public class App {
    static Scanner scanI = new Scanner(System.in);
    static Random rand = new Random();
    public static void main(String[] args) throws Exception {
        int gold = 10, hari = 1;
        int menuAwal, menuBeli, jumlahBeli, menuBeliPupuk, jumlahBeliPupuk;
        int[] hargaBibit = {1, 2, 3, 4, 5};
        int[] hargaJual = {5, 8, 10, 15, 25};
        int[] tinggiPanen = {5, 8, 10, 15, 25};
        int[] hargaPupuk = {1, 2, 3};
        ArrayList<Tanaman> tanaman = new ArrayList<>();
        ArrayList<Pupuk> pupuk = new ArrayList<>();
        // ArrayList<Tanaman> siapJual = new ArrayList<>();

        while(tanaman.size() < 3){
            int dapatTanaman = rand.nextInt(5);
            if(dapatTanaman == 1){
                Tanaman baru = new Satu();
                tanaman.add(baru);
                System.out.println("Berhasil Mendapatkan Tanaman Satu");
            } else if (dapatTanaman == 2){
                Tanaman baru = new Dua();
                tanaman.add(baru);
                System.out.println("Berhasil Mendapatkan Tanaman Dua");
            } else if (dapatTanaman == 3){
                Tanaman baru = new Tiga();
                tanaman.add(baru);
                System.out.println("Berhasil Mendapatkan Tanaman Tiga");
            } else if (dapatTanaman == 4){
                Tanaman baru = new Empat();
                tanaman.add(baru);
                System.out.println("Berhasil Mendapatkan Tanaman Empat");
            } else if (dapatTanaman == 5){
                Tanaman baru = new Lima();
                tanaman.add(baru);
                System.out.println("Berhasil Mendapatkan Tanaman Lima");
            }
        }

        do {
        System.out.println("HARI : " + hari);
        System.out.println("GOLD : " + gold);
        System.out.println("MENU");
        System.out.println("====");
        System.out.println("1. Beli Tanaman");
        System.out.println("2. Jual Tanaman");
        System.out.println("3. Beli Pupuk");
        System.out.println("4. Tampilkan Tanaman");
        System.out.println("5. Keluar");

            do {
                System.out.print(">> ");
                menuAwal = scanI.nextInt();
            } while (menuAwal < 1 || menuAwal > 5);
            
            if(menuAwal == 1){
                System.out.println("GOLD : " + gold);
                System.out.println("BELI TANAMAN");
                System.out.println("============");
                System.out.println("1. `Satu`");
                System.out.println("2. `Dua`");
                System.out.println("3. `Tiga`");
                System.out.println("4. `Empat`");
                System.out.println("5. `Lima`");
                
                System.out.print("Pilihan: ");
                menuBeli = scanI.nextInt();

                System.out.print("Masukkan Jumlah: ");
                jumlahBeli = scanI.nextInt();

                int total = jumlahBeli * hargaBibit[menuBeli-1];

                if(menuBeli > 0){
                    if(menuBeli == 1){
                        Tanaman baru = new Satu();
                        tanaman.add(baru);
                        System.out.println("Berhasil Membeli Tanaman Satu");
                        gold-= total;
                    } else if (menuBeli == 2){
                        Tanaman baru = new Dua();
                        tanaman.add(baru);
                        System.out.println("Berhasil Membeli Tanaman Dua");
                        gold-= total;
                    } else if (menuBeli == 3){
                        Tanaman baru = new Tiga();
                        tanaman.add(baru);
                        System.out.println("Berhasil Membeli Tanaman Tiga");
                        gold-= total;
                    } else if (menuBeli == 4){
                        Tanaman baru = new Empat();
                        tanaman.add(baru);
                        System.out.println("Berhasil Membeli Tanaman Empat");
                        gold-= total;
                    } else if (menuBeli == 5){
                        Tanaman baru = new Lima();
                        tanaman.add(baru);
                        System.out.println("Berhasil Membeli Tanaman Lima");
                        gold-= total;
                    }
                }
                hari++;
            } else if(menuAwal == 2){
                for(int i = 0; i < tanaman.size(); i++){
                    if(tanaman.get(i).siapJual == true){
                        if(tanaman.get(i) instanceof Satu){
                            System.out.println("Tanaman Satu Berhasil Di Jual");
                            tanaman.remove(i);
                            gold += hargaJual[0];
                        } else if (tanaman.get(i) instanceof Dua){
                            System.out.println("Tanaman Dua Berhasil Di Jual");
                            tanaman.remove(i);
                            gold += hargaJual[1];
                        } else if (tanaman.get(i) instanceof Tiga){
                            System.out.println("Tanaman Tiga Berhasil Di Jual");
                            tanaman.remove(i);
                            gold += hargaJual[2];
                        }
                    }
                }
                hari++;
                for(int i = 0; i < tanaman.size(); i++){
                    tanaman.get(i).umur++;

                    if(tanaman.get(i).umur > tanaman.get(i).maxUmur){
                        tanaman.remove(i);
                    }
                }
            } else if(menuAwal == 3){
                System.out.println("GOLD : " + gold);
                System.out.println("BELI PUPUK");
                System.out.println("============");
                System.out.println("1. `X`");
                System.out.println("2. `Y`");
                System.out.println("3. `Z`");
                
                System.out.print("Pilihan: ");
                menuBeliPupuk = scanI.nextInt();

                System.out.print("Masukkan Jumlah: ");
                jumlahBeliPupuk = scanI.nextInt();

                int total = hargaPupuk[menuBeliPupuk-1] * jumlahBeliPupuk;

                if(menuBeliPupuk > 0 && gold >= total){
                    if(menuBeliPupuk == 1){
                        Pupuk baru = new X();
                        pupuk.add(baru);
                        System.out.println("Berhasil Membeli Pupuk X");
                        gold -= total;
                    } else if(menuBeliPupuk == 2){
                        Pupuk baru = new Y();
                        pupuk.add(baru);
                        System.out.println("Berhasil Membeli Pupuk Y");
                        gold -= total;
                    } else if (menuBeliPupuk == 3){
                        Pupuk baru = new Z();
                        pupuk.add(baru);
                        System.out.println("Berhasil Membeli Pupuk Z");
                        gold -= total;
                    }
                }
                hari++;
                for(int i = 0; i < tanaman.size(); i++){
                    tanaman.get(i).umur++;

                    if(tanaman.get(i).umur > tanaman.get(i).maxUmur){
                        tanaman.remove(i);
                    }
                }
            } else if(menuAwal == 4){
                for(int i = 0; i < tanaman.size(); i++){
                    tanaman.get(i).printInfo();
                }
                hari++;
                for(int i = 0; i < tanaman.size(); i++){
                    tanaman.get(i).umur++;

                    if(tanaman.get(i).umur > tanaman.get(i).maxUmur){
                        tanaman.remove(i);
                    }
                }
            }
        } while (menuAwal != 5 && gold < 50 && gold > 0);
        if(gold >= 50){
            System.out.println("Berhasil");
        } else {
            System.out.println("Gagal");
        }
    }
}
