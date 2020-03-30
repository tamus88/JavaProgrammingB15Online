package office_hour.office_hour_20_01_22;

public class ClassNote {

    /*
    01/22/2020
Practice Topic:
				1. Method Overriding
				2. overriding vs Overloading
visibility level of access modifier:
		public > protected > default > private
method overriding:  same method name, same parameter
			rules:
					1. Must be overridden in sub class (inherited relation)
								Method overriding can not take place in the same class
					2. return-type, method name, parameter MUST be same
					3. Overridden' Access modifier MUST be same or more visible
							public > protected > default
					4. only instance method can be overridden( cannot be static, private)
					5. @Override Must be applicable
class car{
	start(){
		sout("started");
	}
}
class Toyota extends car{
	start(){
		sout("Key");
	}
}
class Tesla extends car{
	start(){
		sout("voice Control");
	}
}
class Jeep extends car{
	start(){
		sout("call mechanic");
	}
}
why do we need method overriding?
	to provide different implementation(functionality) to the method
method overriding vs method overloading:
		method overloading: can happen in same class
							return-type can be different or same
							parameter MUST be different
							any method can be overloaded

		method overriding: must happen in sub class only
							return-type must be same
							parameter MUSt be same
							access modifiers of overridden method MUST be same or more visible
							Only instance method can be overridden ( cannot be static, private)
Task:
		create class bank:
				actions: interest rate calculation
							InterestCalculator(){}
		create sub classes:
				BOA: interest rate ==> 3%
				CapitalOne: interest rate ==> 4%
				Citi: interest rate ==> 5%
     */
}
