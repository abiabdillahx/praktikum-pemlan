public class Main {
    public static void main(String[] args) {
        // 1. Manusia
        // a. Laki-laki telah menikah
        Manusia a = new Manusia("Steve", "111", true, true);
        System.out.println(a);
        System.out.println();

        // b. Perempuan telah menikah
        Manusia b = new Manusia("Alice", "112", false, false);
        System.out.println(b);
        System.out.println();

        // c. Belum menikah
        Manusia c = new Manusia("John", "113", true, false);
        System.out.println(c);
        System.out.println();


        // 2. MahasiswaFILKOM
        // a. Ipk < 3
        MahasiswaFILKOM d = new MahasiswaFILKOM("235150701111013", 2.9, "Negus", "222", true, false);
        System.out.println(d);
        System.out.println();

        // b. Ipk 3 – 3.5
        MahasiswaFILKOM e = new MahasiswaFILKOM("245150701111028", 3.2, "Budi", "223", true, false);
        System.out.println(e);
        System.out.println();

        // c. Ipk 3.5 – 4
        MahasiswaFILKOM f = new MahasiswaFILKOM("245150701111029", 3.8, "Teddy", "224", false, false);
        System.out.println(f);
        System.out.println();


        // 3. Pekerja
        // a. Lama bekerja 2 tahun, anak 2
        Pekerja g = new Pekerja(1000, 2023, 3, 12, 2, "D", "111", true, true);
        System.out.println(g);
        System.out.println();

        // b. Lama bekerja 9 tahun
        Pekerja h = new Pekerja(1000, 2016, 3, 2, 0, "E", "112", false, false);
        System.out.println(h);
        System.out.println();

        // c. Lama bekerja 20 tahun, anak 10
        Pekerja i = new Pekerja(1000, 2001, 3, 20, 10, "F", "113", true, true);
        System.out.println(i);
        System.out.println();


        // 4. Manager
        // Lama bekerja 15 tahun dengan gaji $7500
        Manager j = new Manager("HRD", 7500, 2006, 3, 2, 0, "G", "114", true, false);
        System.out.println(j);
    }
}
