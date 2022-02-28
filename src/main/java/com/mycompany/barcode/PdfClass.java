/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.barcode;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.spire.pdf.tables.PdfTable;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.krysalis.barcode4j.impl.code128.Code128Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;

/**
 *
 * @author Shamil
 */
public class PdfClass {

   public void CreatePdfAndBarcode(String barcode, String malinadi, String olcusu, String rengi, double qiymeti ) throws DocumentException, IOException {
//        String ss = "5555555555555";
//        String dd = "Uzun Qadin Salvari";

        Code128Bean code128 = new Code128Bean();
        code128.setHeight(7f);
        code128.setModuleWidth(0.3);
        code128.setQuietZone(9);
        code128.doQuietZone(true);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BitmapCanvasProvider canvas = new BitmapCanvasProvider(baos, "image/x-png", 400, BufferedImage.TYPE_BYTE_BINARY, false, 0);
        code128.generateBarcode(canvas, barcode);
        canvas.finish();

//write to png file
        FileOutputStream fos = new FileOutputStream("barcode.png");
        fos.write(baos.toByteArray());
        fos.flush();
        fos.close();

//write to pdf
        Image png = Image.getInstance(baos.toByteArray());
        png.setAbsolutePosition(0, 705);
        png.scalePercent(25);

        PdfPTable table = new PdfPTable(1);
        table.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
        table.setWidthPercentage(100);
        table.addCell(png);
        table.getDefaultCell().setBorder(0);

        Font pageNumberFont = new Font(Font.FontFamily.UNDEFINED, (float) 4, Font.BOLDITALIC);
        Font pageNumberFont3 = new Font(Font.FontFamily.UNDEFINED, (float) 2.2, Font.BOLD);
        Font pageNumberFont4 = new Font(Font.FontFamily.UNDEFINED, (float) 2.5, Font.BOLD);
        Font pageNumberFont5 = new Font(Font.FontFamily.UNDEFINED, (float) 3.0, Font.BOLD);
        Document doc = new Document(new Rectangle((float) 59.0, (float) 39.0));
        doc.setMargins(0.01f, 0.01f, 0.00001f, 0.0001f);

        try {

            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("C:\\Users\\Shamil\\OneDrive\\Документы\\NetBeansProjects\\Barcode\\barcodes.pdf"));
           
            Paragraph p2 = new Paragraph("                     Venera", pageNumberFont);
            Paragraph p3 = new Paragraph("              Geyim ve Tekstil Dunyasi", pageNumberFont5);
           


            List orderlist = new List(List.ALIGN_CENTER);
            orderlist.add(new ListItem("                             Malin adi :" +" "+ malinadi, pageNumberFont3));
            orderlist.add(new ListItem("                                Ölçüsü :" +" "+ olcusu, pageNumberFont3));
            orderlist.add(new ListItem("                                 Rengi :" +" "+ rengi, pageNumberFont3));
            orderlist.add(new ListItem("                        Qiymeti :" +" "+ qiymeti, pageNumberFont4));

           doc.open();
           p2.setSpacingBefore(0.0001f);
           p2.setSpacingAfter(0.0001f);
           p3.setSpacingBefore(0.0001f);
           p3.setSpacingAfter(0.0001f);
           doc.add(p2);
           doc.add(p3);
           doc.add(orderlist);
           table.setSpacingBefore(0.0001f);
           table.setSpacingAfter(0.0001f);
           table.setHorizontalAlignment(100);


           doc.add(table);

            doc.close();
            writer.close();

        } catch (DocumentException | FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }

}
