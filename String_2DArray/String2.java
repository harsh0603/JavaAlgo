public class String2 {

    static void printPrefix(String s){
         for(int i =0;i<s.length();i++){
             System.out.println(s.substring(0, i+1));
         }
    }



    public static void main(String[] args) {
        String str = "Harsh";
        str = str + "abc";
        System.out.println(str);
        System.out.println(str.concat("def")); // this will print only the new String as
        // not going to change in the original String
        System.out.println(str);


        String str1 = "harsh";
        String str2 = "harsh";

        if(str1 == str2){ //this will compare the stored address
            System.out.println("equal");  
        }else{

            System.out.println("unequal");
        }




        if(str1.equals(str2)){ //this will compare the elements in the Strings
            System.out.println("equal");
        }else{
            System.out.println("unequal");
        }


 
        str = "Harsh";
        printPrefix(str);


    }
}
