# Tugas 2 : Overload dan Overloading Method
> Muhammad Abi Abdillah

**code:**
1. [Main.java](./Main.java)
2. [Buku.java](./.java)

## Dokumentasi
### 1. Membuat Kelas Buku
Pada tahap ini, saya membuat sebuah class Buku yang memiliki atribut judul, pengarang, dan tahun terbit. Selain itu, class ini juga memiliki method untuk menambahkan data dari buku yang baru ditambah dengan format **"Judul Buku: Pengarang, Tahun Terbit"**. Class ini juga memiliki method getter untuk mengambil nilai atribut judul, pengarang, dan tahun terbit yang bersifat private di class tersebut.
kode : [Buku.java](./Buku.java)

### 2. Menampilkan Informasi Buku
Pada tahap ini, saya membuat sebuah class Main yang memiliki method main untuk menampilkan informasi buku. Method ini akan menampilkan judul, pengarang, dan tahun terbit dari buku yang telah ditambahkan sebelumnya. Bagaimana? caranya dengan memanggil method yang akan dijelaskan pada [poin 3](#4-membaca-data-buku-dari-file) di bawah.

### 3. Menyimpan Data Buku ke File
> - Pada tahap ini, saya membuat sebuah sistem yang dapat menyimpan data buku ke dalam filenya. Sistem ini akan menulis data buku ke dalam file dengan format **"Judul Buku** oleh **Penulis (Tahun Terbit)**.
> - Sistem ini saya letakkan di class Main
```java
for (int i = 0; i < banyakBuku; i++) {
                        System.out.print("Masukkan Judul Buku: ");
                        String judul = sc.nextLine();
                        System.out.print("Masukkan nama Penulis: ");
                        String penulis = sc.nextLine();
                        System.out.print("Masukkan Tahun Terbit: ");
                        int tahun = sc.nextInt();
                        sc.nextLine();
                        // Membuat objek baru dari input user dan dimasukkan ke dataBuku.txt
                        Buku bukuBaru = new Buku(judul, penulis, tahun);
                        dataBuku[Buku.getJumlah()-1] = bukuBaru;

                        try (BufferedWriter writer = new BufferedWriter(new FileWriter("pemlanTugas3/dataBuku.txt", true))) {
                            writer.write(bukuBaru.infoBuku(bukuBaru));
                            writer.close();
                        } catch (Exception e) { 
                            System.out.println("Error: " + e.getMessage());
                        }
                        System.out.println("Buku berhasil ditambahkan!");
                    }
```
### 4. Membaca Data Buku dari File
> - Pada tahap ini, saya membuat 2 versi method. Yaitu info secara singkat (judul saja) dan info lengkap. Dikarenakan format yang saya gunakan adalah **"- Judul oleh Penulis (Tahun Terbit)"**, maka saya menggunakan split untuk memisahkan judul, penulis, dan tahun terbit. Functionnya saya letakkan di Buku.java dan bersifat overload.
```java
public static void infoBuku(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("pemlanTugas3/dataBuku.txt"));
            String line;
            System.out.println("\nDaftar Judul Buku:");
            System.out.println("---------------------");
            while ((line = reader.readLine()) != null) {
                // Untuk mengambil judul saja. Judul ada di antara ". " dan "oleh"
                int start = line.indexOf("- ") + 2;
                int end = line.indexOf(" oleh ");
                if (start >= 2 && end > start) {
                    String judul = line.substring(start, end);
                    System.out.println("- " + judul);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file.");
            e.printStackTrace();
        }
    }

    public static void infoBuku(String filename){
        System.out.println("\nDaftar Lengkap Buku");
        System.out.println("--------------------------------");
        try (BufferedReader reader = new BufferedReader(new FileReader("pemlanTugas3/dataBuku.txt" ))){
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }
```
### 5. Interaksi dengan Program
> - Untuk menambah interaktivitas antara program dengan user, saya menggunakan Scanner sebagai pembaca input user.
> - Seluruh program di atas sudah dilengkapi dengan input user. User dapat memilih menu yang diinginkan dan program akan menampilkan hasilnya.
> - *ditambah juga beberapa batasan dan pengecekan untuk menghindari kesalahan input user.*


## Output program
### 1. Menu Utama
### 2. Tambah Buku
### 3. Daftar Judul Buku
### 4. Daftar Lengkap Buku

