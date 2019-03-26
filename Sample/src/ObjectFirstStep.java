import java.time.LocalDate;
import java.util.Date;

public class ObjectFirstStep {


    public static void main(String[] args) {

        Date birthday = new Date();

        String s;

        Date deadline;
        deadline = new Date();
        // There is two way to initialize object variable deadline
        // 'new Date()' or make it refer to other object variable 'deadline = birthday'
        s =  deadline.toString();

        LocalDate.now();

        LocalDate newYearsEve = LocalDate.of(2018, 12, 31);
        int year = newYearsEve.getYear(); // 2018
        int month = newYearsEve.getMonthValue(); // 12
        int day = newYearsEve.getDayOfMonth(); // 31
        System.out.println("NewYearsEve " + year+month+day);

        // lets add days

        LocalDate aThosandDaysLater = newYearsEve.plusDays(1000);
        // method plusDays yields a new LocalDate object,
        // which is then assigned to the aThousandDaysLater variable

        year = aThosandDaysLater.getYear(); // 2021
        month = aThosandDaysLater.getMonthValue(); // 9
        day = aThosandDaysLater.getDayOfMonth(); // 26
        System.out.println("1000 days after NewYearEve " + year+month+day);
        System.out.println("So object variable newYearsEve has same references to object Local Date and same values that it has before " + newYearsEve.getYear() + newYearsEve.getMonthValue() + newYearsEve.getDayOfMonth());

    }
}
