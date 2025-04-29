@SuppressWarnings("FieldMayBeFinal")
public abstract class Kue {
    private String nama;
    private double harga;
    public abstract double hitungHarga();

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }
    public double getHarga() {
        return harga;
    }

    @Override
    public String toString() {
        String kue = String.format("%-15s %10s", nama, harga);
        return kue;
    }
}
