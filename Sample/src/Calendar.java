import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calendar {

    public static void main(String[] args) {

        // First, we construct an object that is initialized with the current date.

        LocalDate date = LocalDate.now();

        int month = date.getMonthValue(); // current month
        int today = date.getDayOfMonth(); // current day

        // Then we set date to the first of the month and get the weekday of that date

        date = date.minusDays(today-1);  // set ot start of month   // public LocalDate minusDays(long daysToSubtract)
        // for example today is 14 than to get first day of month i need calculate daysToSubstract = 14-1

        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); // 1 = Monday,...,7 = Sunday

        // The variable weekday is set to an object of type DayOfWeek.
        // We call the getValue method of that object to get a numerical value for the weekday.
        // This yields an integer that follows the international convention
        // where the weekend comes at the end of the week, returning 1 for Monday, 2 for Tuesday, and so on.
        // Sunday has value 7.

        // Here is the code to print to console the header and the indentation for the first line of calendar:
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++)
            System.out.print("    ");

        // Now, we are ready to print the body of the calendar.
        // We enter a loop in which date traverses the days of the month.
        // In each iteration, we print the date value. If date is today, the date is marked with an *.
        // Then, we advance date to the next day. When we reach the beginning of each new week, we print a new line

        while(date.getMonthValue() == month){
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today){
                System.out.print("*");
            }else
                System.out.print(" ");
            date = date.plusDays(1);  // Incrementing the day
            if(date.getDayOfWeek().getValue() == 1){ // if day of week started with Monday
                System.out.println();  // print new line
            }
        }
        if (date.getDayOfWeek().getValue() != 1){
            System.out.println();
        }

    }
}
