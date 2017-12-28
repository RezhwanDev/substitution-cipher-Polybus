/*
-Rezhwan Sidiq Mahmod
-21/Nov/2017
-19:10
*/
package polybus;
    import java.util.Scanner;
        public class Polybus {
            
char alpha[][] = 
{  	
    {'A', 'B', 'C', 'D', 'E'},
    {'F', 'G', 'H', 'I', 'K'},
    {'L', 'M', 'N', 'O', 'P'},
    {'Q', 'R', 'S', 'T', 'U'},
    {'V', 'W', 'X', 'Y', 'Z'},
};

public void enc(){
    System.out.println("Enter Text ");
    Scanner sob = new Scanner(System.in);
    String s = sob.nextLine();
    s=s.toUpperCase();
    for (int i = 0; i < s.length(); i++) {
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 5; k++) {
                if (s.charAt(i) == alpha[j][k]) {
                    System.out.print(j+1);
                    System.out.print(k+1);
                    System.out.print(" ");
                }
            }
        }
    }
        System.out.println("");
            }    

public void dec(){
    System.out.println("Enter Number ");
    Scanner in = new Scanner(System.in);
    String  s=  in.nextLine();
    char [] str =s.toCharArray();
    for (int i = 0; i < s.length(); i=i+2) {
        int row = Integer.parseInt(String.valueOf(str[i]));
        int col = Integer.parseInt(String.valueOf(str[i+1]));
        System.out.print(alpha[row-1][col-1]+" ");
        }System.out.println("");
    }

    public static void main(String[] args) {
        Polybus cob = new Polybus();
            cob.enc();
            cob.dec();
    }
}
