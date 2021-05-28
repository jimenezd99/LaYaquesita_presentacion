/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes;

import Entidades.Orden;
import Entidades.OrdenHasPlatillo;
import fachadaLogica.FachadaDetalleOrden;
import fachadaLogica.FachadaOrden;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Picture;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author joelvalenzuela
 */
public class GenerarReporte {

    private FachadaDetalleOrden cOrden = new FachadaDetalleOrden();
    private FachadaOrden orden = new FachadaOrden();

//    public static void main(String args[]) {
//        List<Orden> ordenes = new ArrayList();
//        ordenes.add(new Orden(3, new Date(), 100));
//        reporte(new Date(), new Date(), orden.consultarOrdenes());
//    }
    public void reporte(Date inicio, Date fin, List<Orden> ordenes) {
        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet("Productos");
        List<OrdenHasPlatillo> detalleOrden;

        try {

            InputStream is = new FileInputStream("src/images/icon.png");
            byte[] bytes = IOUtils.toByteArray(is);
            int imgIndex = book.addPicture(bytes, Workbook.PICTURE_TYPE_PNG);
            is.close();

            CreationHelper help = book.getCreationHelper();
            Drawing draw = sheet.createDrawingPatriarch();
            ClientAnchor anchor = help.createClientAnchor();
            anchor.setCol1(0);
            anchor.setRow1(1);
            Picture pic = draw.createPicture(anchor, imgIndex);
            pic.resize(1, 3);

            CellStyle tituloEstilo = book.createCellStyle();
            tituloEstilo.setAlignment(HorizontalAlignment.CENTER);
            tituloEstilo.setVerticalAlignment(VerticalAlignment.CENTER);
            Font fuenteTitulo = book.createFont();
            fuenteTitulo.setFontName("Century Gothic");
            fuenteTitulo.setBold(true);
            fuenteTitulo.setFontHeightInPoints((short) 14);
            tituloEstilo.setFont(fuenteTitulo);

            Row filaTitulo = sheet.createRow(1);
            Cell celdaTitulo = filaTitulo.createCell(1);
            celdaTitulo.setCellStyle(tituloEstilo);
            celdaTitulo.setCellValue("Reporte de Ventas");

            sheet.addMergedRegion(new CellRangeAddress(1, 2, 1, 3));
            
            String[] cabecera = new String[]{"Fecha", "Cantidad", "Platillo", "Precio", "Usuario"};

            CellStyle headerStyle = book.createCellStyle();
            headerStyle.setFillForegroundColor(IndexedColors.ORANGE.getIndex());
            headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            headerStyle.setBorderBottom(BorderStyle.THIN);
            headerStyle.setBorderTop(BorderStyle.THIN);
            headerStyle.setBorderLeft(BorderStyle.THIN);
            headerStyle.setBorderRight(BorderStyle.THIN);

            Font font = book.createFont();
            font.setFontName("Century Gothic");
            font.setBold(true);
            font.setColor(IndexedColors.WHITE.getIndex());
            font.setFontHeightInPoints((short) 12);
            headerStyle.setFont(font);

            Row filaEncabezados = sheet.createRow(4);

            for (int i = 0; i < cabecera.length; i++) {
                Cell celdaEncabezado = filaEncabezados.createCell(i + 1);
                celdaEncabezado.setCellStyle(headerStyle);
                celdaEncabezado.setCellValue(cabecera[i]);
            }
            int numFilaDatos = 5;
            int numCol = 6;
            CellStyle datosEstilo = book.createCellStyle();
            datosEstilo.setFillForegroundColor(IndexedColors.WHITE.getIndex());
            datosEstilo.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            datosEstilo.setBorderBottom(BorderStyle.THIN);
            datosEstilo.setBorderLeft(BorderStyle.THIN);
            datosEstilo.setBorderRight(BorderStyle.THIN);
            datosEstilo.setBorderBottom(BorderStyle.THIN);

            for (Orden orden : ordenes) {
                detalleOrden = cOrden.consultarDetalleOrden(orden);
                if (!detalleOrden.isEmpty()) {
                    for (OrdenHasPlatillo detalle : detalleOrden) {
                        Row filaDatos = sheet.createRow(numFilaDatos);
                        for (int i = 1; i < numCol + 1; i++) {
                            Cell celdaDatos = filaDatos.createCell(i);
                            celdaDatos.setCellStyle(datosEstilo);

                            if (i == 1) {
                                int dia = orden.getFecha().getDate();
                                String diaN = getDiaSemana(orden.getFecha().getDay());
                                String mes = getMes(orden.getFecha().getMonth());
                                int anno = orden.getFecha().getYear() + 1900;
                                String fecha = "" + diaN + " " + dia + " de " + mes + " del " + anno;
                                celdaDatos.setCellValue(fecha);
                            }
                            if (i == 2) {
                                celdaDatos.setCellValue(detalle.getCantidad());
                            }
                            if (i == 3) {
                                celdaDatos.setCellValue(detalle.getNotas());
                            }
                            if (i == 4) {
                                celdaDatos.setCellValue(detalle.getPrecio() * detalle.getCantidad());
                            }
                            if (i == 5) {
                                celdaDatos.setCellValue(orden.getUsuarios().getNombre());
                            }

                        }
                        numFilaDatos++;
                    }
                }
            }
            Row total = sheet.createRow(numFilaDatos);
            Cell celdaTotal = total.createCell(3);
            celdaTotal.setCellStyle(datosEstilo);
            celdaTotal.setCellValue("Total:");
            Cell celdaNumTotal = total.createCell(4);
            celdaNumTotal.setCellStyle(datosEstilo);

            celdaNumTotal.setCellValue(calcularVentas(ordenes));
            int dia = inicio.getDate();
            String diaN = getDiaSemana(inicio.getDay());
            String mes = getMes(inicio.getMonth());
            int anno = inicio.getYear() + 1900;
            String fechaInicio = "" + diaN + " " + dia + " de " + mes + " del " + anno;
            dia = fin.getDate();
            diaN = getDiaSemana(fin.getDay());
            mes = getMes(fin.getMonth());
            anno = fin.getYear() + 1900;
            String fechaFin = "" + diaN + " " + dia + " de " + mes + " del " + anno;
            sheet.autoSizeColumn(5);
            sheet.autoSizeColumn(1);
            sheet.autoSizeColumn(2);
            sheet.autoSizeColumn(3);
            sheet.autoSizeColumn(4);
            FileOutputStream fileOut = new FileOutputStream("Reporte de Ventas del " + fechaInicio + " al " + fechaFin + ".xlsx");
            book.write(fileOut);
            fileOut.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "No se encontró la imagen", "Alerta", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "No se pudo convertir la imagen", "Alerta", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public String getDiaSemana(int dia) {
        switch (dia) {
            case 0:
                return "Domingo";
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miércoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sábado";
            default:
                return null;
        }
    }

    public String getMes(int mes) {
        switch (mes) {
            case 0:
                return "Enero";
            case 1:
                return "Febrero";
            case 2:
                return "Marzo";
            case 3:
                return "Abril";
            case 4:
                return "Mayo";
            case 5:
                return "Junio";
            case 6:
                return "Julio";
            case 7:
                return "Agosto";
            case 8:
                return "Septiembre";
            case 9:
                return "Octubre";
            case 10:
                return "Noviembre";
            case 11:
                return "Diciembre";
            default:
                return null;
        }
    }

    private float calcularVentas(List<Orden> ordenes) {
        float total = 0;
        for (int i = 0; i < ordenes.size(); i++) {
            total += ordenes.get(i).getTotal();
        }
        return total;
    }
}
