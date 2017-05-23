package oo.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;

public class SimpleWrite {

	public static void main(String[] args) {
		try{
			FileOutputStream fos = new FileOutputStream("data.txt");  //myproject底下
			fos.write(66);  //ASCII碼→B
			fos.flush();
			fos.close();   //可寫可不寫
		}catch(FileNotFoundException e){
			e.printStackTrace();   //未來再寫錯誤訊息
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
