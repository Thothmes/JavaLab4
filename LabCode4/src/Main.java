/*
Задание 1. Обобщенные типы. Типовые переменные, <>.
Задание 2. Параметризации. Маски типов и их ограничения.
Задание 3. Обобщенные методы. Автовывод типа
*/

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Main {
    static Main r = new Main();
    static Scanner n = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("""
                ЛАБОРАТОРНАЯ РАБОТА №4
                ВЫПОЛНИЛ - КУЛАКОВ МАКСИМ ИТ-6 (ПМИ-10/2023)
                ВАРИАНТ 7
                
                Задания 1,2 - задания 1,2 темы 1
                Задание 3 - задание 3 темы 2
                Задание 4 - задание 1 темы 3
                Задание 5 - задание 2 темы 3
                Задание 6 - задание 3 темы 3
                Задание 7 - задание 4 темы 3
                Что-бы выйти - введите 0
                
                Чтобы просмотреть интересующее вас задание - введите его номер.
                """);
        r.choise();
    }

    public void choise() {
        while (true) {
            System.out.println("\nВведите число для выбора дальнейшего действия:");
            int choisenum = n.nextInt();
            if (choisenum == 0) {
                System.out.println("\nРабота программы завершена!");
                break;
            } else if (0 < choisenum && choisenum < 12) {
                System.out.println(tasks(choisenum));
            } else {
                System.out.print("\nВведите число в указанном диапазоне");
            }
        }
    }

    public String tasks(int args) {

        switch (args) {

            case 1:
                System.out.println("""
                        Текст задания 1 темы 1
                        
                        Обобщенная коробка.
                        Создайте сущность Коробка, которая обладает следующими характеристиками:
                         Может хранить один произвольный объект в один момент времени.
                         Объект можно получить и разместить на хранение в любой момент времени.
                         Если объект забирают из коробки – ссылку на этот объект необходимо обнулить.
                         Если объект кладут в коробку, но она не пуста – необходимо выкинуть исключение.
                         Имеет метод проверки на заполненность.
                         Методы класса должны работать с тем типом данных, который был указан во время
                        создания объекта
                        Создайте Коробку которая может хранить целочисленное значение, разместите туда число 3.
                        Передайте Коробку в какой-либо метод, извлеките значение, и выведите его на экран.
                        
                        """);
                Box box = CreateBox();
                ValueBox(box);
                break;

            case 2:
                System.out.println("""
                        Текст задания 2 темы 1
                        
                        Без null.
                        Создайте сущность Хранилище, которая обладает следующими характеристиками:
                         Может хранить один произвольный объект в один момент времени.
                         Хранилище неизменяемо.
                         Объект кладется в Хранилище при его создании. В качестве объекта может быть
                        сохранено также и значение null.
                         Хранилище может вернуть ссылку на Объект.
                         Если вместо объекта хранится null, необходимо вернуть какое-либо альтернативное
                        значение.
                         Метод получения значения должен работать с тем типом данных, который был указан во
                        время создания объекта
                        Выполните следующие задания:
                         Создайте Хранилище чисел, положите туда значение null.
                        Передайте Хранилище в какой-либо метод, извлеките значение, и выведите его на экран. 
                        Альтернативой должно быть число 0.
                         Создайте Хранилище чисел, положите туда значение 99.
                        Передайте Хранилище в какой-либо метод, извлеките значение, и выведите его на экран. 
                        Альтернативой должно быть число -1.
                         Создайте Хранилище строк, положите туда значение null. 
                        Передайте Хранилище в какой-либо метод, извлеките значение, и выведите его на экран. 
                        Альтернативой должна быть строка “default”.
                         Создайте Хранилище строк, положите туда значение “hello”. Передайте Хранилище в
                        какой-либо метод, извлеките значение, и выведите его на экран. Альтернативой должна
                        быть строка “hello world”.
                        
                        """);
                StorageWork();
                break;

            case 3:
                System.out.println("""
                        Текст задания 3 темы 2
                        
                        Начало отсчета.
                        Создайте метод, принимающий Коробку из задачи 3.1.1, и кладет в неё трехмерную точку
                        координат (из задачи 2.1.5) с произвольными значениями. Метод должен позволять передавать
                        Коробку с более чем одним видом параметризации.
                        
                        """);
                box = new Box();
                System.out.println(PointInBox(box).getItem());
                break;

            case 4:
                System.out.println("""
                        Текст задания 1 темы 3
                        
                        Функция.
                        Разработайте такой метод, который будет принимать список значений типа T, и объект имеющий
                        единственный метод apply. Данный метод надо применить к каждому элементу списка, и вернуть
                        новый список значений типа P, при этом типы T и P могут совпадать, а могут не совпадать.
                        Используйте разработанный метод следующим образом:
                        1. Передайте в метод список со значениями:“qwerty”, “asdfg”, “zx”, а получите список чисел,
                        где каждое число соответствует длине каждой строки.
                        2. Передайте в метод список со значениями: 1,-3,7, а получите список в котором все
                        отрицательные числа стали положительными, а положительные остались без изменений
                        3. Передайте в метод список состоящий из массивов целых чисел, а получите список в
                        котором будут только максимальные значения каждого из исходных массивов
                        
                        
                        """);
                Filtr(1);
                break;

            case 5:
                System.out.println("""
                        Текст задания 2 темы 3
                        
                        Фильтр.
                        Разработайте такой метод, который будет принимать список значений типа T и объект имеющий
                        единственный метод test (принимает T и возвращает boolean). Верните новый список типа T, из
                        которого удалены все значения не прошедшие проверку условием.
                        Используйте разработанный метод следующим образом:
                        1. Передайте в метод список со значениями: “qwerty”, “asdfg”, “zx”, и отфильтруйте все
                        строки имеющие менее трех символов
                        2. Передайте в метод список со значениями: 1,-3,7, и отфильтруйте все положительные
                        элементы
                        3. Передайте в метод список состоящий из массивов целых чисел, а получите список в
                        котором будут только те массивы, в которых нет ни одного положительного элемента
                        
                        """);
                Filtr(2);
                break;

            case 6:
                System.out.println("""
                        Текст задания 3 темы 3
                        
                        Сокращение.
                        Разработайте такой метод, который будет принимать список значений типа T и способ с помощью
                        которого список значений можно свести к одному значению типа T, которое и возвращается из
                        метода.
                        Используйте разработанный метод следующим образом:
                        1. Передайте в метод список со значениями: “qwerty”, “asdfg”, “zx”, и сформируйте одну
                        большую строку, которая состоит из всех строк исходного списка.
                        2. Передайте в метод список со значениями: 1,-3,7, и верните сумму всех значений исходного
                        списка.
                        3. Имеется список, состоящий из списков целых чисел, получите общеe количество
                        элементов во всех списках. Подсказка: решить задачу можно в одно действие или
                        последовательно использовать методы из 3.3.1 и 3.3.3.
                        Далее необходимо изменить разработанный метод таким образом, чтобы данный метод
                        гарантированно не возвращал null и не выбрасывал ошибок в том случае, если исходный список
                        пуст
                        
                        """);
                Filtr(3);
                break;

            case 7:
                System.out.println("""
                        Текст задания 4 темы 3
                        
                        Коллекционирование.
                        Разработайте такой метод, который будет возвращать коллекцию типа P со значениями типа T.
                        Данный метод будет принимать:
                        1. Список исходных значений
                        2. Способ создания результирующей коллекции
                        3. Способ передачи значений исходного списка в результирующую коллекцию.
                        Используйте разработанный метод следующим образом:
                        1. Передайте в метод список со значениями: 1,-3,7, и верните их разбитыми на два
                        подсписка, в одном из которых будут только положительные числа, а в другом только
                        отрицательные.
                        2. Передайте в метод список со значениями: “qwerty”, “asdfg”, “zx”, “qw” и верните их
                        разбитыми на подсписки таким образом, чтобы в любом подсписке были строки только
                        одинаковой длины
                        3. Передайте в метод список со значениями: “qwerty”, “asdfg”, “qwerty”, “qw” и верните набор
                        такого вида, который не может содержать одинаковые объекты.
                        
                        """);
                Filtr(4);
                break;
        }
        return "";
    }

    public Box CreateBox() {
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(3);
        return integerBox;
    }

    public void ValueBox(Box box) {
        System.out.println(box.getItem());
    }

    public void StorageWork() {
        System.out.println("""
                Режимы:
                1 - Хранилище хранит значение null, альтернативное - 0
                2 - Хранилище хранит значение 99, альтернативное - -1
                3 - Хранилище хранит значение null, альтернативное - default
                4 - Хранилище хранит значение hello, альтернативное - hello world
                """);
        switch (1) {
            case 1:
                Storage<Integer> integerStorage1 = new Storage<>(null);
                System.out.println(integerStorage1.getValueOrDefault(-0));
            case 2:
                Storage<Integer> integerStorage2 = new Storage<>(99);
                System.out.println(integerStorage2.getValueOrDefault(-1));

            case 3:
                Storage<String> stringStorage1 = new Storage<>(null);
                stringStorage1.getValueOrDefault("default");
                System.out.println(stringStorage1.getValueOrDefault("default"));
            case 4:
                Storage<String> stringStorage2 = new Storage<>("hello");
                stringStorage2.getValueOrDefault("hello world");
                System.out.println(stringStorage2.getValueOrDefault("hello world"));
        }
    }

    public Box PointInBox(Box box) {
        System.out.println("Введите координату Х для точки");
        int X = n.nextInt();
        System.out.println("Введите координату Y для точки");
        int Y = n.nextInt();
        System.out.println("Введите координату Z для точки");
        int Z = n.nextInt();
        CordPoint Point = new CordPoint(X, Y, Z);
        box.setItem(Point);
        return box;
    }

    public void Filtr(int args) {
        System.out.println("""
                Выбор режима:
                1 - Задание 1
                2 - Задание 2
                3 - Задание 3
                4 - Задание 4
                
                """);

        switch (args) {
            case 1:
                System.out.println("""
                        Выбор режима
                        1 - Задание 1.1
                        2 - Задание 1.2
                        3 - Задание 1.3
                        
                        Что бы выбрать режим введите число:
                        """);
                int args1 = n.nextInt();
                switch (args1) {
                    case 1:
                        List<String> stringList = List.of("qwerty", "asdfg", "zx");
                        List<Integer> lengths = applyFunctionToList(stringList, String::length);
                        System.out.println("\nЗадание 1.1:\nВходящие данные: " + stringList + "\nРезультат работы: " + lengths);
                        break;

                    case 2:
                        List<Integer> numberList = List.of(1, -3, 7);
                        List<Integer> positiveNumbers = applyFunctionToList(numberList, n -> n < 0 ? -n : n);
                        System.out.println("\nПример 2:\nВход: " + numberList + "\nВыход: " + positiveNumbers);
                        break;

                    case 3:
                        List<int[]> arrayList = List.of(new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9});
                        List<Integer> maxValues = applyFunctionToList(arrayList, array -> {
                            int max = array[0];
                            for (int num : array) {
                                if (num > max) {
                                    max = num;
                                }
                            }
                            return max;
                        });
                        System.out.println("\nЗадание 1.3:\nВходящие данные:: " + arrayList + "\nРезультат работы: " + maxValues);
                        break;
                }
            break;
            case 2:
                System.out.println("""
                        Выбор режима
                        1 - Задание 2.1
                        2 - Задание 2.2
                        3 - Задание 2.3
                        
                        Что бы выбрать режим введите число:
                        """);
                int args2 = n.nextInt();
                switch (args2) {
                    case 1:
                        List<String> stringList = List.of("qwerty", "asdfg", "zx");
                        Predicate<String> lengthPredicate = s -> s.length() >= 3;
                        List<String> filteredStrings = filterList(stringList, lengthPredicate);
                        System.out.println("\nПример 1:\nВход: " + stringList + "\nВыход: " + filteredStrings);
                        break;

                    case 2:
                        List<Integer> numberList = List.of(1, -3, 7);
                        Predicate<Integer> positivePredicate = n -> n < 0;
                        List<Integer> filteredNumbers = filterList(numberList, positivePredicate);
                        System.out.println("\nПример 2:\nВход: " + numberList + "\nВыход: " + filteredNumbers);
                        break;

                    case 3:
                        List<int[]> arrayList = List.of(new int[]{1, 2, 3}, new int[]{-1, -2, -3}, new int[]{0, -1, 2});
                        Predicate<int[]> noPositivePredicate = array -> {
                            for (int num : array) {
                                if (num > 0) {
                                    return false;
                                }
                            }
                            return true;
                        };
                        List<int[]> filteredArrays = filterList(arrayList, noPositivePredicate);
                        System.out.println("\nПример 3:\nВход: " + arrayList + "\nВыход: " + filteredArrays);

                        break;
                }
            break;
            case 3:
                System.out.println("""
                        Выбор режима
                        1 - Задание 3.1
                        2 - Задание 3.2
                        3 - Задание 3.3
                        
                        Что бы выбрать режим введите число:
                        """);
                int args3 = n.nextInt();
                switch (args3) {
                    case 1:
                        List<String> stringList = List.of("qwerty", "asdfg", "zx");
                        BinaryOperator<String> stringAccumulator = (a, b) -> a + b;
                        String concatenatedString = reduceList(stringList, stringAccumulator, "");
                        System.out.println("\nПример 1:\nВход: " + stringList + "\nВыход: " + concatenatedString);

                        break;

                    case 2:
                        List<Integer> numberList = List.of(1, -3, 7);
                        int sum = reduceList(numberList, Integer::sum, 0);
                        System.out.println("\nПример 2:\nВход: " + numberList + "\nВыход: " + sum);

                        break;

                    case 3:
                        List<List<Integer>> listOfLists = List.of(List.of(1, 2, 3), List.of(4, 5), List.of(6, 7, 8, 9));
                        sum = reduceList(applyFunctionToList(listOfLists, List::size), Integer::sum, 0);
                        System.out.println("\nПример 3:\nВход: " + listOfLists + "\nВыход: " + sum);

                        break;
                }
            break;
            case 4:
                System.out.println("""
                        Выбор режима
                        1 - Задание 4.1
                        2 - Задание 4.2
                        3 - Задание 4.3
                        
                        Что бы выбрать режим введите число:
                        """);
                int args4 = n.nextInt();
                switch (args4) {
                    case 1:
                        List<Integer> numberList = List.of(1, -3, 7);
                        Supplier<List<List<Integer>>> listSupplier = () -> List.of(new ArrayList<>(), new ArrayList<>());
                        BiConsumer<List<List<Integer>>, Integer> listAccumulator = (lists, number) -> {
                            if (number >= 0) {
                                lists.get(0).add(number);
                            } else {
                                lists.get(1).add(number);
                            }
                        };
                        List<List<Integer>> partitionedNumbers = collect(numberList, listSupplier, listAccumulator);
                        System.out.println("\nПример 1:\nВход: " + numberList + "\nВыход: " + partitionedNumbers);

                        break;

                    case 2:
                        List<String> stringList = List.of("qwerty", "asdfg", "zx", "qw");
                        Supplier<List<List<String>>> stringListSupplier = ArrayList::new;
                        BiConsumer<List<List<String>>, String> stringListAccumulator = (lists, str) -> {
                            boolean added = false;
                            for (List<String> sublist : lists) {
                                if (sublist.isEmpty() || sublist.get(0).length() == str.length()) {
                                    sublist.add(str);
                                    added = true;
                                    break;
                                }
                            }
                            if (!added) {
                                List<String> newSublist = new ArrayList<>();
                                newSublist.add(str);
                                lists.add(newSublist);
                            }
                        };
                        List<List<String>> partitionedStrings = collect(stringList, stringListSupplier, stringListAccumulator);
                        System.out.println("\nПример 1:\nВход: " + stringList + "\nВыход: " + partitionedStrings);

                        break;

                    case 3:
                        List<String> uniqueStringList = List.of("qwerty", "asdfg", "qwerty", "qw");
                        Supplier<List<String>> setSupplier = ArrayList::new;
                        BiConsumer<List<String>, String> setAccumulator = (lists, str) -> {
                            boolean added = true;
                            for (String sublist : lists) {
                                if (Objects.equals(sublist, str)) {
                                    added = false;
                                    break;
                                }
                            }
                            if (added) {
                                lists.add(str);
                            }
                        };
                        List<String> uniqueStrings = collect(uniqueStringList, setSupplier, setAccumulator);
                        System.out.println("\nПример 1:\nВход: " + uniqueStringList + "\nВыход: " + uniqueStrings);

                        break;
                }
                break;
            }

    }

    public static <T, P> List<P> applyFunctionToList(List<T> inputList, Function<T, P> function) {
        List<P> resultList = new ArrayList<>();
        for (T item : inputList) {
            resultList.add(function.apply(item));
        }
        return resultList;
    }

    public static <T> List<T> filterList(List<T> inputList, Predicate<T> predicate) {
        List<T> resultList = new ArrayList<>();
        for (T item : inputList) {
            if (predicate.test(item)) {
                resultList.add(item);
            }
        }
        return resultList;
    }

    public static <T> T reduceList(List<T> inputList, BinaryOperator<T> accumulator, T identity) {
        if (inputList == null || inputList.isEmpty()) {
            return identity;
        }
        T result = identity;
        for (T item : inputList) {
            result = accumulator.apply(result, item);
        }
        return result;
    }

    public static <T, P> P collect(List<T> inputList, Supplier<P> collectionSupplier, BiConsumer<P, T> accumulator) {
        P collection = collectionSupplier.get();
        for (T item : inputList) {
            accumulator.accept(collection, item);
        }
        return collection;
    }
}