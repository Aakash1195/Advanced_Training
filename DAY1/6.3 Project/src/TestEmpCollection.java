	import java.util.Vector;

	public class  TestEmpCollection {
		public static void main(String[]args) {
			Vector<Employee> v=addInput();
			display(v);
		}
		public static Vector<Employee> addInput(){
			Employee e1=new Employee(11,"jonathan","pochunki");
			Employee e2=new Employee(12,"mortal","Nova");
			Employee e3=new Employee(13,"Scout","School");
			Vector<Employee>v = new Vector<Employee>();
			v.add(e1);
			v.add(e2);
			v.add(e3);
			return v;



		}
		public static void display(Vector<Employee>v)
		{
			for(Employee e:v)
			{
				System.out.println(e.getEmpid()+"\t"+e.getEname()+"\t"+e.getAddress());
			}
		}

	}

