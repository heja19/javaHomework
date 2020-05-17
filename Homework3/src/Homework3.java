import java.io.*;
import java.util.Scanner;

public class Homework3 {

    private static final String FILE_LOCATION = "Homework3/src/cityTemp.txt";

    private static String tempInformation[] = new String[5];
    private static int lines = 0;
    private static int counter = 0;
    private static String city;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enetr the city temperatures file name you want to know more information: ");
        String filePath = String.format(FILE_LOCATION, reader.readLine());
        fileReader(filePath);

    }

    public static void lineCounter(String file_location) throws IOException {
        LineNumberReader reader = new LineNumberReader(new FileReader(file_location));

        while ((reader.readLine()) != null) {
            lines++;
        }
        reader.close();
    }

    public static void fileReader(String file_location) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        lineCounter(file_location);
        Scanner scanner = new Scanner(new FileReader(file_location));
        moreInfo(scanner.nextLine());
        cityTempInfo(tempInformation, city);
        counter++;

        for (int i = counter; counter < lines; i++) {
            System.out.println("In this file is more info about city temperatures. Do you want to see other cities info also? yes/no");
            if (reader.readLine().equals("yes")) {
                moreInfo(scanner.nextLine());
                cityTempInfo(tempInformation, city);
                counter++;
                if (counter == lines)
                    System.out.println("End of this file.");
            } else {

                break;
            }
        }

        scanner.close();

    }

    public static void moreInfo(String allLineInfo) {
        int first_item = 0;
        for (char c : allLineInfo.toCharArray()) {
            if (Character.isDigit(c)) {
                first_item = allLineInfo.indexOf(c);
                break;
            }
        }

        city = allLineInfo.substring(0, first_item - 1);
        tempInformation = allLineInfo.substring(first_item).split(" ");
    }

    public static double average(String[] data) {
        double allTemps = 0;
        for (int i = 0; i < data.length; i++) {
            allTemps += Double.parseDouble(data[i]);
        }
        double result = allTemps / data.length;
        return result;
    }

    public static int warmest(String[] city_data) {
        int max = Integer.parseInt(city_data[0]);

        for (int i = 0; i < city_data.length; i++) {
            if (max < Integer.parseInt(city_data[i])) {
                max = Integer.parseInt(city_data[i]);
            }
        }

        return max;
    }

    public static int coldest(String[] data) {
        int min = Integer.parseInt(data[0]);

        for (int i = 0; i < data.length; i++) {
            if (min > Integer.parseInt(data[i])) {
                min = Integer.parseInt(data[i]);
            }
        }

        return min;
    }

    public static double averageNoExtremes(String[] data) {
        double tempSum = 0;
        for (int i = 0; i < data.length; i++) {
            if (Double.parseDouble(data[i]) == warmest(data) || Double.parseDouble(data[i]) == coldest(data)) {
                continue;
            } else {
                tempSum += Double.parseDouble(data[i]);
            }
        }

        double average = tempSum / (data.length - 2);
        return average;
    }

    public static void cityTempInfo(String[] data, String city) {
        System.out.println(String.format("Here is information for %s. The average temperature is %.1f.", city, average(data)));
        System.out.println(String.format("The warmest temperature is %d.", warmest(data)));
        System.out.println(String.format("The coldest temperature is %d.", coldest(data)));
        System.out.println(String.format("The average temperature without extremes is %.1f.", averageNoExtremes(data)));
    }
}