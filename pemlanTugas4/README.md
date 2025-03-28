# Tugas 4 : Encapsulation
> Muhammad Abi Abdillah

**code:**
1. [Main.java](./Main.java)
2. [Akun.java](./Akun.java)
3. [Transaksi.java](./Transaksi.java)

## Dokumentasi
### 1. Informasi akun pelanggan tidak bisa diubah oleh pelanggan secara langsung
Pada tahap ini, saya membuat encapsulation untuk mengatur akses data akun pelanggan. Pelanggan tidak bisa mengubah informasi akunnya secara langsung dengan membuat setter untuk setiap atribut. Data-data akun  diatur sebagai private dan hanya dapat diakses melalui getter. 
**`Akun.java` :**
```java
    private String noPelanggan;
    private String nama;
    private double saldo;
    private final int pin;
    private boolean isBlocked;
```
### 2. Nomor pelanggan terdiri dari 10 digit, dimana 2 digit awal adalah jenis rekening
Pada tahap ini, saya membuat validasi untuk nomor pelanggan. Nomor pelanggan harus terdiri dari 10 digit, dimana 2 digit awal adalah jenis rekening. Jika tidak, maka akan terjadi exception.
```java
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
```
Nantinya, return value dari getLevel() akan digunakan untuk menentukan level pelanggan dan menentukan cashback yang didapat. 
**`Transaksi.java`:**
```java
    public static double calcCashback(String level, double belanja){
        double cashback = 0;
        if (level.equals("Silver") && belanja > 1000000){
            cashback = belanja * 0.05;
        }else if(level.equals("Gold")){
            if(belanja > 1000000){
                cashback = belanja * 0.07;
            }else{
                return belanja * 0.02;
            }
        }else if(level.equals("Platinum")){
            if (belanja > 1000000){
                cashback = belanja * 0.10;
            }else{
                return belanja * 0.05;
            }
        }else{
            return 0;
        }
        return cashback;
    }
```
### 3. Pelanggan harus memiliki saldo minimal 10rb untuk melakukan transaksi 
Pada tahap ini, saya membuat validasi untuk saldo pelanggan. Jika saldo kurang setelah transaksi kurang dari 10rb, maka akan gagal melakukan transaksi. Hal itu saya implementasikan dalam method belanja() di class Transaksi 
```java
    if(belanja < 0){
        System.out.println("Maaf, total harga belanja tidak boleh minus");
    }else if (belanja > saldoAkun || (saldoAkun - belanja) < 10000){
        System.out.println("> Transaksi gagal, saldo anda tidak cukup!");
        return;
    }
```

### 4. Sistem transaksi terbataas pada top up dan pembelian
Selanjutnya, saya membuat method untuk melakukan top up dan pembelian. Pada method ini, setelah semua validasi saldo dan autorisasi akun menggunakan PIN, maka transaksi akan berhasil dilakukan.
Saya juga mengantisipasi jika user melakukan transaksi dengan total belanja kurang dari 0, maka akan menampilkan pesan error.
> [!NOTE]
> Kode lengkapnya ada di [Transaksi.java](./Transaksi.java)

### 5. Apabila PIN salah setelah 3x percobaan, maka akun diblokir
Saya menambahkan atribut bertipe boolean di class Akun agar dapat mengetahui apakah akun sudah diblokir atau belum. Jika sudah diblokir, maka akan menampilkan pesan error dan tidak dapat melakukan transaksi. Saya juga menambahkan atribut untuk mengetahui jumlah kali PIN salah. Jika sudah mencapai 3 kali, maka akan diblokir.
Hal tersebut saya implementasikan dengan while loop sebanyak 3x.
> [!NOTE]
> Kode lengkapnya ada di [Akun.java](./Akun.java) dan [Transaksi.java](./Transaksi.java)

<br>

## Output Program
Saya membuat 4 buah akun pelanggan sebagai contoh penggunaan program. Masing-masing akun memiliki saldo awal dan jenis rekening yang berbeda-beda. Berikut adalah contoh kasus yang akan saya coba pada programnya:
> 1. Pelanggan Silver dengan saldo di bawah 10rb mencoba membeli barang
> 2. Top up saldo
> 3. Pelanggan Gold dengan saldo di atas 10rb mencoba membeli barang dgn harga lebih dari 1jt
> 4. Pembeli salah input PIN sebanyak 3 kali
> 5. Pelanggan Platinum dengan saldo di atas 10rb mencoba membeli barang dgn harga lebih dari 1jt

### 1. Top up saldo akun