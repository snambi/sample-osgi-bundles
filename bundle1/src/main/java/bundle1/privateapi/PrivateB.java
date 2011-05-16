package bundle1.privateapi;

public class PrivateB {

	public String getStatus(int input){
		System.out.println("called private getStatus() method");
		String result = null;
		
		if( input == 0l){
			result = "zero";
		}else if( input > 0){
			result = "+ve";
		}else if( input < 0 ){
			result = "-ve";
		}
		
		return result;
	}
}
