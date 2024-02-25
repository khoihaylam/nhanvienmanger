package ra.presentation;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        EmployeeManagement obj=new EmployeeManagement();
        do {
            System.out.println();
            System.out.println("********************MENU*********************");
            System.out.println("1. Nhập thông tin cho n nhân viên");
            System.out.println("2. Hiển thị thông tin nhân viên");
            System.out.println("3. Tính lương cho các nhân viên");
            System.out.println("4. Tìm kiếm nhân viên theo tên nhân viên");
            System.out.println("5. Cập nhật thông tin nhân viên");
            System.out.println("6. Xóa nhân viên theo mã nhân viên");
            System.out.println("7. Sắp xếp nhân viên theo lương tăng dần (Comparable)");
            System.out.println("8. Sắp xếp nhân viên theo tên nhân viên giảm dần (Comparator)");
            System.out.println("9. Sắp xếp nhân viên theo năm sinh tăng dần (Comparator)");
            System.out.println("10. Thoát");
            System.out.println("MOI Ban chon chuc nang menu:");
            int choice=scanner.nextInt();
            switch (choice){
                case 1:
                    obj.inputData();
                    break;
                case 2:
                    obj.display();
                    break;
                case 3:
                    obj.salary();
                    break;
                case 4:
                    obj.findName();
                    break;
                case 5:
                    obj.update();
                    break;
                case 6:
                    obj.delete();
                    break;
                case 7:
                    obj.sortSalary();
                    break;
                case 8:
                    obj.sortName();
                    break;
                case 9:
                    obj.sortYear();
                    break;
                case 10:
                    System.exit(0);
                default:
                    System.err.println("chi nhap tu 1-10");
            }
        }while (true);


    }
}
