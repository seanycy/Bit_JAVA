import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        Student[] studentArray = new Student[num];
        for (int i = 0; i < num; i++) {
            String name = in.next();
            int year = in.nextInt();
            int month = in.nextInt();
            int day = in.nextInt();
            String studentId = in.next();
            String school = in.next();
            studentArray[i] = new Student(name, year, month, day, studentId, school);
        }

        Arrays.sort(studentArray);
        for (Student s : studentArray)
            System.out.println(s);
    }
}
class Student implements Comparable<Student> {
    private String name;
    private Date birthday;
    private String studentId;
    private String school;
    public Student(String name, int year, int month, int day, String studentId, String school) {
        this.name = name;
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.birthday = calendar.getTime();
        this.studentId = studentId;
        this.school = school;
    }

    @Override
    public String toString() {
        return "姓名：" + name + "，生日：" + birthday + "，学号：" + studentId + "，学校：" + school;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public int compareTo(Student o) {
        return studentId.compareTo(o.studentId);
    }
}