class NotEqualException extends Exception{
    public NotEqualException(String error){
        super(error);
    }
}

public class MatrixAddition {
    public void MatrixSum(int[][] a, int[][] b) throws NotEqualException {
        int rowA = a.length;
        int rowB = b.length;
        if (rowA == rowB) {
            for (int i = 0; i < rowA; i++) {
                int colA = a[i].length;
                int colB = b[i].length;
                if (colA == colB) {
                    for (int j = 0; j < colA; j++) {
                        a[i][j] = a[i][j] + b[i][j];
                    }
                } else {
                    throw new NotEqualException("Columns Don't Match");
                }
            }
        } else {
            throw new NotEqualException("Rows Don't Match");
        }
        for (int i = 0; i < rowA; i++)
            for (int j = 0; j < a[i].length; j++)
                System.out.println(a[i][j]);
    }

}
