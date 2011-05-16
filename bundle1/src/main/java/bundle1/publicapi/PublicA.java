package bundle1.publicapi;

import java.util.Date;

public class PublicA {

	public String getValue( String value ){
		System.out.println("called public getValue() method");
		
		String result = null;
		 if( value == null){
			result = new Date().toString();
		}else if( value.equals("TEST")){
			result = value + "99";
		}else if( value.equals("")){
			
		}
		return result;
	}
}
