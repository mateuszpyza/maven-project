public class DaysOfWeek {
    public static String isWeekend(int numberOfDay) {
        return switch (numberOfDay) {
            case 1 -> "Mondey";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6, 7 -> "Weekend";
            default -> "There is no such a day!";
        };

    }
}
