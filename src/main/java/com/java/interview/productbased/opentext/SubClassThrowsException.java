package com.java.interview.productbased.opentext;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SubClassThrowsException extends BaseClassThrowsException {
	
	@Override
	public List<String> throwsNoException() {
		List<String> fileNames = new ArrayList<String>();
		return fileNames;
	}
	
	@Override
	public List<String> throwsFileNotFoundExceptionAndIOException() throws FileNotFoundException, IOException {
		List<String> fileNames = new ArrayList<String>();
		return fileNames;
	}
	
	@Override
	public List<String> throwsFileNotFoundExceptionAndIOExceptionAndArrayIndexOutOfBoundsException()
			throws FileNotFoundException, IOException, ArrayIndexOutOfBoundsException, NullPointerException {
		List<String> fileNames = new ArrayList<String>();
		return fileNames;
	}
	
	@Override
	public List<String> throwsFileNotFoundException() {
		List<String> fileNames = new ArrayList<String>();
		return fileNames;
	}
	
}
