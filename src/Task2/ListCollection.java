package Task2;

public class ListCollection<T> {

    private Element currentNode, firstNode, lastNode;
    private int count;
    private int maxIndex;

    public ListCollection() {
        this.firstNode = null;//первый элемент коллекции
        this.lastNode = null;//последний элемент коллекции
        this.currentNode = null;//текущий элемент коллекции
        this.count = 0;//счетчик элементов
        this.maxIndex = 0;//Сквозной индекс-идентификатор элемента
    }

    public void add(T item) {

        this.currentNode = new Element(this.lastNode, item, null, this.maxIndex);

        if (this.currentNode.prev != null) {
            this.currentNode.prev.next = this.currentNode;//Предшествующему элементу указываем  текущий как next
        }

        if (count == 0) {
            this.firstNode = this.currentNode;//Запоминаем первый элемент коллекции
        }

        this.count++;
        this.maxIndex++;
        this.lastNode = this.currentNode;//Запоминаем последний элемент коллекции
    }

    public int size() {
        return this.count;
    }

    public int getMaxIndex() {
        return this.maxIndex;
    }

    public Element get(int indexItem) {
        if (indexItem >= this.maxIndex) {
            System.out.println(" get(" + indexItem + ") is out of bounds. (index)= " + indexItem + ", maxIndex=" + this.maxIndex);
            return null;
        }
        Element retElement = this.firstNode;
        boolean checkElem = false;
        int i = 0;

        while (i++ < this.maxIndex) {//Перебираем слева направо все индексы до максимального
            if (retElement != null) {
                if (retElement.itemIndex == indexItem) {
                    checkElem = true;
                    break;
                } else {
                    retElement = retElement.next;
                }
            }
        }
        if (!checkElem) {
            retElement = null;
        }
        return retElement;
    }

    public void remove(int index) {
        Element removedElement = this.get(index);
        if (removedElement == null) {
            return;
        }
        this.deleteElement(removedElement);
    }

    public void remove(T item) {
        Element delElement = this.firstNode;
        boolean checkElem = false;
        int i = 0;

        while (i++ < this.maxIndex) {//Перебираем слева направо все индексы до максимального
            if (delElement != null) {
                if (delElement.value == item) {
                    checkElem = true;
                    break;
                } else {
                    delElement = delElement.next;
                }
            }
        }
        if (checkElem) {
            deleteElement(delElement);
        }
    }

    public void clear() {
        for (int i = 0; i < this.maxIndex; i++) {
            this.remove(i);
        }
        this.firstNode = null;
        this.lastNode = null;
        this.currentNode = null;
        this.count = 0;
        this.maxIndex = 0;
    }


    private void deleteElement(Element delElement) {
        if (delElement == null) {
            return;
        }

        if (delElement.prev != null) {// Если элемент не первый в коллекции то предшественнику указываем на следующий за удаляемым элемент как next
            delElement.prev.next = delElement.next;
        } else {
            this.firstNode = delElement.next;//Если элемент первый в коллекции , записываем в него следующий после удаляемого элемента
        }

        if (delElement.next != null) {//Если элемент не последний в коллекции, то связываем следующий за удаляемым элемент с  предшественником удаляемого
            delElement.next.prev = delElement.prev;
        } else {
            this.lastNode = delElement.prev;//Если удаляемый элемент последний, то записывем в него предыдущий.
        }
        this.count--;
        delElement = null;
    }

    public void getListCollection() {
        Element listElement = this.firstNode;
        System.out.println("Элементы коллекции:");
        while (listElement != null) {
            System.out.println("index = [" + listElement.itemIndex + "] = " + listElement.value);
            listElement = listElement.next;
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