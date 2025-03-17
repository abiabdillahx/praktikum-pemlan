package pemlanTugas3;

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


    // Menampilkan informasi buku
    public String tambahData(Buku buku) {
        String data = jumlahBuku + ". " + buku.getJudul() + ", " + buku.getPenulis() + ", " + buku.getTahunTerbit() + "\n";
        return data;
    }
}