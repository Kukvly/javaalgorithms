package kuksFunc;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class kuksExcelDwn {

	public static void main(String[] args) throws IOException{
        Workbook workbook = new XSSFWorkbook();

        String fileName = "kuksExcel";

        
        Sheet sheet = workbook.createSheet(fileName+"Sheet");
        
        System.out.println("start");
        
        
        // sheet.addMergedRegion(new CellRangeAddress(시작 기준 행, 마지막 행, 시작 기준 열, 마지막 열)
        CellRangeAddress mergedRegion = new CellRangeAddress(1,8,0,0);
        sheet.addMergedRegion(mergedRegion);

        mergedRegion = new CellRangeAddress(9,16,0,2);
        sheet.addMergedRegion(mergedRegion);
        
        mergedRegion = new CellRangeAddress(17,24,0,2);
        sheet.addMergedRegion(mergedRegion);
        
        mergedRegion = new CellRangeAddress(1,7,3,3);
        sheet.addMergedRegion(mergedRegion);
        
        

        // 데이터를 엑셀 시트에 쓰기
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("name");
        
        cell = row.createCell(1);
        cell.setCellValue("kuks");
        
        row = sheet.createRow(1);
        cell = row.createCell(0);
        cell.setCellValue("96");
        
        row = sheet.createRow(10);
        cell = row.createCell(0);
        cell.setCellValue("28");
        
        System.out.println("making sheet");
        
        // 엑셀 파일로 저장
        try (FileOutputStream fileOut = new FileOutputStream(fileName+".xlsx")) {
            workbook.write(fileOut);
            
            // 메모리 리소스 해제
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
