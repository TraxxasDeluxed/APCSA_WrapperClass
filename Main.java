public class Main {
    public static void main(String[] args) {
        // Integer Constructor
        Integer number3 = new Integer(3);
        System.out.println("The value of this Integer is: "+ number3);

        // IntValue
        int primitiveint;
        primitiveint = number3.intValue();

        // Double Value
        Double doubleValue = new Double(12.34);
        System.out.println("Double object created using double value: " + doubleValue);

        // Max double value
        System.out.println(Double.MAX_VALUE);

        // Min double value
        System.out.println(Double.MIN_VALUE);

        // Autoboxing
        Integer primitiveInt = 1;
        Double primitiveDouble = 2.0;
        System.out.println(primitiveInt.intValue());
        System.out.println(primitiveDouble.doubleValue());

        // Unboxing
        Integer numInteger = new Integer(3);
        int number = numInteger;
        int sum = number + numInteger;
        System.out.println("The sum is: "+sum);
    }
}
