package models;

import com.avaje.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.db.ebean.*;

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

    @Constraints.Required(message="Debe ingresar el sello digital sat")
    public String sell;

    @Constraints.Required(message="Debe ingresar el lugar del que expide")
    public String lugar;


    public String dueDate;


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

    @Constraints.Required(message="Debe ingresar el valor unitario")
    public String valUni;

    @Constraints.Required(message="Debe ingresar el importe Total")
    public String impTot;


    public static Model.Finder<Long, Facturaciondb> find = new Model.Finder<Long, Facturaciondb>(long.class, Facturaciondb.class);

}
