import java.util.Scanner;
public class CircularQueueOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        QueueMethods sm=new QueueMethods();
        while(true){
            int choice;
            System.out.println("=======================");
            System.out.println("\t01.Enqueue");
            System.out.println("\t02.Dequeue");
            System.out.println("\t03.Display");
            System.out.println("\t04.Exit");
            System.out.println("=======================");
            System.out.println("");
            System.out.println("Enter your choice:");
            choice=sc.nextInt();
            System.out.println("Process working-----");
            switch(choice){
                case 1:sm.enqueue();
                    break;
                case 2:sm.dequeue();
                    break;
                case 3:sm.display();
                    break;
                case 4:System.out.println("Exit the program.......");
                sc.close();
                    return;
                default:System.out.println("Invalid input...try again!");
                
            }
        }
    }
}

class QueueMethods{
    int []queue=new int[5];
    int rear=-1;
    int front=-1;
    int max=queue.length;
    Scanner scc=new Scanner(System.in);

    void enqueue(){
        if((rear==max-1 && front==0)||(front==rear+1)){
            System.out.println("Queue overflow !");
            return;
        }
        System.out.println("Enter element:");
        int item=scc.nextInt();
        if(front==-1){
            rear=0;
            front=0;
        }else if(rear==max-1){
            rear=0;
        }else{
            rear++;
        }
        queue[rear]=item;
        System.out.println(item+" inserted successfully..");
    }

    void dequeue(){
        if(front==-1){
            System.out.println("Queue underflow !");
            return;
        }
        int item=queue[front];
        if(front==rear){
            front=-1;
            rear=-1;
        }else if(front==max-1){
            front=0;
        }else{
            front++;
        }
        System.out.println(item+" deleted successfully..");
    }

    void display(){
        if(front==-1){
            System.out.println("Queue is empty !");
            return;
        }
        System.out.println("Queue elements are:");
        if(front<=rear){
            for(int i=front;i<=rear;i++){
                System.out.println(""+queue[i]);
            }
        }else{
            for(int i=front;i<max;i++){
                System.out.println(""+queue[i]);
            }
        for(int i=0;i<=rear;i++){
            System.out.println(""+queue[i]);
        }
    }
    }
}