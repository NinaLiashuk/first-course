package HomeWork5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ListStudent {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i < 1000; i++) {
            int studentsNumber = random.nextInt(1000, 9999);
            String studentName = MethodStringName.stringName();
            int studentsAge = random.nextInt(7, 17);
            double studentsMark = MethodDoubleMark.mark();
            boolean studentsOlimp = random.nextBoolean();

            students.add(new Student(studentsNumber, studentName, studentsAge, studentsMark, studentsOlimp));
        }
        System.out.println("Первоначальный список учеников");
        for (Student student1 : students) {
            System.out.println(student1);
        }
        System.out.println();
        System.out.println();

        List<Student> studentList = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() >= 12 && student.getMark() > 8.0)
                studentList.add(student);
        }
        System.out.println("Отфильтрованный список учеников старше 12 с оценкой выше 8,0");
        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println();
        System.out.println();

        studentList.sort(new ComparatorName());
        System.out.println("Сортировка по имени");
        for (int i = 0; i < 10; i++) {
            System.out.println(studentList.get(i));
        }
        System.out.println();
        System.out.println();

        studentList.sort(new ComparatorMarkMaxMin());
        System.out.println("Сортировка по оценке. Топ 10 лучших учеников");
        for (int i = 0; i < 10; i++) {
            System.out.println(studentList.get(i));
        }
        System.out.println();
        System.out.println();

        System.out.println("Сортировка по возрасту и оценке");
        studentList.sort(new ComparatorAge().thenComparing(new ComparatorMarkMaxMin()));
        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println();
        System.out.println();

        int age = 12;
        int count = 0;
        for (Student student : studentList) {
            if (student.getAge() != age){
                System.out.println();
                age++;
                count = 0;
            }
            if (student.getAge() == age && count < 10) {
                System.out.println(student);
                count++;
            }
        }
    }
}
















