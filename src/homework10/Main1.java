package homework10;

public class Main1 {
    public static void main(String[] args) {
//        double[][] nums1 = {{2, 7, 5, 4},
//                            {1, 3, 21, 6},
//                            {5, 6, 4, 8}};

        double[][] nums1 = {{4,1},
                {1,2}};


//Проверка квадратная матрица
//        double[][] nums1 = {{0,0,0,0},
//                {0,0,0,0},
//                {0,0,0,0},
//                {0,0,0,0}};

        double[][] nums2 = {{1, 3, 7, 4},
                {2, 1, 2, 3},
                {5, 7, 8, 9},
                {5, 7, 8, 9}};

        Matrix matrix2= new Matrix(nums2);
        Matrix matrix1 = new Matrix(nums1);

        System.out.println("==========" + "\n" + "matrix1.getRows()" + " = " + matrix1.getRows() + "\n" + "==========");
        System.out.println("matrix1.getColumns()" + " = " + matrix1.getColumns() + "\n" + "==========");
        System.out.println("matrix1.getValueAt(2,2)"  + " = " + matrix1.getValueAt(2,2) + "\n" + "==========");
        //System.out.println("setValueAt()" + " = " + matrix1.setValueAt(2,2,2) + "\n" + "==========");
        matrix1.setValueAt(1,1,1);
        //value пришлось поменять для проверки детерминанта
        System.out.println("==========");

//        public static double sumMatrix{
//        double[][] nums2 = {{10, 10, 10, 10},
//                {10, 10, 10, 10},
//                {10, 10, 10, 10}};
//
//        }
//matrix1.add();

        //Создал дублирующую матрицу и у нее заменил значение элементов
        matrix1.fillMatrix(4);
        System.out.println("==========");

        //Важно не забывать, что элементу 2,2 присвоено значение 2
        matrix1.isNullMatrix();
        System.out.println("==========");

        matrix1.isIdentityMatrix();
        System.out.println("==========");


        matrix1.isSquareMatrix();
        System.out.println("==========");

        matrix1.printToConsole();
        System.out.println("==========");

        //IMatrix resultAdd = matrix1.add(matrix2);
        System.out.println("==========");
        System.out.println("ADD результат выводим через printToConsole(): ");
        //resultAdd.printToConsole();
        System.out.println("==========");
        //this - matrix1
        //other - matrix2

        //IMatrix resultSub = matrix1.sub(matrix2);
        System.out.println("==========");
        System.out.println("SUB результат выводим через printToConsole() : ");
        //resultSub.printToConsole();
        System.out.println("==========");

        //IMatrix resultMul = matrix1.mul(matrix2);
        System.out.println("==========");
        System.out.println("MUL результат выводим через printToConsole() : ");
        //resultMul.printToConsole();
        System.out.println("==========");


        double value = 7;
        //IMatrix resultMulValue = matrix1.mul(value);
        System.out.println("==========");
        System.out.println("MULValue результат выводим через printToConsole() : ");
        //resultMulValue.printToConsole();
        System.out.println("==========");

        //IMatrix resultTranspose = matrix1.transpose();
        System.out.println("==========");
        System.out.println("Transpose результат выводим через printToConsole() : ");
        //resultTranspose.printToConsole();
        System.out.println("==========");


        System.out.println("==========");
        double resultDet = matrix1.determinant();
        System.out.println("DET : " + resultDet);
        System.out.println("==========");


    }

}
