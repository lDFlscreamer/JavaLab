package model;

public class Worker {
  private   double[][] matrix;
  private   int matrixSize;


    public Worker() {
        this.matrixSize=6;
        this.matrix=new double[matrixSize][matrixSize];
        autoGenerate();

    }

    public Worker(int matrixSize) {
        this.matrixSize = matrixSize;
        this.matrix=new double [matrixSize][matrixSize];
            autoGenerate();
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }

    private void autoGenerate(){
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                this.matrix[i][j]= -100 + (double) (Math.random() * 1000);
            }
        }

    }


    public double count(){
        double sum=0;
        boolean begin=false;

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
            if(begin)
                {
                    if(this.matrix[i][j]>0)
                      {
                          /*System.out.println("sum = "+ sum +"+" + matrix[i][j]);*/
                        sum+=matrix[i][j];

                      }
                    else
                        {
                                return sum;
                        }
                }
                else
                {
                    if(this.matrix[i][j]<0)
                    {
                        begin=true;
                    }
                }
            }
        }

        System.out.print("(one negative number)");
        return sum;
    }
}
