package com.simplecrud;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2016-07-07T10:22:01")
@StaticMetamodel(NewMember.class)
public class NewMember_ { 

    public static volatile SingularAttribute<NewMember, String> password;
    public static volatile SingularAttribute<NewMember, Date> signingDate;
    public static volatile SingularAttribute<NewMember, Long> id;
    public static volatile SingularAttribute<NewMember, String> email;
    public static volatile SingularAttribute<NewMember, String> username;

}