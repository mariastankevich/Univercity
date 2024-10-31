package stankevich.cy;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();
        Facility facility = new Facility();
        facility.nameFacility = "Sarbona";
        student.studentName = "Maria";
        teacher.teacherName = "Bob";


        facility.makeLearn(student);
        System.out.println("My name is " + student.studentName + "I am a student in " + facility.nameFacility + ".");
        System.out.println("I am practicing with my Teacher " + teacher.teacherName + " from 9 am - 11 am.");
        student.learn();

        facility.makeTeach(teacher);
        System.out.println("My name is " + teacher.teacherName + ". I a teacher in " + facility.nameFacility);
        System.out.println("I am facilitating with my student  " + student.studentName + ".");
        teacher.teach();

        facility.finishDay();
        }
    }