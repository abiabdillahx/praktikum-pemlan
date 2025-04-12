public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin; // true = laki-laki, false = perempuan
        this.nik = nik;
        this.menikah = menikah;
    }

    // setter (public)
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    // getter (public)
    public String getNama(){
        return nama;
    }
    public boolean getJenisKelamin(){
        return jenisKelamin;
    }
    public String getNik(){
        return nik;
    }
    public boolean getMenikah(){
        return menikah;
    }

    // methods
    public double getTunjangan(){
        if (menikah && jenisKelamin == true) {
            return 25;
        }else if(menikah && jenisKelamin == false) {
            return 20;
        }else{
            return 15;
        }
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    @Override
    public String toString(){
        String manusia = String.format(
            "Nama           : %s%n" +
            "NIK            : %s%n" +
            "Jenis Kelamin  : %s%n" +
            "Pendapatan     : %.1f",
            getNama(),
            getNik(),
            getJenisKelamin() ? "Laki-laki" : "Perempuan",
            getPendapatan()
        );
        return manusia;
    }
}