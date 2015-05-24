import java.util.Arrays;


public class RekurencjaOdwracanieTabeli {
private int[] liczby = {1,2,3,5,6,7};
public int[] odwracanie(int left,int right)
	{
	if(left<right)
		{
		int temp;	
		temp=liczby[left];
		liczby[left]=liczby[right];
		liczby[right]=temp;
		odwracanie(++left,--right);
		
		}
		return liczby;
	}
	public void run()
	{
		odwracanie(0,liczby.length-1);
		
		
			System.out.println(Arrays.toString(liczby));
			
		
	}
public static void main(String[] args)
		{
	RekurencjaOdwracanieTabeli k = new RekurencjaOdwracanieTabeli();
	k.run();
	
		}
}
