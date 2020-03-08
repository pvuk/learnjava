package com.java.file.readandprint.excel;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.util.StringUtils;

import com.monitorjbl.xlsx.StreamingReader;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author udaykiran p
 * @version 2.0
 *
 */
@Slf4j
public class ReadAndPrintExcelFile {
	
	public static void main(String[] args) {
		try {
			String projectPtah = System.getProperty("user.dir");
			/**
			 * Users.xlsx
			 * CC Monthly Bills_v-08032020-0928.xlsx
			 */
			FileInputStream inputStream = new FileInputStream(projectPtah +"/src/main/resources/upload_files/Users.xlsx");// Read Excel file from this location
			if (inputStream != null) {
				Workbook wb = StreamingReader.builder().rowCacheSize(100) // number of rows to keep in memory (default to 10)
						.bufferSize(4096) // buffer size is to use when reading InputStream to file (defaults to 1024)
						.open(inputStream);
				Sheet sheet = wb.getSheetAt(0);//reading first sheet. You can pass argument as well.
				System.out.println("Excel Reading - Number Of Sheets: "+ wb.getNumberOfSheets() +", Active Sheet: "+ sheet.getSheetName());
				Map<String, String> map = new HashMap<String, String>();
				Iterator<Row> iterator = sheet.iterator();
				int rowCount = 0;
				while(iterator.hasNext()) {
					Row row = iterator.next();
					rowCount = row.getRowNum();
					rowCount++;
					
					//identify empty row
					if(!isRowEmpty(row)) {
						int columnNum = 0;
						String key = null, value = null;
						for(Iterator<Cell> cellIterator = row.cellIterator(); cellIterator.hasNext();) {
							Cell cell = cellIterator.next();
							columnNum = cell.getColumnIndex();
							String cellData = getCellValueAsString(cell);
							System.out.println("RowNumber: "+ rowCount +", CellData: "+ cellData +", CellNumber: "+ columnNum);
							//Reading data from Excel upto 6 rows only
//							if (rowCount == 6) {
								//rowCount == 1 Headers Section(User ID, User Name)  is not reading
								if (rowCount > 1) {
									if (columnNum == 0) {
										key = cellData;//User ID
									}
									if (columnNum == 1) {
										value = cellData;//User Name
									}
								}
//							}
						}
						
						if (key != null && value != null) {
							map.put(key, value);
						}
//						String userID = "1";
//						System.out.println("User ID: "+ userID +", User Name: "+ map.get("1"));
					} else {
//						log.info("Empty Row Number: {}", rowCount);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static boolean isRowEmpty(Row row) {
//		for (int c = row.getFirstCellNum(); c < row.getLastCellNum(); c++) {
//	        Cell cell = row.getCell(c);
//	        if (cell != null && cell.getCellType() != CellType.BLANK)
//	            return false;
//	    }
		for(int cellNum = row.getFirstCellNum(); cellNum < row.getLastCellNum(); cellNum++){
            Cell cell = row.getCell(cellNum);
            if(cell != null && cell.getCellType() != CellType.BLANK && !StringUtils.isEmpty(cell.toString())){
            return false;
            }    
         }
	    return true;
	}

	private static String getCellValueAsString(Cell cell) {
		String cellValue = null;
		switch(cell.getCellType()) {
		case BOOLEAN:
			cellValue = String.valueOf(cell.getBooleanCellValue());
			break;
		case STRING:
			cellValue = String.valueOf(cell.getRichStringCellValue().toString());
			break;
		case NUMERIC:
			Double value = cell.getNumericCellValue();
			if (value != null) {
				String valueAsStr = value.toString();
				int indexOf = valueAsStr.indexOf(".");
				if (indexOf > 0) {
					cellValue = valueAsStr.substring(0, indexOf);//decimal numbers truncated
				} else {
					cellValue = value.toString();
				}
			}
			break;
		case FORMULA:
			//if the cell contains formula, this case will be executed.
			cellValue = cell.getStringCellValue();
			break;
		case BLANK:
			cellValue = "";
			break;
		case _NONE:
			cellValue = "";
			break;
		case ERROR:
			throw new RuntimeException("There is no support for this type of cell");
		default:
			cellValue = "";
		}
		return cellValue;
	}
}
