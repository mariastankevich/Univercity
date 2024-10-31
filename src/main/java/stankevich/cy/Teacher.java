package stankevich.cy;

public class Teacher implements Teach {
    String teacherName;

    @Override
    public void teach () {
        System.out.println("I like facilitate with the students");
    }


}
// public class Teacher implements OffUnivercity {
//    @Override
//    public void finishDay () {
//        System.out.println("I finish teaching at 5 pm and go home");
   // }
//}