package pemlanTugas3;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Buku[] dataBuku = new Buku[200];
        
        int pilih;
        System.out.println("=============================");
        System.out.println("Welcome to Library System!!!");
        do { 
            /* Menu */
            System.out.println("=============================");
            System.out.println("1. Tambah Buku\n2. Tampilkan Daftar Buku\n3. Keluar");
            System.out.print("Pilih Menu : ");
            pilih = sc.nextInt();
            sc.nextLine();
            /* Input user interaktif */
            switch (pilih) {
                case 1:
                    System.out.println("> Berapa banyak buku yang ingin ditambahkan?");
                    int banyakBuku = sc.nextInt();
                    sc.nextLine();
                    if(banyakBuku <= 0){
                        System.out.println("> Maaf, jumlah buku tidak boleh 0 atau kurang.");
                        continue;
                    }
                    for (int i = 0; i < banyakBuku; i++) {
                        System.out.print("Masukkan Judul Buku: ");
                        String judul = sc.nextLine();
                        System.out.print("Masukkan nama Penulis: ");
                        String penulis = sc.nextLine();
                        System.out.print("Masukkan Tahun Terbit: ");
                        int tahun = sc.nextInt();
                        sc.nextLine();
                        // Membuat objek baru dari input user dan dimasukkan ke dataBuku.txt
                        Buku bukuBaru = new Buku(judul, penulis, tahun);
                        dataBuku[Buku.getJumlah()-1] = bukuBaru;

                        try (BufferedWriter writer = new BufferedWriter(new FileWriter("pemlanTugas3/dataBuku.txt", true))) {
                            writer.write(bukuBaru.infoBuku(bukuBaru));
                            writer.close();
                        } catch (Exception e) { 
                            System.out.println("Error: " + e.getMessage());
                        }
                        System.out.println("Buku berhasil ditambahkan!");
                    }

                break;
                case 2:
                    System.out.println("\n1. Info Singkat\n2. Info Lengkap");
                    System.out.print("Pilih Versi Info: ");
                    int tampil = sc.nextInt();
                    switch (tampil) {
                        case 1: // MENAMPILKAN INFO SINGKAT
                            Buku.infoBuku();
                            break;
                        case 2: // MENAMPILKAN INFO LENGKAP
                            Buku.infoBuku("pemlanTugas3/dataBuku.txt");
                            break;
                        default:
                            System.out.println("> Menu tidak tersedia!");
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