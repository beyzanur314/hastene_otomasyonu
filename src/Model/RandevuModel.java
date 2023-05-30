
package Model;

import Entity.Randevu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RandevuModel {

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

    public void insert(Randevu c) {
        try {
            Statement st = this.getDb().connect().createStatement();
            String sqlQuery = "INSERT INTO randevularım (doktoradi, poliklinik, randevusaati) "
                    + "VALUES ('" + c.getDoktoradi() + "','" + c.getPoliklinik() + "','" + c.getRandevusaati() + "')";
            int executeUpdate = st.executeUpdate(sqlQuery);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Randevu> getList() {
        List<Randevu> cList = new ArrayList<>();
        try {
            Statement st = this.getDb().connect().createStatement();
            String sqlQuery = "SELECT * FROM randevularım";
            ResultSet rs = st.executeQuery(sqlQuery);

            while (rs.next()) {
                Randevu tmp = new Randevu(rs.getString("doktoradi"), rs.getString("poliklinik"), rs.getString("randevusaati"));
                cList.add(tmp);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return cList;
    }

}
