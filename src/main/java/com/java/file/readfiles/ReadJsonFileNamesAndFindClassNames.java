package com.java.file.readfiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * 
 * @author venkataudaykiranp
 * @version 1, changes on Thu 28-Nov-2019 12:29
 */
public class ReadJsonFileNamesAndFindClassNames {
	String basePackage = "com.spring.transaction.model";
	
	public static void main(String[] args) {
		insertCodeDocumentsFromJSON();
//		convertFileNameIntoClassName();
	}
	
	private static void convertFileNameIntoClassName() {
		String fileName = "years_of_experience_code";
		if(fileName.contains("_")) {
			fileName = fileName.substring(0, fileName.lastIndexOf("_"));//Removes 'code' from string(MakeItAsClassName)
		}
		/**
		 * 1. years_of_experience_code updated to YearsOfExperience
		 * 2. name.substring(0, 1) gets 0 to 1 index char(First char)
		 * 3. name.substring(1) gets all chars after 1st index
		 */
		System.out.println(Stream.of(fileName.trim().split("_")).filter(name -> name.length() > 0).map(name->name.substring(0, 1).toUpperCase() + name.substring(1)).collect(Collectors.joining()));
		
	}
	
	/**
	 * <a href="https://www.programcreek.com/java-api-examples/?api=com.fasterxml.jackson.databind.JavaType">Java Code Examples for com.fasterxml.jackson.databind.JavaType</a>
	 */
	JavaType typeFromId(String id, TypeFactory typeFactory) throws IllegalStateException {
		String className = basePackage + "." + id;
	    try {
	        return typeFactory.constructType(typeFactory.findClass(className));
	    } catch (ClassNotFoundException ex) {
	        throw new IllegalStateException("Could not find event class for type " + id, ex);
	    }
	}
	 
	private static void insertCodeDocumentsFromJSON() {
//		String resourceLocation = "D:\\uday\\Workspace\\2019-09\\learn git\\spring_boot_demo\\target\\classes\\json";
		String resourceLocation = "D:\\Workspace\\2019-09\\Practice\\spring_boot_demo\\src\\main\\resources\\json";
		try {
			File file = ResourceUtils.getFile(resourceLocation);
			String insertFilesFolder = "put";
			Files.walk(Paths.get(file.toURI()))
			.filter(Files::isDirectory)
			.filter(f-> {
				String jsonSubFolder = f.toFile().getPath();
				//lastIndexOf("\\") gets \json. lastIndexOf("\\")+1 gets json.
				if(insertFilesFolder.equals(jsonSubFolder.substring(jsonSubFolder.lastIndexOf("\\")+1))) {
					return true;
				}
				return false;
			})
//			.filter(f->{
			//filter code files
//				return f.toFile().listFiles((filterCodeDocuments)->{return filterCodeDocuments.toString().contains("code");}) != null;
//			})
			.forEach(f -> {
				for(File jsonFile : f.toFile().listFiles()) {
					String fileName = jsonFile.getName();
					//insert JSON data into Documents
					if(fileName.contains("code")) {
						String collectionName = fileName.substring(fileName.indexOf("-") + 1, fileName.lastIndexOf(".")).toUpperCase();
						System.out.println("Reading JSON file: "+ jsonFile +", Insert data into: "+ collectionName);
						
						try {
							String jsonString = FileUtils.readFileToString(new File(jsonFile.getAbsolutePath()), "UTF-8");
							System.out.println(jsonString);
						} catch (IOException e) {
							e.printStackTrace();
						}
						
						//Example 2
//						try {
//							JsonParser jsonParser = new JsonFactory().createParser(jsonFile);
//							Class valueType = Object.class;
//							Iterator<?> iterator = new ObjectMapper().readValues(jsonParser, valueType);
//							while(iterator.hasNext()) {
//								System.out.println(iterator.next());
//							}
//						} catch (JsonParseException e) {
//							e.printStackTrace();
//					    } catch (JsonMappingException e) {
//					    	e.printStackTrace();
//					    } catch (IOException e) {
//					    	e.printStackTrace();
//					    }
					}
				}
			});
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
