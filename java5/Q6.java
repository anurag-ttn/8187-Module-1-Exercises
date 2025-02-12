import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        System.out.println("Part A of Question :-");
        System.out.println("---------------------------------------------------------------------------");
        System.out.print("enter date in format dd-mm-yyyy");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date1 = LocalDate.parse(str1,formater);


        System.out.print("enter other date in format dd-mm-yyyy");
        String str2 = sc.nextLine();
        LocalDate date2 = LocalDate.parse(str2,formater);
        System.out.println("the first date is "+date1+" and second date given is "+date2);

        int year1 = date1.getYear();
        int mon1 = date1.getMonthValue();
        int day1 = date1.getDayOfMonth();

        int year2 = date2.getYear();
        int mon2 = date2.getDayOfMonth();
        int day2 = date2.getDayOfMonth();

        if(year1<year2){
            System.out.println("date "+date1+" occurs before date "+date2);
        }
        else if(year2<year1){
            System.out.println("date "+date2+" occurs before date "+date1);
        }else{
            if(mon1<mon2) System.out.println("date "+date1+" occurs before date "+date2);
            else if(mon2<mon1) System.out.println("date "+date2+" occurs before date "+date1);
            else{
                if(day1<day2) System.out.println("date "+date1+" occurs before date "+date2);
                else if(day2<day1) System.out.println("date "+date2+" occurs before date "+date1);
                else{
                    System.out.println("both are same dates");
                }
            }
        }

        System.out.println("\n Part B of Question :-");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Date and Time in India(Kol)  zone : "+(LocalDateTime.now(ZoneId.of("Asia/Kolkata"))));
        System.out.println("Date and Time in America zone : "+(LocalDateTime.now(ZoneId.of("America/New_York"))));
        System.out.println("Date and Time in Japan zone : "+(LocalDateTime.now(ZoneId.of("Asia/Tokyo"))));

    }
}
