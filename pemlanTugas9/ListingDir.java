import java.io.File;
import java.util.Scanner;

public class ListingDir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan path direktori: "); // ini buat scan input usernya
        String dirPath = scanner.nextLine();

        File directory = new File(dirPath);

        // checking if the directory exists
        if (directory.exists() && directory.isDirectory()) {
            File[] listOfFiles = directory.listFiles();

            // if-else ukuran file nya
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

        scanner.close();
    }
}
