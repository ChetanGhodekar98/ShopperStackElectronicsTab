package DataProvider;



import java.util.Arrays;

import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SheetDataProviderTest {
	
	@DataProvider
	public String[][] data() {
		String[][] data;
		GetSheetData g=new GetSheetData();
		g.sheetOperation("pincode");
		Sheet sheet=g.getSheet();
		int row=g.getRow();
		int col=g.getColumn();
		
		data=new String[row][col];
		for(int i=1;i<row;i++) {
			for(int j=0;j<col;j++) {
				data[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=1;j<col;j++) {
				System.out.println(data[i][j]);
			}
		}
		return data;
	}
	
	
	

}
