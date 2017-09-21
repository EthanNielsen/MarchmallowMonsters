package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;
import monster.view.MonsterDisplay;



public class MonsterController
{
	private MonsterDisplay popup;
	
	public MonsterController()
	{
		popup = new MonsterDisplay();
		popup.displayText("Hi There :L");
	}
	
	public void start()
	{
		MarshmallowMonster basic = new MarshmallowMonster();
//		System.out.println(basic);
// I many need to get rid of this comment //	popup.displayText(basic.toString());
		MarshmallowMonster YeahBoi = new MarshmallowMonster("Weird YeahBoi Monster", 15, 4, 4.5, true);
//		System.out.println(YeahBoi);
		popup.displayText(YeahBoi.toString());
//		System.out.println("I am feeling hungry, I am going to eat one of fred's arms");
		popup.displayText("I am feeling hungry, I am going to eat one of fred's arms");
		YeahBoi.setArmCount(YeahBoi.getArmCount() - 3);
//		System.out.println(YeahBoi);
		popup.displayText(YeahBoi.toString());
//		System.out.println("Hey I need more... Give Me MORE!");
		popup.displayText("Hey I need more... Give Me MORE!");
		YeahBoi.setTentacleAmount(YeahBoi.getTentacleAmount() - 1);
//		System.out.println(YeahBoi)
//		System.out.println("Lets Eat!");
		popup.displayText("Lets Eat!");
		YeahBoi.setEyeCount(YeahBoi.getEyeCount() - 5);
		System.out.println(YeahBoi);

		interactWithMonster(YeahBoi);

		
		
		
		
	}

	private void interactWithMonster(MarshmallowMonster currentMonster)
	{
		Scanner myScanner = new Scanner(System.in);
//		System.out.println(currentMonster.getName() + " wants to know how many eyes you want to eat, please type in how many");
		int consumed = 0;
		String response = popup.getResponse(currentMonster.getName() + " wants to know how many eyes you want to eat");
		
		if(isValidInteger(response))
		{
			consumed = Integer.parseInt(response);
		}
		
		//		int consumed = myScanner.nextInt();
		currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
		System.out.println(currentMonster);
//		System.out.println("How many arms are you interested in eating? I currently have " + currentMonster.getArmCount());
		popup.getResponse("How many arms are you interested in eating? I currently have " + currentMonster.getArmCount());
		
		if(isValidInteger(response))
		{
			consumed = Integer.parseInt(response);
		}
		
		// consumed = myScanner.nextInt();
		int armEat = myScanner.nextInt();

		if (armEat == 0)
		{
//			System.out.println("Not hungry? Thank Goodness...");
		}
		else if (armEat < 0)
		{
//			System.out.println("Math Is going to be your downfall, I cannot give you negative amounts!");
			popup.displayText("Math Is going to be your downfall, I cannot give you negative amounts!");
		}
		else if (armEat > currentMonster.getArmCount())
		{
//			System.out.println("You are not allowed to eat more than exist on me :/ :X");
			popup.displayText("You are not allowed to eat more than exist on me :/ :X");
		}
		else
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - armEat);
//			System.out.println("OK, now I have this many arms " + currentMonster.getArmCount());
			popup.displayText("OK, now I have this many arms " + currentMonster.getArmCount());
		}

		System.out.println("Alright! Now how many tentacles do you want?");
		int tentacleAmount = myScanner.nextInt();

		if (tentacleAmount == 0)
		{
//			System.out.println("Geez, did you eat dinner or something?");
			popup.displayText("Geez, did you eat dinner or something?");
		}
		else if (tentacleAmount > 2)
		{
//			System.out.println("Ok, I need to keep 2 to walk with and I cannot give you a negative amount of tentacles.");
			popup.displayText("Ok, I need to keep 2 to walk with and I cannot give you a negative amount of tentacles.");
		}
		else
		{
			currentMonster.setTentacleAmount(currentMonster.getTentacleAmount() - tentacleAmount);
//			System.out.println("Alright I have this many tentacles left " + currentMonster.getTentacleAmount());
			popup.displayText("Alright I have this many tentacles left " + currentMonster.getTentacleAmount());
		}
		
		System.out.println("How many eyes do you want to eat? I have " + currentMonster.getEyeCount());
		double food = myScanner.nextDouble();
		
		if(food == currentMonster.getEyeCount())
		{
			System.out.println("you ate all my eyes!!!");
		}
		else
		{
			System.out.println("More likely");
		}

		popup.displayText("Hi there ready to play???");
		myScanner.close();
		String answer = popup.getResponse("What is the air speed of a coconut laden swallow?");
		System.out.println(answer);
		
	}
	
	
	//Helper Method
	private boolean isValidInteger(String sample)
	{
		boolean valid = false;
		
		try
		{
			Integer.parseInt(sample);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("You need to input an int, " + sample + " is not valid.");
		}
		
		return valid;
	}	
}
