package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
public class Collection {
    public static void main(String[] args) {
        // ArrayList<String> list = new ArrayList();
        // list.add(12);
        // list.add(45);
        // list.add(null);
        // list.add(78);
        // list.add(5);
        // list.add(null);
        // list.add(78);
        // System.out.println("Arraylist contains : " +list);
        // list.remove(0);
        // System.out.println("Arraylist contains : " +list);
        // if (list.contains(65)) {
        //     System.out.println("true");
        // } else {
        //     System.out.println("false");
        // }
        // //get
        // System.out.println(list.get(2));
        // //set
        // list.set(2, 101);
        // System.out.println(list.get(2));
        // System.out.println(list);
        // list.add(2, 200);
        // System.out.println(list);
        // list.remove(1);
        // System.out.println(list);
        // System.out.println(list.indexOf(78));
        // list.add(101);
        // System.out.println(list);
        // System.out.println(list.lastIndexOf(101));
        // System.out.println(list.indexOf(101));
        // long startTime = System.currentTimeMillis();
        // for(int i=1; i<=100; i++){
        //     System.out.println("name "+i);
        // }
        // long endTime = System.currentTimeMillis();
        // System.out.println("Time taken : "+(endTime-startTime)+"ms");

        // list.add("one");
        // list.add("two");
        // list.add("three");
        // list.add("four");
        // list.add("six");
        // list.add("seven");
        // list.add("eight");
        // list.add("nine");
        // list.add("ten");
        // System.out.println(list);
        // ListIterator itr = list.listIterator();
        // System.out.println("Elements in forward direction ");
        // while (itr.hasNext()) {
        //     System.out.println(itr.next());
        // }
        // System.out.println("Elements in backward direction ");
        // while (itr.hasPrevious()) {
        //     System.out.println(itr.previous());
        // }


        // System.out.println(list.size());
        // ArrayList list2 = new ArrayList(list);
        // System.out.println("list2 : "+list2.size());
        
        
        // ArrayList<Integer> list3 = new ArrayList(20);
        // System.out.println("list3 : "+list3.size());
        // list3.ensureCapacity(30);
        // System.out.println("increased capacity list3 : "+list3.size());
        // list3.trimToSize();
        // System.out.println("trim list3 : "+list3.size());

        // System.out.println(list);
        // System.out.println(list.isEmpty());
        // System.out.println(list3.isEmpty());

        // System.out.println(list.contains("one"));

        // list.add("two");
        // System.out.println(list);
        // System.out.println(list.indexOf("two"));
        // System.out.println(list.lastIndexOf("two"));
        // System.out.println(list.indexOf("five"));

        // System.out.println();

        // System.out.println(list);
        // Object[] arr = list.toArray();

        // System.out.println("mtd 1");
        // for (Object object : arr) {
        //     System.out.print(object+" ");
        // }
        // System.out.println();
        // System.out.println("mtd 2");
        // for (int i = arr.length-1; i>=0; i--) {
        //     System.out.print(arr[i]+" ");
        // }

        // System.out.println();
        // System.out.println(list.get(2));

        // System.out.println(list.set(2, "six"));
        // System.out.println(list);

        // list.add("seven");
        // System.out.println(list);
        // list.add(2, "five");
        // System.out.println(list);

        // list.remove(2);
        // System.out.println(list);

        // list.remove("seven");
        // list.remove("nine");
        // System.out.println(list);

        // System.out.println(list.size());
        // list.clear();
        // System.out.println(list.size());

        // ArrayList<String> list = new ArrayList();
        // list.add("one");
        // // list.add("two");
        // list.add("three");
        // // list.add("four");
        // list.add("five");
        // // list.add("seven");
        // list.add("eight");
        // // list.add("nine");
        // list.add("ten");
        // ArrayList<String> list2 = new ArrayList();
        // // list2.add("one");
        // list2.add("two");
        // // list2.add("three");
        // list2.add("four");
        // // list2.add("six");
        // list2.add("seven");
        // // list2.add("eight");
        // list2.add("nine");
        // // list2.add("ten");
        // System.out.println(list);
        // System.out.println(list2);
        // // System.out.println(list.subList(0, 5));
        // list.addAll(2, list2);
        // System.out.println(list);

        // String[] cars = new String[]{"bmw","maruti","tata","renault"};
        // // ArrayList al = new ArrayList<>(Arrays.asList(cars));
        // // ArrayList arrayList = new ArrayList<>();
        // // Collections.addAll(arrayList, cars);
        // // arrayList.addAll(Arrays.asList(cars));
        // // System.out.println(arrayList);

        // //using streams
        // // List<Object> list = Arrays.stream(cars).collect(Collectors.toList());
        // List<Object> list = Arrays.stream(cars).collect(Collectors.toList());
        // System.out.println(list);

        ArrayList<String> list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        // String[] array = new String[list.size()];
        // list.toArray(array);
        // for (String string : array) {
        //     System.out.println(string);
        // }
        Collections.reverse(list);
        System.out.println(list);

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(5);
        ll.add(3);
        ll.add(2);
        Collections.reverse(ll);
        System.out.println(ll);
        System.out.println();
        
        System.out.println("fre " +Collections.frequency(ll, 3));
        System.out.println("max " +Collections.max(ll));
        System.out.println("min " +Collections.min(ll));
        Collections.sort(ll);
        System.out.println(ll);

        ArrayList<Integer> li = new ArrayList<Integer>();
        Collections.copy(li, ll);
        System.out.println(li);


        




        



    }
}
