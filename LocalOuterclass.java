// write a java programe  to use local innner class

public class LocalOuterClass {
    public void method() {
        final int outerVariable = 10; // Outer variable, must be final or effectively final

        // Local inner class
        class LocalInnerClass {
            private int innerVariable = 20;

            public void printVariable() {
                // Access outer variable and inner variable
                System.out.println("Outer variable: " + outerVariable);
                System.out.println("Inner variable: " + innerVariable);
            }
        }

        // Create an instance of the local inner class and call the method
        LocalInnerClass innerObject = new LocalInnerClass();
        innerObject.printVariable();
    }

    public static void main(String[] args) {
        // Create an instance of the outer class
        LocalOuterClass outerObject = new LocalOuterClass();
        // Call the method which uses the local inner class
        outerObject.method();
    }
}










// write a java programe  to use local innner class