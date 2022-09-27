package corejavabasic;

public class StringRev {
	public static void main(String args[])
	{
		String rev="Reverse";
		char[] arr = rev.toCharArray();
		
		int done = rev.indexOf('e',4);
		int end = rev.indexOf('R');
		System.out.println(end);
		System.out.println(done);
		for(done = 6; done>=end;done--)
		{
			System.out.print(arr[done]);
		}
			
		
	}

}
