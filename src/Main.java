import java.util.Locale;
public class Main
{
    public static void main(String[] args) {
        for (Seasons season : Seasons.values()) {
            printInfo(season);
        }
        System.out.print("\nЛюбимое время года: ");

        printInfo(Seasons.valueOf("Winter"));
    }

    public static void printInfo(Seasons season) {
        System.out.printf(Locale.ROOT, "%s", season);
        season.getDescription();
    }

}