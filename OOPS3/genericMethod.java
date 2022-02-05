
public class genericMethod {

    public static<T> void printArray(T a[]){ //declare the generic type before the return data type
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Integer a[] = new Integer[10]; //Can't declare the variable in the primitive type
        for(int i=0;i<10;i++){
            a[i] = i+1;
        }
        printArray(a);

        String s[] = new String[10];

        for(int i=0;i<s.length;i++){
            s[i] = "Harsh";
        }

        printArray(s);

    }
    
}
