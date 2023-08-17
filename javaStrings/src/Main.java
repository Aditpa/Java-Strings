public class Main {


    public static void main(String[] args) {

        String first = "ABCÖ";
        String second = "abcöäü";
        StringManipulation stringManipulation = new StringManipulation();
        System.out.println(stringManipulation.toLowerCase(first));
        System.out.println(stringManipulation.toUpperCase(second));
        System.out.println("hello \"Worldy\"");
        System.out.println(first.length());
        stringManipulation.compareStringValueOf(true);

        String text = "hello buddy, how is going ?";
        System.out.println("Reverse with split : " +stringManipulation.reverse(text));
    }
}
