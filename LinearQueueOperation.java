import java.util.*;
public class LinearQueueOperation {
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
    //Declaration
    int []queue=new int[5];
    int max=queue.length;
    int rear=-1;
    int front=-1;
    Scanner s=new Scanner(System.in);

    //Methods
    void enqueue(){
        if(rear==max-1){
            System.out.println("Queue overflow !");
            return;
        }
        if(front==-1){
            front=0;
        }
        rear++;
        System.out.println("Enter element:");
        int item=s.nextInt();
        queue[rear]=item;
        System.out.println(item+"insert successfully..");
    }

    void dequeue(){
        if(front>rear || front==-1){
            System.out.println("Queue underflow !");
            return;
        }
        int item=queue[front];
        front++;
        System.out.println(item+"deleted successefully..");
    }

    void display(){
        if(front==-1){
            System.out.println("Queue empty !");
            return;
        }
        System.out.println("Queue elements are:");
        for(int i=front;i<=rear;i++){
            System.out.println(" "+queue[i]);
        }
        System.out.println("At present Rear= "+rear+" Front: "+front);
    }
    
}