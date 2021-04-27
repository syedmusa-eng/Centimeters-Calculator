public class Main {

    public static void main(String[] args) {

        double Calc_1 = calcFeetAndInchesToCentimeters(6, 12);
        //System.out.println(Calc_1);

        //Calling the 1st method to check
        double Calc = calcFeetAndInchesToCentimeters(157);
        System.out.println(Calc + " cm");

    }

    //Creating the 1st method converting feet and inches to centimeters.
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double inch = feet * 12;
            inch = inches + inch;
            double centimeters = inch * 2.54;

            return centimeters;
        } else
            System.out.println("Invalid feet or inches parameters.");
        return -1;
    }

    //Overloading
    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches >= 0) {
            double feet = (int) inches / 12;
            double remainingInches = inches % 12;
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        } else {
            return -1;
        }
    }
}
