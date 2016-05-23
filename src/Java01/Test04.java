package Java01;

import static java.lang.System.*;

public class Test04 {
	public static void main(String[] args){
		try{
			out.println(args[0]);

		}catch(Exception e){
			e.printStackTrace();
			out.println("引数ないけど");
		}
	}
}

