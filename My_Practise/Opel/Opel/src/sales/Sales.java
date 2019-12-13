package sales;

import invoice.Invoice;

public class Sales {
    //propertises
    public int Sales_Id=0;
    String Sales_Name="";
    //Default Constructor
    public Sales()
    {}
    //Constructor ith parameters
    public Sales(int Sales_Id,String Sales_Name)
    {
        this.Sales_Id=Sales_Id;
        this.Sales_Name=Sales_Name;
        }
    public void Sales_Setter(int Invoice_Id,String Invoice_Status)
    {
            this.Sales_Id=Sales_Id;
            this.Sales_Name=Sales_Name; 
        }
    public int Sales_Id_Getter()
    {
        return Sales_Id;
        }
    public String Invoice_Status_Getter()
    {
        return Sales_Name;
        }
}
