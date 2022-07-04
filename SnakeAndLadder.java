package bridgelabz.com;

import java.util.Random;

public class SnakeAndLadder {
	
	public static void main(String[] args) {
		
		final int No_Play = 0;
		final int Ladder = 1;
		final int Snake = 2;
		final int Starting_position = 0;
		final int Win=100;
	
		
		
		int Player_position = 0;
		System.out.println("Starting position is :" + Starting_position);
		
		while(Player_position <= Win) {
		
		Random random = new Random();
   	    int	Rolling_Dice = random.nextInt(6)+1;
   	    System.out.println("After Rolling dice "+ Rolling_Dice);
   	    
   	    int PlayerCheck = random.nextInt(3);
   	    System.out.println("Player check (0)No_Play , (1) Ladder , (2) Snake "+ PlayerCheck );
   	    
   	    if (PlayerCheck == 0)
   	    {
   	    	System.out.println("your position is not change, you are at position " + Player_position);
   	    }
   	    
   	    else if (PlayerCheck == 1) 
   	    {
   	    	Player_position = Player_position + Rolling_Dice;
    		System.out.println(" 'Congratulation' you got the ladder your position will be increesed by " + Rolling_Dice);
   	    }
   	    
   	    else if (PlayerCheck == 2)
   	    {
   	    	Player_position = Player_position - Rolling_Dice;
    		System.out.println(" 'Opps' you got the Snake your position will be Decrease by " + Rolling_Dice);
   	    }
   	    else 
   	    {
   	    	System.out.println(" 'Sorry' Somethis went Worng");
   	    	
   	    } 
	}
		System.out.println("Position:--" +Player_position);
   	    	
	}
}
  