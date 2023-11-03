package lab4b;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        quanlinhanvien ql =new quanlinhanvien();
        int choice;
         
        do {
            menu();
            choice = new Scanner(System.in).nextInt();
            
            switch (choice) {
                case 1 -> ql.nhapdanhsachsinhanvien();
                case 2 -> ql.xuatDanhSachTheoLoaiNhanVien();
                case 3 -> ql.sapXepGiamDanTheoLuong();
                case 4 -> ql.timVaXoaNhanVienTheoTen();
                case 0 -> System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                default -> System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
            }

            System.out.println("----------------------------------");
        } while (choice != 0);
    }
    public static void menu()
    {
        System.out.println("1. Nhập danh sách nhân viên từ bàn phím");
            System.out.println("2. Xuất danh sách theo loại nhân viên ra màn hình");
            System.out.println("3. Sắp xếp giảm dần theo lương và xuất ra màn hình");
            System.out.println("4. Tìm và xóa nhân viên theo tên nhập từ bàn phím");
            System.out.println("0. Thoát chương trình");
            System.out.print("Mời bạn chọn: ");
            
        
    }
}
