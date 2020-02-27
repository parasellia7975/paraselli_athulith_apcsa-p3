//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	static int distance = 0;
	static boolean foundOdd = false;
	public static int go(int[] ray)
	{
		for(int i = 0; i<ray.length; i++) {
			if(ray[i]%2 == 1) {
				foundOdd = true;
			}
			if(ray[i]%2 == 1 && (foundOdd == true)) {
				distance += 1;
			}
			if(ray[i]%2 == 0 && (foundOdd == true)) {
				return distance;
			}
		}
		return -1;
	}
}