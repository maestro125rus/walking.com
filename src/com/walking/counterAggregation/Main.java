package com.walking.counterAggregation;
import java.util.Scanner;
/*Counter
- хранит название счетчика и его значение,
- единицы измерения
- обеспечивает доступ к значениям.
Название счетчика и единицы измерения должны быть неизменны.

CounterService
- хранит массив доступных счетчиков
- получение всех доступных счетчиков
- получение доступа к счетчику по названию
- увеличение значения счетчика на единицу или заданное значение
- сброс счетчика до нулевого значения.

Main
main();

- создание счетчиков
приватный метод, который позволяет вывести значения счетчиков в виде: <Название счетчика>: <Значение счетчика>. */
public class Main {
    public static void main(String[] args) {
        //Counter counter = new Counter(ConfNewCounter.createCounterName(), ConfNewCounter.createCounterUnits());
        System.out.println(new CreateNewCounter("test").createNewCounter());

    }
    public static class ConfNewCounter {
        String name = createCounterName();
        String unit = createCounterUnits();

        static Scanner scanner = new Scanner(System.in);

        static String createCounterName() {
            System.out.print("Enter counter Name: ");
            return scanner.next();
        }
        static String createCounterUnits() {
            System.out.print("Enter counter units: ");
            return scanner.next();
        }
    }
    public static class CreateNewCounter {
        String objectName = "0";

        public CreateNewCounter(String objectName){
            this.objectName = objectName;
        }
        public String createNewCounter() {
            Counter objectName = new Counter(ConfNewCounter.createCounterName(), ConfNewCounter.createCounterUnits());
                return objectName.getName() + ": " + objectName.getCounter() + objectName.getUnits();
        }
    }

    private static String printCounter(){
        return "0"; //System.out.println(CreateNewCounter.name + ": " + counter1.value + counter1.unit);
    }


}
