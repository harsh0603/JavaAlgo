


// class Pair<T>{
//     private T first;
//     private T second;

//     public Pair(T first,T second){
//         this.first = first;
//         this.second = second;
//     }

//     public T getFirst(){
//         return first;
//     }

//     public T getSecond(){
//         return second;

//     }












// this is to give two type of the generics in the same class









class Pair<T,V>{
    private T first;
    private V second;

    public Pair(T first,V second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }

    public V getSecond(){
        return second;

    }

}






public class generics {
    public static void main(String[] args) {
        
        
        
        // Use this code with the first commented class Pair
        
        // Pair<String> p = new Pair<String>("ab","cd");
        // Pair<Integer> p1 = new Pair<Integer>(24,17); //only canuse the class type data member not primitive type


        // Pair<Character> p2 = new Pair<>('a','b');  //in the new versions of the java we not need to define the type after the new key












    //    Pair<Integer,String> p3 = new Pair<Integer,String>(58,"Harsh");  //Two different data type can be generic
    //    Pair<String,String> p4 = new Pair<>("Harsh","Sharma");

        



    int a = 14;
    int b = 25;
    int c = 52;

    Pair<Integer,Integer> innerPair = new Pair<>(a,b);

    Pair<Pair<Integer,Integer>,Integer> p4 = new Pair<>(innerPair,c);

    System.out.println(p4.getSecond());
    System.out.println(p4.getFirst().getSecond());
    System.out.println(p4.getFirst().getFirst());

    }
    
}
