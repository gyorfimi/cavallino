package hu.neomit.cavallino.db.mapping.cavallino_base;

import hu.commit.prodigium.db.mapping.*;
import org.stjs.javascript.annotation.Namespace;
import org.stjs.javascript.functions.Callback1;
import hu.commit.prodigium.db.mapping.metadata.*;

@Namespace("hu.neomit.cavallino.db.mapping.cavallino_base")
public class Registrations implements TableRecord {

       public java.lang.Long id;  // db:bigint 
       public java.lang.String email;  // db:text 
       public java.lang.String firstname;  // db:text 
       public java.lang.String familyname;  // db:text 
       public java.lang.String phonenumber;  // db:text 
       public java.lang.String password;  // db:text 

       public static SimpleKeyTable<Registrations,java.lang.Long> table = new SimpleKeyTable<Registrations,java.lang.Long>("cavallino_base.registrations",
                new Callback1<TableMetadataBuilder>() {

                    @Override
                    public void $invoke(TableMetadataBuilder metamodel) {
                              metamodel
                              .addField("id","bigint") 
                              .addField("email","text") 
                              .addField("firstname","text") 
                              .addField("familyname","text") 
                              .addField("phonenumber","text") 
                              .addField("password","text") 
                              .addPrimaryKeyField("id") 
                             ;
                             };
                    });

};

