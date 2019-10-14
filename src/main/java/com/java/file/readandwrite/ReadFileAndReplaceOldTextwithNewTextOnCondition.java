package com.java.file.readandwrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReadFileAndReplaceOldTextwithNewTextOnCondition {
	
	private String customerName;
	private Long titleListId;
	private String titleListDescription;
	private Long title_id;
	private String title_name;
	private Date license_start_date;
	private Date license_end_date;
	private Long window;
	private Long total_fee;
	private String assign_to;
	
	public static void main(String[] args) {
		String filePath = System.getProperty("user.dir")
				+ "/src/main/java/com/java/file/readandwrite/ReadFileAndReplaceOldTextwithNewTextOnCondition.java";
		File fileToBeModified = new File(filePath);
		log.info("FilePath: "+ fileToBeModified.getAbsolutePath());
		BufferedReader reader = null;
		FileWriter writer = null;
		try {
			reader = new BufferedReader(new FileReader(fileToBeModified));
			String line = "", oldContent = "", newContent = "";
			while((line = reader.readLine()) != null) {
				if (line.contains("_")) {
					String[] splitLine = line.split("_");
					
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
		}
	}
}