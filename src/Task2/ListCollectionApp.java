package Task2;

import java.util.Arrays;

public class ListCollectionApp {
    public static void main(String[] args) {
        ListCollection<String> strCollection = new ListCollection<String>();
        strCollection.add("1a");
        strCollection.add("2a");
        strCollection.add("3a");
        strCollection.add("4a");
        strCollection.add("5a");

        System.out.println(" strCollection.size() = " +    strCollection.size());
        //System.out.println(" strCollection.size() = " +    strCollection.);

    ;
        System.out.println("  strCollection.get(2)= " +    strCollection.get(2).value);

        strCollection.getListCollection();

        strCollection.remove(0);
        strCollection.getListCollection();

        strCollection.remove(1);
        strCollection.getListCollection();
        strCollection.remove(4);
        strCollection.getListCollection();
    }
}
