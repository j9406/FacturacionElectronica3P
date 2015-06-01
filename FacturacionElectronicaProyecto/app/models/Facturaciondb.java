package models;

import com.avaje.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.db.ebean.*;
import views.combo.Lexer;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Facturaciondb extends Model {

    @Id
    public long id;

    @Constraints.Required(message="Debe ingresar el RFC del que expide")
    public String RFCex;

    public String getRFCex() {
        return RFCex;
    }

    public void setRFCex(String RFCex) {
        this.RFCex = RFCex;
    }

    @Constraints.Required(message="Debe ingresar el numero de folio")
    public String numFol;

    public String getNumFol() {
        return numFol;
    }

    @Constraints.Required(message="Debe ingresar el sello digital sat")
    public String sell;

    public String getSell() {
        return sell;
    }

    @Constraints.Required(message="Debe ingresar el lugar del que expide")
    public String lugar;

    public String getLugar() {
        return lugar;
    }

    public String dueDate;

    public String getDueDate() {
        return dueDate;
    }


    @Constraints.Required(message="Debe ingresar el RFC del que se expide")
    public String RFCsexp;

    public String getRFCsexp() {
        return RFCsexp;
    }

    public void setRFCsexp(String RFCsexp) {
        this.RFCsexp = RFCsexp;
    }

    @Constraints.Required(message="Debe ingresar descripción del producto")
    public String desSer;

    public String getDesSer() {
        return desSer;
    }

    @Constraints.Required(message="Debe ingresar el valor unitario")
    public String valUni;

    public String getValUni() {
        return valUni;
    }

    @Constraints.Required(message="Debe ingresar el importe Total")
    public String impTot;

    public String getImpTot() {
        return impTot;
    }

    public static Model.Finder<Long, Facturaciondb> find = new Model.Finder<Long, Facturaciondb>(long.class, Facturaciondb.class);

}
