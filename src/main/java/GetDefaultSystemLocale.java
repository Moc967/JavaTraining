import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class GetDefaultSystemLocale {
    public static void main(String[] args) {
        System.out.println("default locale=" + Locale.getDefault());
        System.out.println("user.language=" + System.getProperty("user.language"));
        DecimalFormat decFormat = new DecimalFormat();
        DecimalFormatSymbols decSymbols = decFormat.getDecimalFormatSymbols();
        System.out.println("Decimal separator is : " + decSymbols.getDecimalSeparator());
    }
}
