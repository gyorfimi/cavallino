package hu.neomit.cavallino.db.mapping.cavallino_configlang;

import hu.commit.prodigium.db.mapping.*;
import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.functions.Callback1;
import hu.commit.prodigium.db.mapping.metadata.*;

@Namespace("hu.neomit.cavallino.db.mapping.cavallino_configlang")
public class Plv8_units implements TableRecord {

       public java.lang.String unitname;  // db:text 
       public java.lang.String src;  // db:text 
       public org.stjs.javascript.Map<String, Object> unitinfo;  // db:json 

       public static Table<Plv8_units> table = new Table<Plv8_units>("cavallino_configlang.plv8_units",
                new Callback1<TableMetadataBuilder>() {

                    @Override
                    public void $invoke(TableMetadataBuilder metamodel) {
                              metamodel
                              .addField("unitname","text") 
                              .addField("src","text") 
                              .addField("unitinfo","json") 
                             ;
                             };
                    });

};

