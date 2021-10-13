package HomeWork5;

public class Student {
    private int number;
    private String name;
    private int age;
    private double mark;
    boolean olimp;

    public int getNumber() {return number;}

    public void setNumber(int number) {this.number = number;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public double getMark() {return mark;}

    public void setMark(int mark) {this.mark = mark;}

    public boolean olimp() {return olimp;}

    public void setOlimp(boolean olimp) {this.olimp = olimp;}

    public Student(int number, String name, int age, double mark, boolean olimp) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.olimp = olimp;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                ", olimp=" + olimp +
                '}';
    }
}





