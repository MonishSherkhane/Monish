class CNC{
	private int sid;
	private String sname;
	private String scourse;
	
	public void setsid(int sid){
			this.sid=sid;
	}
	
	public void setsname(String sname){
			this.sname=sname;
	}
	public void setscourse(String scourse){
			this.scourse=scourse;
	}
	
	
		

	
	public int getsid(){
			return sid;
			
	}
	
	public String getsname(){
			return sname;
			
	}
	public String getscourse(){
			return scourse;
	}
	
		public void stdDetails(){
		setsid(100);
		setsname("moteen");
		setscourse("full stack");
		System.out.println("student id:"+getsid());
		System.out.println("student name:"+getsname());
		System.out.println("student course:"+getscourse());
	
	
	
	
	
}
	

}

class Student extends CNC{
private int sid;
	private String sname;
	private String scourse;
	
	public void stdDetails(){
		setsid(102);
		setsname("monish");
		setscourse("frontend");
		System.out.println("student id:"+getsid());
		System.out.println("student name:"+getsname());
		System.out.println("student course:"+getscourse());
	}
	public void open(){
		super.stdDetails();
	}
}

class Information{
public static void main(String args[]){
Student s=new Student();
//s.stdDetails();
s.open();

	
}
}