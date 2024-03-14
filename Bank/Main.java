import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int noOfAcc,operations,accId,recId;
        String id,name;
        Integer bal;
        Account acc;
        System.out.println("Enter the number of accounts to create: ");
        noOfAcc=sc.nextInt();
        Account accArr[]=new Account[noOfAcc];
        for(int i=0;i<noOfAcc;i++){
            System.out.println("Enter ID:");
            id=sc.next();
            System.out.println("Enter Name:");
            name=sc.next();
            System.out.println("Enter Account Balance:");
            bal=sc.nextInt();
            acc=new Account(id,name,bal);
            accArr[i]=acc;
        }
        do{
            
            operations=0;
            while(operations<9){
                System.out.println("Enter your choice:\n1-Credit\n2-Debit \n3-Transfer");
                operations=sc.nextInt();
                switch(operations) {
                    case 1:
                        System.out.println("Select the account");
                        display(accArr,noOfAcc);
                        accId=sc.nextInt()-1;
                        System.out.println("Enter amount to be added:");
                        int amt=sc.nextInt();
                        accArr[accId].credit(amt);
                        System.out.println(accArr[accId].getAll()+"\n");
                        break;
                    case 2:
                        System.out.println("Select the account");
                        display(accArr,noOfAcc);
                        accId=sc.nextInt()-1;
                        System.out.println("Enter amount to be deducted:");
                        int amount=sc.nextInt();
                        accArr[accId].debit(amount);
                        System.out.println(accArr[accId].getAll()+"\n");
                        break;
                    case 3:
                        System.out.println("Select the account");
                        display(accArr, noOfAcc);
                        accId=sc.nextInt()-1;
                        System.out.println("Select the account for the transfer");
                        recId=sc.nextInt()-1;
                        System.out.println("Enter amount to be transferred:");
                        int at=sc.nextInt();
                        accArr[accId].transferTo(accArr[recId],at);
                        for(int i=0;i<noOfAcc;i++)
                        {
                            System.out.println("Account"+"  "+(i+1)+" : "+accArr[i].getAll());
                        }
                        break;
                    default:
                        break;
                }
            }
        }while(operations>=1 && operations<4);
        sc.close();


    }
    public static void display(Account[] accArr,Integer noOfAcc) {
        for(int i=0;i<noOfAcc;i++)
        {
            System.out.println("Account"+"  "+(i+1)+" : "+accArr[i].getAll());
        }  
    }
}
