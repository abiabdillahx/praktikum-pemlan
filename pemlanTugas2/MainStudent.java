/*
 * 1. Lakukan percobaan dan benahi kesalahan dalam kode
 * 2. Tambahkan constructor pada Student dengan parameter nilai mata pelajaran
 * 3. Tambahkan method boolean untuk melihat status akhir siswa dari nilai rata2nya
 * 4. Buat fitur agar user bisa berinteraksi
 * 5. Buat fitur menghitung dan melihat jumlah objek yang telah dibuat 
 */

package pemlanTugas2;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        // kode sebelum dimodifikasi
        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();

        // menggunakan constructor lain
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();

        // Percobaan menambah objek baru dengan constructor berparameter nilai (no 2)
        Student budi = new Student(90, 70, 80);
        budi.displayMessage(); // tidak memiliki nama, alamat, dan usia kecuali kita setName, setAge, dan setAddress.

        // // siswa dengan nama anna diubah alamat dan umurnya melalui constructor
        System.out.println("==============================");
        Student annaLama = new Student(anna.getName(), anna.getAddress(), anna.getAge());
        annaLama.displayMessage();
        anna = new Student("Anna", "Batu", 18);
        anna.displayMessage();

        Student.jumlahObjek(); // melihat jumlah objek yang dibuat dengan memanggil method jumlahObjek() (no 5)
        System.out.println("==============================");



        // kode modifikasi saya

        System.out.println("\n~ Data Murid ~");
        System.out.println("=======================================================");
        Scanner sc = new Scanner(System.in);

        // Interaktivitas dengan user sehingga bisa menginput murid sesuai yang diinginkan menggunakan array (no 4)
        System.out.print("Berapa jumlah murid : ");
        int jumlahMurid = sc.nextInt();
        Student[] murid = new Student[jumlahMurid];
        
        String[] namaMurid = new String[jumlahMurid];
        String[] alamatMurid = new String[jumlahMurid];
        int[] usiaMurid = new int[jumlahMurid];
        
        for(int i = 0; i < jumlahMurid; i++) {
            
            System.out.println("-----");
            System.out.print("Nama Murid ke-" + (i+1) + " : ");
            namaMurid[i] = sc.next();
            System.out.print("Alamat Murid ke-" + (i+1) + " : ");
            alamatMurid[i] = sc.next();
            System.out.print("Usia Murid ke-" + (i+1) + " : ");
            usiaMurid[i] = sc.nextInt();
            murid[i] = new Student(namaMurid[i], alamatMurid[i], usiaMurid[i]);
        }
        //Student.jumlahObjek(); // melihat jumlah objek yang dibuat

        System.out.println("\n== Nilai Matematika, IPA, dan Bahasa Indonesia masing-masing murid ==");
        for (int i = 0; i < jumlahMurid; i++) {
            System.out.printf("Nilai matematika %s : ", namaMurid[i]);
            double nilaiMath = sc.nextDouble();
            murid[i].setMath(nilaiMath);
            System.out.printf("Nilai science %s : ", namaMurid[i]);
            double nilaiScience = sc.nextDouble();
            murid[i].setScience(nilaiScience);
            System.out.printf("Nilai english %s : ", namaMurid[i]);
            double nilaiEnglish = sc.nextDouble();
            murid[i].setEnglish(nilaiEnglish);

        }
        murid[0].displayMessage();
        
    }
}
