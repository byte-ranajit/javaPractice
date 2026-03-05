package org.example.logics;

public class SimpleConditions {

    public static String printGivenNumber(int num){

        if (num == 0){
            return Helper.NUMBERS.ZERO.toString();
        } else if (num > 0) {
            return Helper.NUMBERS.POSITIVE.toString();
        }

        return Helper.NUMBERS.NEGATIVE.toString();
    }

    public static String evenOrOdd(int num){
        if (num % 2 == 0){
            return "Even";
        }
        return "Odd";
    }

    public static boolean checkNumberDivisbaleByFive(int num){
        return num % 5 == 0;
    }

    public static boolean checkNumberDivisbaleByFiveAndThree(int num){
        return num % 5 == 0 && num % 3 == 0;
    }

    public static boolean isLeapYear(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static int checkLargerNumber(int numOne, int numTwo){
        return Math.max(numOne, numTwo);
    }

    public static void checkLargerNumber(int numOne, int numTwo, int numThree){
        if (numOne > numTwo && numOne > numThree){
            System.out.println(numOne);
        } else if (numTwo > numOne && numTwo > numThree){
            System.out.println(numTwo);
        }  else if (numThree > numOne && numThree > numTwo){
            System.out.println(numThree);
        }
    }

    public static String checkTheTemprature(int value){
        if (value < 15) {
            return "Cold";
        }
        else if (value <= 30) {
            return "Warm";
        }
        else {
            return "Hot";
        }
    }

    public static String checkCharacter(char ch) {
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {

            return "Vowel";
        }
        else {
            return "Consonant";
        }
    }

    public static String checkCharacters(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return "lowercase letter";
        } else if (ch >= 'A' & ch <= 'Z') {
            return "uppercase letter";
        } else {
            return "special character";
        }
    }

    public static boolean checkTriangle(int a, int b, int c) {
        int oneSide = a * a;
        int twoSide = b * b;
        int threeSide = c * c;
        return (oneSide + twoSide == threeSide) || (oneSide + threeSide == twoSide)
                || (twoSide + threeSide == oneSide);
    }

    public static String checkTriangleType(int a, int b, int c) {
        if (a == b && b == c) {
            return Helper.TYPE_TRIANGLES.EQUILATERAL.toString();
        } else if ( a == b || b == c || a == c) {
            return Helper.TYPE_TRIANGLES.ISOSCELES.toString();
        } else {
            return Helper.TYPE_TRIANGLES.SCALENE.toString();
        }
    }

    public static String checkGrade(int marks){
        if (marks<100 && marks>0){
            if ( marks > 90){
                return Helper.GRADE.GRADE_A.toString();
            } else if (marks < 90 && marks > 70) {
                return Helper.GRADE.GRADE_B.toString();
            } else if (marks < 70 && marks > 60) {
                return Helper.GRADE.GRADE_C.toString();
            }  else if (marks < 60 && marks > 40) {
                return Helper.GRADE.GRADE_D.toString();
            } else if  (marks < 40 ) {
                return Helper.GRADE.GRADE_F.toString();
            }
        }
        return Helper.GRADE.INVALID_GRADE.toString();
    }

    public static boolean isMultiple(int a, int b){
        return a % b == 0 || b % a == 0;
    }

    public static String checkHours(int hour){
        if (hour >= 5 && hour <= 11) {
            return Helper.HOUR_OF_THE_DAY.GOOD_MORNING.toString();
        }
        else if (hour >= 12 && hour <= 16) {
            return Helper.HOUR_OF_THE_DAY.GOOD_AFTERNOON.toString();
        }
        else if (hour >= 17 && hour <= 20) {
            return Helper.HOUR_OF_THE_DAY.GOOD_EVENING.toString();
        }
        else if (hour >= 0) {
            return Helper.HOUR_OF_THE_DAY.GOOD_NIGHT.toString();
        } else {
            return "Invalid time";
        }
    }

    public static String checkEvenOrOdd(int a, int b) {
        boolean aEven = a % 2 == 0;
        boolean bEven = b % 2 == 0;
        if (aEven == bEven) {
            return aEven ? Helper.NUMBERS.BOTH_EVEN.toString()
                    : Helper.NUMBERS.BOTH_ODD.toString();
        }
        return aEven ? Helper.NUMBERS.EVEN.toString()
                : Helper.NUMBERS.ODD.toString();
    }


}

class Test {
    public static void main(String[] args) {
        String result = SimpleConditions.checkTriangleType(3,1,3);
        System.out.println(result);
    }
}
