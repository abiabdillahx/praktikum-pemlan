public class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, double gaji, int tahun, int bulan, int hari, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah){
        super(gaji, tahun, bulan, hari, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen){
        this.departemen = departemen;
    }
    public String getDepartemen(){
        return departemen;
    }

    @Override
    public String toString(){
        String manager = super.toString();
        manager += "\nDepartemen     : " + departemen;
        return manager;
    }
}
