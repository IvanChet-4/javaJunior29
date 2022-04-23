package homework10;

import java.util.Arrays;

public class Matrix implements IMatrix {

    private double[][] matrix;

    public Matrix(int rows, int cols) {
        matrix = new double[rows][cols];
    }

    public Matrix (double[][]matrix){
        this.matrix = matrix;
    }

    @Override
    public int getRows() {
        return matrix.length;
    }

    @Override
    public int getColumns() {
        return matrix[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
       if (rowIndex >= this.getRows() || rowIndex < 0){
           System.out.println("Неверный индекс строки : " + rowIndex);
       return -1;
       }
        if (colIndex >= this.getColumns() || colIndex < 0){
            System.out.println("Неверный индекс строки : " + colIndex);
        return -1;
        }
        return matrix[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex <= getRows() && rowIndex >= 0 && colIndex <= getColumns() && colIndex >= 0){
        System.out.println( "setValueAt() : ");
        System.out.println("Старое значение : " + matrix[rowIndex][colIndex]);
        matrix[rowIndex][colIndex] = value;
        System.out.println("Новое значение : " + matrix[rowIndex][colIndex]);
        }else {
        System.out.println("Неверное значение индексов.");}
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {

        if (this.getRows() != otherMatrix.getRows()){return null;}
        if (this.getColumns() != otherMatrix.getColumns()){return null;}

        Matrix resultAdd = new Matrix(this.getRows(), this.getColumns());

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {

                resultAdd.setValueAt(i,j, this.getValueAt(i,j) + otherMatrix.getValueAt(i,j));
            }
        }
        return resultAdd;

    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {

        if (this.getRows() != otherMatrix.getRows()){return null;}
        if (this.getColumns() != otherMatrix.getColumns()){return null;}
        Matrix resultSub = new Matrix(this.getRows(), this.getColumns());

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {

                resultSub.setValueAt(i,j, this.getValueAt(i,j) - otherMatrix.getValueAt(i,j));
            }
        }
        return resultSub;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {

        if (this.getColumns() != otherMatrix.getRows()){return null;}
        Matrix resultMul = new Matrix(this.getRows(), this.getColumns());
        double sumMul = 0;

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                for (int k = 0; k < otherMatrix.getRows(); k++)

                resultMul.setValueAt(i,j, sumMul = sumMul + this.getValueAt(i,j + k) * otherMatrix.getValueAt(i + k,j));
            }
        }
        return resultMul;
    }

    @Override
    public IMatrix mul(double value) {

        Matrix resultMulValue = new Matrix(this.getRows(), this.getColumns());

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {

                resultMulValue.setValueAt(i,j, this.getValueAt(i,j) * value);
            }
        }
        return resultMulValue;
    }

    @Override
    public IMatrix transpose() {

        Matrix resultTranspose = new Matrix(this.getColumns(), this.getRows());

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {

                resultTranspose.setValueAt(j,i, this.getValueAt(i,j));
            }
        }
        return resultTranspose;
    }

    @Override
    public void fillMatrix(double value) {
double[][] fillMatrixOther = new double[this.getRows()][this.getColumns()];
        for (int i = 0; i < this.getRows(); i++){
            for (int j = 0; j < this.getColumns(); j++){
        fillMatrixOther[i][j] = value;
    }
}
        System.out.println("Создал дублирующую matrix матрицу и у нее заменил элементы на value : ");
        System.out.println(Arrays.deepToString(fillMatrixOther));
    }

    @Override
    public double determinant() {

        if (this.getRows() != this.getColumns()){
            System.out.println("Матрица не квадратная");
            return -1;
        }

        //Далее в данном методе ctrl+c and ctrl+v
        double res = 1, tmp;
        for (int i = 0, index = 0; i < this.getRows(); index = ++i) {
            for (int j = i + 1; j < this.getRows(); ++j)
                if (Math.abs(this.matrix[j][i]) > Math.abs(this.matrix[index][i]))
                    index = j;
            if (Math.abs(this.matrix[index][i]) <= 0.0) return 0.;
            if (index != i) res *= -1;
            for (int j = i; j < this.getRows(); ++j) {
                tmp = this.matrix[index][j];
                this.matrix[index][j] = this.matrix[i][j];
                this.matrix[i][j] = tmp;}
            for (int j = i + 1; j < this.getRows(); ++j) {
                tmp = this.matrix[j][i] / this.matrix[i][i];
                for (int k = i; k < this.getRows(); ++k)
                    this.matrix[j][k] -= tmp * this.matrix[i][k];}
            res *= this.matrix[i][i];}

        return res;
    }

    @Override
    public boolean isNullMatrix() {
        //matrix[2][2] = 0;
        double sumNotNull = 0;
        for (int i = 0; i < this.getRows(); i++){
            for (int j = 0; j < this.getColumns(); j++){
                if (matrix[i][j] > 0){
                    sumNotNull = sumNotNull + matrix[i][j];
                    //System.out.println(sumNotNull);
                }
            }
        }
        //System.out.println(sumNotNull);
        if (sumNotNull == 0){
            System.out.println("Нулева матрица.");
        return false;
        }else{
        System.out.println("Не нулевая матрица.");
        return true;}
    }

    @Override
    public boolean isIdentityMatrix() {
        int sumOne = 1;
        for (int i = 0; i < this.getRows(); i++){
            for (int j = 0; j < this.getColumns(); j++){
                if (i == j && matrix[i][j] == 1){
                 sumOne = sumOne + 1;
                }
            }
        }
        //System.out.println(sumOne);
        if (this.getRows() > this.getColumns() && sumOne == this.getColumns()){
            System.out.println("Матрица единичная.");
            return true;
        }

        if (this.getRows() < this.getColumns() && sumOne == this.getRows()){
            System.out.println("Матрица единичная.");
            return true;
        }

        if (this.getRows() == this.getColumns() && sumOne == this.getColumns()){
            System.out.println("Матрица единичная.");
            return true;
        }
        System.out.println("Матрица не единичная.");
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        if (this.getRows() != this.getColumns()){
            System.out.println("Матрица не квадратная.");
            return false;}
        System.out.println("Матрица квадратная.");
        return true;
    }

    @Override
    public void printToConsole() {
        double[][] resultPrintMatrix = new double[this.getRows()][this.getColumns()];
        System.out.println( "Выводим элементы массива построчно (один элемент заменен с помощью setValueAt) : ");
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
        resultPrintMatrix[i][j] = matrix[i][j];
                    }
                }
        System.out.println(Arrays.deepToString(resultPrintMatrix));
            }
}
