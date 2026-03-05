package org.example.logics;

public class Helper {

    enum NUMBERS{
        POSITIVE("Positive"),
        NEGATIVE("Negative"),
        ZERO("Zero"),
        EVEN("Even"),
        ODD("Odd"),
        BOTH_EVEN("Both are even numbers"),
        BOTH_ODD("Both are odd numbers");

        private final String value;

        NUMBERS(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    enum TYPE_TRIANGLES{
        EQUILATERAL("equilateral"),
        ISOSCELES("isosceles"),
        SCALENE("scalene");
        private final String value;

        TYPE_TRIANGLES(String value){
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    enum GRADE{
        GRADE_A("A"),
        GRADE_B("B"),
        GRADE_C("C"),
        GRADE_D("D"),
        GRADE_F("F"),
        INVALID_GRADE("Invalid Grade");
        private final String value;
        GRADE(String value){
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    enum HOUR_OF_THE_DAY{
        GOOD_MORNING("Good Morning"),
        GOOD_AFTERNOON("Good Afternoon"),
        GOOD_EVENING("Good Evening"),
        GOOD_NIGHT("Good Night");
        private final String value;
        HOUR_OF_THE_DAY(String value){
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }



}
