package HomeWork4;

import java.util.Comparator;

   class DataContainerComparator implements Comparator<Integer> {

       @Override
       public int compare(Integer o1, Integer o2) {
           return Integer.compare(o1,o2);
       }
   }
