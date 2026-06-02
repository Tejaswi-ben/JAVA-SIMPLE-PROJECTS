import java.util.*;
public class ElectricityBill {
    int consumerNo;
    String ConsumerName;
    int prevReading;
    int CurrReading;
    int EBconn;
    int units;
    double bill;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Consumer No:");
        consumerNo=sc.nextInt();
        System.out.println("Enter Consumer Name:");
        ConsumerName=sc.next();
        System.out.println("Enter Previous Reading:");
        prevReading=sc.nextInt();
        System.out.println("Enter Current Reading:");
        CurrReading=sc.nextInt();
        System.out.println(" EB Connection Type: 1. Domestic 2. Commercial");
        EBconn=sc.nextInt();
    }
    void calculate_bill(){
        units=CurrReading-prevReading;
        if(EBconn==1){
            if(units<=100){
                bill=units*1.5;
            }
            else if(units>100 && units<=200){
                bill=100*1.5+(units-100)*2.5;
            }
            else{
                bill=100*1.5+100*2.5+(units-200)*4;
            }
        }
        else if(EBconn==2){
            if(units<=100){
                bill=units*2.5;
            }
            else if(units>100 && units<=200){
                bill=100*2.5+(units-100)*4.5;
            }
            else{
                bill=100*2.5+100*4.5+(units-200)*6;
            }
        }
    }
    void display(){
        System.out.println("--------Electricity Bill-------");
        System.out.println("Consumer No:"+consumerNo);
        System.out.println("Consumer Name:"+ConsumerName);
        System.out.println("Previous Reading:"+prevReading);
        System.out.println("Current Reading:"+CurrReading);
        System.out.println("EB Connection Type:"+EBconn);
        System.out.println("Units Consumed:"+units);
        System.out.println("-----------------------------");
        System.out.println("Electricity Bill:"+bill);
    
    }
public static void main(String[]args){
ElectricityBill eb=new ElectricityBill();
eb.input();
eb.calculate_bill();
eb.display();

}
}