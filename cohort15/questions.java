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
        String foodName = "CheeseBurger";
        boolean details = contains(foods, foodName);
        System.out.println((details));

        //Q11

        String element = "Nelson";
        int indexOnly = getIndexByElement(arrayOfName, element);
        System.out.println(indexOnly);

        //Q12
        int startOfRange = 0;
        int endOfRange = 11;
        printOddNumbersInRange(startOfRange,endOfRange);

        //Q13
        String everything = printGivenStringTimesNumberGiven("World ", 5);
        System.out.println(everything);

        //Q14
        String myWords = "I have 7 words in my counter";
        int wordCounter = myWords.split("\\s").length;
        System.out.println(wordCounter);

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
        for (int arry : ints) {
            start += arry;
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
        return allOddNumber.toString();
    }

    //Q9
    public static String extractAllEvenNumbers(int[] numbers) {
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
            if (items.equals(element)) {
                return true;
            }
        }
        return false;
    }

        //Q11
        public static int getIndexByElement(String[] names, String element) {
            for (int i = 0; i < names.length; i++) {
                if (names[i].equals(element)) {
                    return i;
                }
            }
            return -10;
        }
        //Q12
    public static void printOddNumbersInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
        //Q13
           public static String printGivenStringTimesNumberGiven(String str, int n) {
               String anything = "";
               for (int i = 0; i < n; i++) {
                   anything += str;
               }
               return anything;
           }
           //Q14


}//Class
