package codegym;

import java.io.File;

public class a12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "C:/Users/user/Desktop/test";
		// 建立資料夾
		IOUtil.createFolder(fileName);
		
		// 讀取資料夾目錄	
		String[] files = IOUtil.readFolder(fileName);
		for(String name : files){
			System.out.println(name);
		}
		
		// 刪除檔案
//		IOUtil.deleteFolder(fileName);

		String fileName2 = "C:/Users/user/Desktop/test/abc.txt";
		
		IOUtil.readTxtFile(fileName2);

		// Test writeTxtFile()
		String fileName3 = "C:/Users/user/Desktop/test/write.txt";
		IOUtil.writeTxtFile(fileName3);
		
		// Test copyPictureFile
//		String source = "/Users/Shared/tmp/girl.jpg";
//		String dest = "/Users/Shared/tmp/dest/girl.jpg";
//		
//		IOUtil.copyPictureFile(new File(source), new File(dest));		
		
		System.out.println("end");
	}

}
