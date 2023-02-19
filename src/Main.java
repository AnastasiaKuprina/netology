public class Main {
    public static void main(String[] args) {
        int [] s = {1, 100, 200, 300, 1000};

        SalesManager sm = new SalesManager(s);
        System.out.println("Максимальная продажа " + sm.max());
        System.out.println("Расчёт обрезанного среднего " + sm.trimmedAverage());
    }
}