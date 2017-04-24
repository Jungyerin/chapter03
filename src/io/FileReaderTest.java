package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {


	public static void main(String[] args) {
	
		FileReader fr=null;
		FileInputStream fis=null;
		try {
			fr=new FileReader("hello.txt");
			fis=new FileInputStream("hello.txt");
			
			int count=0;
			int data=-1;
			while((data=fr.read())!=-1)
			{
				count++;
				System.out.print((char)data);
			}
			System.out.println("\n읽은횟수  : "+count);
			System.out.println("===================================================="); //3byte씩 읽고 인코딩
			count=0;
			while((data=fis.read())!=-1)
			{
				count++;
				System.out.print((char)data);
			}
			System.out.println("\n읽은횟수  : "+count);
			System.out.println("===================================================="); //1byte씩 읽어서 깨짐
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일없음 : "+e);
		}catch(IOException e)
		{
			System.out.println("IO error. "+e);
		} //file 예외와 io 예외의 자리를 바꾸면 에러가 나는데 그 이유는 파일 예외가 아이오예외보다 자식이기 때문이다.
		finally{
			try{
				if(fr!=null)
				{
					fr.close();
				}
				if(fis!=null)
				{
					fis.close();
				}
			}catch(IOException e)
			{
				System.out.println("내용없음");
			}
		}

	}

}
