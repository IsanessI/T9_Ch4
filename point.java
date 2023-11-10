import java.util.Scanner;

public class point implements instruments {
	Integer posX, posY;
	public point()
	{
		
	}
	public point(int ent_posX, int ent_posY)
	{
		posX = ent_posX;
		posY = ent_posY;
	}
	
	public void set()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a coordinates: ");
		posX = in.nextInt();
		posY = in.nextInt();
	}
	public int getX()
	{
		return posX;
	}
	public int getY()
	{
		return posY;
	}
	public void setX(int x)
	{
		posX = x;
	}
	public void setY(int y)
	{
		posY = y;
	}
	
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		point pnt = (point)obj;
		return posX == pnt.posX && posY == pnt.posY;
	}
	public String toString()
	{
		return "coordinates: " + posX.toString() + " " + posY.toString();
	}
	public int hashCode()
	{
		return posX + posY;
	}
}
