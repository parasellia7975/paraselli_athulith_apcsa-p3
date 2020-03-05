//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int distance = 0;
		int lastEven =0;
		for(int i = 0; i<ray.size(); i++) {
			if(lastEven == 0) {
			if(ray.get(i)%2 == 1) {
				for(int k = i; k<ray.size(); k++) {
					if(ray.get(k)%2 == 1) {
						distance = distance + 1;
					}
					else if(ray.get(k)%2 == 0) {
						distance = distance +1;
						lastEven = distance;
					}
				}
			}
			}
		}
		if(lastEven == 0)
		return -1;
		return lastEven-1;
	}
}