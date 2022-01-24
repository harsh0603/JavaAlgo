public class Question2 {

    static Boolean palindrome(String s){
        int size = (s.length()/2)-1;
        for(int i = 0;i<size;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;

            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "HarssraH";
        System.out.println(palindrome(str));

    }
}
