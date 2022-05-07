import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 7;
        System.out.println(Arrays.toString(sumZero(n)));
    }

    public static int[] sumZero(int n) {
        int[] result = new int[n];
        int index = 0;
        for(int i = 1; i <= n/2; i++) {
            result[index++] = -i;
            result[index++] = i;
        }
        return result;
    }
}
