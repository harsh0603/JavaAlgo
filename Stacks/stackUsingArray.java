// Exceptions for the stack overflow and underflow




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



class StackOverflowException extends Exception{
    String str2;
    StackOverflowException(String str){
        str2=str;
    }

    public String toString(){
        return ("StackOverflowException: "+str2);
    }
}



// Four method are written 1. size()
//                         2. isEmpty()
//                         3. top()
//                         4. push()
//                         5. pop()



public class stackUsingArray {

         private int data[];
         private int top;
         public stackUsingArray(int capacity){
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
            try{
                if(size()==data.length){
                    throw new StackOverflowException("The stack is overflowed");
                }
            } catch (StackOverflowException e) {
                System.out.println(e);
            }

            
            
            top++;
             data[top]= element;
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
             stackUsingArray sua = new stackUsingArray(10);
             sua.push(1);
             sua.push(4);
             sua.push(6);
             sua.push(8);
             sua.push(9);
             sua.push(3);
             sua.push(9);

             System.out.println(sua.top());
             System.out.println(sua.pop());
             System.out.println(sua.pop());
             System.out.println(sua.pop());
             System.out.println(sua.pop());

             System.out.println(sua.top());

             System.out.println(sua.isEmpty());

             System.out.println(sua.size());
           

         }
    }

