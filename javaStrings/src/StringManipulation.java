public class StringManipulation {

    public String toLowerCase(String string){
        return string.toLowerCase();
    }
    public String toUpperCase(String string){
        return string.toUpperCase();
    }

    public void compareStringValueOf(Object value) {
        String stringValue = String.valueOf(value);

        System.out.println("Primitive Value: " + value);
    }

    public String reverse(String string) {
        String[] split = string.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for(String word:split) {
            for (int i = word.length() - 1; 0 <= i; i--) {
                reversed.append(word.charAt(i));
            }
            reversed.append(" ");
        }
        return reversed.toString();
    }



}
