# Tugas 6 : Inheritance
> Muhammad Abi Abdillah

**code:**
1. [Main.java](./Main.java)
2. [Manusia.java](./Manusia.java)
3. [MahasiswaFILKOM.java](./MahasiswaFILKOM.java)
4. [Pekerja.java](./Pekerja.java)
5. [Manager.java](./Manager.java)

## Dokumentasi
### 1. Class Manusia
Class Manusia merupakan class induk yang memiliki atribut dan method dasar. Pada class ini, saya membuat atribut dan method yang diperlukan oleh semua class.
Di dalam class ini, terdapat atribut nama, nik, jenis kelamin, dan status menikah. Seluruhnya bersifat `private` dan saya buat bertipe data sesuai yang diminta pada modul. Lalu, saya buat setter getter dan method-method yang diminta (getTunjangan(), getPendapatan(), dan toString(). 
Pada method `toString()`, saya membuat formatting print agar lebih rapih. 

### 2. Class MahasiswaFILKOM
Class MahasiswaFILKOM merupakan class turunan dari class Manusia yang memiliki atribut dan method khusus.

Atribut khusus yang ada pada class ini adalah:
- IPK: Indeks Prestasi Kumulatif mahasiswa
- status: untuk menyimpan apakah mahasiswa tersebut aktif atau tidak sesuai NIM.

### 3. Class Pekerja
Class Pekerja merupakan class turunan dari class Manusia yang memiliki atribut dan method khusus.

Atribut khusus yang ada pada class Pekerja adalah:
- gaji: untuk menyimpan gaji pekerja
- jumlahAnak: untuk menyimpan jumlah anak pekerja
- tahunMasuk: untuk menyimpan tahun saat pekerja mulai bekerja

### 4. Class Manager
Class Manager merupakan class turunan dari class Pekerja yang memiliki atribut dan method khusus. Pada class ini, atribut yang ditambah hanya `departemen`.

## Screenshot Output


