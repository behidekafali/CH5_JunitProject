package topics;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C51_WriteExcel {

    /*
    Create an object of File class to open xlsx file.
    Create an object of FileInputStream class to read excel file.
    Creating workbook instance that refers to .xlsx file.
    Creating a Sheet object.
    Create a row object to retrieve row at index 3.
    Create a cell object to enter value in it using cell Index.
    Write the data in excel using output stream.
*/
    /*
    xlsx dosyasını açmak için File sınıfının bir nesnesini oluştur.
    Excel dosyasını okumak için FileInputStream sınıfının bir nesnesini oluştur.
    .xlsx dosyasına başvuran bir çalışma kitabı (workbook) örneği oluştur.
    Bir Sayfa (Sheet) nesnesi oluştur.
    3. indeksteki satırı almak için bir satır (row) nesnesi oluştur.
    Hücre indeksini kullanarak bir hücre (cell) nesnesi oluştur ve içine değer gir.
    Çıkış akışını (output stream) kullanarak veriyi excel dosyasına yaz.
*/

    @Test
    public void writeExcelTest() throws IOException {

//Create an object of File class to open xlsx file.
//Create an object of FileInputStream class to read excel file.
        String filePath = System.getProperty("user.dir") + "\\resources\\Capitals.xlsx";
        FileInputStream fileInputStream = new FileInputStream(filePath);

//Creating workbook instance that refers to .xlsx file.
        Workbook workbook = WorkbookFactory.create(fileInputStream);

//Creating a Sheet object.
        Sheet sheet2 = workbook.createSheet("Sheet2");

//Create a row object to retrieve row at index 3.
        Row row4 = sheet2.createRow(3);

//Create a cell object to enter value in it using cell Index.
        Cell r4c5 = row4.createCell(4);
        r4c5.setCellValue("Hello World");

//Write the data in excel using output stream.
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        workbook.write(fileOutputStream);


    }

}
