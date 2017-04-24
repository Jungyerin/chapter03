package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		
		try {
			fos=new FileOutputStream("123.txt");
			bos=new BufferedOutputStream(fos, 5);//fileoutput을 buffer에 넣어서 확장 시킴.
			
			for(int i='1';i<'9';i++) //캐릭터가 가지는 아스키코드값을 i에 할당
			{
				bos.write(i);
				bos.flush(); //flush가 없으면 io가 글자 수 만큼 일어나게 되는데 (9번일어남.)
							//flush를 이용하면 버퍼가 차지 않은 상태에서 플러시를 하기 때문에 2번만 일어난다.?? 버퍼를 열어주어서? 연결?
			}
			
//			for(int i=49;i<57;i++) 
//			{
//				
//			}   위의 포문과 같은 의미
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일없음 : "+e);
		}catch(IOException e){
			System.out.println("io error");
		}finally{
			try{
				if(bos!=null)
				{
					bos.close();
				}
			}catch(IOException e){
				System.out.println("io error."+e);
			}
		}

	}

}
