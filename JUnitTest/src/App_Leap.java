
public class App_Leap {
	public boolean isLeap(int year){
		boolean leap = false;
		if(year / 4 == 0){ //如果被4整除
			if(year / 100 == 0) {//如果被100整除
				if(year / 400 ==0) {	//如果被400整除
					leap = true;
				}else{
					leap = false;
				}
			}else{
				leap = false;
			}
		}else{
			leap = true;
		}
		return leap;
	}
}
