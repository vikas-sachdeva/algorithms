package jsample;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.Test;

public class CountingSortWithNegativeOrRangeInputTest {

    private CountingSortWithNegativeOrRangeInput countingSort = new CountingSortWithNegativeOrRangeInput();

    @Test
    public void sortTest1() {
        int[] array = new int[]{1, 4, 1, 2, 7, 5, 2};
        AssertionsForInterfaceTypes.assertThat(countingSort.sort(array)).containsExactly(1, 1, 2, 2, 4, 5, 7);
    }

    @Test
    public void sortTest2() {
        int[] array = new int[]{33, 22, 11, 0, 2, 3, 4};
        AssertionsForInterfaceTypes.assertThat(countingSort.sort(array)).containsExactly(0, 2, 3, 4, 11, 22, 33);
    }

    @Test
    public void sortTest3() {
        int[] array = new int[]{-5, -10, 0, -3, 8, 5, -1, 10};
        AssertionsForInterfaceTypes.assertThat(countingSort.sort(array)).containsExactly(-10, -5, -3, -1, 0, 5, 8, 10);
    }

    @Test
    public void sortTest4() {
        int[] array = new int[]{33, 22, 11, 3, 4};
        AssertionsForInterfaceTypes.assertThat(countingSort.sort(array)).containsExactly(3, 4, 11, 22, 33);
    }
}
