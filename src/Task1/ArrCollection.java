package Task1;

import java.lang.reflect.Array;

public class ArrCollection<T> {


    private T[] elements;
    private int count;
    private int sizeArr;
    private int stepResizeArr = 5;//Шаг для масштабирования массива

    public ArrCollection(int sizeArr) {
        this.sizeArr = sizeArr;
        count = 0;
        elements = (T[]) new Object[sizeArr];
    }

    public T get(int index) {
        return elements[index];
    }

    public void add(T item) {
        elements[count++] = item;
        if (count == sizeArr) {
            sizeArr += stepResizeArr;
            this.resize(sizeArr);

        }

    }

    public int size() {
        return this.count;

    }

    public void clear() {
        this.resize(0);
    }

    private void resize(int newLength) {
        T[] buffer = (T[]) new Object[newLength];
        if (newLength < count) {
            count = newLength;
        }
        System.arraycopy(elements, 0, buffer, 0, count);
        elements = buffer;
    }

    public void remove(int index) {
        for (int i = index; i < count; i++) {
            elements[i] = elements[i + 1];
        }
        count--;
        if (count < sizeArr - stepResizeArr) {
            sizeArr -= stepResizeArr;
            this.resize(sizeArr);
        }
    }

    public void remove(Object delElement) {
        for (int i = 0; i < count; i++) {
            if (delElement.equals(elements[i])) {
                elements[i] = elements[i + 1];
            }
            count--;
            if (count < sizeArr - stepResizeArr) {
                sizeArr -= stepResizeArr;
                this.resize(sizeArr);
            }
        }

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