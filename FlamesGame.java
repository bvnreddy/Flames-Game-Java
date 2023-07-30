package demo.p1;

//  Flames Game !!! F = Friends, L = Love, A = Affection, M = Marriage, E = Enemy, S = Siblings...

public class FlamesGame {
	public String flames(String boyName, String girlName) {
		String boy = "";
		String girl = "";
		String data = "flames";
		String data1 = data;
		String s1 = boyName.replaceAll("\\s", "");
		String s2 = girlName.replaceAll("\\s", "");
		char[] boyData = s1.toLowerCase().toCharArray();
		char[] girlData = s2.toLowerCase().toCharArray();
		for (int i = 0; i < boyData.length; i++) {
			for (int j = 0; j < girlData.length; j++) {
				if (boyData[i] == girlData[j]) {
					girlData[j] = '0';
					boyData[i] = '0';
					break;
				}
			}
		}
		for (int i = 0; i < boyData.length; i++) {
			if (!(Character.isDigit(boyData[i]))) {
				char ch = boyData[i];
				boy = boy + ch;
			}
		}
		int a = boy.length();
		for (int i = 0; i < girlData.length; i++) {
			if (!(Character.isDigit(girlData[i]))) {
				char ch = girlData[i];
				girl = girl + ch;
			}
		}
		int b = girl.length();
		int sizeOfName = (a + b) - 1;
		for(int i = 0; i < data1.length(); i++) {
			data = data.substring(sizeOfName % data.length() + 1) + data.substring(0, sizeOfName % data.length());
			if(data.length()==1)
				return data;
		}
		return data;
	}

	public static void main(String[] args) {
		FlamesGame obj = new FlamesGame();
		String r = obj.flames("Venkat Reddy", "palavi Reddy");
		System.out.println(r);
	}
}
