//import java.util.*;
//import java.text.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class OneThousandDaysAfterBirth {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        String birthday = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateFormat.parse(birthday));
        calendar.add(Calendar.DATE, 1000);

        Date dateAfterBirthday = calendar.getTime();
        System.out.println(dateFormat.format(dateAfterBirthday));

    }
}
