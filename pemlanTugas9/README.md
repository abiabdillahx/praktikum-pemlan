# Tugas 9 : File Operation
> Muhammad Abi Abdillah

**code:**
1. [TulisFile.java](./TulisFile.java)
2. [CekUkuranFile.java](./CekUkuranFile.java)
3. [ListingDir.java](./ListingDir.java)
4. [HapusDirektori.java](./HapusDirektori.java)

## Dokumentasi
### 1. Apa yang terjadi jika parameter `false` di line 13 diubah menjadi `true`?
Yang terjadi jika saya mengubah parameter `false` di line 13 menjadi `true` adalah bahwa teks yang saya inputkan akan ditulis ke dalam file `output.txt` tanpa menghapus teks yang sudah ada di dalamnya. Sesuai dengan parameternya, "**append**", yang berarti menambahkan. Jika masih bernilai `false`, maka teks yang saya inputkan akan menggantikan teks yang sudah ada di dalam file.

### 2. Buat Program untuk mengetahui besar ukuran file yang diinputkan
Untuk itu, saya membuat kode program **[CekUkuranFile.java](./CekUkuranFile.java)**. User akan diminta memberikan input berupa path file yang akan dicek, lalu program akan menjalankan logika ini
```java
if (file.exists() && file.isFile()) {
    long fileSizeInBytes = file.length();

    if (fileSizeInBytes < 1024 * 1024) {
        double sizeInKB = fileSizeInBytes / 1024.0;
        System.out.printf("Ukuran file: %.2f KB\n", sizeInKB);
    } else {
        double sizeInMB = fileSizeInBytes / (1024.0 * 1024.0);
        System.out.printf("Ukuran file: %.2f MB\n", sizeInMB);
    }
} else {
    System.out.println("File tidak ditemukan atau bukan file yang valid.");
}
```
Jika ukuran sebuah file kurang dari 1 MB, maka ukuran file akan ditampilkan dalam satuan KB, jika lebih dari 1 MB maka akan ditampilkan dalam satuan MB.
##### Ini contoh penggunaannya.
![Screenshot 2025-05-18 133605](https://github.com/user-attachments/assets/c07d67bb-2d3d-4035-a180-11be58bb97e9)


### 3. Buat Program untuk listing semua file di direktori yang diinputkan user
Pada program ini, saya menggunakan kode berikut untuk listing semua file di direktori yang diinputkan user. Setelah user menginputkan path direktori yang dituju, program akan menjalankan logika ini dan menampilkan semua file yang ada di direktori tersebut dengan for-each. Kode program : **[ListingDir.java](./ListingDir.java)**.

```java
if (directory.exists() && directory.isDirectory()) {
    File[] listOfFiles = directory.listFiles();
    if (listOfFiles != null && listOfFiles.length > 0) {
        System.out.println("Daftar file di direktori:");
        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println("- " + file.getName());
            }
        }
    } else {
        System.out.println("Direktori kosong.");
    }
} else {
    System.out.println("Path tidak valid atau bukan direktori.");
}
```

#### Ini contoh penggunaannya
![Screenshot 2025-05-18 133828](https://github.com/user-attachments/assets/3517cafd-d237-4dc0-8ec8-d1988ab1c155)


### 4. Buat kode program untuk menghapus suatu direktori beserta semua file yang ada di dalamnya.
Diasumsikan, bahwa di dalam direktori hanya ada file saja dan tidak ada subdirektori. Untuk itu, saya sudah membuat folder dummy untuk mencoba program : **[ContohDir/](./ContohDir/)**.


Intinya, program ini menggunakan function `delete()` untuk menghapus direktori beserta isinya. Jika direktori tidak ditemukan, maka program akan menampilkan pesan error. Jika direktori berhasil dihapus, maka program akan menampilkan pesan berhasil. Kode programnya bisa dilihat di sini: **[HapusDirektori.java](./HapusDirektori.java)**.

Program akan menghapus semua file di direktori tersebut dan menghapus direktori itu sendiri. Contoh :
![Screenshot 2025-05-18 135218](https://github.com/user-attachments/assets/83f648bd-538b-4288-ac07-70524c330592)


### 5. Apakah yang salah dengan statement berikut? Berikan penjelasan.
```java 
var file = new File(“C:\Data\Java\teks.txt”);
```

Ada beberapa kesalahan dalam kode tersebut. Pertama, karakter `\` harus digunakan dengan `\\ ` karena `\` adalah karakter escape. Kedua, tanda kutip yang ada di modul sepertinya bukan tanda kutip *ascii* yang biasanya, jadi tidak boleh digunakan di Java. Kode yang benar adalah : 
```java 
var file = new File("C:/Data/Java/teks.txt");
```

### 6. Apa yang akan terjadi jika kita mencoba untuk membaca isi dari suatu file tetapi file tersebut tidak ada dan kita tidak melakukan pengecekan lebih dulu?

Yang terjadi jika hal tersebut dilakukan adalah terjadi error exception yaitu `java.io.FileNotFoundException`. Ini karena Java tidak bisa membaca file yang tidak ada. Jika kita ingin membaca file, kita harus melakukan pengecekan lebih dulu apakah file tersebut ada atau tidak. Jika tidak ada, kita bisa menampilkan pesan error. Jadi, cara terbaik untuk menghindari hal ini adalah mengecek dengan function `exists()` atau `isFile()` sebelum membaca file. Contoh kode :
```java
File file = new File("file_tidak_ada.txt");

if (file.exists()) {
    FileReader fr = new FileReader(file);
    // lanjut baca
} else {
    System.out.println("File tidak ditemukan.");
}

```
**atau** pakai try-catch untuk menangkap exceptionnya
```java
try {
    FileReader fr = new FileReader("file_tidak_ada.txt");
    // lanjut baca
} catch (FileNotFoundException e) {
    System.out.println("File tidak ditemukan: " + e.getMessage());
}

```
