import java.util.Scanner;

public class lab1fake
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];
        int[] graduationYears = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Nhập thông tin về ứng viên thứ %d:\n", i+1);
            scanner.nextLine();

            System.out.print("Nhập họ và tên: ");
            names[i] = scanner.nextLine();

            int graduationYear;
            do {
                System.out.print("Nhập năm tốt nghiệp: ");
                graduationYear = scanner.nextInt();
                scanner.nextLine(); // consume newline character left by nextInt()
                if (graduationYear <= 2000 || graduationYear >= 2023) {
                    System.out.println("Năm tốt nghiệp không hợp lệ. Vui lòng nhập lại!");
                }
            } while (graduationYear <= 2000 || graduationYear >= 2023);
            graduationYears[i] = graduationYear;

            int experience = 2023 - graduationYear;
            int salary;
            if (experience >= 10) {
                salary = 16000000;
            } else if (experience >= 8) {
                salary = 12000000;
            } else if (experience >= 5) {
                salary = 8000000;
            } else if (experience > 3) {
                salary = 6000000;
            } else {
                salary = 0;
            }

            if (salary > 0) {
                System.out.printf("Thông tin về ứng viên:\n Họ và tên: %s\n Năm tốt nghiệp: %d\n Lương: %,d VNĐ\n", names[i], graduationYears[i], salary);
            } else {
                System.out.printf("Số năm tốt nghiệp của ứng viên không hợp lệ.\n");
            }
        }
    }
}