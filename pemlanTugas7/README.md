# Tugas 7 : Modul 3 Bab Polymorfisme
> Muhammad Abi Abdillah

**code:**
1. [Main.java](./Main.java)
2. [Kue.java](./Kue.java)
3. [KuePesanan](./KuePesanan.java)
4. [KueJadi](./KueJadi.java)

## Dokumentasi
### 1. Membuat classes sesuai instruksi
Pada tahap ini, saya membuat class Kue beserta subclasses nya, yaitu KueJadi dan KuePesannan. Sesuai instruksi, saya membuat class Kue menjadi class abstrak degan atribut nama dan harga, serta method abstrak `hitungHarga()`.
Lalu, saya membuat method `toString()` yang akan memberikan output string ketika objeknya diprint-out.

- **KueJadi**
> Pada class ini, saya override method hitungHarga() dan toString. Serta menyesuaikan parameter constructor 
```java
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
```
- **KuePesanan**
> Pada class ini, saya override method hitungHarga() dan toString. Serta menyesuaikan parameter constructor khusus kuePesanan
```java
    @Override
    public double hitungHarga() {
        return getHarga() * berat;
    }

    // // override method toString khusus class KuePesanan
    @Override
    public String toString(){
        String pesanan = String.format("%-15s %12s", getNama(), "Rp "+hitungHarga());
        return pesanan;
    }
```

### 2. Membuat Main.java untuk tempat implementasi
> 1. Array yang terdiri dari 20 kue
> 2. Isikan 20 objek kue dengan berbagai jenis kue (KuePesanan atau KueJadi)
> 3. Dari array tersebut :
>   a. Tampilkan semua kue dan harus ditampilkan jenis kuenya
>   b. Hitung total harga yang didapat dari semua jenis kue
>   c. Hitung total harga dan total berat dari KuePesanan
>   d. Hitung total harga dan total jumlah dari KueJadi
>   e. Tampilkan informasi kue dengan harga (harga akhir) terbesar

Implementasinya dapat dilihat langsung di file [Main.java](./Main.java)
Saya membuat array berisi 20 kue random dengan loop for-each untuk listing kue apa saja yang dibeli dan juga harganya.

## Output program
![image](https://github.com/user-attachments/assets/2bb863c6-acdb-4b10-b776-a18059c53656)



