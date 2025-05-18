import java.io.File;
import java.util.Scanner;

public class CekUkuranFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // scan input user
        System.out.print("Masukkan path file: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        // cek apakah file ada
        if (file.exists() && file.isFile()) {
            long fileSizeInBytes = file.length();

            // konversi ukuran file ke MB
            if (fileSizeInBytes < 1024 * 1024) {
                double sizeInKB = fileSizeInBytes / 1024.0;
                System.out.printf("Ukuran file: %.2f KB\n", sizeInKB);
            } else {
                double sizeInMB = fileSizeInBytes / (1024.0 * 1024.0);
                System.out.printf("Ukuran file: %.2f MB\n", sizeInMB);
            }
        } else {
            System.out.println("File tidak ditemukan atau bukan file yang valid."); // jika file tidak ada atau tidak valid
        }

        scanner.close();
    }
}
