public class Main {
    public static void main(String[] args) {
        double totalHarga = 0;
        double totalBerat = 0;
        double totalJumlah = 0;
        double hargaPesanan = 0;
        double hargaJadi = 0;
        Kue[] listKue = new Kue[20];

        listKue[0] = new KueJadi("Brownies", 20000, 2);
        listKue[1] = new KueJadi("Kue Cubit", 15000, 3);
        listKue[2] = new KuePesanan("Kue Tart", 50000, 2);
        listKue[3] = new KuePesanan("Kue Lapis", 30000, 1.5);
        listKue[4] = new KueJadi("Cupcake", 10000, 4);
        listKue[5] = new KueJadi("Donat", 7000, 3);
        listKue[6] = new KuePesanan("Blackforest", 70000, 1);
        listKue[7] = new KuePesanan("Red Velvet", 50000, 2.5);
        listKue[8] = new KueJadi("Pie Buah", 5000, 3);
        listKue[9] = new KueJadi("Lemper", 4000, 4);
        listKue[10] = new KuePesanan("Cheesecake", 60000, 2);
        listKue[12] = new KuePesanan("Rainbow Cake", 55000, 1.5);
        listKue[11] = new KueJadi("Pastel", 3500, 5);
        listKue[13] = new KueJadi("Muffin Coklat", 8000, 3);
        listKue[14] = new KuePesanan("Opera Cake", 65000, 1);
        listKue[15] = new KuePesanan("Tiramisu", 70000, 1.5);
        listKue[16] = new KueJadi("Kue Lumpur", 4500, 4);
        listKue[18] = new KueJadi("Klepon", 3000, 10);
        listKue[17] = new KuePesanan("Bika Ambon", 40000, 1.7);
        listKue[19] = new KuePesanan("Napoleon Cake", 75000, 1);



        double maxHarga = 0;
        Kue kueTermahal = null;

        System.out.printf("%-17s %15s\n", " Nama Kue", "Harga");
        System.out.println("-----------------------------");
        int index = 1;
        for (Kue kue : listKue) {
            System.out.println(index + ". " + kue);
            index++;
            totalHarga += kue.hitungHarga();
            if(kue instanceof KuePesanan kuePesanan){
                hargaPesanan += kuePesanan.hitungHarga();
                totalBerat += kuePesanan.getBerat();
            }else if (kue instanceof KueJadi kueJadi) {
                hargaJadi += kueJadi.hitungHarga();
                totalJumlah += kueJadi.getJumlah();
            }

            if (kue.hitungHarga() > maxHarga){
                maxHarga = kue.hitungHarga();
                kueTermahal = kue;
            }

        }
        System.out.println("--------------------------");
        System.out.printf("%-15s %10s", "Total Harga Kue: ", "Rp " + totalHarga);
        System.out.println("\n");

        System.out.println("Total Berat Kue Pesanan: " + totalBerat + " kg");
        System.out.println("Harga Kue Pesanan: " + hargaPesanan);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlah + " pcs");
        System.out.println("Harga Kue Jadi: " + hargaJadi);
        System.out.println();
        System.out.printf("%-15s %10s\n", "Kue termahal: ", kueTermahal.getNama());
        System.out.printf("%-15s %10s\n","Harganya: ", kueTermahal.hitungHarga());


    }
}
