
public class App_Leap {
	public boolean isLeap(int year){
		boolean leap = false;
		if(year / 4 == 0){ //�����4����
			if(year / 100 == 0) {//�����100����
				if(year / 400 ==0) {	//�����400����
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
