import java.util.Scanner;

public class Main {
    private static Akun[] dataAkun = {
        new Akun("3800001111", "Dung dung", 8000, 111000), // --> sebagai contoh kasus jika saldo dibawah 10rb
        new Akun("3800001112", "Ahmad", 400000, 101010), // --> sebagai contoh akun silver
        new Akun("5600002222", "Mulyono", 2700000, 696969), // --> sebagai contoh akun gold
        new Akun("7400003333", "Niggus", 4000000, 989898) // --> sebagai contoh akun platinum
    };

    public static void main(String[] args) {
        
        int pilihan;
        System.out.println("> Selamat Datang di Swalayan X!");
        do { 
            System.out.println("==============================");
            System.out.println("1. Top up\n2. Belanja\n3. Keluar");
            System.out.println("==============================");
            System.out.print("Pilih Menu : ");
            
            Scanner sc = new Scanner(System.in);
            if (!sc.hasNextInt()) {  // Cek apakah input bukan angka
                System.out.println("> Input tidak valid! Masukkan angka 1-3.");
                sc.next(); // Bersihin input
                continue;
            }
        
            pilihan = sc.nextInt();
            sc.nextLine(); // Flush newline character
        
            if (pilihan == 3){
                System.out.println("> Terima Kasih telah datang!\n");
                break;
            } else if (pilihan < 1 || pilihan > 3) { 
                System.out.println("> Opsi tidak tersedia!"); 
                continue; 
            }
            
            // Jika semua kondisi di atas tidak terpenuhi, maka program akan melanjutkan ke bagian ini
            System.out.print("Masukkan nomor pelanggan: ");
            String noPel = sc.nextLine();   
            Akun akunPelanggan = getAkun(noPel, dataAkun);
        
            if (akunPelanggan == null) { 
                System.out.println("> Nomor pelanggan tidak ditemukan!");
                continue;
            } else if (akunPelanggan.getIsBlocked()) {
                System.out.println("> Akun pelanggan telah diblokir! hubungi admin");
                continue;
            }

            // Transaksi utamanya di sini        
            switch (pilihan) {
                case 1:
                    Transaksi.topUp(akunPelanggan);
                    break;
                case 2:
                    Transaksi.belanja(akunPelanggan);
                    break;
            }
        } while (true);
        
    }

    // method untuk cek akun pelanggan
    public static Akun getAkun(String noPel, Akun[] dataAkun) {
        for (Akun akun : dataAkun) {
            if (akun.getNoPelanggan().equals(noPel)) {
                return akun; // Ketemu
            }
        }
        return null; // Nggak ketemu
    }
        
}