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

        strCollection.getListCollection();

        strCollection.remove(1);
        strCollection.getListCollection();
        strCollection.remove(4);
        strCollection.getListCollection();

        strCollection.remove("3a");

        strCollection.add("6a");
        strCollection.add("7a");
        strCollection.getListCollection();
        strCollection.clear();

        strCollection.add("1b");

        strCollection.getListCollection();
        strCollection.clear();
        strCollection.getListCollection();
    }
}
