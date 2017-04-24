package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {

		BufferedReader br = null;

		try {
			File file = new File("phone.txt");

			if (file.exists() == false) // 파일이 있는지 없는지 확인이 가능
			{
				System.out.println("파일이 존재 하지 않습니다.");
				// System.exit(0); //종료코드에 따라서 os가 종료시켜줌
				return; // 강제종료
			}

			System.out.println("============================파일정보=================================");

			System.out.println("경로 : " + file.getAbsolutePath());
			System.out.println("크기 : " + file.length() + "Bytes");
			Date d = new Date(file.lastModified());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:dd");
			System.out.println("마지막 수정 : " + sdf.format(d));

			System.out.println("============================전화번호=================================");

			FileInputStream fis = new FileInputStream(file); // 주스트림
			InputStreamReader isr = new InputStreamReader(fis, "utf-8"); // 보조스트림
			br = new BufferedReader(isr);
			
			String line=null;
			while((line=br.readLine())!=null){
				StringTokenizer st=new StringTokenizer(line, "\t ");
				
				int index=0;
				while(st.hasMoreTokens()){
					String s=st.nextToken();
					if(index==0){
						System.out.print(s+":");
					}else if(index==1)
					{
						System.out.print(s+"-");
					}else if(index==2)
					{
						System.out.print(s);
					}else if(index==3)
					{
						System.out.print("-"+s);
					}
					index++;
					
				}
				System.out.println();
				
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
