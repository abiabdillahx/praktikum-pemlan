public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    // setter & getter
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setIpk(double ipk){
        this.ipk = ipk;
    }
    public String getNim() {
        return nim;
    }
    public double getIpk() {
        return ipk;
    }

    // status mahasiswa (angkatan + prodi)
    public String getStatus(){
        String angkatan = "20" + getNim().substring(0, 2);
        String kodeProdi = getNim().substring(5, 7);
        String prodi;
        prodi = switch (kodeProdi) {
            case "02" -> "Teknik Informatika";
            case "03" -> "Teknik Komputer";
            case "04" -> "Sistem Informasi";
            case "06" -> "Pendidikan Teknologi Informasi";
            case "07" -> "Teknologi Informasi";
            default -> "Unknown Prodi";
        };
        return prodi + ", " + angkatan;
    }
    // logic beasiswa yg didapat tiap mahasiswa
    public double getBeasiswa(){
        double beasiswa;
        if (getIpk() >= 3.5 && getIpk() <= 4.0) {
            beasiswa = 75;
        }else if(getIpk() >= 3.0 && getIpk() < 3.5){
            beasiswa = 50;
        }else{
            return 0;
        }
        return beasiswa;
    }

    // function untuk menampilkjan atribut-atribnut mahasiswa
    @Override
    public String toString(){
        String nama = getNama();
        String nik = getNik();
        String jenisKelamin = getJenisKelamin()? "Laki-laki" : "Perempuan";
        double pendapatan = getTunjangan() + getBeasiswa();

        // maaf agak berantakan 
        String mahasiswa = String.format(
            "Nama           : %s%n" +
            "NIK            : %s%n" +
            "Jenis Kelamin  : %s%n" +
            "Pendapatan     : %.1f%n" +
            "NIM            : %s%n" +
            "IPK            : %.1f%n" +
            "Status         : %s",
            nama,
            nik,
            jenisKelamin,
            pendapatan,
            getNim(),
            getIpk(),
            getStatus()
        );
        return mahasiswa;
    }
}
