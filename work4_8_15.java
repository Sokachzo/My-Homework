//编程练习题 6.39 给出一个方法，用于测试三点是否在一条直线上。编写下面的方法，检测 points 数组中所有的点是否都在同一条直线上。
import java.util.Scanner;
public class work4_8_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        System.out.print("Enter five points:");
        double[][] points=new double[5][2];
        for(int i=0;i<points.length;i++){
            for(int j=0;j<points[i].length;j++){
                points[i][j]=input.nextDouble();
            }
        }
        if (sameLine(points))
            System.out.println("The five points are on the same line");
        else System.out.println("The five points are not on the same line");
    }
    public static boolean sameLine(double[][] points){
        double[] sentinel=new double[2];
        sentinel[0]=points[0][0];
        sentinel[1]=points[0][1];
        for(int i=1;i<points.length;i++) {
            for (int j=1;j<points[i].length;j++) {
                double just=(points[i][j-1]-sentinel[0])*(points[i-1][j]-sentinel[1])-(points[i][j]-sentinel[0])*(points[i-1][j-1]-sentinel[1]);
                if (just!=0){
                    return false;
                }
            }
        }
        return true;

	}

}
