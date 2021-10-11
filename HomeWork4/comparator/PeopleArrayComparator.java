package HomeWork4.comparator;

import java.util.Arrays;
import java.util.Comparator;

 class People {
    private String name;
    private final int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

 class PeopleArrayComparatorByAge implements Comparator<People> {

    @Override
    public int compare(People people1, People people2) {
        return Integer.compare(people1.getAge(), people2.getAge());
    }
}

class PeopleArrayComparatorByName implements Comparator<People> {

    @Override
    public int compare(People people1, People people2) {
        return people1.getName().compareTo(people2.getName());
    }

}
class PeopleArrayComparator {
    public static void main(String[] args) {
        People[] peoples = new People[6];
        peoples[0] = new People("Ivan", 27);
        peoples[1] = new People("Timur", 31);
        peoples[2] = new People("Angelina", 18);
        peoples[3] = new People("Lev", 22);
        peoples[4] = new People("Nina", 28);
        peoples[5] = new People("Vadim", 12);

        System.out.println("Без сортировки");
        for (int i = 0; i < peoples.length; i ++) {
            System.out.println(peoples[i].getName() + "  " + peoples[i].getAge());
        }

        System.out.println("Сортировка по имени");
        Arrays.sort(peoples, new PeopleArrayComparatorByName());
        for (int i = 0; i < peoples.length; i ++) {
            System.out.println(peoples[i].getName() + "  " + peoples[i].getAge());
        }

        System.out.println("Сортировка по возрасту");
        Arrays.sort(peoples, new PeopleArrayComparatorByAge());
        for (int i = 0; i < peoples.length; i ++) {
            System.out.println(peoples[i].getName() + "  " + peoples[i].getAge());
        }
    }
 }











