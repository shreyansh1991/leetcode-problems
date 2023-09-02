package problems.easy;


public class ReverseUpperAndLowerCase {
    public static void main(String[] args) {
        String s = "Gautam";
        StringBuilder reqString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                reqString.append(String.valueOf(s.charAt(i)).toLowerCase());
            } else {
                reqString.append(String.valueOf(s.charAt(i)).toUpperCase());
            }
        }
        System.out.println(reqString);
    }
}