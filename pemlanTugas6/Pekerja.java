
import java.time.LocalDate;
import java.time.Period;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahun, int bulan, int hari, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.jumlahAnak = jumlahAnak;
        this.tahunMasuk = LocalDate.of(tahun, bulan, hari);
    }

    // setter getter
    public void setGaji(double gaji){
        this.gaji = gaji;
    }
    public void setTahunMasuk(LocalDate tahunMasuk){
        this.tahunMasuk = tahunMasuk;
    }
    public void setJumlahAnak(int jumlahAnak){
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji(){
        return gaji;
    }
    public LocalDate getTahunMasuk(){
        return tahunMasuk;
    }
    public int getJumlahAnak(){
        return jumlahAnak;
    }

    // methods
    // logic bonus yg didapat
    public double getBonus(){
        final int BONUS_PER_ANAK = 20;
        double bonus = 0;
        Period lamaKerja = Period.between(tahunMasuk, LocalDate.now());
        if (lamaKerja.getYears() >= 10) {
            bonus += gaji * 0.15;
        }else if(lamaKerja.getYears() >= 5 && lamaKerja.getYears() < 10){
            bonus += gaji * 0.10;
        }else{
            bonus += gaji * 0.05;
        }
        bonus += jumlahAnak * BONUS_PER_ANAK;
        return bonus;
    }

    @Override
    public String toString() {
        String nama = getNama();
        String nik = getNik();
        String jenisKelamin = getJenisKelamin()? "Laki-laki" : "Perempuan";
        double pendapatan = gaji + getBonus();
        int tanggal = tahunMasuk.getDayOfMonth(); 
        int bulan = tahunMasuk.getMonthValue();
        int tahun = tahunMasuk.getYear();
        
        String pekerja = String.format(
            "Nama           : %s%n" +
            "NIK            : %s%n" +
            "Jenis Kelamin  : %s%n" +
            "Pendapatan     : %.1f%n" + 
            "Tahun Masuk    : %d %d %d%n" +
            "Jumlah Anak    : %d%n" +
            "Gaji           : %.1f",
            nama, nik, jenisKelamin, pendapatan, tanggal, bulan, tahun, jumlahAnak, gaji
            );
        return pekerja;
    }
}
