package problems.easy;

public class Day17ReverseanArrayusing2pointersapproach {
    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'm', 'l', 'o', 'j'};
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(arr);

    }
}
