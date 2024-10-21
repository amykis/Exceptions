/*
Задание №2
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с
квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об
ошибке.
*/

package Seminar_1;

public class Task_2 {
    public static void main(String[] args) {
     int[][] matrix = {{1, 0, 1}, {1, 1, 1}, {0, 0, 1}};
     System.out.printf("Сумма элементов массива равна %d", sumElements(matrix));
    }

    public static int sumElements(int[][] matrix){
        int n  = matrix.length;
        for (int[] row: matrix){
            if(row.length != n){
                throw new RuntimeException("Количество строк не равно количеству столбцов!");
            }
        }
        for (int[] row: matrix){
            for (int element: row){
                if (element != 0 && element != 1) {
                    throw new RuntimeException("Массив должен содержать только 0 или 1");
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                sum = sum + matrix[i][j];
            }
        }
        return sum;
    }
}
