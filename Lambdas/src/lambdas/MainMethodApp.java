package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MainMethodApp {
	
/*A lambda expression is a short block of code which takes in parameters and returns a value. 
 * Lambda expressions are similar to methods, but they do not need a name 
 * and they can be implemented right in the body of a method.
 * 	The simplest lambda expression contains a single parameter and an expression: parameter -> expression

To use more than one parameter, wrap them in parentheses:(parameter1, parameter2) -> expression

Expressions are limited. They have to immediately return a value, and they cannot contain variables, 
assignments or statements such as if or for. In order to do more complex operations, 
a code block can be used with curly braces. If the lambda expression needs to return a value, 
then the code block should have a return statement:(parameter1, parameter2) -> { code block }

Remember, lambdas can become a variable for functional interfaces (interfaces with only ONE abstract method w/@FunctionalInterface Annotation).
This can be done with your own created functional interfaces, or with ones that are already pre-made.  Pre-made functional interfaces 
may include Consumer, Predicate ammongst 40+ others.....You can store these functional interfaces as a lambda expression variable so you
can perform certain functionalities with it. For example, if you store a functional interface as a lambda variable, you can use it as a parameter for a method.
See example below
 */
	public static void main (String [] args) {
		LambdaMethods lambdaMethods = new LambdaMethods();

//*********LAMDA used as a functionalinterface variable paramater for a method that takes a f.interface as a paramater
//from the class, LambdaMethods and created functional interface, FunctionalInterfaceExpressions			
		lambdaMethods.variableFlair("Rachael", lambdaMethods.getExclamateVariable());
		lambdaMethods.variableFlair("Henry", lambdaMethods.getQuestionVariable());

//***********LAMBDA WITH A forEach() method		
	List <Integer> randoNumbs = Arrays.asList(2, 25, 6, 10, 3);
	randoNumbs.forEach(x->{System.out.println(x + 3);});
	
//***********LAMBDA STORED AS A Pre-existing FUNCTIONAL INTERFACE VARIABLE AND PRINTED OUT WITH A FOREACH()	method
	Consumer <Integer> lambdaVariable = x -> {System.out.println(x);};
	randoNumbs.forEach(lambdaVariable);
	
		

//*********LAMDA used inside a created method which takes a lambda expression/functional interface as a parameter:		
	RandomInterface lambdaVariable1 = (x -> {return x + "!";});
	RandomInterface lambdaVariable2 = (x -> {return x + " is too kool for skool.";});
	printStuff("Hey", lambdaVariable1);
	printStuff("Rachael", lambdaVariable2);
	RandomInterface doYoMomma = (x -> {return x + " yo momma";});
	System.out.println(doYoMomma.doSomething("So is"));
	
	}
//*********LAMDA AS Create a method which takes a lambda expression as a parameter:	
	public static void printStuff (String x, RandomInterface w) {	
		String result = w.doSomething(x);
		System.out.println(result);
		
	}
//*********LAMDA AS Create a method which takes a lambda expression as a parameter:		
	@FunctionalInterface
	interface RandomInterface {
		public String doSomething (String x);
	}
	
	

}
