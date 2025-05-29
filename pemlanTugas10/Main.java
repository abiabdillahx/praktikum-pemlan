import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. Data Pemain
        List<Pemain> timA = new ArrayList<>(Arrays.asList(
            new Pemain(1, 168, 50),
            new Pemain(2, 170, 60),
            new Pemain(3, 165, 56),
            new Pemain(4, 168, 55),
            new Pemain(5, 172, 60),
            new Pemain(6, 170, 70),
            new Pemain(7, 169, 66),
            new Pemain(8, 165, 56),
            new Pemain(9, 171, 72),
            new Pemain(10, 166, 56)
        ));

        List<Pemain> timB = new ArrayList<>(Arrays.asList(
            new Pemain(1, 170, 66),
            new Pemain(2, 167, 60),
            new Pemain(3, 165, 59),
            new Pemain(4, 166, 58),
            new Pemain(5, 168, 58),
            new Pemain(6, 175, 71),
            new Pemain(7, 172, 68),
            new Pemain(8, 171, 68),
            new Pemain(9, 168, 65),
            new Pemain(10, 169, 60)
        ));

        List<Pemain> timC = new ArrayList<>(); // Untuk copy Tim B

        // 2. Copy Tim B ke Tim C
        timC.addAll(timB);

        // 3. Sorting
        System.out.println("=== Tim A - Tinggi Ascending ===");
        sortByTinggi(timA, true);
        timA.forEach(System.out::println);

        System.out.println("\n=== Tim A - Tinggi Descending ===");
        sortByTinggi(timA, false);
        timA.forEach(System.out::println);

        System.out.println("\n=== Tim B - Berat Ascending ===");
        sortByBerat(timB, true);
        timB.forEach(System.out::println);

        System.out.println("\n=== Tim B - Berat Descending ===");
        sortByBerat(timB, false);
        timB.forEach(System.out::println);

        // 4. Max & Min
        System.out.println("\n--- MAX & MIN ---");
        printMinMax(timA, "Tim A");
        printMinMax(timB, "Tim B");

        // 5. Binary Search (tinggi & berat harus sudah urut)
        sortByTinggi(timB, true);
        searchTinggi(timB, 168, "Tim B");
        searchTinggi(timB, 160, "Tim B");

        sortByBerat(timA, true);
        searchBerat(timA, 56, "Tim A");
        searchBerat(timA, 53, "Tim A");

        // 6. Cek ada yang sama
        System.out.println("\n--- CEK KEMIRIPAN ---");
        checkSama(timA, timB);
    }

    // Sorting berdasarkan tinggi
    public static void sortByTinggi(List<Pemain> tim, boolean ascending) {
        tim.sort(Comparator.comparingInt(Pemain::getTinggiBadan));
        if (!ascending) Collections.reverse(tim);
    }

    // Sorting berdasarkan berat
    public static void sortByBerat(List<Pemain> tim, boolean ascending) {
        tim.sort(Comparator.comparingInt(Pemain::getBeratBadan));
        if (!ascending) Collections.reverse(tim);
    }

    // Cari min dan max
    public static void printMinMax(List<Pemain> tim, String namaTim) {
        int minTinggi = Integer.MAX_VALUE;
        int maxTinggi = Integer.MIN_VALUE;
        int minBerat = Integer.MAX_VALUE;
        int maxBerat = Integer.MIN_VALUE;

        for (Pemain p : tim) {
            if (p.getTinggiBadan() < minTinggi) minTinggi = p.getTinggiBadan();
            if (p.getTinggiBadan() > maxTinggi) maxTinggi = p.getTinggiBadan();
            if (p.getBeratBadan() < minBerat) minBerat = p.getBeratBadan();
            if (p.getBeratBadan() > maxBerat) maxBerat = p.getBeratBadan();
        }

        System.out.println(namaTim + " - Tinggi Min: " + minTinggi + ", Max: " + maxTinggi);
        System.out.println(namaTim + " - Berat  Min: " + minBerat + ", Max: " + maxBerat);
    }


    // Binary search tinggi
    public static void searchTinggi(List<Pemain> tim, int target, String namaTim) {
        int count = 0;
        for (Pemain p : tim) {
            if (p.getTinggiBadan() == target) {
                count++;
            }
        }
        System.out.println("Tinggi " + target + " cm ditemukan sebanyak " + count + " pemain di " + namaTim);
    }


    // Binary search berat
    public static void searchBerat(List<Pemain> tim, int target, String namaTim) {
        int count = 0;
        for (Pemain p : tim) {
            if (p.getBeratBadan() == target) {
                count++;
            }
        }
        System.out.println("Berat " + target + " kg ditemukan sebanyak " + count + " pemain di " + namaTim);
    }


    // Cek apakah ada data tinggi/berat yang sama
    public static void checkSama(List<Pemain> timA, List<Pemain> timB) {
        Set<Integer> tinggiA = new HashSet<>();
        Set<Integer> beratA = new HashSet<>();

        for (Pemain p : timA) {
            tinggiA.add(p.getTinggiBadan());
            beratA.add(p.getBeratBadan());
        }

        boolean ditemukan = false;
        for (Pemain p : timB) {
            if (tinggiA.contains(p.getTinggiBadan())) {
                System.out.println("Ada tinggi sama: " + p.getTinggiBadan() + " cm");
                ditemukan = true;
            }
            if (beratA.contains(p.getBeratBadan())) {
                System.out.println("Ada berat sama: " + p.getBeratBadan() + " kg");
                ditemukan = true;
            }
        }

        if (!ditemukan) System.out.println("Tidak ada tinggi/berat yang sama antar tim.");
    }
}
