package demo;
import java.util.Scanner;

public class ThreeArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Colleges :");
        int college = sc.nextInt();

        System.out.println("Enter the Number of Classes :");
        int classes = sc.nextInt();

        System.out.println("Enter the Number of Students :");
        int student = sc.nextInt();

        int [][][] arr = new int[college][classes][student];

        for(int  i=0; i<college; i++){
            for(int j=0; j<classes; j++){
                for(int k=0; k<student; k++){
                    System.out.println("Enter the Numbe of College"  + i + "Classes" + j + "Students" + k );
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("Details are :");
        for(int i=0; i<college; i++){
            for(int j=0; j<classes; j++){
                for(int k=0; k<student; k++){
                    System.out.println("College " + i + "Classes" + j + "Students" + k +":" + arr[i][j][k]);
                }
            }
        }




    }
    
}
