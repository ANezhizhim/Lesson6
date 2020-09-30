package Task1;

import java.util.Arrays;

public class ArrayCollectionApp {
    public static void main(String[] args) {

        ArrCollection<String> stringArrlist = new ArrCollection<String>(5);

        stringArrlist.add("qwe");
        stringArrlist.add("asd");
        stringArrlist.add("zxc");
        stringArrlist.add("3");
        stringArrlist.add("4");
        stringArrlist.add("5");
        stringArrlist.add("6");
        stringArrlist.add("7");
        stringArrlist.add("8");
        stringArrlist.add("9");
        stringArrlist.add("10");
        System.out.println("args = " + stringArrlist.get(10));

        System.out.println("stringArrlist.size() = " + stringArrlist.size());



        stringArrlist.remove("qwe");
        System.out.println("args = " + stringArrlist.get(0));

        stringArrlist.clear();
        System.out.println("stringArrlist.size() = " + stringArrlist.size());

    }
}


/*
Создать собственную типизированную коллекцию с методами:
- int size() – возвращает размер коллекции
- void add(E item) – добавить элемент в коллекцию
- void remove(int index) – удаляет элемент по индексу
- void remove(E item) – удаляет элемент
- E get(int index) – получение элемента по индексу
- void clear() – очищает коллекцию
Необходимо создать две реализации коллекции: на основе массива
и связанного списка


 */