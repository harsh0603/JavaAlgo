import java.util.Scanner;

public class Question11 {
    static String Compress(String str){
        String compress = "";
        int localCount=1;
        int i;

        for(i=0;i<str.length()-1;i++){
           if(str.charAt(i+1)==str.charAt(i)){
               localCount++;
           }else{
               if(localCount!=1){
                   compress= compress+str.charAt(i)+localCount;
               }else{
                   compress= compress+str.charAt(i);
               }
               localCount =1;
           }  
        }
        if(localCount!=1){
            compress= compress+ str.charAt(i)+localCount;
        }else{
            compress= compress+str.charAt(i);
        }

        return compress;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		String str = s.nextLine();

        String result = Compress(str);
        System.out.println(result);
        s.close();
        
    }
    
}
