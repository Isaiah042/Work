package cohort15;

import java.lang.reflect.Array;
import java.util.Arrays;

public class questions {
    public static void main(String[] args) {

        //Q1
        String[] arrayOfName = {"Isaiah", "Nelson", "Nelson Jr"};
        int lastIndex = getLastIndex(arrayOfName);
        System.out.println(lastIndex);
        //Q2
        int lastIndex2 = getSecondToLastIndex(arrayOfName);
        System.out.println(lastIndex2);

        //Q3
        String lastIndex3 = getFirstElement(arrayOfName);
        System.out.println(lastIndex3);

        //Q4
        String lastIndex4 = getLastElement(arrayOfName);
        System.out.println(lastIndex4);

        //Q5
        String lastIndex5 = getSecondToLastElement(arrayOfName);
        System.out.println(lastIndex5);

        //Q6
        int[] arrayNumbers6 = {5, 10, 15, 5};
        int total = getSum(arrayNumbers6);
        System.out.println(total);

        //Q7
        double[] arrayNumbers7 = {5, 10, 15, 5};
        double average = getAverage(arrayNumbers7);
        System.out.println(average);

        //Q8
        int[] oddArrays = {1, 2, 3, 4, 5, 6};
        String getOddNumbers = extractAllOddNumbers(oddArrays);
        System.out.println(getOddNumbers);

        //Q9
        int[] evenArrays = {1, 2, 3, 4, 5, 6};
        String getEvenNumbers = extractAllEvenNumbers(evenArrays);
        System.out.println(getEvenNumbers);

        //10
        String[] foods = {"CheeseBurger", "FrenchFries", "PinaColada"};
        String nametoCheck = "ChesseBurger";
        boolean details = contains(foods,nametoCheck);
        System.out.println((nametoCheck));


    }//Method

    //Q1
    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }

    //Q2
    public static int getSecondToLastIndex(String[] names) {
        int x = names.length - 2;
        return x;
    }

    //Q3
    public static String getFirstElement(String[] names) {
        return names[0];
    }

    //Q4
    public static String getLastElement(String[] names) {
        int number = getLastIndex(names);
        return names[number];
    }

    //Q5
    public static String getSecondToLastElement(String[] names) {
        int number = getSecondToLastIndex(names);
        return names[number];
    }

    //Q6
    public static int getSum(int[] ints) {
        int start = 0;
        for (int zero : ints) {
            start += zero;
        }
        return start;
    }

    //Q7
    public static double getAverage(double[] ints) {
        double sum = 0;
        for (double arrayNum : ints) {
            sum += arrayNum;
        }
        return sum / ints.length;
    }

    //Q8
    public static String extractAllOddNumbers(int[] numbers) {
        StringBuilder allOddNumber = new StringBuilder();
        for (int arrayNum : numbers) {
            if (arrayNum % 2 != 0) {
                allOddNumber.append(arrayNum).append(", ");
            }
        }
        if (allOddNumber.length() > 0) {
        }
        if (allOddNumber.length() > 0) {
        }
        return allOddNumber.toString();
    }

    //Q9
    public static String extractAllEvenNumbers(int[] numbers) {
        StringBuilder allOddNumber = new StringBuilder();
        StringBuilder allEvenNumber = new StringBuilder();
        boolean foundEven = false;
        for (int arrayNum : numbers) {
            if (arrayNum % 2 == 0) {
                if (foundEven) {
                }
                allEvenNumber.append(arrayNum).append(", ");

            }
        }
        return allEvenNumber.toString();
    }

    //Q10
    public static boolean contains(String[] names, String element) {
        for (String items : names) {
            if (items.equalsIgnoreCase(element)) {
                return true;
            }
        }
            return false;
        }public static String toProperCaps(String input){
        if (input == null || input.isEmpty()){
        return input;
    }return input.substring(0,1).toUpperCase()+input.substring(1).toLowerCase();}


} //Class
