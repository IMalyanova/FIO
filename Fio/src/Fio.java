import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fio {

    public static void main(String[] args) throws IOException {

        System.out.println("Введите ФИО полностью (например, “Иванов Сергей Петрович”): ");
        String fio = (new BufferedReader(new InputStreamReader(System.in))).readLine();

        String foiTrim = fio.trim();
        int gap = foiTrim.indexOf(" ");
        int gapLast = foiTrim.lastIndexOf(" ");
        System.out.println(gap);
        System.out.println(gapLast);
        String foiSplit[] = new String[3];
        foiSplit[0] = foiTrim.substring(0,gap);
        foiSplit[2] = foiTrim.substring(gapLast+1);
        foiSplit[1] = foiTrim.substring(gap,gapLast).trim();

        System.out.println("Фамилия: " + foiSplit[0]);
        System.out.println("Имя: " + foiSplit[1]);
        System.out.println("Отчество: " + foiSplit[2]);
    }
}
