/**
 * Problem Set 1.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 *
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet1 {

    public static void main(String[] args) {

        /*
         * Exercise 1.
         *
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */

        double length = 11;
        double width = 8.5;
        double inchToMilli = 645.16;
        System.out.printf("\n%,.2f square millimeters.\n", length * width * inchToMilli);



        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */
        double inchToCenti = 2.54;
        System.out.printf("\n%.2f centimeters. \n" , (((2 * length) + (2 * width)) * inchToCenti));


        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         * root of w^2 + l^2
         */
        System.out.printf("\n%.2f inches.\n", (Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2))));



        /*
         * Exercise 4.
         *
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */

        int homework1 = 88;
        int homework2 = 91;
        int homework3 = 0;
        int quiz1 = 84;
        int quiz2 = 89;
        int quiz3 = 93;
        int test1 = 74;
        int test2 = 87;
        int test3 = 82;

        double homeworkWeight = 0.15;
        double quizWeight = 0.35;
        double testWeight = .50;

        double homeworkGrade =((homework1 + homework2 + homework3)* homeworkWeight)/3;
        double quizGrade = ((quiz1 + quiz2 + quiz3) * quizWeight)/3;
        double testGrade = ((test1 + test2 + test3) * testWeight) / 3;
        System.out.printf("\n%.2f%%.\n", homeworkGrade + quizGrade + testGrade);


        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */
         double wage = 12.50;

         System.out.printf("\n$%.2f. \n", ((7.5 + 8 + 10.5 + 9.5 + 6 + 11.5) * wage));


        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */
        double beforeTax = (117000/12)/2;
        double federalIncomeTax = beforeTax * 0.24;
        double stateIncomeTax = (beforeTax - federalIncomeTax) * 0.0637 ;
        double retirement = ((beforeTax - (federalIncomeTax + stateIncomeTax)) * .07 );
 
        System.out.printf("\n$%,.2f.\n" , (beforeTax - (federalIncomeTax + stateIncomeTax + retirement)));

        

        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */
        double students = 273;
        double teachers = 28;
        double busCapcity = 54;
            
       System.out.println( "\n" + Math.round(Math.ceil((students + teachers)/busCapcity)) + " buses are needed, with " + Math.round((students + teachers)%busCapcity) + " passengers on the last bus. \n");
 




        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */
        double cornWidth = 24;
        double cornLength = 48;
        double cornDiameter = 6;

        System.out.printf("%,.2f square inches. \n" ,(cornWidth * cornLength) - (Math.PI * Math.pow(cornDiameter/2 , 2)));




    }
}
