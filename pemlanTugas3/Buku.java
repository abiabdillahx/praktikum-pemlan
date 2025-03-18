package pemlanTugas3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buku{
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private static int jumlahBuku;

    // Membuat kelas Buku dan constructor yang menginisialisasi atribut
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        jumlahBuku++;
    }

    // Getter method
    public String getJudul(){
        return judul;
    }
    public String getPenulis(){
        return penulis;
    }
    public int getTahunTerbit(){
        return tahunTerbit;
    }
    public static int getJumlah(){
        return jumlahBuku;
    }

    // Menambah buku baru
    public String infoBuku(Buku buku) {
        String data = "- " + buku.getJudul() + " oleh " + buku.getPenulis() + " (" + buku.getTahunTerbit() + ")" + "\n";
        return data;
    }

    // Menampilkan informasi buku
    public static void infoBuku(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("./dataBuku.txt"));
            String line;
            System.out.println("\nDaftar Judul Buku:");
            System.out.println("---------------------");
            while ((line = reader.readLine()) != null) {
                // Untuk mengambil judul saja. Judul ada di antara ". " dan "oleh"
                int start = line.indexOf("- ") + 2;
                int end = line.indexOf(" oleh ");
                if (start >= 2 && end > start) {
                    String judul = line.substring(start, end);
                    System.out.println("- " + judul);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file.");
            e.printStackTrace();
        }
    }

    public static void infoBuku(String filename){
        System.out.println("\nDaftar Lengkap Buku");
        System.out.println("--------------------------------");
        try (BufferedReader reader = new BufferedReader(new FileReader("./dataBuku.txt" ))){
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }

    
}