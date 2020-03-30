package office_hour.office_hour_20_01_16;

public class TestUser {

    int a;

    public static void main(String[] args) {
        // 	ClassName	ReferenceName = new  ExistingConstructor;
        TestUser t = new TestUser();
        //  System.out.println(t.a);

        UserInfo Alisa = new UserInfo();  // to call the insatnce of the class
        //Alisa.userName = "Alisa";
        // System.out.println( Alisa.userName );  private is not accessible outside class

        Alisa.setUserName("Alisa");
        System.out.println(Alisa.getUserName());

        Alisa.setSSN("123456");
        System.out.println(Alisa.getSSN());

        UserInfo Kamran = new UserInfo();
        System.out.println(Kamran.getUserName());
        System.out.println(Kamran.getSSN());


    }

}

/*
1/16/2020
Practice Topic: Encapsulation
Access-modifiers: public, protected, default, private
private: only visible or accessible within the class
instance variable: declared within the class, outside any methods & blocks
			belong to the object
			each object they have their own copy of instance variable
constructor:	used for creating object
	 every class MUST have. if we don't create one then the compiler will create the default(no-arg) constructor
			gets executed as soon as we create the object of the class
		deceleration:
				Access-modifier  ClassName(parameter){
						statement;
				}
creating object of the class: object must be created with existing constructor
		ClassName	ReferenceName = new  ExistingConstructor;
Encapsulation: data hiding
		1. data has private access modifier
		2. grants other classes get access to the private data through public getter/setter methods
		getter(Read Only):  instance method
					returns the value of the private data
					return type of the method MUST match with the private data' data-type
		setter(Modify): instance method
					does not return anything
					return-type MUST be void
				passes a parameter. Parameter's data-type MUST match with the preivate data' data-type
this: refers to object instance
	this. : used to call instance variable and instance methods
			if the local variable has same variable name with instance variable, then we can use this keyword to call instance
 */

