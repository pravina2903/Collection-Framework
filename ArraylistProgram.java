import java.util.*;
import java.util.ArrayList;

public class ArraylistProgram {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        list.add(60);
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            System.out.println("The elements is : " +list.get(i));
        }

        for(Integer element:list){
          System.out.println("The elements is : "+element);
        }

        list.set(1,10);
        System.out.println(list);

        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(70);
        newList.add(80);
        System.out.println(newList);

        list.addAll(newList);
        System.out.println(list);

        list.add(2, 90);
        System.out.println(list);

        list.remove(Integer.valueOf(1));
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        int count = list.size();
        System.out.println(count);

        System.out.println(list.contains(20));

        System.out.println(list.get(3));
        System.out.println(list);

        list.removeAll(list);
        System.out.println(list);
        
  }
}