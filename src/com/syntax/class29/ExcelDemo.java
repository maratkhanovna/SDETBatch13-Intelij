package com.syntax.class29;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Owner\\Documents\\ExcelTest\\Test.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        Row ro = sheet.getRow(0);
        System.out.println(ro.getCell(0));

    }
}
