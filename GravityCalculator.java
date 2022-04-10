class GravityCalculator {
    public static void main(String[] arguments) {

        //The output of the program without editing is : "The object's position after 10.0 seconds is 0.0 m."
        double gravity = -9.81; //
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        double calculation;
        calculation = (0.5 * gravity*(fallingTime*fallingTime)+ (initialVelocity* fallingTime) + initialPosition);
        System.out.println("The object's position after " + fallingTime + " seconds is " + calculation +  " m.");

        System.out.println("If the object was released on the equatoral line gravity would be 9,798 m/m^2");

        double gravityOnEquator = -9.798;
        double calculationOnEquator;
        calculationOnEquator = (0.5 * gravityOnEquator*(fallingTime*fallingTime)+ (initialVelocity* fallingTime) + initialPosition);
        System.out.println("And the distance travelled on the equator is " + calculationOnEquator + " meters" + " after " + fallingTime + " seconds");



    }
}
