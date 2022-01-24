public class Question4{

    static void reverse(String s){
        String [] words  = s.split("\\s");
        String output = "";
        for(int i = words.length-1;i>=0;i--){

            output += words[i]+" ";
        }

        for(int i = 0;i<output.length();i++){
            System.out.print(output.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "run fast to reach";
        reverse(str);
    }
}