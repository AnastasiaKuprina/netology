public class Main {
    public static void main(String[] args) {
        long [] s = {100, 200, 300};

        SalesManager sm = new SalesManager(s);
        System.out.println("Максимальная продажа " + sm.max());
    }
}