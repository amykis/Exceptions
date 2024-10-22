/*
Задание №3
1. Создайте класс исключения, который будет выбрасываться при делении на
0. Исключение должно отображать понятное для пользователя сообщение
об ошибке.
2. Создайте класс исключений, которое будет возникать при обращении к
пустому элементу в массиве ссылочного типа. Исключение должно
отображать понятное для пользователя сообщение об ошибке
3. Создайте класс исключения, которое будет возникать при попытке открыть
несуществующий файл. Исключение должно отображать понятное для
пользователя сообщение об ошибке.
*/
package Seminar_3.Lesson;

public class Task_3 {
    public static void main(String[] args) {

    }
    public class DivisionByZeroException extends Exception{
        public DivisionByZeroException(){
            super("Делить на ноль нельзя!");
        }
    }
    public class NullArrayElementException extends Exception{
        public NullArrayElementException(){
            super("Обращение к пустому элементу массива!");
        }
    }
    public class FileNotFoundExeption extends Exception{
        public FileNotFoundExeption(){
            super("Файл не найден!");
        }
    }
}
