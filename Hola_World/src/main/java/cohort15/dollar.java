package cohort15;

public class dollar{
public static void main(String[] args) {
//        dollarAmount(8.75);
//        System.out.println(mychange);
//        areaOfCircle(10);
//        System.out.println(squareOfCircle(15));
    double result = calcPriceAfterDiscount(100.0, 10.0);
    System.out.println(result);
}

    public static double calcPriceAfterDiscount(double price, double afterPrice){
        double discount = afterPrice / 100;
        double discountedAmount = discount * price;
        double finalprice = price - discountedAmount;
        return finalprice;

    }

//double
//    public static void dollarAmount(double amount) {
//
//         final int PRICE_COFFEE = 1;
//         double change = amount - PRICE_COFFEE;
////         return change ;
//        System.out.println("You paid " + amount + "\n" + "Here's your change  " + change);
//    }


//    public static double areaOfCircle(double radius){
//        System.out.println(Math.PI * Math.pow(radius, 2) );
//        return radius;
//    }
//public static double squareOfCircle(double number){
//        return Math.pow(number, 2);
//}
    ;
}

                 //double
//    public static void dollarAmount(double amount) {
//
//         final int PRICE_COFFEE = 1;
//         double change = amount - PRICE_COFFEE;
////         return change ;
//        System.out.println("You paid " + amount + "\n" + "Here's your change  " + change);
//    }


//    public static double areaOfCircle(double radius){
//        System.out.println(Math.PI * Math.pow(radius, 2) );
//        return radius;
//    }
//public static double squareOfCircle(double number){
//        return Math.pow(number, 2);
//}






