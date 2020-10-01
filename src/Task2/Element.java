package Task2;

public class Element<E> {
    protected E value;
    protected Element next;
    protected Element prev;
    protected int itemIndex;


    Element(Element prevtElem, E valueElem, Element nextElem,int index) {
        this.value = valueElem;
        this.prev = prevtElem;
        this.next = nextElem;
        this.itemIndex=index;

    }
}
