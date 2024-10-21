/* Задание №1
Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое
значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом,
например:
1. если длина массива меньше некоторого заданного минимума, метод возвращает -1 в
качестве кода ошибки.
2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
3. если вместо массива пришел null, метод вернет -3
4. придумайте свои варианты исключительных ситуаций и верните соответствующие
коды ошибок.
Напишите метод, в котором реализуете взаимодействие с пользователем. То есть, этот
метод запросит искомое число у пользователя, вызовет первый метод, обработает
возвращенное значение и покажет читаемый результат пользователю. Например, если
вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
 */

package Seminar_1;

public class Task_1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int element = 2;
        int result = searchElement(array, element);
        if (result == -1) {
            System.out.println("Длинна массива меньше 3" );
        }
        else if (result == -2){
            System.out.println("Искомый элемент не найдет");
        }
        else if (result == -3){
            System.out.println("Массив не передан");
        }
        else {
            System.out.printf("Индекс найденного элемента %d", result);
        }
    }
    public static int searchElement(int[] array, int element){
        if (array == null){
            return -3;
        }
        int min_length = 3;
        if (array.length < min_length){
            return -1;
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] == element){
                return  i;
            }
        }
        return  -2;
    }
}
