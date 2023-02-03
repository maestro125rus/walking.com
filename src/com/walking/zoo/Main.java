package com.walking.zoo;

import java.util.Arrays;
import java.util.Random;

/*+Задача 1:
+ Реализовать класс Animal, содержащий protected-конструктор без параметров,
который выводит в консоль сообщение «I’m an animal».

+ Реализовать для Animal классы-наследники Dog и Cat.
+ Реализовать для каждого из них приватный конструктор без параметров,
который выводит в консоль сообщение «I’m a dog» («I’m a cat»).
+Также реализовать публичный конструктор, принимающий строковый параметр color.
Он должен вызывать конструктор без параметров,
а также выводить в консоль сообщение «I’m a <color> dog» («I’m a <color> cat»),
где <color> – значение параметра конструктора color.

Создайте в main() экземпляр Dog и экземпляр Cat.
Обратите внимание на консоль. Такой ли порядок сообщений вы ожидали увидеть?

Задача 2(*):
Реализуйте класс Animal. Реализуйте его наследников: Dog, Cat, Cow.
Каждый из наследников должен содержать свой метод: woof(), meow() и moo() соответственно.
Остальные поля и методы суперкласса и наследников реализовать по своему усмотрению, если они необходимы.

Каждый из методов должен выводить в консоль соответствующую ему строку: "woof ", "meow " или "moo".

В main() создать и наполнить в произвольном порядке объектами разных классов-наследников массив типа Animal.
Реализовать метод, принимающий массив Animal и вызывающий метод, характерный для конкретного животного.

Использовать при решении instanceof, getClass() или другие неизвестные нам механики – недопустимо.

Дополнительное условие (необязательно): решить задачу, при условии, что woof(), meow() и moo()
внутри себя выполняют только вызов protected-метода sound(), который определен в Animal.

*/
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Animal[] allUsedAnimals = new Animal[3];
        allUsedAnimals[0] = new Cat();
        allUsedAnimals[1] = new Dog();
        allUsedAnimals[2] = new Cow();


        Animal[] animals = new Animal[32];
        for (int i = 0; i < animals.length; i++) {
            int rand = random.nextInt(3);
            animals[i] = allUsedAnimals[rand];
            System.out.printf("%s says %s\n", animals[i].getName(), animals[i].sound());
        }

    }
}
