public class S_tring {

    public static void print(String s){
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));

        }
    }
    public static void main(String[] args) {
        String str=  "abcdefgh";
        System.out.println(str.charAt(5));
        print(str);
        // System.out.println(srt[2]);         //this is incorrect
        System.out.println(str.length());
        System.out.println(str.substring(2, 5)); //this will not include the 5th index->(n-1)
        System.out.println(str.substring(3)); //this will print the string from 3 to end 
        System.out.println(str.substring(1, 1)); //this will not going to give any thing
        System.out.println(str.contains("cde")); //this is true 
        System.out.println(str.concat("cdf"));   //this will concat the given string in end of the original string 





    }
}

