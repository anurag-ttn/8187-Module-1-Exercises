

class SpecialStack{
    int[] arr ;
    int head = -1;
    int capacity;
    SpecialStack(int n){
        capacity = n;
        arr = new int[n];
    }
    void push(int element){
        head++;
        if(head<capacity){
            arr[head] = element;
        }
        else{
            System.out.println("overflow");
        }
    }
    int pop(){
        if(head<0) return -10000;
        int val = arr[head];
        head--;
        return val;
    }
    boolean isFull(){
        if(head>=capacity) return true;
        return false;
    }


}




public class Q3 {
    public static void main(String[] args){
        SpecialStack s1 = new SpecialStack(100);
        s1.push(10);s1.push(20);s1.push(30);s1.push(22);
        System.out.println(s1.pop());
        System.out.println(s1.isFull());

    }
}
