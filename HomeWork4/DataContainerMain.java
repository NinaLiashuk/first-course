package HomeWork4;

import java.util.Iterator;

public class DataContainerMain {

   public static void main(String[] args) {

      DataContainer<String> container = new DataContainer<>(new String[]{});
      int index1 = container.add("Привет!");
      int index2 = container.add("Как дела?");
      int index3 = container.add("Лучше всех");
      int index4 = container.add("Созвонимся позже");
      String text1 = container.get(index1);
      String text2 = container.get(index2);
      String text3 = container.get(index3);
      String text4 = container.get(index4);
      String[] data = new String[]{text1, text2, text3, text4};
      System.out.println(container);                  // [Привет!, Как дела?, Лучше всех, Созвонимся позже]
      container.delete(1);
      System.out.println(container.get(2));           // Созвонимся позже
      System.out.println(container);                  // [Привет!, Лучше всех, Созвонимся позже]
      System.out.println(container.get(0));           // Привет!

      Integer[] data1 = new Integer[]{1, 2, 3, null, null, null};
      DataContainer<Integer> container1 = new DataContainer<>(data1);

      //    Пример: data = [1, 2, 3, null, null, null]. Вызвали add(null). Должно получиться data = [1, 2, 3, null, null, null]. Метод add вернёт число -1.
      System.out.println(container1.add(null));                   // -1
      System.out.println(container1);                             // [1, 2, 3, null, null, null]

      //    Пример: data = [1, 2, 3, null, null, null]. Вызвали add(777). Должно получиться data = [1, 2, 3, 777, null, null]. Метод add вернёт число 3.
      System.out.println(container1.add(777));                    // 3
      System.out.println(container1);                             // [1, 2, 3, 777, null, null]

      //    Пример: data = [1, null, 3, null, null, null]. Вызвали add(777). Должно получиться data = [1, 777, 3, null, null, null]. Метод add вернёт число 1.
      Integer[] data2 = new Integer[]{1, null, 3, null, null, null};
      DataContainer<Integer> container2 = new DataContainer<>(data2);
      System.out.println(container2.add(777));                    // 1
      System.out.println(container2);                             // [1, 777, 3, null, null, null]

      //    Пример: data = []. Вызвали add(777). Должно получиться data = [777]. Метод add вернёт число 0.
      Integer[] data3 = new Integer[]{};
      DataContainer<Integer> container3 = new DataContainer<>(data3);
      System.out.println(container3);                             // []
      System.out.println(container3.add(777));                    // 0
      System.out.println(container3);                             // [777]

      //    Пример: data = [1, 2, 3]. Вызвали add(777). Должно получиться data = [1, 2, 3, 777]. Метод add вернёт число 3.

      Integer[] data4 = new Integer[]{1, 2, 3};
      DataContainer<Integer> container4 = new DataContainer<>(data4);
      System.out.println(container4);                            // [1, 2, 3]
      System.out.println(container4.add(777));                   // 3
      System.out.println(container4);                            // [1, 2, 3, 777]

      //    Пример: data = []. Вызвали add(9999). Получили data = [9999]. Метод add вернул число 0. Вызываем get(0). Метод get возвращает 9999
      Integer[] data5 = new Integer[]{};
      DataContainer<Integer> container5 = new DataContainer<>(data5);
      System.out.println(container5);                            // []
      System.out.println(container5.add(9999));                  // 0
      System.out.println(container5);                            // [9999]
      System.out.println(container5.get(0));                     // 9999

      //    Пример: data = [9999]. Вызываем get(1). Метод get возвращает null
      System.out.println(container5.get(1));                     // null

      //    Пример data = [1, 2, 3, 777]. Вызывают delete(3). Должно получиться data = [1, 2, 3]. Метод delete вернёт true
      Integer[] data6 = new Integer[]{1, 2, 3, 777};
      DataContainer<Integer> container6 = new DataContainer<>(data6);
      System.out.println(container6);                          // [1, 2, 3, 777]
      System.out.println(container6.delete(9));           // false
      System.out.println(container6.delete(3));           // true
      System.out.println(container6);                          // [ 1, 2, 3]

      Integer[] data7 = new Integer[]{1, 2, 3, 777};
      DataContainer<Integer> container7 = new DataContainer<>(data7);
      System.out.println(container7.delete(2));           // true
      System.out.println(container7);                          // [1, 2, 777]

      Integer[] data8 = new Integer[]{1, 2, 3, 777};
      DataContainer<Integer> container8 = new DataContainer<>(data8);
      System.out.println(container8);                          // [1, 2, 3, 777]
      System.out.println(container8.deleteItem(111));          // false
      System.out.println(container8.deleteItem(777));          // true
      System.out.println(container8);                          // [1, 2, 3]

      Integer[] data9 = new Integer[]{1, 2, 3, 777, 3};
      DataContainer<Integer> container9 = new DataContainer<>(data9);
      System.out.println(container9.deleteItem(3));            // true
      System.out.println(container9);                          // [ 1, 2, 777, 3]

      Integer[] data10 = new Integer[]{1, 3, 2, 777, 3, 6, 11};
      DataContainer<Integer> container10 = new DataContainer<>(data10);
      DataContainerComparator dataContainerComparator = new DataContainerComparator();
      System.out.println(container10);                        // [1, 3, 2, 777, 3, 6, 11]
      container10.sort(dataContainerComparator);
      System.out.println(container10);                        // [1, 2, 3, 3, 6, 11, 777]

      DataContainer<Integer> container11 = new DataContainer<>(new Integer[]{1, 2, null, 6, null, 78, null});
      System.out.println(container11);                        // [1, 2, 6, 78]

   }
}

