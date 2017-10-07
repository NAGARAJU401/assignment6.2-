package Hashcode;

 public class StudentDemo {
	//public : members which can access as public,public members are visible to all other classes.
	//class : is a context of java that are used to create objects and to define object data types and methods.
		
	public static void main(String[] args) {
		//Public is a keyword that is used as an access modifier for methods and variables.
		//static used to prepare a field,method or inner classes as a class field.
		//void: it is void if the method does not return a value.
		//main:it is a function name When a program starts running, it has to start execution from somewhere.
		//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		// TODO Auto-generated method stub
		Student sudha = new Student();
		Student srujan =new Student();
		  // here we  the student objects,one object has sudha and the other has srujan
		 System.out.println("Hash code =" +sudha.hashCode());  //here it prints the hashcodes of both of them
		  System.out.println("Hash code =" +srujan.hashCode());//system is used to return code
			                                                 //out is a static number
		                                              //Println is used to print textand gives output

	}
	

}
