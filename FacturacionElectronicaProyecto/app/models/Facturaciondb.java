package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class Facturaciondb extends Model {

    @Id
    @Constraints.Min(10)
    public Long id;

    @Constraints.Min(0)
    @Constraints.Max(13)
    @Constraints.Required(message="Debe ingresar el RFC del que expide")
    public String RFCex;

    @Constraints.Required(message="Debe ingresar el numero de folio")
    public int numFol;

    @Constraints.Required(message="Debe ingresar el sello digital sat")
    public String sell;

    @Constraints.Required(message="Debe ingresar el lugar del que expide")
    public String lugar;

    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date dueDate = new Date();

    @Constraints.Min(0)
    @Constraints.Max(13)
    @Constraints.Required(message="Debe ingresar el RFC del que se expide")
    public String RFCsexp;

    @Constraints.Required(message="Debe ingresar descripción del producto")
    public String desSer;

    @Constraints.Required(message="Debe ingresar el valor unitario")
    public int valUni;

    @Constraints.Required(message="Debe ingresar el importe Total")
    public float impTot;

    public static Finder<Long,Facturaciondb> find = new Finder<Long,Facturaciondb>(
            Long.class, Facturaciondb.class
    );

}
