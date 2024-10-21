/* Задание №0
        Реализуйте метод, принимающий в качестве аргумента
        целочисленный массив.
        Если длина массива меньше некоторого заданного минимума,
        метод возвращает -1 в качестве кода ошибки, иначе - длину
        массива.
 */

package Seminar_1;

public class Task_0 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int min_length = 1;
        int result = checkArrayLength(array, min_length);
        System.out.println(result);
    }
    public static  int checkArrayLength(int[] array, int min_length){
        if (array.length < min_length){
            return -1;
        }
        else{
            return array.length;
        }
    }
}