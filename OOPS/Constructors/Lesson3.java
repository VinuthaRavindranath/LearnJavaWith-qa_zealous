package OOPS.Constructors;

class Product{

    private int itemno;
    private String name;
    private double price;
    private int qty;

    public int getitemno(){
        return itemno;
    }

    public String getname(){
        return name;
    }

    public double getprice(){
        return price;
    }

    public void setprice(double price)
    {
        this.price=price;
    }

    public int getqty(){
        return qty;
    }

    public void setquantity(int i)
    {
        this.qty=i;
    }

    public Product(){
        itemno=1234;
        name="MI phone 15";
        price= 2500.50;
        qty=1;
    }

    public Product(int productId, String productName, double productPrice, int ProductQty){
        itemno=productId;
        name=productName;
        price=productPrice;
        qty=ProductQty;
    }

    public void displayProductDetails(){
        System.out.println(itemno +" "+ name +" "+price+" "+qty);
    }
}

class Customer{

    private int customerId;
    private String customerName;
    private String address;
    private int phoneNo;

    public int getcustomerId(){
        return customerId;
    }

    public String getcustomerName(){
        return customerName;
    }

    public String getaddress(){
        return address;
    }

    public void setaddress(String address)
    {
        this.address=address;
    }


    public int getphoneNo(){
        return phoneNo;
    }

    public void setphoneNo(int phoneNo)
    {
        this.phoneNo=phoneNo;
    }


    public Customer(){
        customerId= 2027;
        customerName="Vinutha";
        address ="No 12, abc , xyz road , Bangalore";
        phoneNo=999999991;

    }

    public Customer(int userId, String userName, String userAddress, int contactNo){
        customerId=userId;
        customerName =userName;
        address=userAddress;
        phoneNo=contactNo;
    }

    public void displayCustomerDetails(){
        System.out.println(customerId +" "+ customerName +" "+address+" "+phoneNo);
    }

}


public class Lesson3 {

    public static void main(String[] args) {
        Product skuInfo1 = new Product();
        skuInfo1.displayProductDetails();

        Product skuInfo2 = new Product(888, "Samsung phone", 3400.67,1);
        skuInfo2.displayProductDetails();
        

        Product skuInfo3 = new Product();
        skuInfo3.setprice(3500.99);
        skuInfo3.setquantity(2);
        skuInfo3.displayProductDetails();

        Customer userInfo = new Customer();
        userInfo.displayCustomerDetails();

        Customer userInfo2 = new Customer(2828, "Micky", "No 12, jhk , ddd road , Bangalore", 999999992);
        userInfo2.displayCustomerDetails();

        Customer userInfo3 = new Customer();
        userInfo3.setaddress("No 13, ttt , yyy road , Bangalore");
        userInfo3.setphoneNo(999999993);
        userInfo3.displayCustomerDetails();
}

}