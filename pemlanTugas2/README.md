# Tugas 2 : Constructor and Instance Method
> Muhammad Abi Abdillah

**code:**
1. [MainStudent.java](./MainStudent.java)
2. [Student.java](./Student.java)


## Hasil Analisa dan Dokumentasi
**1. Percobaan Constructor sebelum dimodifikasi**
Ternyata ketika objek yang sudah dideklarasikan diubah dengan instansiasi yang baru, maka akan terhitung sebagai referensi baru karena tidak ada objek yang menunjuk ke referensi lama. Yaitu pada bagian ini
```java
// siswa dengan nama anna diubah alamat dan umurnya melalui constructor
    System.out.println("==============================");
    anna = new Student("Anna", "Batu", 18);
    anna.displayMessage();
```
Data-data yang ada pada objek sebelumnya akan digantikan oleh data-data baru dari instansiasi yang baru. Kecuali jika data **anna** diubah melalui **setter**. Lalu, bagaimana solusinya?

- **Mengubah melalui constructor**. Jika objek anna lama tetap ingin ada, maka kita harus membuat objek baru yang mengambil data2 dari anna lama dengan method `getter`. _Cara ini hanya mengambil data2 yang terdapat pada parameter_. Jadi, saya ubah kode menjadi seperti ini:
```java
Student annaLama = new Student(anna.getName(), anna.getAddress(), anna.getAge());
annaLama.displayMessage();
```

- Mengubah melalui setter. Kita dapat mengubah data2 pada **anna** hanya dengan `setter`. _Cara ini lebih efektif untuk mengubah nilai objek_.

</br>

**2. Menambahkan Constructor pada class Student dengan parameter nilai mata pelajaran**
> - Pada percobaan ini, saya menambahkan constructor pada class Student dengan parameter nilai mata pelajaran (math, english, and science)
> - Jika menginstansiasi objek melalui constructor ini, maka harus set nama, alamat, dan umur secara manual dengan **setter**.
```java
// menambahkan constructor dengan parameter maisng2 nilai mata pelajaran (no 2)
    public Student(double math, double english, double science){
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
    }
```
Contoh penggunaan objeknya :
```java
    Student budi = new Student(90, 70, 80);
    budi.setNama("Budi");
    budi.setAlamat("Bali");
    budi.setUmur(20);
```

**3. Menambahkan method boolean statusAkhir() yang pada Student untuk mengecek status kelulusan siswa**
> - Method ini bekerja dengan mengecek nilai rata-rata yang dimiliki tiap siswa berdasarkan method **getAverage()**.
> - Jika nilai rata2 siswa kurang dari atau sama dengan 60, maka status akhirnya _"Tidak Lulus"_
```java
    public double getAverage(){
        average = (mathGrade + englishGrade + scienceGrade)/3;
        return average;
    }
    // Menambahkan method yang berfungsi sebagai penentu kelulusan siswa berdasarkan average
    public boolean statusAkhir(double avg){
        avg = getAverage();
        return avg >= 61;
    }
    // mengecek apakah nilai getAverage true atau false ( no 3)
    System.out.println("- Status: " + (statusAkhir(getAverage()) ? "Lulus" : "Tidak Lulus")); 

```

**4. Membuat fitur user dapat berinteraksi dan membuat objek baru**
> - Tahap awal, saya membuat fitur interaksi user hanya dengan input biasa
> - Selanjutnya, saya tambahkan fitur menu yang memungkinkan user untuk memilih menu yang diinginkan (menambah data siswa atau menambah nilai)

Yang diubah :
1. Menu tambah data siswa dipisah ke function tambahMurid()
2. Menu tambah nilai siswa dipisah ke function tambahNilai()
3. Versi ini agak kompleks, untuk versi yang tanpa **menu** ada di [link ini](https://github.com/abiabdillahx/praktikum-pemlan/blob/24f2b1b6bcbff3c218f67879f9d9a3907cea3021/pemlanTugas2/MainStudent.java) (MainStudent.java sebelumnya).


**5. Menghitung jumlah objek yang telah dibuat**
> - Method ini berada di class Student dan berfungsi untuk menghitung jumlah objek yang telah dibuat dengan menggunakan static variable **jumlahObj**.
> - Setiap kali objek dibuat, maka constructor akan menjalankan increment pada variable **jumlahObj**.
```java
// Menghitung jumlah objek yang dibuat dengan return type void. (no 5)
public static void jumlahObjek(){
    // jumlah objek dihitung dengan menambahkan kode `jumlah++;` pada tiap constructor
    System.out.println("Jumlah objek yang dibuat: " + jumlahObj);
}
```

## Output dari kode
[gambar output]