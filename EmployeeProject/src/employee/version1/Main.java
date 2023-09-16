package employee.version1;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dateFor = new SimpleDateFormat("dd/MM/yyyy");
        Date Bdate = dateFor.parse("27/03/2002");
        Date BHdate = dateFor.parse("15/09/2023");
        
        HourlyEmployee hE1 = new HourlyEmployee(001, "James Ng", Bdate, BHdate, (float) 35.5, 100);

        System.out.println("HourlyEmployee Data: ");
        hE1.displayInfo();
        System.out.println("________________________________");

        PieceWorkerEmployee pWE1 = new PieceWorkerEmployee(002, "Kirzteen Uy", Bdate, BHdate, 35, 20);

        System.out.println("HourlyEmployee Data:");
        pWE1.displayInfo();
        System.out.println("________________________________");


        CommissionEmployee cE1 = new CommissionEmployee(003, "Sophia Cohon", Bdate, BHdate, 400000);

        System.out.println("HourlyEmployee Data: ");
        cE1.displayInfo();
        System.out.println("________________________________");

        BasePlusCommissionEmployee bPS1 = new BasePlusCommissionEmployee(004, "Jaina Garot", Bdate, BHdate, 400000, 100);

        System.out.println("HourlyEmployee Data: ");
        bPS1.displayInfo();
        System.out.println("________________________________");
    }
    
}
