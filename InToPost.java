import java.io.*;
import java.util.*;

/*
 * InToPost - Class that reads a file of infix expressions 
 *               and converts them to postfix notation.
 */

public class InToPost {
    
    public static void main(String[] args)
						    throws FileNotFoundException{
        
        //Maps to hold the InPriorities and StkPriorities of each operator 
        
        Map<String, Integer> inPr = new Map<String, Integer>();
        Map<String, Integer> stkPr = new Map<String, Integer>();
    
        // Create a Stack for storing operators.

        Stack<String> opStk = new Stack<String>();  //Stack for operators.

        // Read the name of a file containing infix expressions from
        // the command line and open it for reading.  There is one
        // infix expression per line.

        File fin = new File(args[0]);     
        Scanner inFile = new Scanner(fin);

		String alpha="abcdefghijklmnopqrstuvwxyz"; 

        // Set the InPriorities of each operator

        inPr.insert("^", 5);
		inPr.insert("*",3);
		inPr.insert("/",3);
		inPr.insert("+",2);
		inPr.insert("-",2);
		inPr.insert("==",1);
		inPr.insert("<=",1);
		inPr.insert(">=",1);
		inPr.insert("(",0);
		inPr.insert(")",0);
	

           // etc ...c
        
        //Set the StkPriorities of each operator

        stkPr.insert("^", 4);
		stkPr.insert("*",3);
		stkPr.insert("/",3);
		stkPr.insert("+",2);
		stkPr.insert("-",2);
		stkPr.insert("==",1);
		stkPr.insert(">=",1);
		stkPr.insert("<=",1);
		stkPr.insert("#",0);
		stkPr.insert("(",0);
		stkPr.insert(")",0);
           // etc ... 
        
        // Repeat reading an infix expression and creating a
        // String storing the equivalent postfix expression. 
        // Print both expressions to the monitor.

        while (inFile.hasNext()){             
            String infix = inFile.nextLine(); // Read the infix expression
            String postfix = "";              // Prepare to create the
                                              // postfix expression.
            
            // Set up a tokenizer to move through each infix statement.
            StringTokenizer expr = new StringTokenizer(infix); 

            // Next is the algorithm to create the postfix expression 
            opStk.push("#");    // Mark the bottom of the stack.
            
            String token = expr.nextToken(); // Retrieve the first token
            
            //While loop to evaluate each token of each infix.
            //Stops when it reaches the end mark, '#'.

            while (!token.equals("#")){
				if(alpha.indexOf(token)!=-1){
					postfix=postfix+token;
				}
				else if(token.equals("(")){
					opStk.push(token);
				}
				else if(token.equals(")")){
					String opr=opStk.top();
					while(!opr.equals("(")){
						opr=opStk.pop();
						postfix=postfix+opr;
						opr=opStk.top();
					}
				}
				else{
					String opr=opStk.top();
					while(stkPr.getValue(opr)>=inPr.getValue(token)){
						opr=opStk.pop();
						if(!opr.equals("(")){
							postfix=postfix+opr;
						}
						opr=opStk.top();
					}
					opStk.push(token);
				}
				token=expr.nextToken();
	            // Complete this code
	        }

            while (!opStk.isEmpty()) {
				String opr=opStk.pop();
				if(!opr.equals("(")){
					postfix=postfix+opr;
				}
			
                // Complete this code
            }
			System.out.println("This is infix: "+infix);
			System.out.println(postfix);
        } // End of outer while loop     

    } // End of main()
    
}
