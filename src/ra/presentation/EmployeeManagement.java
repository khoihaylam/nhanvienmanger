package ra.presentation;
import ra.businessImpc.Employee;
import java.util.Scanner;
public class EmployeeManagement {
    Scanner sc = new Scanner(System.in);
    Employee[] arr = new Employee[100];
    private static int n;

    //    int n;
    public void inputData() {
        System.out.println("Moi ban nhap so luong nhan vien");
        n = sc.nextInt();
        arr = new Employee[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Employee();
            arr[i].inputData(sc);
        }
    }

    public void display() {
        for (int i = 0; i < n; i++) {
            arr[i].display();
        }
    }

    public void salary() {
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f", arr[i].getSalary());
        }
    }

    public void findName() {
        System.out.println("moi ban nhap ten:");
        String name = sc.nextLine();
        int check = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i].getName().equals(name)) {
                check = i;
            }
        }
        if (check == -1) {
            System.out.println("khong tim thay");
        } else {
            for (int i = 0; i < n; i++) {
                if (check == i) {
                    arr[i].display();
                }
            }
        }
    }

    public void update() {
        System.out.println("nhap id muon tim:");
        String id = sc.nextLine();
        int find = findId(id);
        if (find < 0) {
            System.out.println("ma nhan vien khong ton tai");
        } else {
            boolean exit = true;
            do {
                System.out.println("************************UPDATE*********************");
                System.out.println("1.update Tên nhân viên");
                System.out.println("2.update Năm sinh nhân viên");
                System.out.println("3.update he số lương nhân viên");
                System.out.println("4.update Hoa hồng của nhân viên hàng tháng ");
                System.out.println("5.update trang thai của nhân viên  ");
                System.out.println("moi ban chon chuc nang menu");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("moi ban update Tên nhân viên");
                        arr[find].setName(sc.nextLine());
                        break;
                    case 2:
                        System.out.println("moi ban update Năm sinh nhân viên");
                        arr[find].setYear(Integer.parseInt(sc.nextLine()));
                        break;
                    case 3:
                        System.out.println("moi ban update he số lương nhân viên");
                        arr[find].setRate(Double.parseDouble(sc.nextLine()));
                        break;
                    case 4:
                        System.out.println("moi ban update Hoa hồng của nhân viên hàng tháng");
                        arr[find].setCommission(Double.parseDouble(sc.nextLine()));
                        break;
                    case 5:
                        System.out.println("moi ban update trang thai của nhân viên hàng tháng");
                        arr[find].setStatus(Boolean.parseBoolean(sc.nextLine()));
                        break;
                    default:
                        double salary = arr[find].inputSalary();
                        arr[find].setSalary(salary);
                        exit = false;
                }

            } while (exit);
        }


    }

    public int findId(String id) {
        for (int i = 0; i < n; i++) {
            if (arr[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;


    }

    public void delete() {
        System.out.println("nhap id muon xoa:");
        String id = sc.nextLine();
        int delete = findId(id);
        if (delete >= 0) {
            for (int i = delete; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
        }

    }

    public void sortSalary() {
        Employee temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].getSalary() > arr[j].getSalary()) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void sortYear() {
        Employee temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].getYear() > arr[j].getYear()) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void sortName() {
        Employee temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].getName().compareTo(arr[j].getName())<0){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
    }
}
