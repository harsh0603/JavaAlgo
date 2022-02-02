import java.util.Arrays;

public class Question8 {
    public static void main(String[] args) {
        String str = "aaabccdee";
        char ch[] = str.toCharArray();
        int j=0;
        for(int i=1;i<str.length();i++){
            if(ch[j]!=ch[i]){
                j++;
                ch[j]=ch[i];
            }
        }


        System.out.println(Arrays.copyOfRange(ch, 0,j+1));
    }
}
