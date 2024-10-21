/*
Задача 4. Поиск и замена строк
Реализуйте метод findAndReplace, который принимает массив строк, строку
для поиска и строку для замены. Если искомая строка не найдена, добавьте
сообщение об ошибке в список. Верните новый массив строк с выполненной
заменой.
*/

/*
Подсказка № 1
Создайте новый массив строк, который будет содержать те же строки, что и исходный
массив. Этот новый массив будет использоваться для хранения результатов замены

Подсказка № 2
Используйте цикл for для прохождения каждого элемента в исходном массиве строк.
Для каждой строки сравните её с искомой строкой. Если строка совпадает, замените
её на строку для замены в новом массиве.

Подсказка № 3
Добавьте флаг (например, found), чтобы отслеживать, была ли строка найдена. Если
после завершения цикла флаг указывает, что строка не была найдена, добавьте
соответствующее сообщение об ошибке в список ошибок.

Подсказка № 4
Проверьте каждую строку в исходном массиве и поместите либо заменённую строку,
либо исходную строку в новый массив. Если строка совпадает с искомой строкой,
замените её, иначе оставьте её без изменений.

*/

package Seminar_1.DZ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_4 {
    public static void main(String[] args) {
        List<String> errors = new ArrayList<>();
        String[] strings = {"apple", "banana", "cherry", "date"};
        String target = "banana";
        String replacement = "orange";
        String[] result = Task_4.findAndReplace(strings, target,
                replacement, errors);
        System.out.println("Результаты замены: " +
                Arrays.toString(result));
        if (!errors.isEmpty()) {
            System.out.println("Обнаружены ошибки:");
            for (String error : errors) {
                System.out.println(error);
            }
        }
    }
    public static String[] findAndReplace(String[] strings, String
            target, String replacement, List<String> errors) {
        boolean found = false;
        String[] result = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(target)) {
                result[i] = replacement;
                found = true;
            } else {
                result[i] = strings[i];
            }
        }
        if (!found) {
            errors.add("Искомая строка \"" + target + "\" не найдена");
        }
        return result;
    }
}
