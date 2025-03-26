public class Akun {
    private String noPelanggan;
    private String nama;
    private int saldo;
    private final int pin;
    private Akun[] dataAkun = {
        new Akun("3800001111", "Dung dung", 8000, 111000),
        new Akun("3800001112", "Ahmad", 500000, 001100),
        new Akun("5600002222", "Ilham", 300000, 696969),
        new Akun("5600002223", "Buzzer", 1500000, 123789),
        new Akun("7200003333", "Nigga", 2000000, 989898)
    }

    final int silver = 38;
    final int gold = 56;
    final int platinum = 74;

    public Akun(String noPelanggan, String nama, int saldo, int pin){
        this.noPelanggan = noPelanggan;
        this.nama = nama;
        this.saldo = saldo;
        this.pin = pin;
    }

    public String getNoPelanggan(){
        return noPelanggan;
    }
    public int getSaldo(){
        return saldo;
    }
    public String getNama(){
        return nama;
    }
    public int getPin(){
        return pin;
    }

}