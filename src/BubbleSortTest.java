import java.util.Arrays;

public class BubbleSortTest {

    public static void main(String[] args) {
        int[] array = new int[]{11,2,43,5,4,6,1};

        BubbleSort b = new BubbleSort();

        b.bubbleSort(array);

        System.out.println(Arrays.toString(array));
        }
}
