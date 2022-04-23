package lesson10;

public class Main1 {
    public static void main(String[] args) {
        double[][] nums1 = {{2, 1, 5, 4},
                            {1, 3, 6, 6},
                            {5, 6, 4, 8}};

        Matrix matrix1 = new Matrix(nums1);
        System.out.println(matrix1.getRows());
        System.out.println(matrix1.getColumns());
        System.out.println(matrix1.getValueAt(2,2));
    }
}
