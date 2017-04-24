package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneList02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			Scanner scanner = new Scanner(file);
			
			while(scanner.hasNextLine())
			{
				String name=scanner.next();
				String phone1=scanner.next();
				String phone2=scanner.next();
				String phone3=scanner.next();
				
				System.out.println(name+":"+phone1+"-"+phone2+"-"+phone3);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
