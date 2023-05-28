import java.util.Arrays;

/**
 * Реализовать сортировку подсчетом
 * [1 2 3 3 2 3 4 2 1 1 2 3 4 4 2 3 1 4 2 3 4 2 1 2 3 4 2 1 3 4 2 1 2 3 4 4 2 3
 * 3 2 4]
 * Подсчитываем, сколько раз встречается конкретный элемент
 * 1 -> 5 (количество единиц в массиве: число взято с потолка!)
 * 2 -> 7 (количество двоек в массиве)
 * 3 -> 3
 * 4 -> 4
 * * Вставляем единицу 5 раз
 * Вставляем двойку 7 раз
 * Вставялем тройку 3 раза
 * Вставляем четверку 4 раза
 **/

public class countSort {

    public static void main(String[] args) {
        int[] myArray = new int[] { 1, 2, 3, 3, 2, 3, 4, 2, 1, 1, 2, 3, 4, 4, 2, 3, 1, 4, 2, 3, 4, 2, 1, 2, 3, 4, 2, 1,
                3, 4, 2, 1, 2, 3, 4, 4, 2, 3, 3, 2, 4 };
        System.out.println(Arrays.toString(myArray));
        countingSort(myArray);
        System.out.println(Arrays.toString(myArray));

    }

    static void countingSort(int[] array) {

        int k = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > k) {
                k = array[i];
            }
        }

        int[] tempArray = new int[k + 1];

        for (int value : array) {
            ++tempArray[value];
        }

        int el = 0;
        for (int i = 0; i < k + 1; ++i) {
            for (int j = 0; j < tempArray[i]; ++j) {
                array[el++] = i;
            }
        }
    }

}
