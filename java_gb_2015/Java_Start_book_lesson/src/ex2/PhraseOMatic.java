package ex2;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"круглосуточный", "трех-звездный", "30000-футовый",
                "взаимный", "обоюдный выигрыш", "фронтенд", "на основе веб-технологий",
                "проникающий", "умный", "шесть сигм", "метод критического пути", "динамичный"};

        String[] wordListTwo = {
                "уполномоченый", "трудный", "чистый продукт", "ориентированнный", "центральный",
                "распределенный", "кластеризованный", "фирменный", "нестандартный ум", "позиционированный",
                "сетевой", "сфокусированный", "мспользованный с выгодой", "выровненный",
                "нацеленный на", "общий", "совеместный", "ускоренный"
        };

        String[] wordListThree = {
                "процесс", "пункт разгрузки", "выход из приложения", "типс труктуры",
                "талант", "подход", "уровень завоеванного внимания", "портал", "период времени",
                "обзор", "образец", "пункт следования"
        };

        // Вычисляем, сколько слов в каждом спсике
        int oneLenght = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int threeLenght = wordListThree.length;

        // Генерируем три случайных число
        int rand1 = (int) (Math.random() * oneLenght);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLenght);

        // Теперь строим фразу
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // Выводим фразы на экран
        System.out.println("Все, что нам нужно, - это " + phrase);
    }

}
