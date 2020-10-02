import java.util.*;

public class test {
    public static void main(String [] args) {
        List<String> myList = new ArrayList<>();

        myList.add("cat");
        myList.add("dog");
        myList.add("dog");
        myList.add("house");

        myList.remove("dog");

        System.out.println(myList.size());

        Double d1 = 3.14159;
        Double d2 = d1;
            System.out.println("d2 =" + d2);
    }
}
