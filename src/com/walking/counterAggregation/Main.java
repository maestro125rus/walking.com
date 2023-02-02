package com.walking.counterAggregation;

import static com.walking.counterAggregation.CounterService.COUNTER_LIST;
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
- приватный метод, который позволяет вывести значения счетчиков в виде: <Название счетчика>: <Значение счетчика>. */
public class Main {
    public static void main(String[] args) {
        String name = "Beer";
        String units = "l";
        //Создаём счётчики
        Counter[] counter = new Counter[1];
        counter[0] = new Counter(name, units);
        CounterService.addCounterToList(counter);
        counter[0] = new Counter("Cold Water", "m^3");
        CounterService.addCounterToList(counter);
        counter[0] = new Counter("Electric", "KWh");
        CounterService.addCounterToList(counter);

        //Печатаем список всех доступных счётчиков
        System.out.print(CounterService.getCounterList());

        //Увеличиваем счётчики на заданный шаг
        CounterService.incrementCounter("Electric", 1);
        CounterService.incrementCounter("Electric", 1);
        CounterService.incrementCounter("Cold Water", 18);
        CounterService.incrementCounter("Beer", 3);
        CounterService.incrementCounter("Beer", 3);

        //Вывод значений всех счётчиков.
        PrintAllCounts();

        //Сброс счётчика
        CounterService.reset("Beer");

        //Доступ к счётчику по названию и вывод его значений.
        System.out.println(CounterService.accessByName("Beer"));

    }

        private static String PrintAllCounts (){
            String result = "";
            for (int i = 0; i < COUNTER_LIST.length; i++){
                if (COUNTER_LIST[i] != null) {
                    System.out.println(COUNTER_LIST[i].getName() + ": " + COUNTER_LIST[i].getCounter() + " " + COUNTER_LIST[i].getUnits());
                }
                else return result;
            }
            return result;
        }

}
