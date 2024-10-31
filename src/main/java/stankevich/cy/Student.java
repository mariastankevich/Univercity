package stankevich.cy;

public class Student implements Learn {
    String studentName;

    @Override
    public void learn () {
        readBook();
        listenTeacher();
        System.out.println("I like to learn");
    }

    private void readBook () {
        System.out.println("I read 1 book from 9 am - 11 am");
    }

    private void listenTeacher () {
        System.out.println("I take part in facilitation from 12.00 am until 5 pm");
    }
}
