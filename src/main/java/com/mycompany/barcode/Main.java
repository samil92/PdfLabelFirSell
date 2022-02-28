/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.barcode;

import com.aspose.pdf.facades.PdfViewer;
import com.aspose.pdf.printing.PdfPrinterSettings;
import com.aspose.pdf.printing.PrintPageSettings;
import com.aspose.pdf.printing.PrintPaperSize;
import com.aspose.pdf.printing.PrinterMargins;
import com.spire.pdf.*;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Rectangle2D;
import java.awt.print.*;

public class Main {


    public static void main(String[] args) {


// Create PdfViewer object
       // Create PdfViewer object
         // Create PdfViewer object
    PdfViewer viewer = new PdfViewer();
    // Open input PDF file
    viewer.openPdfFile("barcodes.pdf");
    // Set attributes for printing
    // Print the file with adjusted size
    viewer.setAutoResize(true);
    // Print the file with adjusted rotation
    viewer.setAutoRotate(true);
    // Do not produce the page number dialog when printing
    viewer.setPrintPageDialog(false);
    // gets a printjob object.
    PrinterJob printJob = PrinterJob.getPrinterJob();
    // gets the default page.
    PageFormat pf = printJob.defaultPage();
    // print PDF document
    viewer.printDocument();
    // close the Pdf file.
    viewer.closePdfFile();

  //-------------------------Isleyir ancaq PX660 ucun (pixel problemi)---------------      
//PdfViewer viewer = new PdfViewer();
//viewer.bindPdf("C:\\burayaz\\"+"barcodes.pdf");
//viewer.setAutoResize(true);
//viewer.setAutoRotate(true);
//viewer.setPrintPageDialog(true);
//
//
//        PrintPageSettings pgs = new PrintPageSettings();
//        PdfPrinterSettings ps = new PdfPrinterSettings();
//
//
//        ps.setPrinterName("TSC TDP-225");
//
//
//        ps.setPrintRange(0);
//
//
//
//viewer.printDocumentWithSettings(pgs, ps);
//viewer.close();
  
//-----------------------------------------------------------------------------------------
//load the sample document
        //load the sample document
        //load the sample document
//        PdfDocument pdf = new PdfDocument();
//        pdf.loadFromFile("C:\\burayaz\\"+"barcodes.pdf");
//
//        PrinterJob loPrinterJob = PrinterJob.getPrinterJob();
//        PageFormat loPageFormat  = loPrinterJob.defaultPage();
//
//       //set the print page size
//        Paper loPaper = loPageFormat.getPaper();
//        loPaper.setSize(2.1,1.5);
//        loPageFormat.setPaper(loPaper);
//                loPrinterJob.setPrintable(pdf,loPageFormat);
//
//        try {
//            loPrinterJob.print();
//        } catch (PrinterException e) {
//            e.printStackTrace();
//        } 
//    }

//public static void main(String[] args) {
        //load the sample document
//        PrinterJob pj = PrinterJob.getPrinterJob();
//        if (pj.printDialog()) {
//            PageFormat pf = pj.defaultPage();
//            Paper paper = pf.getPaper();    
//            double width = fromCMToPPI(5.5);
//            double height = fromCMToPPI(3.8);    
//            paper.setSize(width, height);
//            paper.setImageableArea(
//                            fromCMToPPI(0.25), 
//                            fromCMToPPI(0.5), 
//                            width - fromCMToPPI(0.35), 
//                            height - fromCMToPPI(1));                
//            System.out.println("Before- " + dump(paper));    
//            pf.setOrientation(PageFormat.PORTRAIT);
//            pf.setPaper(paper);    
//            System.out.println("After- " + dump(paper));
//            System.out.println("After- " + dump(pf));                
//            dump(pf);    
//            PageFormat validatePage = pj.validatePage(pf);
//            System.out.println("Valid- " + dump(validatePage));                
//            //Book book = new Book();
//            //book.append(new MyPrintable(), pf);
//            //pj.setPageable(book);    
//            pj.setPrintable(new MyPrintable(), pf);
//            try {
//                pj.print();
//            } catch (PrinterException ex) {
//                ex.printStackTrace();
//            }    
//        }    
//    }
//
//    protected static double fromCMToPPI(double cm) {            
//        return toPPI(cm * 0.393700787);            
//    }
//
//    protected static double toPPI(double inch) {            
//        return inch * 72d;            
//    }
//
//    protected static String dump(Paper paper) {            
//        StringBuilder sb = new StringBuilder(64);
//        sb.append(paper.getWidth()).append("x").append(paper.getHeight())
//        .append("/").append(paper.getImageableX()).append("x").
//        append(paper.getImageableY()).append(" - ").append(paper
//        .getImageableWidth()).append("x").append(paper.getImageableHeight());            
//        return sb.toString();            
//    }
//
//    protected static String dump(PageFormat pf) {    
//        Paper paper = pf.getPaper();            
//        return dump(paper);    
//    }
//
//    public static class MyPrintable implements Printable {
//
//        public int print(Graphics graphics, PageFormat pageFormat,int pageIndex) throws PrinterException {    
//       
//       PdfDocument pdf = new PdfDocument();
//       pdf.loadFromFile("C:\\burayaz\\"+"barcodes.pdf");            
//
//
//
//            System.out.println(pageIndex);                
//            int result = NO_SUCH_PAGE;    
//            if (pageIndex < 2) {                    
//                Graphics2D g2d = (Graphics2D) graphics;                    
//                System.out.println("[Print] " + dump(pageFormat));                    
//                double width = pageFormat.getImageableWidth();
//                double height = pageFormat.getImageableHeight();    
//                g2d.translate((int) pageFormat.getImageableX(), 
//                    (int) pageFormat.getImageableY());  
//                
//                g2d.draw(new Rectangle2D.Double(1, 1, width - 1, height - 1));                    
//                FontMetrics fm = g2d.getFontMetrics();
//                g2d.drawString("0x000000000000", 0, fm.getAscent());    
//                result = PAGE_EXISTS;    
//            }    
//            return result;    
//        }
//    }
//


}
}

 



