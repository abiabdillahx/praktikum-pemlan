## Tugas Praktikum Pemlan 1 : Class dan Object
> Muhammad Abi Abdillah

**code:**
1. [MainMobil.java](MainMobil.java)
2. [Mobil.java](Mobil.java)

## Hasil Analisa dan Dokumentasi
**1. Membuat interaksi dengan user agar bisa memasukkan data**

</br>

**2. Menambahkan method `setWaktu` pada class Mobil yang berparameter _double_ 
User harus memberikan input dalam satuan jam**
```java
    // Menambahkan method setWaktu dalam parameter double (no 4)
    public void setWaktu(double d){
        waktu = ubahSekon(d);
    }
```
</br>

**3. Menambahkan method `ubahSekon`untuk mengubah satuan waktu dari jam menjadi detik**
> - Method ini hanya boleh dipanggil dari class Mobil, yang artinya saya beri enkapsulasi **private** sehingga User tidak bisa mengubah satuan waktu secara langsung dari luar class Mobil
> - Method ini dipanggil pada method **setWaktu** dengan nilai parameter yang sama

```java
    // Menambahkan method ubahSekon yang hanya bisa dipanggil di class ini untuk mengubah waktu dari jam ke sekon (no 5)
    private double ubahSekon(double d){
        return d * 3600;
    }
```
</br>

**4. Menambahkan method `ubahKecepatan` untuk mengubah satuan kecepatan dari km/h menjadi m/s**
> - Method ini hanya boleh dipanggil dari class Mobil, yang artinya saya beri enkapsulasi **private** sehingga User tidak bisa mengubah satuan kecepatan secara langsung dari luar class Mobil
> - Dipanggil pada method **setKecepatan** dengan nilai parameter yang sama

```java
    // Menambah method untuk mengubah kecepatan dari km/h menjadi m/s
    private double ubahKecepatan(double i){
        return i * (1000.0 / 3600.0);
    }
```

</br>

**5. Menambahkan method `hitungJarak` yang berfungsi untuk menghitung jarak yang ditempuh oleh mobil dalam satuan meter**
```java
    // Menambah method hitungJarak yang mengembalikan jarak yang ditempuh mobil dalam satuan m (no 7)
    public double hitungJarak(double waktu, double kecepatan){
        return (waktu * kecepatan);
    }
```

</br>

**6. Menambahkan output pada method `displayMessage`, yaitu jarak tempuh mobil yang dikonversi  menjadi satuan km dari meter.**
```java
    public void displayMessage(){
        System.out.println("Mobil anda bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memiliki warna " + warna);
        System.out.printf("dan mampu menempuh kecepatan %.1f km/h ", kecepatan);
        System.out.printf("dalam waktu %.2f detik %n %n", waktu);
        // Menambahkan output jarak tempuh mobil dalam satuan km (no 8)
        System.out.printf("Jarak yang ditempuh mobil anda adalah %.2f km", hitungJarak(waktu, kecepatan)/1000);
    }
```


## Output dari kode
![image](https://github.com/user-attachments/assets/c72f0b74-a196-4d5f-b3ee-f6925879cb69)

