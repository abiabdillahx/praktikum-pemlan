import java.util.Scanner;

public class Transaksi {
    
    public static void topUp(Akun akun){
        Scanner in = new Scanner(System.in);
        System.out.println("------------------");
        int tries = 0;
        int pin = 0;
        String noPel = akun.getNoPelanggan();
        while(tries < 3 || pin != akun.getPin()){
            // System.out.println("percobaan = " + tries); // debug doang
            System.out.print("Masukkan PIN : ");
            pin = in.nextInt();
            if(pin == akun.getPin()){
                akun.infoAkun(noPel, pin);
                System.out.print("> Masukkan jumlah uang yang ingin ditambahkan : ");
                double uang = in.nextInt();
                if(uang < 0){
                    System.out.println("Maaf, jumlah uang tidak boleh minus");
                    return;
                }
                akun.setSaldo(akun.getSaldo() + uang);
                System.out.println("> Uang berhasil ditambahkan");
                break;

            }else{
                System.out.println("> PIN salah");
                tries++;
            }
            if(tries == 3){
                System.out.println("> PIN salah sebanyak 3 kali, akun diblokir");
                akun.setBlokir(true);
                break;
            }
            
        }
        // System.out.println("------------------");
    }

    public static void belanja(Akun akun){
        double saldoAkun = akun.getSaldo();
        if (saldoAkun < 10000){
            System.out.printf("Saldo anda Rp %,.2f %n", akun.getSaldo());
            System.out.println("> Saldo tidak cukup, top up dulu yhh");
            return;
        }
        Scanner ok = new Scanner(System.in);
        System.out.println("------------------");
        int tries = 0;
        int pin = 0;
        String noPel = akun.getNoPelanggan();
        while(tries < 3 || pin != akun.getPin()){
            System.out.print("Masukkan PIN : ");
            pin = ok.nextInt();
            if(pin == akun.getPin()){
                akun.infoAkun(noPel, pin);
                System.out.print("> Masukkan total harga belanja : ");
                double belanja = ok.nextInt();
                if(belanja < 0){
                    System.out.println("Maaf, total harga belanja tidak boleh minus");

                }else if (belanja > saldoAkun || (saldoAkun - belanja) < 10000){
                    System.out.println("> Transaksi gagal, saldo anda tidak cukup!");
                    return;
                }
                if(belanja > 0 && belanja <= saldoAkun){
                    double cashback = calcCashback(akun.getLevel(noPel), belanja);
                    akun.setSaldo(akun.getSaldo() - belanja + cashback);
                    System.out.println("> Transaksi berhasil!");
                    System.out.println("Total belanja : Rp " + (belanja - cashback));
                    System.out.println("> Cashback : Rp " + cashback);
                    System.out.println("> Saldo anda : Rp " + akun.getSaldo());
                    break;
                }

            }else{
                System.out.println("> PIN salah");
                tries++;
            }
            if(tries == 3){
                System.out.println("> PIN salah sebanyak 3 kali, akun diblokir");
                akun.setBlokir(true);
                break;
            }
            
        }
        


    }

    public static double calcCashback(String level, double belanja){
        double cashback = 0;
        if (level.equals("Silver") && belanja > 1000000){
            cashback = belanja * 0.05;
        }else if(level.equals("Gold")){
            if(belanja > 1000000){
                cashback = belanja * 0.07;
            }else{
                cashback = belanja * 0.02;
            }
        }else if(level.equals("Platinum")){
            if (belanja > 1000000){
                cashback = belanja * 0.10;
            }else{
                cashback = belanja * 0.05;
            }
        }else{
            return 0;
        }
        return cashback;
    }

}
