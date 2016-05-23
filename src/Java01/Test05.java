package Java01;

import static java.lang.System.*;

public class Test05 {
	public static void main(String[] args){
		try{
			int argsCount = args.length ;
			if (argsCount <= 0){
				throw new Exception();
			}
			else
			{
				for(int i = 0 ;i < argsCount ;i++){
					out.println(args[i]);
				}
			}

		}catch(Exception e){
			e.printStackTrace();
			out.println("引数ないけど");
		}
	}
}
