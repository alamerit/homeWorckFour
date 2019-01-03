import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
    //          Все сделано до нас
    //    LinkedList<Integer> arr = new LinkedList<Integer>();
    //           arr.add(2);
    //           arr.add(0,10);
    //           arr.addLast(6);
    //           arr.add(arr.size(),85);
    //    System.out.println(arr.toString());
    //           arr.sort(null);
    //           arr.forEach( elem -> System.out.print(elem + " "));
    //    System.out.println();
//
    //    Iterator<Integer> it = arr.iterator();
    //    while (it.hasNext()){
    //        System.out.print(it.next() + " ");


            // Dick nails
            LinkedLisst<String> list = new LinkedLisst<>();

            list.insert("Artem");
            list.insert("Roman");
            list.insert("Roman");
            list.insert("Roman");
            list.display();

            System.out.println(list.find("Artem"));

            LinkedLisst<People> peopleList = new LinkedLisst<>();
            peopleList.insert(new People("Artem", 22));

        }




    }




