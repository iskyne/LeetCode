package algorithms;
//304. Range Sum Query 2D - Immutable
public class NumMatrix {
    private int[][] matrix;
    private int[][] sum;
    public NumMatrix(int[][] matrix) {
        this.matrix=matrix;
        if(matrix.length!=0&&matrix[0].length!=0){
            sum=new int[matrix.length][matrix[0].length];
        }
        for(int i=0;i<matrix.length;i++){
            sum[i][0]=matrix[i][0];
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                sum[i][j]=sum[i][j-1]+matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int rslt=0;
        for(int i=row1;i<=row2;i++){
            rslt=rslt+(sum[i][col2]-sum[i][col1]+matrix[i][col1]);
        }
        return rslt;
    }
}

