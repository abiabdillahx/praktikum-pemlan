package pemlanTugas1;

public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatan;
    private double waktu;

    public void setNoPlat(String s){
        noPlat = s;
    }
    public void setWarna(String s){
        warna = s;
    }
    public void setManufaktur(String s){
        manufaktur = s;
    }
    public void setKecepatan(double i){
        kecepatan = ubahKecepatan(i);
    }

    // Menambahkan method setWaktu dalam parameter double (no 4)
    public void setWaktu(double d){
        waktu = ubahSekon(d);
    }

    // Menambahkan method ubahSekon yang hanya bisa dipanggil di class ini untuk mengubah waktu dari jam ke sekon (no 5)
    private double ubahSekon(double d){
        return d * 3600;
    }

    // Menambah method untuk mengubah kecepatan dari km/h menjadi m/s
    private double ubahKecepatan(double i){
        return i * (1000.0 / 3600.0);
    }

    // Menambah method hitungJarak yang mengembalikan jarak yang ditempuh mobil dalam satuan m (no 7)
    public double hitungJarak(double waktu, double kecepatan){
        return (waktu * kecepatan);
        
    }

    public void displayMessage(){
        System.out.printf("=> Mobil anda bermerek %s ", manufaktur);
        System.out.printf("dengan nomor plat %s ", noPlat);
        System.out.printf("serta memiliki warna %s ", warna);
        System.out.printf("mampu menempuh kecepatan %.1f m/s ", kecepatan);
        System.out.printf("dalam waktu %.2f detik %n %n", waktu);
        // Menambahkan output jarak tempuh mobil dalam satuan km (no 8)
        System.out.printf("=> Jarak yang ditempuh mobil anda adalah %.2f km", hitungJarak(waktu, kecepatan)/1000);
    }
}
