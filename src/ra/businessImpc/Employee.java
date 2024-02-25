package ra.businessImpc;
import ra.business.IEmployee;

import java.util.Scanner;

public class Employee implements IEmployee{
    private String id;
    private String name;
    private int year;
    private double rate;
    private double commission;
    private double salary;
    private boolean status;

    public Employee() {
    }

    public Employee(String id,String name, int year,double rate,double commission,double salary,boolean status) {
        this.id = id;
        this.name=name;
        this.year=year;
        this.rate=rate;
        this.commission=commission;
        this.salary=salary;
        this.status=status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner scanner) {
        scanner.nextLine();
        this.id=inputId(scanner);
        this.name=inputName(scanner);
        this.year=inputYear(scanner);
        this.rate=inputRate(scanner);
        this.commission=inputCommission(scanner);
        this.salary=inputSalary();
        this.status=inputStatus(scanner);

    }
    public String inputId(Scanner scanner){
        System.out.println("nhap ma id:");
        return scanner.nextLine();
    }
    public String inputName (Scanner scanner){
        System.out.println("nhap ten nhn vien:");
        return  scanner.nextLine();

    }
    public int inputYear(Scanner scanner){
        System.out.println("moi ban nhap nam sinh nhan vien");
        return Integer.parseInt(scanner.nextLine());
    }
    public double inputRate(Scanner scanner){
        System.out.println("moi ban nhap he so luong nhan vien:");
        return Double.parseDouble(scanner.nextLine());
    }
    public double inputCommission(Scanner scanner){
        System.out.println("moi ban nhap Hoa hồng của nhân viên hàng thang :");
        return Double.parseDouble(scanner.nextLine());
    }
    public double inputSalary(){
        return (rate*basic_salary)+commission;
    }
    public boolean inputStatus (Scanner scanner){
        System.out.println("moi ban nhap Trạng thái nhân viên :");
        do {
            String status=scanner.nextLine();
            if (status.equals("true")||status.equals("false")){
                return Boolean.parseBoolean(status);
            }
            else{
                System.out.println("chi nhap true hoac false");
            }

        }while (true);
    }

    @Override
    public void display() {
        System.out.printf("%4s  %5s  %5d  %.1f  %.1f %.1f  %6s\n",this.id,this.name,this.year,this.rate,this.commission,this.salary,(this.status)?"đang làm viec ":" Nghỉ việc");

    }
}
