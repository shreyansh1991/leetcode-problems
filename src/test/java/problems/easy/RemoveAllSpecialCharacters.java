package problems.easy;

public class RemoveAllSpecialCharacters {
    public static void main(String[] args) {
        String s = "cbjasbjcxabjw1212!!!%@%!&@^&!^@&!^&@^!&^shbjsabxjabsj";
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s1);
    }
}
