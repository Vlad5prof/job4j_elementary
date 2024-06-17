package ru.job4j.array;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = MinDiapason.FindLoop.indexInRange(data, min, i, data.length - 1);
            // Меняем местами элементы по индексам
            data = MinDiapason.FindLoop.SwitchArray.swap(data, i, index);
        }
        return data;
    }

    public class MinDiapason {
        public static int findMin(int[] array, int start, int finish) {
            int min = array[start];
            for (int i = start + 1; i <= finish; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }

        public class FindLoop {
            public static int indexInRange(int[] data, int el, int start, int finish) {
                for (int i = start; i <= finish; i++) {
                    if (data[i] == el) {
                        return i;
                    }
                }
                return -1;
            }

            public class SwitchArray {
                @Contract("_, _, _ -> param1")
                public static int @NotNull [] swap(int[] array, int source, int dest) {
                    int temp = array[source];
                    array[source] = array[dest];
                    array[dest] = temp;
                    return array;
                }
            }
        }
    }
}