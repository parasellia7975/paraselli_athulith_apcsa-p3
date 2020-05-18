import java.util.ArrayList;

public class digits {
	
private ArrayList<Integer> digitList;

public digits(int num){
digitList = new ArrayList<Integer>();
while(num>=0){
digitList.add(0,(num%10));
num = num/10;
	}
		
}

public boolean isStrictlyIncreasing(){
for(int i = 0; i<digitList.size()-1; i++){
if(digitList.get(i)>digitList.get(i+1)){
return false;
}
}
return false;
}



public String toString() {
	String output = " ";
	for(int i = 0; i<digitList.size(); i++) {
		output = " " + digitList.get(i);
	}
	return output;
}
}



