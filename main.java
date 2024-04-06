import java.util.Scanner;
class Manager implements system
{
    String Name;
    private String Password;
    public static int count=0;
    public Manager(){}
    public Manager(String Name, String Password)
    {
        this.Name=Name;
        this.Password=Password;
        count++;
    }
    public void setDetails()
    {
        while (true){
            System.out.println("Enter field you want to set");
            System.out.println("Name or Password or exit");
            Scanner sc = new Scanner(System.in);
            String choice=sc.nextLine();
            if(choice.equalsIgnoreCase("Name"))
            {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Enter new Name");
                String newName=sc1.nextLine();
                this.Name=newName;
                System.out.println("Name has been updated to "+newName);
            }
            else if(choice.equalsIgnoreCase("PASSWORD"))
            {
                Scanner sc2=new Scanner(System.in);
                System.out.println("Enter new Password");
                String newPassword=sc2.nextLine();
                this.Password=newPassword;
                System.out.println("Password has been updated");
            }
            else
            break;
        }
    }
    public void getDetails()
    {
        while (true){
            System.out.println("Enter field you want to know");
            System.out.println("Name or  exit");
            Scanner sc = new Scanner(System.in);
            String choice=sc.nextLine();
            if(choice.equalsIgnoreCase("Name"))
            {
                System.out.println("Manager name: "+this.Name);
                break;
            }
            
            else
            break;
        }
    }
    public int chechPassword(String Pwd)
    {
        if(this.Password.equals(Pwd))
        return 1;
        else
        return 0;
        
    }
}
abstract class Showroom implements system
{
    String SName, Dealer;
    int VehicleId[] = new int[10];
    
