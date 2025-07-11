
import java.util.*;
public class T2sort{
    public static void main(String args[])
   {
     ArrayList<Integer> list= new ArrayList<>();
     list.add(2);
     list.add(5);
     list.add(9);
     list.add(3);
     list.add(6);
     int idx1=1;
     int idx2=3;
     System.out.println(list);
     Collections.sort(list);//assending
     System.out.println(list);
     //decending
     Collections.sort(list, Collections.reverseOrder());
     //comparator--fnx logic---sorting ka logic define karega comparator
     System.out.println(list);
   } 
}