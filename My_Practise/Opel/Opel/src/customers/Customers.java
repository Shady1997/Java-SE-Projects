package customers;

import invoice.Invoice;

public class Customers {
    //propertises
     int Customer_Id=0;
     String Customer_Name="";
    //Default Constructor
    public Customers()
    {}
    //Constructor ith parameters
    public Customers(int Customer_Id,String Customer_Name)
    {
        this.Customer_Id=Customer_Id;
        this.Customer_Name=Customer_Name;
        }
    public void Customer_Setter(int Customer_Id,String Invoice_Status)
    {
            this.Customer_Id=Customer_Id;
            this.Customer_Name=Customer_Name; 
        }
    public int Customer_Id_Getter()
    {
        return Customer_Id;
        }
    public String Customer_Status_Getter()
    {
        return Customer_Name;
        }
}
