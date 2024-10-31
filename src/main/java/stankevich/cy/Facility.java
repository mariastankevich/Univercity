package stankevich.cy;

public class Facility implements Rest {
    String nameFacility;

    public void makeLearn(Learn learn) {
        System.out.println("The facility is open from 9 am till 5 pm. Students have to learn");
    }

    public void makeTeach(Teach teach) {
        System.out.println("The facility is open from 9 am till 5 pm. Teachers have to tech");
    }

    public void finishDay () {
        System.out.println("The university is closed at 5 pm");
        System.out.println("Students go to the bar.");
        System.out.println("Teachers go to home.");
    }

    //}
}
