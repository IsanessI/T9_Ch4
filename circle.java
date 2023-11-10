public class circle
{
	circumference circum;
	
	public circle()
	{
		circum = new circumference();
	}
	
	public void set() 
	{
		circum.set();
	}
	
	public boolean belongs(int posX, int posY)
	{
		int x = Math.abs(posX - circum.getCenter().getX());
		int y = Math.abs(posY - circum.getCenter().getY());
		boolean f = Math.pow(circum.getRadius(), 2) >= (Math.pow(x, 2) + Math.pow(y, 2));
		return f;
	}
	
	public void setRadius(int rad)
	{
		circum.setRadius(rad);
	}
	public void setPoint(int ent_posX, int ent_posY)
	{
		circum.setCenter(new point(ent_posX, ent_posY));
	}
	
	public int hashCode()
	{
		return circum.hashCode();
	}
	public String toString()
	{
		return circum.toString();
	}
	public boolean equals(Object obj)
	{
		if (this == obj) 
			return true;
		if (obj == null || obj.getClass() != getClass()) 
			return false;
		circle crc = (circle)obj;
		return circum.equals(crc.circum);
	}
}