
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jailyn Perales

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxChecker
{
	String result;
	private String exp;
	private Stack<Character> symbols;

	public SyntaxChecker()
	{
		symbols = new Stack<Character>();
	    
	}

	/*
	 * 
	 */
	public SyntaxChecker(String s){
		exp = s;
		symbols = new Stack<Character>();
		setExpression(s);
	}
	
	/*
	 *hi  
	 */
	public void setExpression(String s){
	
		for(char cha : s.toCharArray()) {
			if(cha == '(' || cha == '[' || cha == '{') {
				symbols.push(cha);
			}
			else if(cha == ')' || cha == ']' || cha == '}') {
				if(symbols.isEmpty()) {
					result = ("IS NOT CORRECT");
				}
				char top = symbols.pop();
				if(!checkExpression(top,cha)) {
					result = ("IS NOT CORRECT");
				}
				else {
					result = ("IS CORRECT");
				}
			}
		}
		//System.out.println(result);
	
	}

	/*
	 * This checkExpression() method Checks that the opening symbol matches with the closing symbol
	 */
	public boolean checkExpression(char open, char close)
	{
		return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
	}

	/*
	 * 
	 */
	public String toString() {
		return exp + " " + result;
	}
}


