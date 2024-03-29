package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import lombok.Getter;

@Getter
public class GetSheetData {
	private  Sheet sheet;
	private  int row;
	private  int column;
	
	public void sheetOperation(String sheetName) {
		File file=new File("./src/test/resources/ExcelSheetData/ShopperStackData.xlsx");
		FileInputStream fin;
		try {
			fin=new FileInputStream(file);
			Workbook workbook=WorkbookFactory.create(fin);
			sheet=workbook.getSheet(sheetName);
			row=sheet.getPhysicalNumberOfRows();
			column=sheet.getRow(0).getPhysicalNumberOfCells();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
}
