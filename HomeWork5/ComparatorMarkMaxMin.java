package HomeWork5;

import java.util.Comparator;

class ComparatorMarkMaxMin implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.getMark(), o1.getMark());
    }
}

