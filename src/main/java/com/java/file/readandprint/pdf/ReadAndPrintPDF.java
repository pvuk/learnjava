package com.java.file.readandprint.pdf;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReadAndPrintPDF {
	public static void main(String[] args) {
		File file = new File(System.getProperty("user.dir") +"/src/main/resources/upload_files/SE_List_1.pdf");
		if (file != null) {
			PDDocument document = null;
			try {
				document = PDDocument.load(file);
				if (!document.isEncrypted()) {
					PDFTextStripper stripper = new PDFTextStripper();
					String text = stripper.getText(document);
					String[] lines = text.split("\\r?\\n");
					for (String line : lines) {
						System.out.println(line);
					}
				} else {
					log.error("Encrypted Document: {}", file.getName());
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (document != null) {
						document.close();	
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
