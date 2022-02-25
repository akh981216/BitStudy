package jp03;
import java.io.*;
public class FileInfo {
	//main method
	public static void main(String[] args) {
		System.out.println("파일 이름을 넣으세요");
		
		String name = "";
		//=>NullString= =>STring s => new String() 과 같은 의미
		//=> String s = null과 구분
		
		//파일 이름을 받아들임
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			name = in.readLine();
		}catch(Exception e) {
			e.printStackTrace();
		}
		//File클래스 객체 생성
		File file =new File(name);
		
		//file이 존재한다면 file 관련된 information출력
		if(file.exists()) {
			System.out.println("파일 이름:"+file.getName());
			System.out.println("상대 패스:"+file.getPath());
			System.out.println("절대 패스:"+file.getAbsolutePath());
			System.out.println("쓰기 가능:"+file.canWrite());
			System.out.println("읽기 가능:"+file.canRead());
			System.out.println("파일 길이:"+file.length()+"바이트");
		}else {
			System.out.println("해당 파일은 존재하지 않습니다.");
		}
	}//end of main
}//end of class