    public void setetails()
    {
       while (true){
            System.out.println("Enter field you want to set");
            System.out.println("ShowroomName or Dealer or Vehicle or exit");
            Scanner sc = new Scanner(System.in);
            String choice=sc.nextLine();
            if(choice.equalsIgnoreCase("ShowroomName"))
            {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Enter Showroom Name");
                String newName=sc1.nextLine();
                this.SName=newName;
                System.out.println("Name has been updated to "+newName);
            }
            else if(choice.equalsIgnoreCase("Dealer"))
            {
                Scanner sc2=new Scanner(System.in);
                System.out.println("Enter Dealer");
                String newDealer=sc2.nextLine();
                this.Dealer=newDealer;
                System.out.println("Dealer has been updated");
            }
            else if(choice.equalsIgnoreCase("Vehicle"))
            {
                Scanner sc3=new Scanner(System.in);
                System.out.println("Enter new vehicleID");
                int newID=sc3.nextInt();
                for(int i=0; i<10; i++)
                {
                    if(this.VehicleId[i]==0)
                    {
                    VehicleId[i]=newID;
                    break;
                    }
                }
                System.out.println("vehicleID has been added");
            }
            else
            break;
        } 
    }
    public void getDetails()
    {
        System.out.println("Showroom "+this.SName+" is managed by "+this.Dealer);
    }
    
}
class Dealer extends Showroom
{
    private String  Password;
    String Name, ID;
    public static int count=0;
    public Dealer(String Name, String ID, String Password, String SName)
    {
        this.Name=Name;
        this.ID=ID;
        this.Password=Password;
        this.SName=SName;
        this.Dealer=Name;
        for (int i=0; i<this.VehicleId.length; i++)
        this.VehicleId[i]=0;
        count++;
    }
    public int chechPassword(String pwd)
    {
        if(this.Password.equals(pwd))
        return 1;
        else
        return 0;
    }
    public void setDetails()
    {
        while (true){
            System.out.print("Enter field you want to update:");
            Scanner sc = new Scanner(System.in);
            String choice=sc.nextLine();
            if(choice.equalsIgnoreCase("Name"))
            {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Enter Dealer's Name");
                String newName=sc1.nextLine();
                this.Name=newName;
                System.out.println("Name has been updated to "+newName);
            }
            else if(choice.equalsIgnoreCase("password"))
            {
                Scanner sc2=new Scanner(System.in);
                System.out.println("Enter password");
                String newPassword=sc2.nextLine();
                this.Password=newPassword;
                System.out.println("Dealer password has been updated");
            }
            else if(choice.equalsIgnoreCase("id"))
            {
                Scanner sc2=new Scanner(System.in);
                System.out.println("Enter new ID");
                String newID=sc2.nextLine();
                this.ID=newID;
                System.out.println("Dealer ID has been updated");
            }
            else
            break;
        }
    }
    public void getDetails()
    {
        System.out.println(this.ID+" \t"+Name+" \t"+SName);
    }
}
class Customer implements system
{
   private String Password, address;
   String ID, Name;
   private long phoneNumber;
   static int count=0;
   public Customer(String Name, String ID, String Password, String address, long phoneNumber)
   {
       this.Name=Name;
       this.ID=ID;
       this.Password=Password;
       this.address=address;
       this.phoneNumber=phoneNumber;
       count++;
   }
   public int chechPassword(String pwd)
   {
       if(this.Password.equals(pwd))
       return 1;
       else
       return 0;
   }
   public void getDetails()
   {
       System.out.println(Name+" \t "+ID+" \t "+phoneNumber +" \t "+address);
   }
   public void setDetails()
   {
       while (true){
            System.out.println("Enter field you want to update");
            System.out.println("Name or ID or Password or address or exit");
            Scanner sc = new Scanner(System.in);
            String choice=sc.nextLine();
            if(choice.equalsIgnoreCase("Name"))
            {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Enter Name");
                String newName=sc1.nextLine();
                this.Name=newName;
                System.out.println("Name has been updated to "+newName);
            }
            else if(choice.equalsIgnoreCase("id"))
            {
                Scanner sc2=new Scanner(System.in);
                System.out.println("Enter ID");
                String newID=sc2.nextLine();
                this.ID=newID;
                System.out.println("CustomerID has been updated");
            }
            else if(choice.equalsIgnoreCase("Password"))
            {
                Scanner sc2=new Scanner(System.in);
                System.out.println("Enter Password");
                String newPassword=sc2.nextLine();
                this.Password=newPassword;
                System.out.println("Customer password has been updated");
            }
            else if(choice.equalsIgnoreCase("address"))
            {
                Scanner sc2=new Scanner(System.in);
                System.out.println("Enter address");
                String newaddress=sc2.nextLine();
                this.address=newaddress;
                System.out.println("Customer address has been updated");
            }
            else if(choice.equalsIgnoreCase("phoneNumber"))
            {
                Scanner sc2=new Scanner(System.in);
                System.out.println("Enter phoneNumber");
                while(true)
                {
                    int count=0;
                    long newphone=sc2.nextInt();
                    long temp=newphone;
                    while(temp>0)
                    {
                        temp/=10;
                        count++;
                    }
                    if(count==10)
                    {
                    this.phoneNumber=newphone;
                    break;
                    }
                    else
                    System.out.println("Enter correct phone number");
                }
                
                System.out.println("CustomerID has been updated");
            }
            else
            break;
       }
   }
   
}
abstract class Sales implements system
{
    String SaleID, DealerID, CustomerID, VehicleID;
    static int count=0;
    public Sales(){}
    public void set(String Sale, String Customer, String Dealer, String Vehicle)
    {
        this.SaleID=Sale;
        this.CustomerID=Customer;
        this.DealerID=Dealer;
        this.VehicleID=Vehicle;
        count++;
    }
    public void setDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SaleID, CustomerID, DealerID, and vehicleID respectively");
        String Sale=sc.nextLine();
        String Customer=sc.nextLine();
        String Dealer=sc.nextLine();
        String Vehicle=sc.nextLine();
        set(Sale, Customer, Dealer, Vehicle);
    }
}
class Transactions extends Sales
{
    int TransactionID;
    int instalements[]=new int[24];
    String Dates[]=new String[24];
    int Amount[]=new int[24];
    public static int count=0;
    public Transactions(String Sale, String Customer, String Dealer, String Vehicle, int TransactionID)
    {
        count++;
        set( Sale,  Customer, Dealer, Vehicle);
        this.TransactionID=TransactionID;
        for(int i=0; i<24; i++)
        {
            instalements[i]=0;
            Dates[i]="";
            Amount[i]=0;
        }
    }
    public void setDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("set \n1.paymentDetails\n2.exit");
        String choice=sc.nextLine();
        if(choice.equalsIgnoreCase("paymentDetails")||choice.equals("1"))
        {
            System.out.println("Enter Date:");
            Scanner sc1=new Scanner(System.in);
            String newdate=sc1.nextLine();
            System.out.println("Enter amount:");
            int newamount=sc1.nextInt();
            int sum=0;
            for(int i=0; i<24; i++)
            {
                if(Dates[i]=="")
                {
                    Dates[i]=newdate;
                    Amount[i]=newamount;
                    instalements[i]+=1;
                    sum+=Amount[i];
                    break;
                }
            }
        }
        
    }
    public void getDetails()
    {
        System.out.println(VehicleID+" \t "+CustomerID+" \t "+SaleID+" \t "+TransactionID);
    }
}
class Vehicle implements system
{
    String CarName,ModelNumber,fuelType;
    int milage;
    public void setDetails()
    {
         while (true){
            System.out.println("Enter field you want to set");
            System.out.println("CarName or modelnumber or fueltype or milage exit");
            Scanner sc = new Scanner(System.in);
            String choice=sc.nextLine();
            if(choice.equalsIgnoreCase("CarName"))
            {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Enter new Name");
                String newName=sc1.nextLine();
                this.CarName=newName;
                System.out.println("CarName has been updated to "+newName);
            }
            else if(choice.equalsIgnoreCase("modelnumber"))
            {
                Scanner sc2=new Scanner(System.in);
                System.out.println("Enter new modelnumber");
                String newmodel=sc2.nextLine();
                this.ModelNumber=newmodel;
                System.out.println("model Number has been updated");
            }
            else if(choice.equalsIgnoreCase("fueltype"))
            {
                Scanner sc2=new Scanner(System.in);
                System.out.println("Enter new fueltype");
                String newfuel=sc2.nextLine();
                this.fuelType=newfuel;
                System.out.println("Fuel Type has been updated to "+newfuel);
            }
            else if(choice.equalsIgnoreCase("milage"))
            {
                Scanner sc2=new Scanner(System.in);
                System.out.println("Enter milage ");
                int newmilage=sc2.nextInt();
                this.milage=newmilage;
                System.out.println("Milage has been updated to "+newmilage);
            }
            else
            break;
        }
    }
    public void getDetails(){}
}
class Car extends Vehicle
{
    private String Color, GearType;
    String CarID;
    int Price;
    public static int count;
    public Car( String CarName, String ModelNumber, String fuelType, int milage, String CarID, String Color, String GearType, int Price)
    {
        this.CarName=CarName;
        this.ModelNumber=ModelNumber;
        this.fuelType=fuelType;
        this.milage=milage;
        this.CarID=CarID;
        this.Color=Color;
        this.GearType=GearType;
        this.Price=Price;
        count++;
    }
    public void setDetails()
    {
        while (true){
            System.out.println("Enter field you want to set");
            System.out.println(" CarID or  color or price or GearType or exit");
            Scanner sc = new Scanner(System.in);
            String choice=sc.nextLine();
            if(choice.equalsIgnoreCase("carid"))
            {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Enter new ID");
                String newID=sc1.nextLine();
                this.CarID=newID;
                System.out.println("CarID has been updated to "+CarID);
            }
            else if(choice.equalsIgnoreCase("color"))
            {
                Scanner sc2=new Scanner(System.in);
                System.out.println("Enter new color");
                String newcolor=sc2.nextLine();
                this.Color=newcolor;
                System.out.println("Color has been updated");
            }
            else if(choice.equalsIgnoreCase("price"))
            {
                Scanner sc2=new Scanner(System.in);
                System.out.println("Enter Price");
                int newPrice=sc2.nextInt();
                this.Price=newPrice;
                System.out.println("Price has been updated to "+newPrice);
            }
            else if(choice.equalsIgnoreCase("Gear Type"))
            {
                Scanner sc2=new Scanner(System.in);
                System.out.println("Enter new Gear Type");
                String newgear=sc2.nextLine();
                this.GearType=newgear;
                System.out.println("Gear Type has been updated");
            }
            else
            break;
       }
    }
    public void getDetails()
    {
        System.out.println(CarName+" \t"+ModelNumber+" \t "+milage+" \t"+fuelType+
        " \t "+CarID+"\t"+Color+"\t"+Price+"\t"+GearType);
    }
}
class Bike extends Vehicle
{
   private String  Color;
   String BikeID;
    int Price;
    public static int count;
    public Bike( String CarName, String ModelNumber, String fuelType, int milage, String BikeID, String Color, int Price)
    {
        this.CarName=CarName;
        this.ModelNumber=ModelNumber;
        this.fuelType=fuelType;
        this.milage=milage;
        this.BikeID=BikeID;
        this.Color=Color;
        this.Price=Price;
        count++;
    }
    public void setDetails()
    {
        while (true){
            System.out.println("Enter field you want to set");
            System.out.println(" BikeID or  color or price or exit");
            Scanner sc = new Scanner(System.in);
            String choice=sc.nextLine();
            if(choice.equalsIgnoreCase("BikeID"))
            {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Enter new ID");
                String newID=sc1.nextLine();
                this.BikeID=newID;
                System.out.println("BikeID has been updated to "+BikeID);
            }
            else if(choice.equalsIgnoreCase("color"))
            {
                Scanner sc2=new Scanner(System.in);
                System.out.println("Enter new color");
                String newcolor=sc2.nextLine();
                this.Color=newcolor;
                System.out.println("Color has been updated");
            }
            else if(choice.equalsIgnoreCase("price"))
            {
                Scanner sc2=new Scanner(System.in);
                System.out.println("Enter Price");
                int newPrice=sc2.nextInt();
                this.Price=newPrice;
                System.out.println("Price has been updated to "+newPrice);
            }
            else
            break;
       }
    }
    public void getDetails()
    {
        System.out.println(CarName+" \t"+ModelNumber+" \t "+milage+" \t"+fuelType+
        " \t "+BikeID+"\t"+Color+"\t"+Price);
    }
    
}
interface system{  
void setDetails(); 
void getDetails();  
}  
public class Main
{
    	static Manager m[]=new Manager[5];
		static Dealer d[]=new Dealer[5];
		static Customer c[]=new Customer[10];
		static Car cars[]=new Car[10];
		static Bike bikes[]=new Bike[10];
		static Transactions t[]=new Transactions[5];
    public static void ManagerMenu(int index){
        while(true)
        {
            System.out.println("Welcome "+m[index].Name);
            System.out.println("1.Dealers\n2.Customers\n3)Vehicle details\n");
            Scanner sc = new Scanner(System.in);
            String choice=sc.nextLine();
           if(choice.equalsIgnoreCase("Dealers")||choice.equals("1"))
            {
                System.out.println("                 Dealers");
                System.out.println("___________________________________________________");
                System.out.println("1.Add new dealer\n2.Existing dealers list\n3.Change dealer details\n4.Sales made");
                Scanner sc2 = new Scanner(System.in);
                int choice1=sc2.nextInt();
                if(choice1==1){
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("\nEnter details");
                    System.out.print("Dealer Name:");
                    String Name=sc3.nextLine();
                    System.out.print("ID:");
                    String ID=sc3.nextLine();
                    System.out.print("Password:");
                    String Password=sc3.nextLine();
                    System.out.print("Showroom:");
                    String Sname=sc3.nextLine();
                    d[Dealer.count]=new Dealer(Name, ID, Password, Sname);
                    System.out.println("\nNew dealer added successfully");
                }
                if(choice1==2){
                    System.out.println("___________________________________________________________");
                    System.out.println("ID"+" \t "+"Name"+" \t "+"showroom");
                    System.out.println("___________________________________________________________");
                    for(int i=0; i<Dealer.count; i++){
                        d[i].getDetails();
                    }
                }
                if(choice1==3){
                    System.out.println("___________________________________________________________");
                    System.out.println("ID"+" \t "+"Name"+" \t "+"showroom");
                    System.out.println("___________________________________________________________");
                    for(int i=0; i<Dealer.count; i++){
                        d[i].getDetails();
                    }
                    System.out.print("\nEnter id:");
                    Scanner sc1 = new Scanner(System.in);
                    String userid=sc1.nextLine();
                    for(int i=0; i<Dealer.count; i++){
                        if(userid.equals(d[i].ID))
                            d[i].setDetails();
                    }
                }
                if(choice1==4){
                    System.out.println("___________________________________________________________");
                    System.out.println("ID"+" \t "+"Name"+" \t "+"showroom");
                    System.out.println("___________________________________________________________");
                    for(int i=0; i<Dealer.count; i++){
                        d[i].getDetails();
                    }
                    System.out.print("\nEnter id:");
                    Scanner sc1 = new Scanner(System.in);
                    String userid=sc1.nextLine();
                    System.out.println("Sales made by dealer "+userid+" are");
                    System.out.println("___________________________________________________________");
                    System.out.println("Vehicle id"+" \t "+"Customer id"+" \t "+"sale id\t"+"Transaction id");
                    System.out.println("___________________________________________________________");
                    for(int i=0; i<Transactions.count; i++){
                        if(userid.equals(t[i].DealerID)){
                            t[i].getDetails();
                        }
                    }
                }
            }
            if(choice.equalsIgnoreCase("customers")||choice.equals("2")){
                System.out.println("                 Customers");
                System.out.println("___________________________________________________");
                System.out.println("1.Add new customer\n2.Existing customers list\n"+
                "3.Change customer details\n4.vehicles bought");
                Scanner sc2 = new Scanner(System.in);
                int choice1=sc2.nextInt();
                if(choice1==1){
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("\nEnter details");
                    System.out.println("Customer Name:");
                    String Name=sc3.nextLine();
                    System.out.println("ID:");
                    String ID=sc3.nextLine();
                    System.out.println("Password:");
                    String Password=sc3.nextLine();
                    System.out.println("Address:");
                    String Address=sc3.nextLine();
                    System.out.println("Phone number");
                    long phoneNumber=sc3.nextLong();
                    c[Customer.count]=new Customer(Name, ID, Password, Address, phoneNumber);
                    System.out.println("\nNew customer added successfully");
                }
                if(choice1==2){
                    System.out.println("___________________________________________________________");
                    System.out.println("Name"+" \t "+"Id"+" \t "+"Phone number"+" \t "+"City");
                    System.out.println("___________________________________________________________");
                    for(int i=0; i<Customer.count; i++){
                        c[i].getDetails();
                    }
                }
                if(choice1==3){
                    System.out.println("___________________________________________________________");
                    System.out.println("Name"+" \t "+"Id"+" \t "+"Phone number"+" \t "+"City");
                    System.out.println("___________________________________________________________");
                    for(int i=0; i<Customer.count; i++){
                        c[i].getDetails();
                    }
                    System.out.print("\nEnter id:");
                    Scanner sc1 = new Scanner(System.in);
                    String userid=sc1.nextLine();
                    for(int i=0; i<Customer.count; i++){
                        if(userid.equals(c[i].ID))
                            c[i].setDetails();
                    }
                }
                if(choice1==4){
                    System.out.println("___________________________________________________________");
                    System.out.println("Name"+" \t "+"Id"+" \t "+"Phone number"+" \t "+"City");
                    System.out.println("___________________________________________________________");
                    for(int i=0; i<Customer.count; i++){
                        c[i].getDetails();
                    }
                    System.out.print("\nEnter id:");
                    Scanner sc1 = new Scanner(System.in);
                    String userid=sc1.nextLine();
                    System.out.println("Vehicles bought by "+userid+" is/are");
                    System.out.println("___________________________________________________________");
                    System.out.println("Vehicle id"+" \t "+"Customer id"+" \t "+"sale id\t"+"Transaction id");
                    System.out.println("___________________________________________________________");
                    for(int i=0; i<Transactions.count; i++){
                        if(userid.equals(t[i].CustomerID)){
                            t[i].getDetails();
                        }
                    }
                }
            }
            if(choice.equalsIgnoreCase("Vehicle details")||choice.equals("3")){
                System.out.println("                 Customers");
                System.out.println("___________________________________________________");
                System.out.println("1.Add new vehicles\n2.Existing vehicles list\n3.Change vehicle details");
                Scanner sc5 = new Scanner(System.in);
                int choice1=sc5.nextInt();
                if(choice1==1){
                    System.out.println("1.For Car\n2.For Bike");
                    Scanner sc6 = new Scanner(System.in);
                    int choice3=sc6.nextInt();
                if(choice3==1){
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("\nEnter details");
                    System.out.println("Car Name:");
                    String CarName=sc3.nextLine();
                    System.out.println("Model number");
                    String ModelNumber=sc3.nextLine();
                    System.out.println("Fuel Type");
                    String fuelType=sc3.nextLine();
                    System.out.println("Milage");
                    int milage=sc3.nextInt();
                    System.out.println("Car ID");
                    String CarID=sc3.nextLine();
                    System.out.println("Color");
                    String Color=sc3.nextLine();
                    System.out.println("Gear Type");
                    String GearType=sc3.nextLine();
                    System.out.println("price");
                    int price=sc3.nextInt();
                    cars[Car.count]=new Car(CarName, ModelNumber, fuelType,  milage, CarID, Color, GearType, price);
                    System.out.println("\nNew Car added successfully");
                }        
                if(choice3==2){
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("\nEnter details");
                    System.out.println("Bike Name:");
                    String CarName=sc3.nextLine();
                    System.out.println("Model number");
                    String ModelNumber=sc3.nextLine();
                    System.out.println("Fuel Type");
                    String fuelType=sc3.nextLine();
                    System.out.println("Milage");
                    int milage=sc3.nextInt();
                    System.out.println("Bike ID");
                    String BikeID=sc3.nextLine();
                    System.out.println("Color");
                    String Color=sc3.nextLine();
                    System.out.println("price");
                    int price=sc3.nextInt();
                    bikes[Bike.count]=new Bike(CarName, ModelNumber, fuelType, milage, BikeID, Color, price);
                    System.out.println("\nNew Bike added successfully");
                }
            }
                if(choice1==2){
                    System.out.println("\n            Cars :");
                    System.out.println("______________________________________");
                    System.out.println("______________________________________");
                    System.out.println("Car Name\tModel no\tMilage\tFuel Type\tCar ID\tColor\tPrice\tGear type");
                    System.out.println("______________________________________");
                    for(int i=0; i<Car.count; i++)
                    cars[i].getDetails();
                    System.out.println("\n            Bikes :");
                    System.out.println("______________________________________");
                    System.out.println("______________________________________");
                    System.out.println("Car Name\tModel no\tMilage\tFuel Type\tCar ID\tColor\tPrice\tGear type");
                    System.out.println("______________________________________");
                    for(int i=0; i<Bike.count; i++)
                    bikes[i].getDetails();
                }
                if(choice1==3){
                    System.out.println("\n            Cars :");
                    System.out.println("______________________________________");
                    System.out.println("______________________________________");
                    System.out.println("Car Name\tModel no\tMilage\tFuel Type\tCar ID\tColor\tPrice\tGear type");
                    System.out.println("______________________________________");
                    for(int i=0; i<Car.count; i++)
                    cars[i].getDetails();
                    System.out.println("\n            Bikes :");
                    System.out.println("______________________________________");
                    System.out.println("______________________________________");
                    System.out.println("Car Name\tModel no\tMilage\tFuel Type\tCar ID\tColor\tPrice\tGear type");
                    System.out.println("______________________________________");
                    for(int i=0; i<Bike.count; i++)
                    bikes[i].getDetails();
                    System.out.print("Enter id:");
                    Scanner sc1 = new Scanner(System.in);
                    String userid=sc1.nextLine();
                    for(int i=0; i<Car.count; i++){
                        if(userid.equals(cars[i].CarID))
                        cars[i].setDetails();
                    }
                    for(int i=0; i<Bike.count; i++){
                        if(userid.equals(bikes[i].BikeID))
                        bikes[i].setDetails();
                    }
                }
            }
            System.out.print("\nDo you want to return back:(y/n)");
            Scanner sc10 = new Scanner(System.in);
            String choice2=sc10.nextLine();
            if(choice2.equalsIgnoreCase("n"))
            break;
        }
    }
    public static void DealerMenu(int index){
        while(true)
        {
            System.out.println("Welcome "+d[index].Name);
            System.out.println("Enter your choice");
            System.out.println("1)Vehicles sold\n2)Customers\n3)Existing Vehicles\n4.Sale");
            Scanner sc = new Scanner(System.in);
            String choice=sc.nextLine();
            if(choice.equalsIgnoreCase("vehicles sold")||choice.equals("1"))
            {
                String userid=d[index].ID;
                System.out.println("___________________________________________________________");
                System.out.println("Vehicle id"+" \t "+"Customer id"+" \t "+"sale id\t"+"Transaction id");
                System.out.println("___________________________________________________________");
                    for(int i=0; i<Transactions.count; i++){
                        if(userid.equals(t[i].DealerID)){
                            t[i].getDetails();
                        }
                    }
            }
            if(choice.equalsIgnoreCase("customers")||choice.equals("2")){
                System.out.println("                 Customers");
                System.out.println("___________________________________________________");
                System.out.println("1.Add new customer\n2.Existing customers list\n"+
                "3.Change customer details\n4.vehicles bought");
                Scanner sc2 = new Scanner(System.in);
                int choice1=sc2.nextInt();
                if(choice1==1){
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("\nEnter details");
                    System.out.print("Customer Name:");
                    String Name=sc3.nextLine();
                    System.out.print("ID:");
                    String ID=sc3.nextLine();
                    System.out.print("Password:");
                    String Password=sc3.nextLine();
                    System.out.print("Address:");
                    String Address=sc3.nextLine();
                    System.out.print("Phone number");
                    long phoneNumber=sc3.nextLong();
                    c[Customer.count]=new Customer(Name, ID, Password, Address, phoneNumber);
                    System.out.println("\nNew customer added successfully");
                }
                if(choice1==2){
                    System.out.println("___________________________________________________________");
                    System.out.println("Name"+" \t "+"Id"+" \t "+"Phone number"+" \t "+"City");
                    System.out.println("___________________________________________________________");
                    for(int i=0; i<Customer.count; i++){
                        c[i].getDetails();
                    }
                }
                if(choice1==3){
                    System.out.println("___________________________________________________________");
                    System.out.println("Name"+" \t "+"Id"+" \t "+"Phone number"+" \t "+"City");
                    System.out.println("___________________________________________________________");
                    for(int i=0; i<Customer.count; i++){
                        c[i].getDetails();
                    }
                    System.out.print("\nEnter id:");
                    Scanner sc1 = new Scanner(System.in);
                    String userid=sc1.nextLine();
                    for(int i=0; i<Customer.count; i++){
                        if(userid.equals(c[i].ID))
                            c[i].setDetails();
                    }
                }
                if(choice1==4){
                    System.out.println("___________________________________________________________");
                    System.out.println("Name"+" \t "+"Id"+" \t "+"Phone number"+" \t "+"City");
                    System.out.println("___________________________________________________________");
                    for(int i=0; i<Customer.count; i++){
                        c[i].getDetails();
                    }
                    System.out.print("\nEnter id:");
                    Scanner sc1 = new Scanner(System.in);
                    String userid=sc1.nextLine();
                    System.out.println("Vehicles bought by "+userid+" is/are");
                    System.out.println("___________________________________________________________");
                    System.out.println("Vehicle id"+" \t "+"Customer id"+" \t "+"sale id\t"+"Transaction id");
                    System.out.println("___________________________________________________________");
                    for(int i=0; i<Transactions.count; i++){
                        if(userid.equals(t[i].CustomerID)){
                            t[i].getDetails();
                        }
                    }
                }
            }
            if(choice.equalsIgnoreCase("Existing vehicles")||choice.equals("3"))
            {
                System.out.println("\n            Cars :");
                System.out.println("______________________________________");
                System.out.println("______________________________________");
                System.out.println("Car Name\tModel no\tMilage\tFuel Type\tCar ID\tColor\tPrice\tGear type");
                System.out.println("______________________________________");
                for(int i=0; i<Car.count; i++)
                cars[i].getDetails();
                System.out.println("\n            Bikes :");
                System.out.println("______________________________________");
                System.out.println("______________________________________");
                System.out.println("Car Name\tModel no\tMilage\tFuel Type\tCar ID\tColor\tPrice\tGear type");
                System.out.println("______________________________________");
                    for(int i=0; i<Bike.count; i++)
                bikes[i].getDetails();
            }
            if(choice.equalsIgnoreCase("sale")||choice.equals("4"))
            {
                System.out.println("\n1.New Sale\n2.Installmentpayments");
                Scanner sc4 = new Scanner(System.in);
                int choice3=sc4.nextInt();
                if(choice3==1){
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("\nEnter details");
                    System.out.println("Sale ID:");
                    String Sale=sc3.nextLine();
                    System.out.println("Customer Id");
                    String Customer=sc3.nextLine();
                    System.out.println("Dealer ID");
                    String Dealer=sc3.nextLine();
                    System.out.println("Vehicle ID");
                    String Vehicle=sc3.nextLine();
                    System.out.println("Transaction id");
                    int TransactionID=sc3.nextInt();
                    t[Transactions.count]=new Transactions(Sale, Customer, Dealer, Vehicle, TransactionID);
                    t[Transactions.count-1].setDetails();
                    int sum=0;
                    for(int i=0; i<24; i++){
                        if(t[Transactions.count-1].Dates[i]!=""){
                            sum+=t[Transactions.count-1].Amount[i];
                        }
                    }
                    for(int i=0; i<Car.count; i++){
                        if((cars[i].CarID).equals(t[Transactions.count-1].VehicleID)){
                            System.out.println("Car Price: "+cars[i].Price);
                            System.out.println("Amount to be Paid: "+((cars[i].Price) - sum));
                            break;
                        }
                    }
                    for(int i=0; i<Car.count; i++){
                        if((bikes[i].BikeID).equals(t[Transactions.count-1].VehicleID)){
                            System.out.println("Bike Price: "+bikes[i].Price);
                            System.out.println("Amount to be Paid: "+((bikes[i].Price) - sum));
                            break;
                        }
                    }
                }
                if(choice3==2){
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("\nEnter transaction id ");
                    String id=sc3.nextLine();
                    int index2=0;
                    for(int i=0; i<Transactions.count; i++){
                        if(t[i].equals(id))
                        index2=i;
                    }
                    t[index2].setDetails();
                    int sum=0;
                    for(int i=0; i<24; i++){
                        if(t[index2].Dates[i]!=""){
                            sum+=t[index2].Amount[i];
                        }
                    }
                    for(int i=0; i<Car.count; i++){
                        if((cars[i].CarID).equals(t[index2].VehicleID)){
                            System.out.println("Car Price: "+cars[i].Price);
                            System.out.println("Amount to be Paid: "+((cars[i].Price) - sum));
                            break;
                        }
                    }
                    for(int i=0; i<Car.count; i++){
                        if((bikes[i].BikeID).equals(t[index2].VehicleID)){
                            System.out.println("Bike Price: "+bikes[i].Price);
                            System.out.println("Amount to be Paid: "+((bikes[i].Price) - sum));
                            break;
                        }
                    }
                }
            }
            System.out.println("\nDo you want to return back(y/n)");
            Scanner sc10 = new Scanner(System.in);
            String choice2=sc10.nextLine();
            if(choice2.equalsIgnoreCase("n"))
            break;
        }
        
    }
    public static void CustomerMenu(int index){
        while(true)
        {
            System.out.println("Welcome "+c[index].Name);
            System.out.println("\n1.Change Profile\n2.Vehicle details\n3.Payments");
            Scanner sc = new Scanner(System.in);
            String choice=sc.nextLine();
            if(choice.equalsIgnoreCase("change profile")||choice.equals("1")){
                c[index].setDetails();
            }
            
            if(choice.equalsIgnoreCase("Vehicle details")||choice.equals("2"))
            {
                
                System.out.println("\n            Cars :");
                System.out.println("______________________________________");
                System.out.println("______________________________________");
                System.out.println("Car Name\tModel no\tMilage\tFuel Type\tCar ID\tColor\tPrice\tGear type");
                System.out.println("______________________________________");
                for(int i=0; i<Car.count; i++)
                cars[i].getDetails();
                System.out.println("\n            Bikes :");
                System.out.println("______________________________________");
                System.out.println("______________________________________");
                System.out.println("Car Name\tModel no\tMilage\tFuel Type\tCar ID\tColor\tPrice\tGear type");
                System.out.println("______________________________________");
                    for(int i=0; i<Bike.count; i++)
                bikes[i].getDetails();
               
            }
            if(choice.equalsIgnoreCase("Payments")||choice.equals("3")){
                String userid=c[index].ID;
                System.out.println("___________________________________________________________");
                System.out.println("Vehicle id"+" \t "+"Customer id"+" \t "+"sale id\t"+"Transaction id");
                System.out.println("___________________________________________________________");
                    for(int i=0; i<Transactions.count; i++){
                        if(userid.equals(t[i].CustomerID)){
                            t[i].getDetails();
                        }
                    }
                System.out.println("\n1.To see installments \n2.exit");
                Scanner sc2 = new Scanner(System.in);
                int choice2=sc2.nextInt();
                if(choice2==1){
                    System.out.print("Enter Transaction ID:");
                    Scanner sc3 = new Scanner(System.in);
                    int id=sc3.nextInt();
                    System.out.println("___________________________________________________________");
                    System.out.println("S.no\t Date\t Amount");
                    System.out.println("___________________________________________________________");
                    for(int i=0; i<Transactions.count; i++){
                        if((t[i].TransactionID)==id){
                            for(int j=0; j<24; j++){
                                if(t[i].instalements[j]!=0)
                                System.out.println(t[i].instalements[j]+"\t"+t[i].Dates[j]+"\t"+t[i].Amount[j]);
                            }
                        }
                    }
                }
            }
            System.out.println("Do you want to continue(y/n)");
            Scanner sc10 = new Scanner(System.in);
            String choice2=sc10.nextLine();
            if(choice2.equalsIgnoreCase("n"))
            break;
        }
    }
    
