package employee.version2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeProject {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
        Date BirthDate = date.parse("03/27/2000");
        Date HiredDate = date.parse("09/15/2023");

        HourlyEmployee hE1 = new HourlyEmployee(1, "James Ng", BirthDate, HiredDate, (float) 35.5, 100);
        System.out.println("HourlyEmployee Data: ");
        hE1.displayInfo();
        System.out.println("________________________________");

        PieceWorkerEmployee pWE1 = new PieceWorkerEmployee(2, "Kirzteen Uy", BirthDate, HiredDate, 35, 20);

        System.out.println("PieceWorkerEmployee Data:");
        pWE1.displayInfo();
        System.out.println("________________________________");


        CommissionEmployee cE1 = new CommissionEmployee(3, "Sophia Cohon", BirthDate, HiredDate, 400000);

        System.out.println("CommissionEmployee Data: ");
        cE1.displayInfo();
        System.out.println("________________________________");

        BasePlusCommissionEmployee bPS1 = new BasePlusCommissionEmployee(4, "Jaina Garot", BirthDate, HiredDate, 400000, 100);

        System.out.println("BasePlusCommissionEmployee Data: ");
        bPS1.displayInfo();
        System.out.println("________________________________");
    }
}
