/*
Задача 2. Объединение массивов с проверкой длины и содержимого
Реализуйте метод mergeAndValidateArrays, который принимает два
массива целых чисел. Метод должен объединить массивы и вернуть новый
массив. Если длины массивов не равны, выбрасывайте исключение
IllegalArgumentException. Если хотя бы один элемент объединенного
массива отрицательный, выбрасывайте исключение RuntimeException с
сообщением "Обнаружен отрицательный элемент".
*/

/*
Подсказка № 1
Перед тем как объединять массивы, проверьте их длины. Используйте условие if для
сравнения длины двух массивов. Если длины не равны, выбросьте исключение
IllegalArgumentException с соответствующим сообщением.

Подсказка № 2
Для объединения двух массивов используйте метод System.arraycopy или простое
объединение с помощью цикла for. Создайте новый массив, который будет вдвое
длиннее исходных массивов, и скопируйте в него элементы обоих массивов.

Подсказка № 3
После объединения массивов пройдитесь по элементам объединенного массива с
помощью цикла for. Если обнаружите отрицательное значение, выбросьте
исключение RuntimeException с сообщением "Обнаружен отрицательный элемент".

Подсказка № 4
Используйте метод System.arraycopy для эффективного копирования элементов из
одного массива в другой. Это поможет избежать сложностей при ручном копировании
элементов.*/
package Seminar_1.DZ;

import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        int [] array1 = {10, 20, 10};
        int [] array2 = {40, 50, 60};
        System.out.println(Arrays.toString(mergeAndValidateArrays(array1, array2)));
        }
        public static int[] mergeAndValidateArrays(int [] array1, int [] array2) throws IllegalArgumentException {
        if (array1.length != array2.length){
            throw new IllegalArgumentException("Массивы имеют разную длину!");
        }
        int [] mergeArray = new int[array1.length + array2.length];
            System.arraycopy(array1, 0, mergeArray, 0, array1.length);
            System.arraycopy(array2, 0, mergeArray, array1.length, array2.length);

            for (int i = 0; i < mergeArray.length; i++){
                if (mergeArray[i] < 0){
                    throw new RuntimeException("Обнаружен отрицательный элемент");
                }
            }
            return mergeArray;
        }
}
