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
    static int jumlahMurid;
    static Student[] murid;
    static String[] namaMurid;

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
        // Interaktivitas dengan user sehingga bisa menginput murid sesuai yang diinginkan menggunakan array (no 4)
        System.out.println("\n~ Data Murid ~");
        System.out.println("=======================================================");
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do { 
            System.out.println("...............");
            System.out.println("1. Tambahkan Data Murid\n2. Tambahkan Nilai Murid\n3. Keluar");
            System.out.print("Pilih Menu : ");
            pilihan = sc.nextInt();
            if (pilihan == 1){
                tambahMurid();
                System.out.println("-----");
            }else if(pilihan == 2){
                if (murid == null){
                    System.out.println("## Tidak ada data murid yang dapat ditambahkan nilai ##");
                }else{
                    tambahNilai(murid, jumlahMurid, namaMurid);
                    break;
                }
            }
        } while (pilihan == 1 || pilihan == 2);
        for (int i = 0; i < jumlahMurid; i++) {
            murid[i].displayMessage();
        }
        sc.close();


    }
    // Menambah data murid (nama, alamat, usia)
    public static void tambahMurid(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Berapa jumlah murid : ");
        jumlahMurid = scan.nextInt();
        scan.nextLine();
        murid = new Student[jumlahMurid];
        
        namaMurid = new String[jumlahMurid];
        String[] alamatMurid = new String[jumlahMurid];
        int[] usiaMurid = new int[jumlahMurid];
        
        for(int i = 0; i < jumlahMurid; i++) {
            
            System.out.println("-----");
            System.out.print("Nama Murid ke-" + (i+1) + " : ");
            namaMurid[i] = scan.next();
            System.out.print("Alamat Murid ke-" + (i+1) + " : ");
            alamatMurid[i] = scan.next();
            System.out.print("Usia Murid ke-" + (i+1) + " : ");
            usiaMurid[i] = scan.nextInt();
            scan.nextLine();

            murid[i] = new Student(namaMurid[i], alamatMurid[i], usiaMurid[i]);
        }
        // scan.close();
        Student.jumlahObjek(); // melihat jumlah objek yang dibuat
    }
    // menambah data nilai murid
    public static void tambahNilai(Student[] murid, int jumlahMurid, String namaMurid[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n== Nilai Matematika, IPA, dan Bahasa Indonesia masing-masing murid ==");
        for (int i = 0; i < jumlahMurid; i++) {
            System.out.printf("Nilai matematika %s : ", namaMurid[i]);
            double nilaiMath = sc.nextDouble();
            System.out.printf("Nilai science %s : ", namaMurid[i]);
            double nilaiScience = sc.nextDouble();
            System.out.printf("Nilai english %s : ", namaMurid[i]);
            double nilaiEnglish = sc.nextDouble();
            System.out.println("-----");

            murid[i].setMath(nilaiMath);
            murid[i].setScience(nilaiScience);
            murid[i].setEnglish(nilaiEnglish);
        }
        sc.close();
    }
}
