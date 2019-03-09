import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
        String[] nameActArray = {"Справка", "Больничный", "Прием", "Выписка", "Лечение", "Рецепт", "Результат анализа", "Направление"};

        ArrayList<String> loginArray = new ArrayList<String>();

        try (FileInputStream fstream = new FileInputStream("Login.txt")) {
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String s;
            while ((s = br.readLine()) != null){
                loginArray.add(s);
            }
        } catch (IOException ex) {
        }

        int referralSize = 0;
        int actSize = 0;

        for (int i = 1; i <= 20000; i++) {
            String name = nameArray[rnd.nextInt(nameArray.length)];
            LocalDate beginDate = createRandomDate(1990, 2018);
            LocalDate date = null;

            int status = rnd.nextInt(4) + 1;
            int patient = rnd.nextInt(200) + 1;

            int referralCount = rnd.nextInt(10) + 1;
            for (int j = 1; j <= referralCount; j++) {
                int type = rnd.nextInt(5) + 1;
                date = beginDate.plusDays(rnd.nextInt(15));
                referralSize++;
                referral.add("INSERT INTO public.\"Referral\" (\"ID_Referral\", \"Ref_Date\", \"ID_Request\", \"ID_Type\") VALUES("
                        + referralSize + ", '" + date + "', " + i + ", " + type + ");");

                int actCount = rnd.nextInt(3) + 1;
                for (int jj = 1; jj <= actCount; jj++) {
                    int login = rnd.nextInt(99) + 1;
                    String nameAct = nameActArray[rnd.nextInt(nameActArray.length)];
                    actSize++;
                    act.add("INSERT INTO public.\"Act\" (\"ID_Act\", \"A_Name\", \"A_Date\", \"ID_Request\", \"E_Login\") VALUES("
                            + actSize + ", '" + nameAct + "', '" + date + "', " + i + ", '" + loginArray.get(login) + "');");
                }
            }

            if (status != 1) {
                request.add("INSERT INTO public.\"Request\" (\"ID_Request\", \"R_Name\", \"R_Begin_Date\", \"R_End_Date\", \"R_Update_Date\", \"ID_Status\", \"ID_Patient\") VALUES(" +
                        i + ", '" + name + "', '" + beginDate + "', '" + date + "', '" + date + "', " + status + ", " + patient + ");");
            } else {
                request.add("INSERT INTO public.\"Request\" (\"ID_Request\", \"R_Name\", \"R_Begin_Date\", \"R_End_Date\", \"R_Update_Date\", \"ID_Status\", \"ID_Patient\") VALUES(" +
                        i + ", '" + name + "', '" + beginDate + "', '', '" + date + "', " + status + ", " + patient + ");");
            }
        }

        try (FileWriter fstream = new FileWriter("Act.txt")) {
            for (String s : act) {
                fstream.write(s);
                fstream.append('\n');
            }
        } catch (IOException ex) {
        }

        try (FileWriter fstream = new FileWriter("Referral.txt")) {
            for (String s : referral) {
                fstream.write(s);
                fstream.append('\n');
            }
        } catch (IOException ex) {
        }

        try (FileWriter fstream = new FileWriter("Request.txt")) {
            for (String s : request) {
                fstream.write(s);
                fstream.append('\n');
            }
        } catch (IOException ex) {
        }

        /*for (String s : act) {
            System.out.println(s);
        }

        for (String s : referral) {
            System.out.println(s);
        }*/

        /*for (String s : request) {
            System.out.println(s);
        }*/
    }
}
