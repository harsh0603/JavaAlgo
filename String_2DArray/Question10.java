// public class Question10 {
  

//     public static void main(String[] args) {
//         String str = "harsh is high at heights";
//         char c = 'h';
//         // toRemove(str, c);

//         char ch[] = str.toCharArray();
//         int j;
//         int count = 0;
//         for(int i=j=0;i<str.length();i++){
//             if(ch[i]!=c){  
//             ch[j++]= ch[i];  //this will adjust the characters after and if not meet the condition
//             }else{
//                 count++; //this will take the the track of the repeated elements in the last to nullifiy them 
//             }
//         }
//         while(count>0){           
//             ch[j++] = '\0';     //adding null to all repeated once 
//             count--;
//         }

//         System.out.println(ch);

//         // System.out.println(str);
//     }

// }











public class Question10{
   static final int ASCII_SIZE = 256;
    static char Count(String str){

        int arr[] = new int[ASCII_SIZE];

        int len = str.length();
        for(int i=0;i<len;i++){
            arr[str.charAt(i)]++;
        }

        int max = -1;
        char result = ' ';
        for(int i=0;i<len;i++){
            if(max<arr[i]){
                max = arr[i];
                result = str.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "harshhigh";
        System.out.println(Count(str)); 


    }
}
