//import java.util.ArrayList;
import java.util.*;
class Employee
{
    private String name;
	private int id;
    private int age;
	private String designation;
	private String department;
    private double salary;
	public Employee(String name, int id,int age,String designation,String department, double salary) 
	{
        this.name = name;
		this.id=id;
        this.age = age;
		this.designation=designation;
		this.department=department;
        this.salary = salary;
    }
    public String getName() 
	{
        return name;
    }
	public int getid()
	{
		return id;
	}
    public int getAge()
	{
        return age;
    }
	public String getdesignation()
	{
		return designation;
	}
	public String getdepartment()
	{
		return department;
	}
    public double getSalary()
	{
        return salary;
    }
    public void setName(String name) 
	{
        this.name = name;
    }
	public void setid(int id)
	{
		this.id=id;
	}
    public void setAge(int age) 
	{
        this.age = age;
    }
	public void setdesignation(String designation)
	{
		this.designation=designation;
	}
	public void setdepartment(String department)
	{
		this.department=department;
	}
    public void setSalary(double salary) 
	{
        this.salary = salary;
    }
    public String toString() 
	{
        return "Name: " + name +",id: "+id+ ", Age: " + age +",designation: "+designation+",department: "+department+ ", Salary: " + salary;
    }
}
class main
{
	public static void menu()
	{       System.out.println();
	        System.out.println("   >>>>>>>>>> :: WELCOME TO EMPLOYEE MANAGMENT APPLICATION :: <<<<<<<<<<");
			System.out.println();
		    System.out.println("Select your choice");
		    System.out.println(" press 1  ->viwe all employees details :");
            System.out.println(" press 2  ->Add Employee :");
            System.out.println(" press 3  ->Update employee details :");
            System.out.println(" press 4  ->remove employee :");
			System.out.println(" press 5  ->count employee same designation :");
			System.out.println(" press 6  ->do you want to increase employee salary ? :");
			System.out.println(" press 7  ->do you want to promote an employee ?:");
			System.out.println(" press 8  ->do you want to give bonuses to employee ? ");
			System.out.println(" press 9  ->Wheter the employee wants to withdraw salary ?");
			System.out.println(" press 10 ->do you want to deduct the salary of an absentee employee :");
			System.out.println(" press 11 -> over time salary :");
            System.out.println(" press 12 ->Exit ");
	}
    public static void main(String[] args) 
	{   
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Scanner sc = new Scanner(System.in);
		Employee emp1=new Employee("viraj",101,21,"devloper","IT",100000.0);
		Employee emp2=new Employee("darshan",102,22," senior devloper","IT",10000.0);
		Employee emp3=new Employee("hardik",103,23,"designer","IT",120000.0);
		Employee emp4=new Employee("romil",104,24,"devloper","IT",10000.0);
		Employee emp5=new Employee("sujan",105,25,"deloper","IT",100000.0);
        employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		int choice;
        do {
			menu();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice) 
			{
                case 1:
                    System.out.println("List of Employees:");
                    for(Employee e : employees) 
					{
                        System.out.println(e.toString());
                    }
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    String name = sc.next();
					System.out.print("Enter id: ");
					int id=sc.nextInt();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
					System.out.print("Enter designation: ");
					String designation=sc.nextLine();
					sc.nextLine();
					System.out.print("Enter department: ");
					String department=sc.nextLine();
                    System.out.print("Enter salary: ");
                    double salary = sc.nextDouble();
                    employees.add(new Employee(name,id, age,designation,department, salary));
                    System.out.println("Employee added successfully!");
                    break;
                case 3:
				    sc.nextLine();
                    System.out.print("Enter employee name you want to update: ");
                    String Name = sc.nextLine();
                    boolean found = false;
                    for(Employee e : employees) {
                        if(e.getName().equalsIgnoreCase(Name)) 
						{  
						 System.out.println("What do you want to update:");
						 System.out.println("1 - update Name");
						 System.out.println("2 - update id");
						 System.out.println("3 - update age");
						 System.out.println("4 - update designation");
						 System.out.println("5 - update department");
						 System.out.println("6 - update all details");
						 int u=sc.nextInt();
						 sc.nextLine();
						 switch(u)
						 {
							 case 1:
							 System.out.print("Enter new name: ");
                             e.setName(sc.nextLine());
							 found =true;
							 break;
							 case 2:
							 System.out.print("Enter new id: ");
							 e.setid(sc.nextInt());
							 found =true;
							 break;
							 case 3:
							 System.out.print("Enter new age: ");
                             e.setAge(sc.nextInt());
							 found =true;
							 break;
							 case 4:
							 System.out.print("Enter new designation: ");
							 e.setdesignation(sc.nextLine());
							 sc.nextLine();
							 found =true;
							 break;
							 case 5:
							 System.out.print("Enter new department: ");
							 e.setdepartment(sc.nextLine());
							 found =true;
							 break;
							 case 6:
							System.out.print("Enter new name: ");
                            e.setName(sc.nextLine());
							System.out.print("Enter new id: ");
							e.setid(sc.nextInt());
                            System.out.print("Enter new age: ");
                            e.setAge(sc.nextInt());
							System.out.print("Enter new designation: ");
							e.setdesignation(sc.nextLine());
							sc.nextLine();
							System.out.print("Enter new department: ");
							e.setdepartment(sc.nextLine());
                            System.out.print("Enter new salary: ");
                            e.setSalary(sc.nextDouble());
                            System.out.println("Employee updated successfully!");
                            found = true;
							break;
							 default:
							 System.out.println("plese enter valid choice:");
							 found=true;	
						 }
                        }
                    }
                    if(!found) {
                        System.out.println("Employee not found!");
                    }
                    break;
                case 4:
                    System.out.print("Enter employee name to delete: ");
                    String deleteName = sc.next();
                    found = false;
                    for(int i = 0; i < employees.size(); i++) 
					{
                        if(employees.get(i).getName().equals(deleteName)) 
						{
                            employees.remove(i);
                            System.out.println("Employee deleted successfully!");
                            found = true;
                            break;
                        }
                    }
                    if(!found) 
					{
                        System.out.println("Employee not found!");
                    }
                    break;
					case 5:
					System.out.println("enter employee designation you want to serch:");
					String Designation=sc.next();
					int c=0;
					for(Employee e: employees)
					{
						if(e.getdesignation().equals(Designation))
						{
							System.out.println(e.toString());
						    c++;
						}
					}
					System.out.println("Total number of "+Designation+"="+c);
					if(c==0)
						System.out.println(" enter valid designation:");
					break;
					case 6:
					System.out.println("enter employee id no. you want to increes salary:");
					sc.nextLine();
					int Id=sc.nextInt();
					double s=0;
					for(Employee e:employees)
					{
						if(e.getid()==Id)
						{
						 System.out.println("enter persntage:");
					     double persntage=sc.nextDouble();
			             s=e.getSalary()*persntage/100+e.getSalary();
						 System.out.println("inceesis salary="+s);
						 System.out.println("Enter updated salary:");
						 e.setSalary(sc.nextDouble());
						 System.out.println("increase salary successfully:");
						 s++;
						}
					}
					if(s==0)
						System.out.println("enter valid id no.");
					break;
					case 7:
					System.out.println("enter employee id you want to prmoted:");
					int q=sc.nextInt();
					sc.nextLine();
				    found=false;
					for(Employee e:employees)
					{
						if(e.getid()==q)
						{
							System.out.println("enter prmoted designation:");
							e.setdesignation(sc.nextLine());
							System.out.println("employee prmoted successfully:");
							found=true;
						}
					}
					if(!found)
					System.out.println("enter valid designation:");
				    break;
					case 8:
					System.out.println("Enter bonuses amount:");
					double bonuses=sc.nextDouble();
					double b=0;
					for(int i=0;i<employees.size();i++)
					{
					  b=employees.get(i).getSalary()+bonuses;
					  System.out.println("bonuses amount plus salary for id no."+employees.get(i).getid()+"="+b);
					  System.out.println(" this year Total bonuses amount:"+employees.size()*bonuses);
					}
					break;
					case 9:
					System.out.println("Enter the id number of the employee to whome you want to withdraw: ");
					int ID=sc.nextInt();
					double w=0;
					System.out.println("enter withdraw amount:");
					double withdraw=sc.nextDouble();
					for(int i=0;i<employees.size();i++)
					{
						if(employees.get(i).getid()==ID)
						{   
					        w=employees.get(i).getSalary()-withdraw;
							System.out.println("Salary after withdraw id no."+employees.get(i).getid()+"= "+w);
							employees.get(i).setSalary(w);
							System.out.println("withdraw amount successfully:");
							w++;
						}
					}
					if (w==0)
						System.out.println("plise enter valid id number");
					break;
					case 10:
					System.out.println("Enter absarnt employee id:");
					int iD=sc.nextInt();
					double a=0;
					for(Employee e:employees)
					{
						if(e.getid()==iD)
						{   
					        System.out.println("Enter days of absarnt:");
							int day=sc.nextInt();
							if(3<day)
							{
							int D=day-3;	
							a=e.getSalary()-500*D;
							System.out.println("salary="+a);
							e.setSalary(a);
							System.out.println("absarnt employee salary daduct successfully: ");
							a++;
							}	
						}
					}
					if(a==0)
					{
						System.out.println("Enter valid id number:");
					}
					break;
					case 11:
					System.out.println("Enter employee id :");
					int di=sc.nextInt();
					double h=1;
					for(Employee e: employees)
					{   
				        if(e.getid()==di)
						{
						System.out.println("enter over time hours:");
						int hours=sc.nextInt();
						h=e.getSalary()+h*200;
						System.out.println("salary plus overtime salary="+h);
						e.setSalary(h);
						System.out.println("over time salary added successfully:");
						h++;
						}
					}
					if(h==1)
						System.out.println("Enter valid employee id");
					break;
                    case 12:
                    System.out.println("  :: THANKYOU FOR USING APPLICATION  ::");
                    break;
                    default:
					System.out.println("plese enter valid choice:");
                    break;   
            }
        } while(choice !=12);
    }
}