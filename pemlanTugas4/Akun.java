public class Akun {
    private String noPelanggan;
    private String nama;
    private double saldo;
    private final int pin;
    private boolean isBlocked;
    

    public Akun(String noPelanggan, String nama, int saldo, int pin){
        this.noPelanggan = noPelanggan;
        this.nama = nama;
        this.saldo = saldo;
        this.pin = pin;
        this.isBlocked = false;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setBlokir(boolean isBlocked){
        this.isBlocked = isBlocked;
    }

    // Getter method
    public boolean getIsBlocked(){
        return this.isBlocked;
    }
    public String getNoPelanggan(){
        return noPelanggan;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getNama(){
        return nama;
    }
    public int getPin(){
        return this.pin;
    }

    public String getLevel(String noPel) {
        String kodeAwal = noPel.substring(0, 2);
        switch (kodeAwal) {
            case "38":
                return "Silver";
            case "56":
                return "Gold";
            case "74":
                return "Platinum";
            default:
                return "Unknown";
        }
    }

    public void infoAkun(String noPel, int pin){
        if (noPel.equals(noPelanggan) && pin == this.pin) {
            System.out.println("--- Data Akun ---");
            System.out.printf("%-15s : %s", "Nama", nama);
            System.out.printf("\n%-15s : %s", "No Pelanggan", noPelanggan);
            System.out.printf("\n%-15s : Rp %,.2f", "Saldo", saldo);
            System.out.printf("\n%-15s : %s\n", "Level", getLevel(noPelanggan));
        }
        
    }

}