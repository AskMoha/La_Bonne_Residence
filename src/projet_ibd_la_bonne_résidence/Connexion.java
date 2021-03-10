package projet_ibd_la_bonne_résidence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
/*
/**
 *
 * @author mido1
 */
public class Connexion {
 static final String DB_URL="jdbc:mysql://localhost:3306/la_bonne_residence?useUnicode=true&useJDBCCompliantTimeZoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
static final  String DB_USER="root";
 static final String DB_PASSWD="rootpwd";
Connection con;
    /**
     * Creates new form Annonce
     */
    public Connexion() {
         try { 
    con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
    //System.out.println("Connection reussie");
}
 catch(SQLException exe)
 {
     System.out.println(exe);
 }
    }
 Connection ObtenirConnexion(){
        return con;
    }
}
