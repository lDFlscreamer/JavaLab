package view;

public class OutConsole {
  private   double[][] matrix;

    public OutConsole() {

        matrix=new double[6][6];
    }


    public void out(double matrix[][])
    {
        for (int i = 0; i < matrix.length;i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(String.format("%.2f ", matrix[i][j])+" ");
            }
            System.out.println("");
        }


    }
}
