package com.java.interview.productbased.opentext;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BaseClassThrowsException {

	public List<String> throwsFileNotFoundExceptionAndIOException() throws FileNotFoundException, IOException, NullPointerException {
		List<String> fileNames = new ArrayList<String>();
		return fileNames;
	}

	public List<String> throwsFileNotFoundExceptionAndIOExceptionAndArrayIndexOutOfBoundsException()
			throws FileNotFoundException, IOException, ArrayIndexOutOfBoundsException {
		List<String> fileNames = new ArrayList<String>();
		return fileNames;
	}

	public List<String> throwsNoException() {
		List<String> fileNames = new ArrayList<String>();
		return fileNames;
	}

	public List<String> throwsFileNotFoundException() throws FileNotFoundException {
		List<String> fileNames = new ArrayList<String>();
		return fileNames;
	}
}
