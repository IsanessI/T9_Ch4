import java.util.Scanner;

public class circumference implements instruments {
	point center;
	Integer radius;
	
	public circumference()
	{
		center = new point();
	}
	public circumference(int ent_posX, int ent_posY, int ent_radius)
	{
		center = new point(ent_posX, ent_posY);
		radius = ent_radius;
	}
	
	public void set()
	{
		Scanner in = new Scanner(System.in);
		
		center.set();
		System.out.print("Enter radius: ");
		radius = in.nextInt();
	}
	public void setRadius(int rad)
	{
		radius = rad;
	}
	public void setCenter(point pnt)
	{
		center = pnt;
	}
	public Integer getRadius()
	{
		return radius;
	}
	public point getCenter()
	{
		return center;
	}
	public String toString()
	{
		return center.toString() + " radius: " + radius.toString();
	}
	public int hashCode()
	{
		return center.hashCode() + radius;
	}
	public boolean equals(Object obj)
	{
		if (this == obj) 
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		circumference crc = (circumference)obj;
		return crc.center.equals(center) && radius == crc.radius;
	}
}
