public class Question9 {
    public static void main(String[] args) {
        String str = "This is Question7";
    //     String st = "";
    //     int i=0;
        
    //     for(int k = 0;k<str.length();k++){
    //         if(str.charAt(k)==' ' || k == str.length()-1 ){
    //             for(int m=k;m>=i;m--){
    //                 st+=str.charAt(m);
    //             }
    //             st+=' ';
            
    //             i=k+1;
                
    //         }

    //     }

    //     for(int n = 0;n<st.length();n++){
    //         System.out.print(st.charAt(n));
    //     }



    StringBuffer s = new StringBuffer(str);
    str = s.reverse().toString();  //to convert the StringBuffer into String we use toString()
    System.out.println(str);

    String [] rev = str.split(" "); //this will save the words splitted with space in the String Array
    for(int i=0;i<rev.length;i++){
        System.out.print(rev[i]);
    }
    System.out.println();


    StringBuffer reverse = new StringBuffer();
    for(int j=rev.length-1;j>=0;j--){
        reverse.append(rev[j]).append(" "); //this will append the StringBuffer with rev words stored and a space
    }

    System.out.println(reverse.toString());

    }
    
}
