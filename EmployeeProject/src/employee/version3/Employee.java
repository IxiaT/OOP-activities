package employee.version3;

import java.util.Date;

public class Employee extends Name{
    protected int empID;
    protected Date empDateHired;
    protected Date empBirthDate;

    public Employee(){}

    public Employee(int empID, String firstName, String middleName, String lastName, String suffix, Date empBirthDate, Date empDateHired) {
        super(firstName, lastName, middleName, suffix);
        this.empID = empID;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public Employee(int empID, String firstName, String middleName, String lastName, Date empBirthDate, Date empDateHired) {
        super(firstName, lastName, middleName);
        this.empID = empID;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    @Override
    public String toString() {
        return "Employee{" + "empID=" + empID +
                ", empName=" + firstName + " " + middleName.charAt(0) + ". " + lastName
                + ", empDateHired=" + empDateHired + ", empBirthDate=" + empBirthDate + '}';
    }
}
