package com.java.convert.word;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public class ReadWordDocumentAndFormatData {
	public static void main(String[] args) {
		FileInputStream fis = null;
		XWPFDocument document = null;
		try {
			String projectDir = System.getProperty("user.dir");
            File file = new File(projectDir +"/src/main/resources/read_files/Answers.docx");
            if (file.exists()) {
            	System.out.println("Reading File: "+ file.getAbsolutePath());
            	fis = new FileInputStream(file.getAbsolutePath());
            
            	document = new XWPFDocument(fis);

                List<XWPFParagraph> paragraphs = document.getParagraphs();
                String containsData = "Q.", uptoLength = "", answer = "";
                int answerCountPerRow = 0;
                for (XWPFParagraph para : paragraphs) {
                	if (para.getText().contains(containsData)) {
                		uptoLength += para.getText() +"		";
                		answerCountPerRow++;
                	}
                	// print upto 5 answers in a row
            		if (answerCountPerRow == 5) {
            			answer = answer + uptoLength.trim() + "\n\n";
            			uptoLength = "";
            			answerCountPerRow = 0;
            		}
                }
                //print upto 4 answers
                if (answerCountPerRow != 0 && answerCountPerRow < 5) {
                	answer = answer + uptoLength.trim() +"\n\n";
                }
                System.out.println(answer);
            } else {
            	System.err.println("File not found: "+ file.getName() +" at location: "+ file.getAbsolutePath());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
			try {
				if (fis != null) {
					fis.close();
				}
				if (document != null) {
					document.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
