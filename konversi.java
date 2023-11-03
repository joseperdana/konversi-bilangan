package AOK;

import java.util.Scanner;

public class konversi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean menu = true;

        // template menu
        System.out.println("=".repeat(30));
        System.out.println("Program Konversi Bilangan");
        System.out.println("=".repeat(30));
        System.out.println("1. Biner");
        System.out.println("2. Decimal");
        System.out.println("3. Hexadecimal");
        System.out.println("\n*Pilih dengan nomor");
        System.out.print("Konversi dari nomor: ");
        int dari = input.nextInt();
        System.out.print("Konversi ke nomor: ");
        int ke = input.nextInt();
        System.out.print("Masukkan bilangan yang ingin dikonversi: ");
        String bilangan = input.next();

        if (dari == 1 && ke == 2) {
            int bilangan2 = Integer.parseInt(bilangan);
            int hasil = 0, hitung = bilangan2, dasar = 1;
            while (hitung > 0) {
                int digit = hitung % 10;
                hitung = hitung / 10;
                hasil += digit * dasar;
                dasar = dasar * 2;
            }
            System.out.println("Hasil = " + hasil);
        } else if (dari == 2 && ke == 1) {
            int bilangan2 = Integer.parseInt(bilangan);
            System.out.print("Hasil: ");
            for (int i = 31; i >= 0; i--) {
                int k = bilangan2 >> i;
                if ((k & 1) > 0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
        } else if (dari == 2 && ke == 3) {
            int bilangan2 = Integer.parseInt(bilangan);
            String hasil = Integer.toHexString(bilangan2).toUpperCase();
            System.out.println("Hasil: " + hasil);
        } else if (dari == 3 && ke == 2) {
            String hexString = "0123456789ABCDEF";
            String hexa = bilangan.toUpperCase();
            int hasil = 0;
            for (int i = 0; i < hexa.length(); i++) {
                char ch = hexa.charAt(i);
                int posisi = hexString.indexOf(ch);
                hasil = 16 * hasil + posisi;
            }
            System.out.println("Hasil: " + hasil);
        } else if (dari == 1 && ke == 3) {
            int bilangan2 = Integer.parseInt(bilangan);
            String hasil = Integer.toHexString(bilangan2).toUpperCase();
            System.out.println("Hasil: " + hasil);
        } else if (dari == 3 && ke == 1) {
            // dari 3 ke 2
            String hexString = "0123456789ABCDEF";
            String hexa = bilangan.toUpperCase();
            int hasil = 0;
            for (int i = 0; i < hexa.length(); i++) {
                char ch = hexa.charAt(i);
                int posisi = hexString.indexOf(ch);
                hasil = 16 * hasil + posisi;
            }
            // dari 2 ke 1
            System.out.print("Hasil: ");
            for (int i = 31; i >= 0; i--) {
                int k = hasil >> i;
                if ((k & 1) > 0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
        } else {
            System.out.println("=".repeat(30));
            System.out.println("Pilihan tidak valid");
        }

    }
}
