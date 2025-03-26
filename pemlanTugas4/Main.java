import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Selamat Datang di Swalayan X!");
        System.out.println("==============================");
        System.out.println("1. Top up\n2. Belanja\n3. Keluar");
        System.out.println("==============================");
        System.out.print("Pilih Menu");
        Scanner sc = new Scanner(System.in);
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                topUp();
        }
    }

    public void topUp(){
        Scanner in = new Scanner(System.in);
        System.out.println("------------------");
        System.out.print("Masukkan no pelanggan : ");
        String noPelanggan = in.nextLine();
        System.out.print("Masukkan PIN : ");
        String pin = in.nextLine();
    }
}