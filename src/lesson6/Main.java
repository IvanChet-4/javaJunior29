package lesson6;

public class Main {
    //Игра в сапера ДЗ
    public static void main(String[] args) {
        //Возвращает введеный пользователем уровень сложности
        String level = ScannerUtils.getLevelFromUser();
        //Генерируем поле (массив)
        int[][] field = SaperUtils.createGameField(level);
        //Определяем количество мин
        int countMines = SaperUtils.countMinesByLevel(level);
        //Расставляем мины случайным образом
        int[][] fieldsWithMines = SaperUtils.feelRandomMines(field, countMines);
        //Выводим полученное игровое поле
        //SaperUtils.printMinesFromField(fieldsWithMines);
        //Вводим пользовательское число строк
        int StepUserRow = SaperUtils.createStepUserRow();
        //Вводим пользовательское число столбцов
        int StepUserСol = SaperUtils.createStepUserCol();
        //Цикл игры
        SaperUtils.stepResult(field, StepUserRow, StepUserСol, countMines);
    }
}
