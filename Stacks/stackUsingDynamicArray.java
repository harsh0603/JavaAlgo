
class StackEmptyException extends Exception
{
    String str1;
    StackEmptyException(String str){

        str1 = str;
    }
  
    public String toString(){
        return ("StackEmptyException: "+str1);
    }
}




public class stackUsingDynamicArray {
    private int data[];
         private int top;
         public stackUsingDynamicArray(int capacity){
             data = new int[capacity];
             top=-1;
         }

         public boolean isEmpty(){
             return (top==-1);
         }





         public int size(){
             return top+1;
         }






         public int top(){
            try{
                if(size()==0){
                throw new StackEmptyException("The stack is empty");
                }
            }catch(StackEmptyException e){

                System.out.println(e);
            }
            return data[top];
         }







         public void push(int element){
            top++;
             data[top]= element;
             if(size()==data.length){
                 doubleCapacity();
             }
         }






         private void doubleCapacity() {

            int temp[] = data;
            data = new int[2*temp.length];

            for(int i=0;i<temp.length;i++){
                data[i] = temp[i];
            }

        }

        public int pop(){
            
            try {
                if(size()==0){
                    throw new StackEmptyException("The stack is empty");
                }
            } catch (StackEmptyException e) {
                System.out.println(e);
            }
             int temp = data[top];
             top--;
             return temp;
         }


public static void main(String[] args) {
    stackUsingDynamicArray suda = new stackUsingDynamicArray(3);

    System.out.println(suda.size());

    for(int i=0;i<9;i++){ //this will work if the capacity od the array is doubled
        suda.push(i);
    }

    while(!suda.isEmpty()){
            System.out.println(suda.pop());
        
    }
}

    
}
