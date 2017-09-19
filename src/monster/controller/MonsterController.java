package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController
{
	
	public void start()
	{
		MarshmallowMonster basic = new MarshmallowMonster();
		System.out.println(basic);
		MarshmallowMonster YeahBoi = new MarshmallowMonster("Weird YeahBoi Monster", 15, 4
				, 4.5, true);
		System.out.println(YeahBoi);
		System.out.println("I am feeling hungry, I am going to eat one of fred's arms");
		YeahBoi.setArmCount(YeahBoi.getArmCount() - 3);
		System.out.println(YeahBoi);
		System.out.println("Hey I need more... Give Me MORE!");
		YeahBoi.setTentacleAmount(YeahBoi.getTentacleAmount() - 1);
		System.out.println(YeahBoi);
		System.out.println("Lets Eat!");
		YeahBoi.setEyeCount(YeahBoi.getEyeCount() - 5);
		System.out.println(YeahBoi);
		
		interactWithMonster(YeahBoi);
		
	}
	
	private void interactWithMonster(MarshmallowMonster currentMonster)
	{
		Scanner myScanner = new Scanner(System.in);
		System.out.println(currentMonster.getName() + " wants to know how many eyes you want to eat, please type in how many");
		int consumed = myScanner.nextInt();
		currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
		System.out.println(currentMonster);
		
		System.out.println("How many arms are you interested in eating?" + currentMonster.getArmCount());
		//consumed = myScanner.nextInt();
		int armEat = myScanner.nextInt();
		
		if(armEat == 0)
		{
			System.out.println("Not hungry? Thank Goodness...");
		}
		else if(armEat < 0)
		{
			System.out.println("Math Is going to be your downfall, I cannot give you negative amounts!");
		}
		else if(armEat > currentMonster.getArmCount())
		{
			System.out.println("You are not allowed to eat more than exist on me :/ :X");
		}
		else
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - armEat);
			System.out.println("OK, now I have this many arms " + currentMonster.getArmCount());
		}
		
		
		myScanner.close();
	}
}
