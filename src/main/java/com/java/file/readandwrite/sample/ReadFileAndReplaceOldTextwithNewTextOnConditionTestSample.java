package com.java.file.readandwrite.sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

import lombok.Data;

@Data
public class ReadFileAndReplaceOldTextwithNewTextOnConditionTestSample {

	private String customer_name;
	private Long title_list_id;
	private String title_list_description;
	private Long title_id;
	private String title_name;
	private Date license_start_date;
	private Date license_end_date;
	private Long window;
	private Long total_fee;
	private String assign_to;
	public static void main(String[] args)
	{
		String projectPath = System.getProperty("user.dir");
		String path = "/src/main/java/com/java/file/readandwrite/sample/";
		String fileName ="ReadFileAndReplaceOldTextwithNewTextOnConditionTestSample.java";
		File f = new File(projectPath +"\\"+ path +"\\"+ fileName);
		String pathName = f.getAbsolutePath();
		System.out.println("FilePath: "+ pathName);
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(pathName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String line = "";
		while(line != null)
		{
			try {
				line = reader.readLine();
				if (line != null) {
					System.out.println(line);					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
