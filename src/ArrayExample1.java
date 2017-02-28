import java.util.Arrays;

/**
 * @author flo
 * @since 28/02/2017.
 */
public class ArrayExample1 {
    public static void main(String[] args) {

        // square odd and double even
        // ridica la patrat nr impare & dupleaza numere pare
        int[] input = {1, 5, 4, 6, 12, 13,27};
        int[] output = new int[input.length];

        for(int i = 0; i < input.length; i++) {
            "Victoria".equals("Victoriu");
            if(input[i] % 2 == 0) {
                output[i] = 2 * input[i];
            } else {
                output[i] = input[i] * input[i];
            }
        }

        for(int i=0;i<output.length;i++) {
            System.out.println(output[i]);
        }

    }
}
