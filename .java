package ClassAndObject;

class Student{  
	 private int id;  
	  private String name;
	  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}  
	}  
	class ClassAndObjectExamp{  
		
	 public static void main(String args[]){    
	  Student s1=new Student();  
	  Student s2=new Student();    
	  s1.setId(101);  
	  s1.setName("Afridi");  
	  s2.setId(1111); 
	  s2.setName("ramu");    
	  System.out.println(s1.getId()+" "+s1.getName());  
	  System.out.println(s2.getId()+" "+s2.getName());  
	 }  
	}  
