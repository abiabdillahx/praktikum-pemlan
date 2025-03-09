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

**3. Menambahkan method boolean yang pada Student untuk mengecek status kelulusan siswa**
> - Method ini bekerja dengan mengecek nilai rata-rata yang dimiliki tiap siswa berdasarkan method **getAverage()**.
