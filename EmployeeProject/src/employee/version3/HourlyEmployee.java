package employee.version3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HourlyEmployee extends Employee {
    private float totalHoursWorked;
    private float ratePerHour;

    // Constructors
    public HourlyEmployee(int empID, String firstName, String middleName, String lastName, String suffix, Date empDateHired, Date empBirthDate, float totalHoursWorked, float ratePerHour) {
        this.empID = empID;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(int empID, String firstName, String middleName, String lastName, Date empDateHired, Date empBirthDate, float totalHoursWorked, float ratePerHour) {
        this.empID = empID;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = "";
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee() {
        empID = 0;
        firstName = "XXXXX";
        middleName = "XXXXX";
        lastName = "XXXXX";
        suffix = " ";
        totalHoursWorked = 0;
        ratePerHour = 0;
    }

    public HourlyEmployee(int empID, String firstName, String middleName, String lastName) {
        this.empID = empID;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        totalHoursWorked = 0;
        ratePerHour = 0;
    }

    // Setters and Getters
    void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }
    void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    float getTotalHoursWorked() {
        return totalHoursWorked;
    }
    float getRatePerHour() {
        return ratePerHour;
    }

    // Methods
    public double computeSalary() {
        double salary = 0;
        if(totalHoursWorked > 40) {
            salary = (40 * ratePerHour) + ((totalHoursWorked - 40) * (ratePerHour * 1.5));
        } else {
            salary = totalHoursWorked * ratePerHour;
        }
        return salary;
    }

    public void displayInfo() {
        System.out.println("ID: " + empID);
        if(suffix.isEmpty()){
            System.out.println("Name: " + firstName + " " + middleName.charAt(0) + ". " + lastName);
        } else {
            System.out.println("Name: " + firstName + " " + middleName.charAt(0) + ". " + lastName + " " + suffix);
        }
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Birthday: " + empBirthDate);
        System.out.println("Total Hours Worked " + totalHoursWorked);
        System.out.println("Rate Per Hour: " + ratePerHour);
        System.out.println("Salary: " + computeSalary());
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + "empID=" + empID + ", empName=" + firstName + " " + middleName.charAt(0) + ". " + lastName +
                ", empDateHired=" + empDateHired + ", " +
                "empBirthDate=" + empBirthDate +
                ", totalHoursWorked=" + totalHoursWorked +
                ", ratePerHour=" + ratePerHour + '}';
    }
}
