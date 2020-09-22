public class sluc3
{
	public static final int No_Play = 0;
    public static final int Ladder = 1;
    public static final int Snake = 2;

	public static void main(String[] args)
	{
	int pos = 0;
	int dice_roll = 0;
	int options = 0;
	dice_roll = 1 + (int)(Math.random() * ((6 - 1) + 1));
    options = (int) Math.floor(Math.random() * 10) % 3;
    System.out.println("The Start Postion is : "+pos);
    if(options == No_Play)
    {
    	pos = pos;
    }
    else if(options == Ladder)
    {
    	pos = pos + dice_roll;
    }

    else
    {
    	pos = pos - dice_roll;
    }
	
    	System.out.println("The New Postion is : "+pos);

	}
}

