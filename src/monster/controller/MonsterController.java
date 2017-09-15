package monster.controller;

import monster.model.MarshmallowMonster;

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
	}
}
