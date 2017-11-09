import java.util.Scanner;

public class JavaDateAndTime {
    public static String getDay (String day, String month, String year) {
        java.util.Calendar c = java.util.Calendar.getInstance();
        int d = Integer.parseInt(day);
        int m = Integer.parseInt(month) - 1;
        int y = Integer.parseInt(year);

        c.set(y, m, d);
        int date = c.get(java.util.Calendar.DAY_OF_WEEK);
        String s = "";
        switch(date) {
            case 1:
                s = "SUNDAY";
                break;
            case 2:
                s = "MONDAY";
                break;
            case 3:
                s = "TUESDAY";
                break;
            case 4:
                s = "WEDNESDAY";
                break;
            case 5:
                s = "THURSDAY";
                break;
            case 6:
                s = "FRIDAY";
                break;
            case 7:
                s = "SATURDAY";
                break;
        }
        return s;

    }

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }
}