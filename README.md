# Менеджер продаж
## Задача
*Автоматизировать часть задач отдела продаж, 
и создать простой инструмент анализа статистики продаж.*

## Решение
*Создадим класс SalesManager, в котором опишем метод, 
находящий максимальное значение продаж*
``` Java
public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
} 
```

*В классе Main продемонстрируем работу класса SalesManager*

``` Java
public class Main {
    public static void main(String[] args) {
        int [] s = {100, 200, 300};

        SalesManager sm = new SalesManager(s);
        System.out.println("Максимальная продажа " + sm.max());
    }
}
```