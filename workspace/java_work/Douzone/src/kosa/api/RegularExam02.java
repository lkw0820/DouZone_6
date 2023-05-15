package kosa.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data[] = {
				"bat", "bba", "bbg", "bonus",
				"CA", "ca", "c232", "car",
				"date", "dic", "diraaa"
		};
		Pattern p = Pattern.compile("^[\\w\\W]*[a|A]$");
		for(int i=0;i<data.length;i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches()) {
				System.out.println(data[i]);
			}
		}
	}

}
