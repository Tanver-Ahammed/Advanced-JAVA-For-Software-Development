package queue.algorithm.pq;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int age;
    private int score;

    public Student(int id, String name, int age, int score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String toString() {
        String display = String.format("\nId: %d , Name: %s , Age: %d , Score: %d\n",
                getId(),getName(),getAge(),getScore());
        return display;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student student) {
        if (this.getScore() == student.getScore()) {
            if (this.getName().compareToIgnoreCase(student.getName()) > 0) {
                return 1;
            } else {
                return -1;
            }
        } else {
            if (this.getScore() < student.getScore()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
