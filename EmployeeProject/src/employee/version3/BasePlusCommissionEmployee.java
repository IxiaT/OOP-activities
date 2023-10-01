package employee.version3;

import java.util.Date;

public class BasePlusCommissionEmployee extends Employee {
    private double totalSales;
    private double baseSalary;


    // Constructors
    public BasePlusCommissionEmployee() {

    }

    public BasePlusCommissionEmployee(int empID, String firstName, String middleName, String lastName, String suffix, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = 0;
        this.baseSalary = 0;
    }

    public BasePlusCommissionEmployee(int empID, String firstName, String middleName, String lastName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = "";
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = 0;
        this.baseSalary = 0;
    }

    public BasePlusCommissionEmployee(int empID, String firstName, String middleName, String lastName, String suffix, Date empDateHired, Date empBirthDate, double totalSales, double baseSalary) {
        this.empID = empID;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(int empID, String firstName, String middleName, String lastName, Date empDateHired, Date empBirthDate, double totalSales, double baseSalary) {
        this.empID = empID;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = "";
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }

    //Setters And Getters
    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Methods

    double computeSalary() {
        double Salary = 0;

        if(this.totalSales < 50000) {
            Salary = (this.totalSales * 0.05) + this.baseSalary;
        }else if(this.totalSales >= 50000 && this.totalSales < 100000){
            Salary = (this.totalSales * 0.20) + this.baseSalary;
        }else if(this.totalSales >= 100000 && this.totalSales < 500000){
            Salary = (this.totalSales * 0.30) + this.baseSalary;
        }else if(this.totalSales >= 500000){
            Salary = (this.totalSales * 0.50) + this.baseSalary;
        }

        return Salary;
    }


    public void displayInfo() {
        System.out.println("Base Plus Commission Employee");
        System.out.println("ID: " + empID);
        if(suffix.isEmpty()){
            System.out.println("Name: " + firstName + " " + middleName.charAt(0) + ". " + lastName);
        } else {
            System.out.println("Name: " + firstName + " " + middleName.charAt(0) + ". " + lastName + " " + suffix);
        }
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Date of Birth: " + empBirthDate);
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Total Salary: " + computeSalary());
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                "empID=" + empID +
                ", empName=" + firstName + " " + middleName.charAt(0) + ". " + lastName +
                ", empDateHired=" + empDateHired +
                ", empBirthDate=" + empBirthDate +
                ", totalSales=" + totalSales +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
