package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		BufferedReader br = null;  //보조스트림을 밖으로 빼서 자원정리를 해줄 수 있다.
		try {
			FileReader fr = new FileReader("./src/Util/BufferedReaderTest.java");
			br = new BufferedReader(fr);

			int index=0;
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(++index+":"+line);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("io error");
		} finally {

			try {
				if (br != null) {
					br.close(); //보조스트림 형의 br이 null이 아닐때 자원정리는 해줌. 예외가 발생할수도 있기때문에 trycatch문을 써준다.
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
