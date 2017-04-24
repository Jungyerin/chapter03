package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("./1.png");
			fos = new FileOutputStream("./2.png");

			int data = -1;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 없음:" + e);
		} catch (IOException e) {
			System.out.println("I/O 오류:" + e);
			// checked exception
		} finally {
			// 자원정리
			try {
				if (fis != null) {
					fis.close();
				}
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				System.out.println("I/O 오류:" + e);
			}
		}

	}

}
