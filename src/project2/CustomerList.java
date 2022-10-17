package project2;

public class CustomerList {
    private Customer[] customers;
    private int total=0;

    public CustomerList(int totalCustomer){
        customers=new Customer[totalCustomer];
    }

    public boolean addCustomer(Customer customer){//添加customer
        if(total<customers.length){
            customers[total]=customer;
            total+=1;
            return true;
        }else{
            return false;
        }
    }

    public boolean replaceCustomer(int index,Customer cust){//修改客户
        if(index<=total ||index>=0){
            customers[index]=cust;
            return true;
        } else{
            return false;
        }
    }

    public boolean deleteCustomer(int index){//删除客户
        if(index>=0 ||index<total){
            for(int i=index+1;i<total;i++){
                customers[index]=customers[i];
            }
            customers[--total]=null;
//            total-=1;
            return true;
        }else {
            return false;
        }
    }

    public Customer[] getCustomers(){//获取所有客户
        Customer[] newCustomer= new Customer[total];
        for(int i=0;i<total;i++){
            newCustomer[i]=customers[i];
        }
        return newCustomer;
    }

    public Customer getCustomer(int index){//根据索引返回客户对象
        return customers[index];
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal(){
        return this.total;
    }
}
