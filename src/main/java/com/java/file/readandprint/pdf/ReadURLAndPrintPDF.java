package com.java.file.readandprint.pdf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FilenameUtils;
import org.apache.pdfbox.pdmodel.PDDocument;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReadURLAndPrintPDF {
	
	public static void main(String[] args) {
		File targetFile = null;
		PDDocument document = null;
		try {
			URL url = new URL("https://drive.google.com/open?id=0Bwz1Xin_KMzya1RtN3E0b2plam02YXhPLXlsUlhYUkRTdUtV");
			InputStream inputStream = url.openStream();
			String fileName = null;
			fileName = FilenameUtils.getName(url.getPath());
//			fileName = Paths.get(new URI(url.getFile()).getPath()).getFileName().toString();
			
			byte[] buffer = new byte[inputStream.available()];
		    inputStream.read(buffer);
		 
		    targetFile = new File(System.getProperty("user.dir") + "/src/main/resources/upload_files/" + fileName + "_"
					+ ZonedDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH_mm_ss_SSS")) + ".pdf");
		    log.info("Reading PDF : {}", targetFile.getName());
		    OutputStream outStream = new FileOutputStream(targetFile);
		    outStream.write(buffer);
		    if (outStream != null) {
		    	outStream.close();
		    }
		    
//			if (targetFile != null) {
//				log.info("Reading PDF file: {}", targetFile.getName());
//				document = PDDocument.load(targetFile, "file_password");
//				if (document.isEncrypted()) {
//					PDFTextStripper stripper = new PDFTextStripper();
//					String text = stripper.getText(document);
//					String[] lines = text.split("\\r?\\n");
//					for (String line : lines) {
//						System.out.println(line);
//					}
//				} else {
//					log.error("Encrypted Document: {}", targetFile.getName());
//				}
//			}
			
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
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
