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
		int count = 0;
//		while(count < 10)
//		{
//			popup.displayText("Am I not the coolest??!");
//			count +=2;
//		}
		
//		for(int loop = 0; loop < 10; loop += 1)
//		{
//			popup.displayText("This is loop # " + (loop + 1) + " of ten");
//		}
		
		
		MarshmallowMonster basic = new MarshmallowMonster();
		System.out.println(basic);
		popup.displayText(basic.toString());
		MarshmallowMonster YeahBoi = new MarshmallowMonster("Weird YeahBoi Monster", 15, 4, 4.5, true);
//		System.out.println(YeahBoi);
		popup.displayText(YeahBoi.toString());
//		System.out.println("I am feeling hungry, I am going to eat one of fred's arms");
		popup.displayText("I am feeling hungry, I am going to eat one of YeahBoi's arms");
		YeahBoi.setArmCount(YeahBoi.getArmCount() - 3);
//		System.out.println(YeahBoi);
		popup.displayText(YeahBoi.toString());
//		System.out.println("Hey I need more... Give Me MORE!"); <---- This is just extra stuff I don't want
//		popup.displayText("Hey I need more... Give Me MORE!");  <----
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
		
		while(!isValidInteger(response))
		{
			popup.displayText("grrr type in a betteer answer next time");
			response = popup.getResponse("Type in a integer value!");
		}	
		consumed = Integer.parseInt(response);
//		if(isValidInteger(response))
//		{
//			consumed = Integer.parseInt(response);
//		}
		
//		I have no idea what's going on with the code underneath this comment :L
		
//		int armEat = 0; myScanner.nextInt();
		int armEat;
//		currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
//		System.out.println(currentMonster);
//		System.out.println("How many arms are you interested in eating? I currently have " + currentMonster.getArmCount());
		String armResponse = popup.getResponse(currentMonster.getName() + "wants to kno how many arms are you interested in eating? I currently have " + currentMonster.getArmCount());
		
		while(!isValidInteger(armResponse))
		{
//			popup.displayText("You need to type in a correct Integer");
			armResponse = popup.getResponse("Please Type in a CORRECT response...");
		}
		armEat = Integer.parseInt(armResponse);
		// I don't think I needed to add this //
//		if(isValidInteger(armResponse))
//		{			
//			consumed = Integer.parseInt(armResponse);
//		}
		// ----------------------------------- //
//		consumed = myScanner.nextInt();

		if (armEat == 0)
		{
//			System.out.println("Not hungry? Thank Goodness...");
			popup.displayText("Not hungry? Thank Goodness...");
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

//		System.out.println("Alright! Now how many tentacles do you want?");
		popup.displayText("Alright! Now onto tentacles!");
//		int tentacleAmount = myScanner.nextInt();
		int tentacleAmount;
		String tentacleResponse = popup.getResponse(currentMonster.getName() + "wants to know how many tentacles you interested in eating? I currently have " + currentMonster.getTentacleAmount());
		
		while(!isValidInteger(tentacleResponse))
		{
			tentacleResponse = popup.getResponse("Look PLEASE Type in a correct integer!!! >:(");
		}
		tentacleAmount = Integer.parseInt(tentacleResponse);
		
//		double food = 0.0;
//		String tentacleResponse = popup.getResponse("");
//		if(isValidDouble(tentacleResponse))
//		{
//			food = Double.parseDouble(tentacleResponse);
//		}
		
		
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
//		double food = myScanner.nextDouble();
		double food;
//		if(food == currentMonster.getEyeCount())
//		{
//			System.out.println("you ate all my eyes!!!");
//			popup.displayText("you ate all my eyes!!!");
//		}
//		else
//		{
//		System.out.println("More likely");
//		}

		popup.displayText("Hi there ready to play???");
		myScanner.close();
		String answer = popup.getResponse("What is the air speed of a coconut laden swallow?");
		System.out.println(answer);
		
		
		myScanner.close();
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
	
	private boolean isValidDouble(String sampleDouble)
	{
		boolean valid = false;
		
		try
		{
			Double.parseDouble(sampleDouble);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("You neeed to type in a doulbe - " + sampleDouble + " is not a valid answer.");
		}
		
		return valid;
	}
	
	private boolean isValidBoolean(String sampleBoolean)
	{
		boolean valid = false;
		
		try
		
		{
			Boolean.parseBoolean(sampleBoolean);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("Type in a boolean value" + sampleBoolean + " does not count.");
		}
		
		return valid;
	}
	
}
