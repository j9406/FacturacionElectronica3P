package controllers;


import play.*;
import play.mvc.*;
import play.data.*;
import play.data.Form;

import models.Facturaciondb;

import views.html.*;

public class Application extends Controller {



    public static Result index() {
        Form<Facturaciondb> formulario = Form.form(Facturaciondb.class);
        return ok(index.render(formulario));
    }

    public static Result create(){
            Form<Facturaciondb> formulario = Form.form(Facturaciondb.class);
            if (formulario.hasErrors()) {
                return badRequest(index.render(formulario));
            }
            flash("success", "se ha guardado tus datos");
            return ok(index.render(formulario));
        }
    }
