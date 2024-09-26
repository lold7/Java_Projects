


public class random_student_score {
    public static void main(String[] args){
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int F = 0;

        int[] amount = new int[100];
        for (int i = 1 ; i <= amount.length ; i++){
            int x = (int) (Math.random()*101);
            if(x >= 80){
                A++;
            }
            else if (x >= 70 && x<80){
                B++;
            }
            else if (x >= 60 && x<70){
                C++;
            }
            else if (x >= 50 && x<60){
                D++;
            }
            else if (x<50){
                F++;
            }
        }
        int total = A+B+C+D+F;
        System.out.println("Student got A "+A);
        System.out.println("Student got B "+B);
        System.out.println("Student got C "+C);
        System.out.println("Student got D "+D);
        System.out.println("Student got F "+F);
        System.out.println("Total Student "+total );
    }
}
