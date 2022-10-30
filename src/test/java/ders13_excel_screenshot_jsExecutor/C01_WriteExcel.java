package ders13_excel_screenshot_jsExecutor;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C01_WriteExcel {

    @Test
    public  void writeExcelTest() throws IOException {
        //1) Yeni bir Class olusturalim WriteExcel
        //2) Yeni bir test method olusturalim writeExcelTest()
        //3) Adimlari takip ederek 1.satira kadar gidelim
        String dosyaYolu=System.getProperty("user.home")+"/Desktop/ulkeler.xlsx";
        FileInputStream fis =new FileInputStream(dosyaYolu);
        Workbook workbook= WorkbookFactory.create(fis);

        //4) 4.hucreye yeni bir cell olusturalim
        workbook
                .getSheet("Sayfa1")
                .getRow(0)
                .createCell(4)
                .setCellValue("Nufus");
        //5) Olusturdugumuz hucreye “Nufus” yazdiralim
        //6) 2.satir nufus kolonuna 1500000 yazdiralim
        workbook
                .getSheet("Sayfa1")
                .getRow(1)
                .createCell(4)
                .setCellValue("1500000");
        //7) 10.satir nufus kolonuna 250000 yazdiralim
        workbook
                .getSheet("Sayfa1")
                .getRow(9)
                .createCell(4)
                .setCellValue("250000");
        //8) 15.satir nufus kolonuna 54000 yazdiralim
        workbook
                .getSheet("Sayfa1")
                .getRow(14)
                .createCell(4)
                .setCellValue("54000");


        //9) 15. satirdaki nufus bilgisini 540000 olarak düzeltelim.
        workbook
                .getSheet("Sayfa1")
                .getRow(14)
                .getCell(4)
                .setCellValue("540000");

        //10) Dosyayi kaydedelim
        FileOutputStream fos=new FileOutputStream(dosyaYolu);
        workbook.write(fos);
        //11)Dosyayi kapatalim
        workbook.close();
        fis.close();
        fos.close();
    }
}
