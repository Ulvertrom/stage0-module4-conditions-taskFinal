package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        int remainder = year % 4;
        int leap = 0;
        switch (remainder) {
            case 1:
            case 2:
            case 3:
                leap = 0;
                break;
            case 0:
                if ((year % 100) != 0) {
                    leap = 1;
                }
                else {
                    if ((year % 400) == 0) {
                        leap = 1;
                    } else {
                        leap = 0;
                    }
                }
                break;
        }
        //System.out.println(leap);
        if (year >= 0) {
            switch (month) {
                case (1):
                case (3):
                case (5):
                case (7):
                case (8):
                case (10):
                case (12):
                    System.out.println("31");
                    break;
                case (4):
                case (6):
                case (9):
                case (11):
                    System.out.println("30");
                    break;
                case (2):
                    System.out.println(leap == 0 ? "28" : "29");
                    break;
                default:
                    System.out.println("invalid date");
                    break;
            }
        } else {
            System.out.println("invalid date");
        }

    }
}
