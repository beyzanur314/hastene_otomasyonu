
package Model;

import Entity.Hasta;
import java.sql.ResultSet;
import java.sql.Statement;


public class HastaModel {

    private DBConnection db;

    public DBConnection getDb() {

        if (db == null) {
            this.db = new DBConnection();
        }
        return db;
    }

    public void setDb(DBConnection connection) {
        this.db = connection;
    }

    public void getKontrol(String tc, String Sifre) {
        int sayac = 0;
        try {
            Statement st = this.getDb().connect().createStatement();
            ResultSet rs = st.executeQuery("select * from hasta");

            while (rs.next()) {
                Hasta tmp = new Hasta(rs.getString("tc"), rs.getString("sifre"));
                if (rs.getString("tc").equals(tc) && rs.getString("sifre").equals(Sifre)) {
                    sayac++;
                }
            }

            if (0 == sayac) {
                System.out.println("Sisteme giriş başarsız");
            } else {
                System.out.println("Sisteme giriş basarili");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void insert(Hasta c) {
        try {
            Statement st = this.getDb().connect().createStatement();
            st.executeUpdate("insert into hasta(id,tc, adisoyadi,sifre ) values ('"
                    + c.getId() + "','"
                    + c.getTc() + "','"
                    + c.getAdisoyadi() + "','"
                    + c.getSifre() + "')");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
