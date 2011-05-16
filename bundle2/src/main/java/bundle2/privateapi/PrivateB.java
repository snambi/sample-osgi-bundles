package bundle2.privateapi;

public class PrivateB {
	
	public String getValue( int input){
		System.out.println("executing Bundle2.getValue()");

		String result=null;
		
		if( input ==0 ){
			result = "ZERO";
		}else if( input > 0){
			result = "POSITIVE";
		}else if( input < 0){
			result = "NEGATIVE";
		}
		
		return result;
	}
}
