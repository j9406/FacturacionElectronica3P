package controllers;


import play.*;
import play.mvc.*;
import play.data.*;
import play.data.Form;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import models.Facturaciondb;

import views.html.*;


public class Application extends Controller {



    public static Result index() {
        Form<Facturaciondb> formulario = Form.form(Facturaciondb.class);
        return ok(index.render(formulario));
    }

    public static Result create(){
        Form<Facturaciondb> formulario = Form.form(Facturaciondb.class).bindFromRequest();
        if (formulario.hasErrors()) {
            return badRequest(index.render(formulario));
        }
            formulario.get().save();
            flash("success", "se ha guardado tus datos");
            return ok(index.render(formulario));
        }

    public static Result PDFcreate(){
        Form<Facturaciondb> formulario = Form.form(Facturaciondb.class);

        Workbook libro = new HSSFWorkbook();

        Sheet hoja = libro.createSheet("Hoja1");

        for (int i = 0; i < 9; i++) {
            Row fila = hoja.createRow(i);
            Cell celda = fila.createCell(0);
            Cell celda2 = fila.createCell(1);

            switch (i) {
                case 0:
                    celda.setCellValue("RFC(De quien expide)");

                    break;
                case 1:
                    celda.setCellValue("NUMERO DE FOLIO");

                    break;
                case 2:
                    celda.setCellValue("SELLO");

                    break;
                case 3:
                    celda.setCellValue("LUGAR");

                    break;
                case 4:
                    celda.setCellValue("FECHA");

                    break;
                case 5:
                    celda.setCellValue("RFC(Del que se expide)");

                    break;
                case 6:
                    celda.setCellValue("DESCRIPCION");

                    break;
                case 7:
                    celda.setCellValue("VALOR UNITARIO");

                    break;
                case 8:
                    celda.setCellValue("IMPORTE TOTAL");

                    break;
                default:
                    throw new AssertionError();
            }
            celda2.setCellValue(i);

        }

        String file="Prueba.xml";

        try (FileOutputStream out = new FileOutputStream(file)){
            libro.write(out);
        }catch(IOException e){
            System.err.println(e.getMessage());
        }

        return ok(index.render(formulario));
    }
    }
