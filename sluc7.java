public class sluc7
{
	public static final int No_Play = 0;
    public static final int Ladder = 1;
    public static final int Snake = 2;

	public static void main(String[] args)
	{    
    int toggle = 0;   // Variable used to switch dice between players
	int player1_pos = 0;
    int player2_pos = 0;
	int dice_roll = 0;
	int options = 0;

    System.out.println("The Start Postion of Player1 is : "+player1_pos);
    System.out.println("The Start Postion of Player2 is : "+player2_pos);

    while(player1_pos != 100 && player2_pos!=100)
    {
	dice_roll = 1 + (int)(Math.random() * ((6 - 1) + 1));
    options = (int) Math.floor(Math.random() * 10) % 3;
  
    if(options == No_Play)
    {
        if(toggle == 0)
        {
    	player1_pos = player1_pos;
        toggle = 1;       // Toggle value is changed to give chance to the other player next time
        }

        else
        {
        player2_pos = player2_pos;
        toggle = 0;
        }
    }
    else if(options == Ladder)
    {
        if(toggle == 0)
        {
            if(player1_pos+dice_roll<=100)
            {
    	       player1_pos = player1_pos + dice_roll;
               toggle = 0;   // Toggle value remains same to give the same player chance to roll the dice again since he got a Ladder
            }
        }

        else
        {
            if(player2_pos+dice_roll<=100)
            {
               player2_pos = player2_pos + dice_roll;
               toggle = 1;
            }
        }
    }

    else
    {
        if(toggle == 0)
        {
            if(player1_pos>dice_roll)
            {
    	       player1_pos = player1_pos - dice_roll;
            }      

            else
            {
                player1_pos = 0;
            }

            toggle = 1;  // Toggle value is changed to give chance to the other player next time
        }

        else
        {
            if(player2_pos>dice_roll)
            {
               player2_pos = player2_pos - dice_roll;
            }      

            else
            {
                player2_pos = 0;
            }

            toggle = 0;
        }
    }
        
}
	
        
        System.out.println("The final position of Player 1 is : "+player1_pos);
        System.out.println("The final position of Player 2 is : "+player2_pos);
        System.out.println("The Winner of the Game is "+(toggle+1));
        

	}
}





