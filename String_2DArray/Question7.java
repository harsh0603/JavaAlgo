
import java.util.Scanner;

public class Question7 {
    
    static Boolean permutation(String st1,String st2){
        if(st1.length()!=st2.length()){
            return false;
        }else{
            for(int i = 0;i<st1.length();i++){
                for(int j =0;j<st2.length();j++){
                    if(st2.charAt(j)==st1.charAt(i) && j<=st2.length()-1){
                        break;
                    }else if(st2.charAt(j)!=st1.charAt(i) && j==st2.length()-1){
                        return false;
                    }
                }

            }
        }
        return true;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(permutation(s1, s2));
        sc.close();
    }
}
