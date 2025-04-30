@SuppressWarnings("FieldMayBeFinal")
public class KueJadi extends Kue{
    private double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }
    
    public double getJumlah(){
        return jumlah;
    }

    @Override
    public double hitungHarga() {
        return getHarga() * jumlah * 2;
    }

    // override method toString khusus class KueJadi
    @Override
    public String toString(){
        String jadi = String.format("%-15s %12s", getNama(), "Rp "+hitungHarga());
        return jadi;
    }
}
