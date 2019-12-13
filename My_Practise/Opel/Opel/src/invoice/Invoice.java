package invoice;

public class Invoice {
    //propertises
    public int Invoice_Id=0;
    String Invoice_Status="";
    //Default Constructor
    public Invoice()
    {}
    //Constructor ith parameters
    public Invoice(int Invoice_Id,String Invoice_Status)
    {
        this.Invoice_Id=Invoice_Id;
        this.Invoice_Status=Invoice_Status;
        }
    public void Invoice_Setter(int Invoice_Id,String Invoice_Status)
    {
            this.Invoice_Id=Invoice_Id;
            this.Invoice_Status=Invoice_Status; 
        }
    public int Invoice_Id_Getter()
    {
        return Invoice_Id;
        }
    public String Invoice_Status_Getter()
    {
        return Invoice_Status;
        }
}
