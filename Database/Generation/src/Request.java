import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Request {

    public static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public static LocalDate createRandomDate(int startYear, int endYear) {
        int day = createRandomIntBetween(1, 28);
        int month = createRandomIntBetween(1, 12);
        int year = createRandomIntBetween(startYear, endYear);
        return LocalDate.of(year, month, day);
    }

    public static void main(String args[]) {

        ArrayList<String> request = new ArrayList<String>();
        ArrayList<String> act = new ArrayList<String>();
        ArrayList<String> referral = new ArrayList<String>();

        Random rnd = new Random();

        String[] nameArray = {"Боль в животе", "Боль в ноге", "Боль в голове", "Боль в руке", "Простуда", "Инфекция", "Медицинский осмотр", "Профилактика"};

        for (int i = 1; i < 20000; i++) {
            String name = nameArray[rnd.nextInt(nameArray.length)];
            LocalDate beginDate = createRandomDate(1990, 2018);

            LocalDate endDate = createRandomDate(1990, 2018);
            LocalDate updateDate = createRandomDate(1990, 2018);
            int status = rnd.nextInt(4) + 1;
            int patient = rnd.nextInt(200) + 1;
            request.add("INSERT INTO public.\"Request\" (\"ID_Request\", \"R_Name\", \"R_Begin_Date\", \"R_End_Date\", \"R_Update_Date\", \"ID_Status\", \"ID_Patient\") VALUES(" +
                    i + ", '" + name + "', '" + beginDate + "', '" + endDate + "', '" + updateDate + "', " + status + ", " + patient + ");");
            
        }

        for (String s : request) {
            System.out.println(s);
        }
    }
}
