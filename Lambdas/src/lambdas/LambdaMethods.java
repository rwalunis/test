package lambdas;

import lambdas.MainMethodApp.RandomInterface;

public class LambdaMethods {
	
	FunctionalInterfaceExpressions exclamateVariable = (x -> {return(x + "!");});	
	FunctionalInterfaceExpressions questionVariable = (x -> {return(x + "?");});

	public FunctionalInterfaceExpressions getExclamateVariable() {
		return exclamateVariable;
	}

	public void setExclamateVariable(FunctionalInterfaceExpressions exclamateVariable) {
		this.exclamateVariable = exclamateVariable;
	}

	public FunctionalInterfaceExpressions getQuestionVariable() {
		return questionVariable;
	}

	public void setQuestionVariable(FunctionalInterfaceExpressions questionVariable) {
		this.questionVariable = questionVariable;
	}

	
	
	public void variableFlair (String x, FunctionalInterfaceExpressions w) {	
		String result = w.expressThisString(x);
		System.out.println(result);
	
}
}
	