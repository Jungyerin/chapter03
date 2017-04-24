package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = null;
		// 기반 스트림은 system.in(표준입력, 키보드)을 사용함
		try {
			InputStreamReader isr = new InputStreamReader(System.in, "utf-8");
			br = new BufferedReader(isr);

			while (true) {
				System.out.print(">>");

				String line = br.readLine();

				if (line == null) {
					break;
				}
				if ("exit".equals(line) == true) {
					break;
				}

				System.out.println(line);

			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
