import java.util.Scanner;

public class Check_score_student {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[] student = new int[8];

        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
    
        char[] key = {'D','B','D','C','C','D','A','E','A','D'};

        for (int i = 0 ; i < answers.length;i++){
            for (int j = 0 ; j < answers[i].length;j++){
                if (answers[i][j] == key[j]){
                    student[i] += 1;
                }
            }
        }
        for (int i = 0; i<student.length; i++ ){
            System.out.println("student " + i + " currect count is " + student[i]);
        }

    }
}
