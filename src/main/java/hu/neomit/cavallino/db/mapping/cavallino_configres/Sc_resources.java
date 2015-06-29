package hu.neomit.cavallino.db.mapping.cavallino_configres;

import hu.commit.prodigium.db.mapping.*;
import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.functions.Callback1;
import hu.commit.prodigium.db.mapping.metadata.*;

@Namespace("hu.neomit.cavallino.db.mapping.cavallino_configres")
public class Sc_resources implements TableRecord {

       public java.lang.String rscpath;  // db:text 
       public java.lang.String rscname;  // db:text 
       public java.lang.String rsc;  // db:bytea 

       public static Table<Sc_resources> table = new Table<Sc_resources>("cavallino_configres.sc_resources",
                new Callback1<TableMetadataBuilder>() {

                    @Override
                    public void $invoke(TableMetadataBuilder metamodel) {
                              metamodel
                              .addField("rscpath","text") 
                              .addField("rscname","text") 
                              .addField("rsc","bytea") 
                             ;
                             };
                    });

};

