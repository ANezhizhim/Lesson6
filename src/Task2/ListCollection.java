package Task2;

public class ListCollection<T> {
/*
    private static class Element<E> {
        E value;
        Element next;
        Element prev;
        int itemIndex = 0;

        Element(Element prevtElem, E valueElem, Element nextElem) {
            this.value = valueElem;
            this.prev = prevtElem;
            this.next = nextElem;
            itemIndex++;
        }
    }
*/

    private Element currentNode, prevNode, nextNode, firstNode, lastNode;
    private int count;


    public ListCollection() {
        this.firstNode = null;// = new Element(null, null, null);
        this.lastNode = null;//new Element(this.firstNode, null, null);

        //  this.Node = new Element(null, null, null);
        // this.nextNode = new Element(null, null, null);
        this.prevNode = null;
        this.currentNode = null;
        this.nextNode = null;

        this.count = 0;

    }

    public void add(T item) {

        if ((this.currentNode != null) && (this.currentNode.prev != null)) {
            System.out.println("[item]      Node.prev.value = " + currentNode.value + "  " + currentNode.prev.value);
        }
        this.currentNode = new Element(this.currentNode, item, null, this.count);


        if (this.currentNode.prev != null) {
            this.currentNode.prev.next = this.currentNode;

        }

        //  this.Node.itemCount=count;

        if (this.currentNode.prev != null) {
            System.out.println("[item] Node.prev.next.value = " + currentNode.prev.value + "  " + currentNode.prev.next.value);
        }

        if (count == 0) {
            this.firstNode = this.currentNode;
           // this.currentNode.prev = this.currentNode;
            //  this. currentNode.prev.next=this.currentNode;
        }

        this.count++;
        this.lastNode = this.currentNode;
    }

    public int size() {
        return count;
    }

    public Element get(int indexItem) {
        if (indexItem >= count) {
            System.out.println(" get(" + indexItem + ") is out of bounds. (index)= " + indexItem);
            return null;
        }
        Element retElement = this.firstNode;
        boolean checkElem = false;
        int i = 0;

        while (i++ < this.count) {

            //System.out.println("retElement.itemIndex = " + retElement.itemIndex);
            if (retElement.itemIndex == indexItem) {
                checkElem = true;
                break;
            } else {
                retElement = retElement.next;
            }

        }
        if (!checkElem) {
            retElement = null;
        }

        return retElement;
    }

    public void remove(int index) {
        Element removedElement = this.get(index);
        if (removedElement.prev!=null){
            removedElement.prev.next = removedElement.next;
       }else{
            this.firstNode=removedElement.next;
            System.out.println("remove 0");
        }

        if (removedElement.next != null) {
            removedElement.next.prev = removedElement.prev;
        }else{
            this.lastNode=removedElement.prev;
        }
        // removedElement=removedElement.next;
        this.count--;

        removedElement = null;
        System.out.println("firstNode.value = " + this.firstNode.value);


    }

    public void getListCollection() {
        Element listElement = this.firstNode;
        int i = 0;

        // while (i++ < this.count) {
        while (listElement != null) {
            System.out.println("index = ["+listElement.itemIndex+"] = " + listElement.value);
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