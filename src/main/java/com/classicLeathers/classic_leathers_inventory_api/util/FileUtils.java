package com.classicLeathers.classic_leathers_inventory_api.util;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.*;
import java.util.*;

public class FileUtils {

    public String getFileData(String filePath, Integer sheetIndex) throws Exception {
        File file = new File(filePath);

        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(inputStream);

        XSSFSheet sheet = xssfWorkbook.getSheetAt(sheetIndex);

        Iterator<Row> itr = sheet.iterator();
        String fileData = "";
        while (itr.hasNext()) {
            Row row = itr.next();

            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (cell.getCellType()) {
                    case STRING:
                        fileData = fileData + cell.getStringCellValue() + ",";
                        break;
                    case NUMERIC:
                        fileData = fileData + Math.round(cell.getNumericCellValue()) + ",";
                        break;
                    case FORMULA:
                        try {
                            fileData = fileData + cell.getStringCellValue() + ",";
                            break;
                        } catch (IllegalStateException e) {
                            fileData = fileData + Math.round(cell.getNumericCellValue()) + ",";
                            break;
                        }
                    default:
                }
            }
            fileData = fileData + "\n";
        }

        return fileData;
    }
}
