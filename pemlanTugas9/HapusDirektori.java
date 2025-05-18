import java.io.File;
import java.util.Scanner;

public class HapusDirektori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan path direktori yang akan dihapus: ");
        String dirPath = scanner.nextLine();

        File directory = new File(dirPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            boolean semuaBerhasil = true;

            // Hapus semua file di dalam direktori
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        if (!file.delete()) {
                            System.out.println("Gagal menghapus file: " + file.getName());
                            semuaBerhasil = false;
                        }
                    }
                }
            }

            // Kalau semua file berhasil dihapus, hapus direktori
            if (semuaBerhasil) {
                if (directory.delete()) {
                    System.out.println("Direktori berhasil dihapus.");
                } else {
                    System.out.println("Gagal menghapus direktori.");
                }
            } else {
                System.out.println("Tidak semua file berhasil dihapus. Direktori tidak dihapus.");
            }

        } else {
            System.out.println("Path tidak valid atau bukan direktori.");
        }

        scanner.close();
    }
}
