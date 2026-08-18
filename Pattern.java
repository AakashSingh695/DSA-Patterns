import java.util.Scanner;
public class Pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the nymber of Rows:");
        int num = sc.nextInt();

        // Q-1
        // 1 1 1 1 1
        // 2 2 2 2 2 
        // 3 3 3 3 3 
        // 4 4 4 4 4
        // 5 5 5 5 5

        // for(int i =1 ;i<=num ;i++){
        //     for(int j = 1; j<=num;j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }



        // Q-2
        // 1 1 1 1 1
        // 0 0 0 0 0 
        // 1 1 1 1 1 
        // 0 0 0 0 0 
        // 1 1 1 1 1 
        //  for(int i =1 ;i<=num ;i++){
        //     for(int j = 1; j<=num;j++){
        //         if(i%2==0){
        //         System.out.print("0");}
        //         else{
        //             System.out.print("1");
        //         }
        //     }
        //     System.out.println();
        // }
        

        // Q-3
        // 1 2 3 4 5 
        // 1 2 3 4 5 
        // 1 2 3 4 5 
        // 1 2 3 4 5 
        // 1 2 3 4 5 
        

        //  for(int i =1 ;i<=num ;i++){
        //     for(int j = 1; j<=num;j++){
                
        //         System.out.print(j);
                
        //     }
        //     System.out.println();
        // }
}
}
