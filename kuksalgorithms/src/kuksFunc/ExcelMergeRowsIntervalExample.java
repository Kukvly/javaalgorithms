package kuksFunc;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelMergeRowsIntervalExample {
    public static void main(String[] args) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sheet1");

        // 데이터 입력
        String[][] data = {
                {"a", "b", "c", "f", "qq"},
                {"a", "e", "q", "f", "qq"},
                {"a", "h", "i", "f", "qq"},
                {"b", "b", "c", "f", "qq"},
                {"b", "e", "s", "f", "qq"},
                {"b", "h", "I", "f", "qq"},
                {"c", "b", "c", "f", "qq"},
                {"c", "e", "s", "f", "qq"},
                {"c", "h", "I", "f", "qq"}
        };

        // 데이터를 엑셀 시트에 쓰기
        setData(sheet, data);

        // 3행 간격으로 0번째 열을 병합
        mergeRowsInterval(sheet, 0, 3);

        // 6행 간격으로 3번째 열을 병합
        mergeRowsInterval(sheet, 3, 6);

        // 엑셀 파일로 저장
        try (FileOutputStream fileOut = new FileOutputStream("workbook.xlsx")) {
            workbook.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 메모리 리소스 해제
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 엑셀 시트에 데이터 입력
    private static void setData(Sheet sheet, String[][] data) {
        for (int rowIdx = 0; rowIdx < data.length; rowIdx++) {
            Row row = sheet.createRow(rowIdx);
            for (int colIdx = 0; colIdx < data[rowIdx].length; colIdx++) {
                Cell cell = row.createCell(colIdx);
                cell.setCellValue(data[rowIdx][colIdx]);
            }
        }
    }

    // 일정 간격으로 특정 열을 기준으로 행을 병합하는 메서드
    private static void mergeRowsInterval(Sheet sheet, int columnIndex, int interval) {
        int numRows = sheet.getPhysicalNumberOfRows();

        for (int rowIdx = 0; rowIdx < numRows; rowIdx += interval) {
            int startRow = rowIdx;
            int endRow = Math.min(rowIdx + interval - 1, numRows - 1);

            sheet.addMergedRegion(new CellRangeAddress(
                    startRow, // 첫 번째 행
                    endRow,   // 마지막 행
                    columnIndex, // 기준 열
                    columnIndex  // 기준 열
            ));
        }
    }
}
//이 코드에서 setData 메서드는 엑셀 시트에 데이터를 입력하고, mergeRowsInterval 메서드는 일정 간격으로 특정 열을 기준으로 행을 병합합니다. 코드 실행 후 생성된 "workbook.xlsx" 파일을 확인하면 병합된 결과를 확인할 수 있습니다.






//Message ChatGPT…

// ChatGPT can make mistakes. Consider checking important information.