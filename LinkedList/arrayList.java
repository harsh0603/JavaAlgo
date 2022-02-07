
import java.util.ArrayList;


// public class arrayList {
//     public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<>(20); //20 is not the size of the arraylist but the capacity of the arrrayList 
//         arr.add(10);   //this add function will add the element in the respect index
//         arr.add(20);
//         arr.add(1,81);  //we can define the index and the element 
        
        
//         arr.clear();  //this will clear the whole arraylist
        
//         arr.add(30);
//         arr.add(40);
        
      
//         ArrayList<Integer> arr2 = new ArrayList<>();
//         arr2 = (ArrayList)arr.clone(); //this will make the shallow copy of the arr in arr2



//         System.out.println(arr2);


//         System.out.println(arr.size());
//         System.out.println(arr.get(1));  //this get function use to get the element on that index


//         arr.add(50);
//         arr.add(60);
//         arr.add(70);
//         arr.add(80);
//         arr.add(90);


//         for(int j: arr){
//             System.out.print(j+" ");
//         }
//         System.out.println();





//         arr.remove(3);  //this will remove the 60 from the arrayList 
        
//         System.out.println(arr.size());

//         Integer i=70;
//         arr.remove(i); //this will remove the 70 straightly

//         System.out.println(arr.size());


//         System.out.println(arr.set(0, 15)); //this will set the 0 index as 15 and will not increase the size
//         System.out.println(arr.size());


      


//     }
    
// }








// Question-> Remove the consecutive duplicates in the array





public class arrayList{

    public static ArrayList<Integer> remove(int arr[]){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                result.add(arr[i]);
            }
        }
        return result;

    }
    public static void main(String[] args) {
        int arr[] = {10,10,50,60,60,10};

        ArrayList<Integer> result = remove(arr);
        
        System.out.println(result);
        
    }
}




