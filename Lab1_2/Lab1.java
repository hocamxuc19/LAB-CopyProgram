import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab1 {
    /*     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Nhap so luong sinh vien: ");

        try {
            n = scanner.nextInt();
            scanner.nextLine(); 
        } catch (InputMismatchException e) {
            System.out.println("khong hop le. Vui long nhap lai!");
            return;
        }

        String[] ten = new String[n]; 
        int[] namTotNghiep = new int[n]; 
        int[] luong = new int[n]; 
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin sinh vien thu " + (i + 1) + ":");
            System.out.print("Nhap ten cua sinh vien: ");
            ten[i] = scanner.nextLine();
            boolean hopLe = false;
            while (!hopLe) {
                try {
                    System.out.print("Nhap nam tot nghiep cua sinh vien: ");
                    namTotNghiep[i] = scanner.nextInt();
                    scanner.nextLine(); 
                    if (namTotNghiep[i] > 2000 && namTotNghiep[i] < 2023) {
                        hopLe = true;
                    } else {
                        System.out.println("khong hop le. Vui long nhap lai!");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("khong hop le. Vui long nhap lai!");
                    scanner.nextLine(); 
                }
            if (namTotNghiep[i] < 3) {
                luong[i] = 6000000;
            } else if (namTotNghiep[i] >= 5 && namTotNghiep[i] < 8) {
                luong[i] = 8000000;
            } else if (namTotNghiep[i] >= 8 && namTotNghiep[i] < 10) {
                luong[i] = 12000000;
            } else if (namTotNghiep[i] >= 10) {
                luong[i] = 16000000;
            }
            System.out.println("Thong tin ung vien thu " + (i + 1) + ":");
            System.out.println("Ten: " + ten[i]);
            System.out.println("Nam tot nghiep: " + namTotNghiep[i]);
            System.out.println("Luong: " + luong[i]);
        }

        scanner.close();
    }
}