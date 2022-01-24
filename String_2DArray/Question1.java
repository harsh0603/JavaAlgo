public class Question1 {
    

    static int Count(String s){
        int count = 0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == ' ' && Character.isLetter(s.charAt(i+1)) && (i>0)) count++;

        }
        count++;
        return count;
    }
    public static void main(String[] args) {
        String str = "this is the best code";
        System.out.println("the total words is: "+Count(str));
    }
}
