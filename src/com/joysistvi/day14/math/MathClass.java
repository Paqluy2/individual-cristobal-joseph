package com.joysistvi.day14.math;

public class MathClass {

    public static void main(String[] args) {


        //Returns the positive version of a number, removing any negative sign
        int negativeNumber = -50;
        int absoluteValue = Math.abs(negativeNumber);
        System.out.println("Math.abs()");
        System.out.println(absoluteValue);

        //Compares two numbers and returns the larger one.
        int score1 = 85;
        int score2 = 92;
        int highestScore = Math.max(score1, score2);
        System.out.println("\nMath.max()");
        System.out.println(highestScore);

        //Compares two numbers and returns the smaller one.
        int priceA = 150;
        int priceB = 120;
        int lowestPrice = Math.min(priceA, priceB);
        System.out.println("\nMath.min()");
        System.out.println(lowestPrice);

        //Returns the value of the first argument raised to the power of the second argument. It always returns a double.
        double base = 5;
        double exponent = 3;
        double result = Math.pow(base, exponent); // 5^3
        System.out.println("\nMath.pow()");
        System.out.println(result);

        //Returns the positive square root of a number. It always returns a double.
        double number = 144;
        double root = Math.sqrt(number);
        System.out.println("\nMath.sqrt()");
        System.out.println(root);

        //Rounds a decimal number to the closest whole number. .5 and above rounds up, below .5 rounds down.
        long roundedUp = Math.round(5.7);
        long roundedDown = Math.round(5.2);
        System.out.println("\nMath.round()");
        System.out.println("Up: " + roundedUp + " | Down: " + roundedDown);

        //Always rounds a decimal number up to the next highest whole number, returning it as a double.
        double ceiling = Math.ceil(3.1);
        System.out.println("\nMath.ceil()");;
        System.out.println(ceiling);

        //Generates a random double value between 0.0 (inclusive) and 1.0 (exclusive).
        double randomNum = Math.random();
        System.out.println("\nMath.random()");
        System.out.println(randomNum);

        //Returns the natural logarithm (base e) of a double value.
        double eValue = Math.E;
        double naturalLog = Math.log(eValue);
        System.out.println("\nMath.log()");
        System.out.println(naturalLog);

        //Returns the base 10 logarithm of a double value
        double log10Value = Math.log10(1000);
        System.out.println("\nMath.log10()");
        System.out.println(log10Value);

        //Returns Euler's number e raised to the power of the provided double value.
        double power = 2.0;
        double expValue = Math.exp(power);
        System.out.println("\nMath.exp()");
        System.out.println(expValue);

        //Returns the trigonometric sine of an angle (the angle must be provided in radians, not degrees).
        double sineValue = Math.sin(Math.PI / 2);
        System.out.println("\nMath.sin()");
        System.out.println(sineValue);

        //Returns the trigonometric cosine of an angle (in radians).
        double cosineValue = Math.cos(Math.PI);
        System.out.println("\nMath.cos()");
        System.out.println(cosineValue);

        //Returns the trigonometric tangent of an angle (in radians).
        double tangentValue = Math.tan(0);
        System.out.println("\nMath.tan()");
        System.out.println(tangentValue);
    }
}
