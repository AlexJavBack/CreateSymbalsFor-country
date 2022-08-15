import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class main {

    /*
     * Complete the 'getMaxColors' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY prices
     *  2. INTEGER money
     */

    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year,month,day);

        return LocalDate.of(year, month, day).getDayOfWeek().toString();
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        String [] contrys = new String[]{"US", "India", "China", "France"};
        String [] contrysName = new String[]{"US: ", "India: ", "China: ", "France: "};
        ArrayList<String> sumbols = new ArrayList<>();
        NumberFormat [] n = new NumberFormat[]{NumberFormat.getCurrencyInstance(Locale.US),
                NumberFormat.getCurrencyInstance(new Locale("en", "IN")),
                NumberFormat.getCurrencyInstance(Locale.CHINA),
                NumberFormat.getCurrencyInstance(Locale.FRANCE)};
        for (int i = 0; i < n.length; i++){
            contrys[i] = n[i].format(payment);
        }
        for(int i = 0; i < contrys.length; i++){
            System.out.println(contrysName[i] + contrys[i]);
        }

    }

}



