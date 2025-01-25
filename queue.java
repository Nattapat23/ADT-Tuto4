import java.util.ArrayList;

public class queue {
    private int frist ,rear,size=0 ;
    private String print ="";
    private String[] array = new String[5];

    public queue(){
        this.frist = 0;
        this.rear=0;
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        if (array[0]== null) {
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if (array[4] != null) {
            return true;
        }else{
            return false;
        }
    }

    public void enqueue(String data){
        if (isFull()) {
        System.out.println("Queue is Full!!");
        System.out.println("Plese quite !");
        }else{
            size++;

            array[rear] = data;
            rear++;
            print += "Enqueue "+data+"\n [ "+array[0]+", "+array[1]+", "+array[2]+", "+array[3]+", "+array[4]+" ] "+" [first = "+frist+" , rear = "+rear+" , length = "+size+"] \n";
            
            

        }
    }

    public void dequeu(){
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
        }else{
        
            System.out.println("Dequeue "+array[frist]);
            frist++;
            size--;

            System.out.print("[ ");

            for(int i = frist ;i< 5;i++){
            
            if (i == 4) {
                System.out.print(array[i]+" ");
            }else{
                System.out.print(array[i]+", ");
            }
            }
            System.out.print(" ] ");
            System.out.println(" [first = "+frist+" , rear = "+rear+" , length = "+size+"] \n");
        }
    }

    public void print(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        }else{
            System.out.print(this.print);

            dequeu();
        
        }
         
    }

}
