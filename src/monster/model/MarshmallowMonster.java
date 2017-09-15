package monster.model;

public class MarshmallowMonster
{
	//Declaration section of data members
	
	private String name;
	private int eyeCount;
	private int armCount;
	private double tentacleAmount;
	private boolean hasBloop;
	
	
	public MarshmallowMonster()
	{
		//initializes everything to 0, false or null.
	}
	
	public MarshmallowMonster(String name, int eyeCount, int arms, double tentacleCount, boolean hasBloop)
	{
		this.name = name;
		this.eyeCount = eyeCount;
		this.armCount = arms;
		this.tentacleAmount = tentacleCount;
		this.hasBloop = hasBloop;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public int getArmCount()
	{
		return armCount;
	}
	
	public double getTentacleAmount()
	{
		return tentacleAmount;
	}
	
	public boolean hasBloop()
	{
		return hasBloop;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	
	public void setArmCount(int armCount)
	{
		this.armCount = armCount;
	}
	
	public void setTentacleAmount(double tentacleAmount)
	{
		this.tentacleAmount = tentacleAmount;
	}
	
	public void setBloop(boolean hasBloop)
	{
		this.hasBloop = hasBloop;
	}
	
	
	public String toString()
	{
		String description = "Eyy Boi, my name is " + name + ", I contain " + eyeCount + " eye holes inside of the skullular region, I also contain ";
		description += tentacleAmount + " tentacles but I have " + armCount + " swole arms!. " + hasBloop + " communicates to you ";
		description += "if I have some sort of bloop";
		
		return description;
	}
}
