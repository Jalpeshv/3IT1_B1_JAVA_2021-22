import java.util.Scanner;
import java.time.LocalDate;
class JavaDateAndTime
{
    static String getDate(String day,String month,String year)
    {
        int d = Integer.parseInt(day);
        int m = Integer.parseInt(month);
        int y = Integer.parseInt(year);

        LocalDate ld = LocalDate.of(y,m,d);
        return ld.getDayOfWeek().name();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String d = sc.next();
        String m = sc.next();
        String y = sc.next();
        System.out.println(getDate(d,m,y));
    }
}
