public class sluc5
{
	public static final int No_Play = 0;
    public static final int Ladder = 1;
    public static final int Snake = 2;

	public static void main(String[] args)
	{
	int pos = 0;
	int dice_roll = 0;
	int options = 0;

    System.out.println("The Start Postion is : "+pos);
    while(pos != 100)
    {
	dice_roll = 1 + (int)(Math.random() * ((6 - 1) + 1));
    options = (int) Math.floor(Math.random() * 10) % 3;

    if(options == No_Play)
    {
    	pos = pos;
    }
    else if(options == Ladder)
    {
        if(pos+dice_roll<=100)
        {
    	pos = pos + dice_roll;
        }
    }

    else
    {
        if(pos>dice_roll)
        {
    	pos = pos - dice_roll;
        }

        else
        {
            pos = 0;
        }
    }
        
}
	
    	System.out.println("The Final Postion is : "+pos);
        System.out.println("The Player Won The Game");

	}
}

