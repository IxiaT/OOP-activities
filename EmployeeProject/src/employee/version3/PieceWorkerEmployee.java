package employee.version3;

import java.util.Date;
public class PieceWorkerEmployee extends Employee {
    private int totalPiecesFinished;
    private float ratePerPiece;

    // Constructors
    public PieceWorkerEmployee() {

    }

    public PieceWorkerEmployee(int empID, String firstName, String middleName, String lastName, String suffix, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = 0;
        this.ratePerPiece = 0;
    }

    public PieceWorkerEmployee(int empID, String firstName, String middleName, String lastName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = "";
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = 0;
        this.ratePerPiece = 0;
    }

    public PieceWorkerEmployee(int empID, String firstName, String middleName, String lastName, String suffix, Date empDateHired, Date empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        this.empID = empID;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empID, String firstName, String middleName, String lastName, Date empDateHired, Date empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        this.empID = empID;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = "";
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    // Setters and Getters
    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    // Methods
    double computeSalary(){
        double Comission = 0;

        Comission = this.ratePerPiece * this.totalPiecesFinished;

        if(this.totalPiecesFinished > 100){
            int temp = (int) Comission;

            temp = (totalPiecesFinished/100) * 10;

            Comission =  Comission + temp;
        }

        return Comission;
    }

    public void displayInfo() {
        System.out.println("Piece Worker Employee");
        System.out.println("ID: " + empID);
        if(suffix.isEmpty()){
            System.out.println("Name: " + firstName + " " + middleName.charAt(0) + ". " + lastName);
        } else {
            System.out.println("Name: " + firstName + " " + middleName.charAt(0) + ". " + lastName + " " + suffix);
        }
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Date of Birth: " + empBirthDate);
        System.out.println("Total Pieces Finished: " + totalPiecesFinished);
        System.out.println("Rate per Piece: " + ratePerPiece);
        System.out.println("Total Salary: " + computeSalary());
    }

    @Override
    public String toString() {
        return "PieceWorkerEmployee{" +
                "empID=" + empID +
                ", empName=" + firstName + " " + middleName.charAt(0) + ". " + lastName +
                ", empDateHired=" + empDateHired +
                ", empBirthDate=" + empBirthDate +
                ", totalPiecesFinished=" + totalPiecesFinished +
                ", ratePerPiece=" + ratePerPiece +
                '}';
    }
}
