package com.venkadesh;

public class Jump {
	
	public void totalJumps(int depth)
	{
		int firstjump=0;
		while(firstjump<=depth)
		{
			firstjump++;
			if(firstjump>=3)
			{
				int c=firstjump-2;
				
				if(firstjump>depth)
				{
					System.out.print("The total jumps are ");
					System.out.println(c);
				}
			}
		
		}
		
	}

}
