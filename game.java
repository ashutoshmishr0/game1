import java.util.Scanner;

public class game {
    public static void main(String[] args) {
    Scanner scn =new Scanner(System.in);
    int n=(int)(Math.random()*100);
    int a=0,cout=0;
    System.out.println("Enter your name");
    String str=scn.nextLine();
    System.out.println("Hello ! " + str );
    System.out.println("chose number between 1 to 100");
    int p=scn.nextInt();
    while(a==0){
        
    if(p<n){
        System.out.println("greater number please");
        cout++;
    }
     else if(p>n){
        System.out.println("Lower number please");
        cout++;
    }
    else{
        System.out.println(str + " you win with : " + cout +" times ");
        a=1;
    }
    p=scn.nextInt();
    }
}
}
