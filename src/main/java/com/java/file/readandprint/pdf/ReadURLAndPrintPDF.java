package com.java.file.readandprint.pdf;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.pdfbox.pdmodel.PDDocument;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReadURLAndPrintPDF {
	
	public static void main(String[] args) {
		File file = null;
		PDDocument document = null;
		try {
			StringBuilder content = new StringBuilder();
			URL url = new URL("https://drive.google.com/open?id=0Bwz1Xin_KMzya1RtN3E0b2plam02YXhPLXlsUlhYUkRTdUtV");
			InputStream inputStream = url.openStream();
			String fileName = null;
			fileName = FilenameUtils.getName(url.getPath());
//			fileName = Paths.get(new URI(url.getFile()).getPath()).getFileName().toString();
			file = new File(System.getProperty("user.dir") +"/src/main/resources/upload_files/"+ fileName +".pdf");
			FileUtils.copyInputStreamToFile(inputStream, file);
//			// wrap the urlconnection in a bufferedreader
//		      BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//
//		      String line;
//
//		      // read from the urlconnection via the bufferedreader
//		      while ((line = bufferedReader.readLine()) != null)
//		      {
//		        content.append(line + "\n");
//		      }
//		      bufferedReader.close();
		      
//			if (file != null) {
//				document = PDDocument.load(file);
//				if (!document.isEncrypted()) {
//					PDFTextStripper stripper = new PDFTextStripper();
//					String text = stripper.getText(document);
//					String[] lines = text.split("\\r?\\n");
//					for (String line : lines) {
//						System.out.println(line);
//					}
//				} else {
//					log.error("Encrypted Document: {}", file.getName());
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
