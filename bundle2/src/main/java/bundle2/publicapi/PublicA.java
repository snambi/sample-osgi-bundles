package bundle2.publicapi;

public class PublicA {

	public String convert(String value){
		
		String result = null;
		
		bundle1.publicapi.PublicA A = new bundle1.publicapi.PublicA();
		result = A.getValue( value);
		
		if( result.startsWith("TEST")){
			result = result + "100";
		}
		
		return result;
	}
}
