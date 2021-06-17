import java.io.*;
import java.lang.*;
import java.util.*;

class Point implements Comparable<Point>
{
	int x,y;
	
	Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public int compareTo(Point p)
	{
		return this.x-p.x;
	}	
}


class ClassSort
{
	public static void main(String args[])
	{
		Point arr[]={
			new Point(23,7),
			new Point(8,2),
			new Point(23,5),
			new Point(5,4),
			new Point(8,1)
		};
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].x+" "+arr[i].y);
		}
	}
}