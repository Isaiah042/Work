package cohort15;

public class randomGen {
    public static void main(String[] args) {
        int randomNum = (int)(Math.random() * 101);
        System.out.println(randomNum);
//      int studentsScore = 50;
        String letterGrade = "You get an";
        if (randomNum >= 90) {
            System.out.println(letterGrade + " A");
//            System.out.println(studentsScore);
        } else if (randomNum >= 80) {
            System.out.println(letterGrade + " B");
        } else if (randomNum >= 70) {
            System.out.println(letterGrade + " C");
        } else if (randomNum >= 60) {
            System.out.println(letterGrade + " D");
        } else if (randomNum <= 50) {
            System.out.println(letterGrade + " F");
        }
    }
}
