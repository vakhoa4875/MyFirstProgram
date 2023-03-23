package fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//dùng để surround những câu lệnh có tiềm năng gặp lỗi
		try {
			FileWriter writer = new FileWriter("poem.txt");
			// turn the file to blank, then write those into the file
			writer.write("Roses are red\nViolet are blue\nBooty booty");
			// append to file
			writer.append("\n(poem by khoa)");
			writer.close();
		}
		//bắt lỗi nếu xảy ra trường hợp lỗi như bên dưới
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