    //main method
	public static void main(String[] args) {

		m[0]=new Manager("Ram", "password");
		d[0]=new Dealer("Madhu", "D201", "password", "xyz");
		d[1]=new Dealer("Shashank", "D202", "password", "abc");
		c[0]=new Customer("Ajay", "C101", "password", "Tanuku", 1234567890L);
		c[1]=new Customer("Prabas", "C102", "password", "Peravali", 9087654321L);
		c[2]=new Customer("Praneeth", "C103", "password", "Eluru", 132547698L);
		cars[0]=new Car("car1", "m201", "petrol", 20, "401", "white", "normal", 1000000);
		cars[1]=new Car("car2", "m202", "diesel", 15, "402", "red", "automatic", 1200000);
		bikes[0]=new Bike("Bike1", "m203", "petrol", 50, "501", "grey", 90000);
		bikes[1]=new Bike("Bike2", "m204", "electric", 30, "502", "blue", 70000);
		t[0]=new Transactions("S601", "C102", "D201", "401", 957);
		//Start of programme
		System.out.println("____________________________________________________________");
		System.out.println("                     Vehicle Dealership");
		System.out.println("_____________________________________________________________"+"\n");
		while(true)
		{
		    String userid="", password="", user=""; 
		    int userindex=-1;
		    //for searching username
		    while(true)
		    {
		        Scanner sc1 = new Scanner(System.in);
		        System.out.print("Enter username: ");
		        String temp=sc1.nextLine();
		        for(int i=0; i<Manager.count; i++)
		        {
		            if(temp.equals(m[i].Name))
		            {
		                userid=temp;
		                user="Manager";
		                userindex=i;
		                break;
		            }
		        }
		        for(int i=0; i<Dealer.count; i++)
		        {
		            if(temp.equals(d[i].ID))
		            {
		                userid=temp;
		                user="Dealer";
		                userindex=i;
		                break;
		            }
		        }
		        for(int i=0; i<Customer.count; i++)
		        {
		            if(temp.equals(c[i].ID))
		            {
		                userid=temp;
		                user="Customer";
		                userindex=i;
		                break;
		            }
		        }
		        if(userid.equals(""))
		        System.out.println("Enter correct username");
		        else
		        break;
		    }
		    //for password checking
		    while(true)
		    {
		        int pwdStatus=0;
		        Scanner sc2 = new Scanner(System.in);
		        System.out.print("Enter password: ");
		        String temp=sc2.nextLine();
		        if(user.equalsIgnoreCase("Manager"))
		        pwdStatus=m[userindex].chechPassword(temp);
		        else if(user.equalsIgnoreCase("Dealer"))
		        pwdStatus=d[userindex].chechPassword(temp);
		        else if(user.equalsIgnoreCase("Customer"))
		        pwdStatus=c[userindex].chechPassword(temp);
		        if(pwdStatus==0)
		        System.out.println("Enter a correct password");
		        else
		        {
		            if(user.equalsIgnoreCase("Manager"))
		            {
		                System.out.println("Login Successful!\n");
		                ManagerMenu(userindex);
		                break;
		            }
		            else if(user.equalsIgnoreCase("Dealer"))
		            {
		                System.out.println("Login Successful!\n");
		                DealerMenu(userindex);
		                break;
		            }
		            else if(user.equalsIgnoreCase("Customer"))
		            {
		                System.out.println("Login Successful!\n");
		                CustomerMenu(userindex);
		                break;
		            }
		        }
		        
		    }
		    Scanner sc3 = new Scanner(System.in);
		    System.out.println("Do you want to switch to another account(y/n)");
		    String choice=sc3.nextLine();
		    if(choice.equalsIgnoreCase("n"))
		    break;
		}
	}
}




