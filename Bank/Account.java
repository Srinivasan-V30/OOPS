import java.util.ArrayList;

public class Account
{
    private String id;
    private String name;
    private Integer bal;

    Account(String id,String name){
        this.id=id;
        this.name=name;
    }
    Account(String id,String name,Integer bal){
        this.id=id;
        this.name=name;
        this.bal=bal;
    }
    public void setID(String id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setBal(Integer bal){
        this.bal=bal;
    }

    public String getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public Integer getBal(){
        return this.bal;
    }
    public ArrayList<Object> getAll(){
        ArrayList<Object> details=new ArrayList<Object>();
        details.add(id);
        details.add(name);
        details.add(bal);
        return details;
    }
    public Integer credit(Integer amt){
        this.bal+=amt;
        return this.bal;
    }
    public Integer debit(Integer amt){
        if (amt<=this.bal){
            this.bal-=amt;
        }
        else{
            System.out.println("Insufficient Balance");
        }
        return this.bal;
    }
    public Integer transferTo(Account acc,Integer amt){
        if (amt<=this.bal){
            acc.setBal(acc.getBal()+amt);
            this.bal-=amt;
        }
        else{
            System.out.println("Insufficient Balance");
        }
        return this.bal;
    }
}

    