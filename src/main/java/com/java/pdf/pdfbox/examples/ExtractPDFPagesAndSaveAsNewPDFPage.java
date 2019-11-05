package com.java.pdf.pdfbox.examples;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;

/**
 * 
 * @version 2.0.16
 * 
 * @author udaykiran.pulipati
 * 
 */

public class ExtractPDFPagesAndSaveAsNewPDFPage {
	public static void main(String[] args) {
		try {
			String sourceDir = "C:\\Users\\Priyanka\\Downloads\\04-Request-Headers.pdf";
			String destinationDir = "C:\\Users\\Priyanka\\Downloads\\PDFCopy\\";
			File oldFile = new File(sourceDir);
			String fileName = oldFile.getName().replace(".pdf", "");
			if (oldFile.exists()) {
				File newFile = new File(destinationDir);
				if (!newFile.exists()) {
					newFile.mkdir();
				}

				PDDocument document = PDDocument.load(oldFile);
				
				int totalPages = document.getNumberOfPages();
				System.out.println("Total Pages: "+ totalPages);
				if(totalPages > 0) {
					Splitter splitter = new Splitter();
					
					List<PDDocument> Pages = splitter.split(document);
					Iterator<PDDocument> iterator = Pages.listIterator();

					//Saving each page as an individual document
					int i = 1;
					while(iterator.hasNext()) {
						PDDocument pd = iterator.next();
						String pagePath = destinationDir + fileName + "_" + i + ".pdf";
						pd.save(pagePath);
						System.out.println("Page "+ i +", Extracted to : "+ pagePath);
						i++;
					}
				} else {
					System.err.println("Blank / Empty PDF file: "+ fileName  +", Contains "+ totalPages +" pages.");
				}
			} else {
				System.err.println(fileName + " File not exists");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}