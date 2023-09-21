public class Main {

    public static void main(String[] args) {
// Write a method called add. This method will have two parameters called numOne and numTwo,
// both of type int. This method will add the two numbers together and return the
// result (an integer). Call this method inside the main method and store the result in a
// variable called resultOne. Print this variable using the println statement.
    }
        public static int add(int numOne, int numTwo) {
        int resultOne;
        resultOne = (numOne + numTwo);
        System.out.println(resultOne);
        return (resultOne);

        }

    //Write a method called greeting. This method will have one parameter called name of type String.
        // This method will return a string of the format “Bonjour, [name]!”. Call this method
        // inside the main method and store the result in a variable called resultTwo.
        // Print this variable using the println statement.
    public static String greeting(String name) {
        String resultTwo;
        resultTwo = ("Bonjour, " + name);
        System.out.println(resultTwo);
        return (resultTwo);
        }

        //Write a method called add. This method will have four parameters called
        // numOne, numTwo, numThree, and numFour. This method will add the
        // four numbers together and return the result. However, it will not
        // add the numbers together like numOne + numTwo + numThree + numFour, but
        // instead it will call the add method that you created in question 1
        // thrice to compute the sum of the four numbers and return that result (an integer).
        // Call this method inside the main method and store the result in a variable called
        // resultThree. Print this variable using the println statement.
    public static int add(int numOne, int numTwo, int numThree, int numFour) {
        int resultThree;
        resultThree = add(add(add(numOne, numTwo), numThree), numFour);
        System.out.println(resultThree);
        return(resultThree);
        }

//Write a method called printMe. This method will have one parameter called toBePrinted.
// This method will simply print the content that was passed to the method call
// (i.e. print whatever value toBePrinted was initialized to when printMe was called).
// Call this method inside the main method.
        public static String printMe(String toBePrinted) {
        String printMe;
        printMe = toBePrinted;
        System.out.println(printMe);
        return(printMe);
        }
    }
