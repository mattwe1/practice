abstract class Student {
    private String fullName;
    private int course;
    private double lastExamGrade;

    // Конструктор для инициализации полей
    public Student(String fullName, int course, double lastExamGrade) {
        this.fullName = fullName;
        this.course = course;
        this.lastExamGrade = lastExamGrade;
    }

    // Абстрактный метод, который должен быть реализован в наследниках
    public abstract void writeExam();

    // Геттеры для полей
    public String getFullName() {
        return fullName;
    }

    public int getCourse() {
        return course;
    }

    public double getLastExamGrade() {
        return lastExamGrade;
    }
}
class IUStudent extends Student {
    public IUStudent(String fullName, int course, double lastExamGrade) {
        super(fullName, course, lastExamGrade);
    }

    @Override
    public void writeExam() {
        System.out.println(getFullName() + " (студент факультета информационных технологий) пишет экзамен по информатике.");
    }
}
class MathStudent extends Student {
    public MathStudent(String fullName, int course, double lastExamGrade) {
        super(fullName, course, lastExamGrade);
    }

    @Override
    public void writeExam() {
        System.out.println(getFullName() + " (студент математического факультета) пишет экзамен по математике.");
    }
}
