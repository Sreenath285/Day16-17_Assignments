public class Main {

    public static void main(String[] args) {

        Calender calender = new Calender();
        System.out.println("Enter month and year : ");
        int month = calender.inputInteger();
        int year = calender.inputInteger();
        calender.calenderService(month,year);

    }
}
