package Obsquara.NewProject;

import java.io.IOException;


public class TestExcel {

	public static void main(String[] args) throws IOException {
		String s = Excelcode.readStringData(0, 0);
		System.out.println(s);
		String s1 = Excelcode.readStringData(1, 0);
		System.out.println(s1);
		String s2 = Excelcode.readStringData(0, 1);
		System.out.println(s2);
		double d = Excelcode.readNumericData(1, 1);
		System.out.println(d);


	}

}
