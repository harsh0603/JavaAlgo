public class Question3 {
    static void subString(String str){
        for(int i = 0;i<str.length();i++){
            for(int j =i+1;j<=str.length();j++){
                System.out.println(str.substring(i, j));

            }
        }
    } 
    public static void main(String[] args) {
        String str = "Harsh";
        subString(str);
    }
    
}
