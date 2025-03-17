package pemlanTugas3;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Buku[] dataBuku = new Buku[200];
        
        int pilih;
        do { 
            /* Menu */
            System.out.println("=============================");
            System.out.println("Sistem Perpustakaan");
            System.out.println("1. Tambah Buku\n2. Tampilkan Daftar Buku\n3. Keluar");
            System.out.print("Pilih Menu : ");
            pilih = sc.nextInt();
            sc.nextLine();
            /* Input user interaktif */
            switch (pilih) {
                case 1:
                System.out.print("Masukkan Judul Buku: ");
                String judul = sc.nextLine();
                System.out.print("Masukkan nama Penulis: ");
                String penulis = sc.nextLine();
                System.out.print("Masukkan Tahun Terbit: ");
                int tahun = sc.nextInt();
                sc.nextLine();

                // Membuat objek baru dari input user dan dimasukkan ke
                Buku bukuBaru = new Buku(judul, penulis, tahun);
                dataBuku[Buku.getJumlah()-1] = bukuBaru;
                System.out.println(dataBuku[0].getJudul());
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("pemlanTugas3/dataBuku.txt", true))) {
                    writer.write(bukuBaru.tambahData(bukuBaru));
                }
                catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Error: " + e.getMessage());
                }
                System.out.println("Buku berhasil ditambahkan!");
                break;
                case 2:
                    System.out.println("1. Info Singkat\n2. Info Lengkap");
                    System.out.print("Pilih Menu : ");
                    int pilih2 = sc.nextInt();
                    if (pilih2 == 1){
                        // Buku.displayInfo();
                    }
                    break;
                case 3:
                    System.out.println("> Terima Kasih!!");
                    break;
                default:
                    System.out.println("> Menu tidak tersedia!");
            }
        } while (pilih != 3);
    }
}