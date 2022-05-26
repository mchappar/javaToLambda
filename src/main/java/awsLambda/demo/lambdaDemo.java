package awsLambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
//here object is input and the other object is output
public class lambdaDemo implements RequestHandler<Object,Object>{

	public Object handleRequest(Object input, Context context) {
		System.out.println("Hiii!! Myself Madhura I work for Capgemini");
		return null;
	}

	 

	

}
