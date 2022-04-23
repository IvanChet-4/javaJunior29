package lesson7;

public class Main {
    public static void main(String[] args) {
        String level = ScannerUtils.getLevelFromUser();
        int[][] field = SaperUtils.createGameField(level);
        int countMines = SaperUtils.countMinesByLevel(level);
        int[][] fieldsWithMines = SaperUtils.feelRandomMines(field, countMines);
        int[][] fieldForGamer = SaperUtils.createFieldForGamer(level);
        while (true) {
            System.out.println("Игра началась.");
            SaperUtils.printFieldForGamer(fieldForGamer, fieldsWithMines);
            int chosenRow=0;
            int chosenCol=0;
            while (true) {
                chosenRow = ScannerUtils.chooseRow(fieldsWithMines.length);
                chosenCol = ScannerUtils.chooseCol(fieldsWithMines[0].length);
                if(fieldForGamer[chosenRow][chosenCol]==1) {
                    System.out.println("Вы уже совершали этот ход. Выберите другую ячейку.");
                } else {
                    break;
                }
            }
            if(!SaperUtils.checkForMin(fieldsWithMines, chosenRow, chosenCol)) {
                System.out.println("Игра окончена, вы проиграли");
                break;
            }
            fieldForGamer[chosenRow][chosenCol] = 1;
            if (SaperUtils.checkForWin(fieldsWithMines, fieldForGamer)) {
                System.out.println("Вы выиграли");
                break;
            }
        }
    }
}
