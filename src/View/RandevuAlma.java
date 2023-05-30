package View;
import Entity.Randevu;
import Model.DBConnection;
import View.KanTahlilSistemi.KanTahlil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTable;


public final class RandevuAlma extends javax.swing.JFrame {

    private Object secilenDoktor;

    public RandevuAlma() {
        initComponents();
        RandevuAl();
    }
    
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
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        doktoradi = new javax.swing.JComboBox();
        randevualbtn = new javax.swing.JButton();
        poliklinik = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        randevulistele = new javax.swing.JButton();
        randevusaati = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        lbl_logo = new javax.swing.JLabel();
        lbl_randevu = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        doktoradi.setEditable(true);
        doktoradi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dr. Ahmet", " Dr. Serdal", " Uzm.Dr. Hande", " Dyt. Nuray" }));
        doktoradi.setRequestFocusEnabled(true);
        doktoradi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doktoradiActionPerformed(evt);
            }
        });

        randevualbtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        randevualbtn.setForeground(new java.awt.Color(255, 102, 102));
        randevualbtn.setText("RANDEVU AL");
        randevualbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randevualbtnActionPerformed(evt);
            }
        });

        poliklinik.setEditable(true);
        poliklinik.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Diş", "Anestezi", "Beslenme ve Diyetetik", "\"Beyin ve Sinir cerrahi\"", "Cildiye", "Genel Cerrahi", "Aile Hekimliği" }));
        poliklinik.setRequestFocusEnabled(true);
        poliklinik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poliklinikActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel1.setText("DOKTOR SEÇİNİZ:");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel2.setText("POLİKLİNİK SEÇİNİZ:");

        randevulistele.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        randevulistele.setForeground(new java.awt.Color(255, 102, 102));
        randevulistele.setText("GEÇMİŞ RANDEVULARIM");
        randevulistele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randevulisteleActionPerformed(evt);
            }
        });

        randevusaati.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09:30", "10:00", "13:30", "15:00" }));
        randevusaati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randevusaatiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel3.setText("SAAT SEÇİNİZ:");

        lbl_randevu.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lbl_randevu.setForeground(new java.awt.Color(255, 102, 102));
        lbl_randevu.setText("Randevu Alma");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(randevualbtn)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(poliklinik, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_randevu)
                            .addComponent(doktoradi, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(randevusaati, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(randevulistele)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(lbl_logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(496, 496, 496))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(randevusaati, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_randevu)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poliklinik, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doktoradi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)))
                .addGap(38, 38, 38)
                .addComponent(randevualbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(randevulistele, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        randevulistele.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void RandevuAl() {
        try {
            Statement st = this.getDb().connect().createStatement();
            ResultSet rs = st.executeQuery("select name,poliklinik from bashekim");
            while (rs.next()) {
                String name = rs.getString("name");
                doktoradi.addItem(name);
                String poliklinikk = rs.getString("poliklinik");
                poliklinik.addItem(poliklinikk);
            }
        } catch (SQLException e) {
            e.getMessage();
        }

    }


    private void randevualbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randevualbtnActionPerformed
      lbl.setText("Randevunuz başarıyla oluşturulmuştur..");
       try {
            Statement st = this.getDb().connect().createStatement();
            String doktorAdi = doktoradi.getSelectedItem() != null ? doktoradi.getSelectedItem().toString() : "";
            String poliklinikAdi = poliklinik.getSelectedItem() != null ? poliklinik.getSelectedItem().toString() : "";
            String randevuSaati = randevusaati.getSelectedItem() != null ? randevusaati.getSelectedItem().toString() : "";

            if (doktorAdi.isEmpty() || poliklinikAdi.isEmpty() || randevuSaati.isEmpty()) {
                System.out.println("Lütfen doktor, poliklinik ve randevu saati seçin.");
                return;
            }

            String sqlQuery = "INSERT INTO randevu (doktoradi, poliklinik, randevusaati) VALUES ('" + doktorAdi + "','" + poliklinikAdi + "','" + randevuSaati + "')";

            int executeUpdate = st.executeUpdate(sqlQuery);
            if (executeUpdate > 0) {
                System.out.println("Randevu başarıyla eklendi.");
            } else {
                System.out.println("Randevu eklenirken bir hata oluştu.");
            }
        } catch (SQLException e) {
        }
        
    }//GEN-LAST:event_randevualbtnActionPerformed
 public void hapus(JComboBox j, int n){
     
        for(int i=n-1;i>=1;i--){
             j.removeItemAt(i);
        }

}

    private void randevulisteleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randevulisteleActionPerformed
         
         Randevularim randevu = new Randevularim();
        randevu.setVisible(true);
    try {
           try (Statement statement = this.getDb().connect().createStatement()) {
               String sqlQuery = "SELECT * FROM randevu";
               try (ResultSet resultSet = statement.executeQuery(sqlQuery)) {
                   while (resultSet.next()) {
                       String doktorAdi = resultSet.getString("doktoradi");
                       String poliklinikAdi = resultSet.getString("poliklinik");
                       String randevuSaati = resultSet.getString("randevusaati");
                       
                       System.out.println("Doktor Adı: " + doktorAdi);
                       System.out.println("Poliklinik Adı: " + poliklinikAdi);
                       System.out.println("Randevu Saati: " + randevuSaati);
                       System.out.println("--------------------");
                       
                       // Randevu nesnesini oluşturup listeye ekleme işlemini burada yapabilirsiniz
                       // Örnek olarak:
                       // Randevu randevuObjesi = new Randevu(doktorAdi, poliklinikAdi, randevuSaati);
                       // randevular.add(randevuObjesi);
                   }
               }
           }
        this.getDb().connect().close();
    } catch (SQLException e) {
    }
    }//GEN-LAST:event_randevulisteleActionPerformed

    private ArrayList<Randevu> randevular;

    private void randevusaatiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randevusaatiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_randevusaatiActionPerformed

    private static class jScrollPane1 {

        private static void setViewportView(JTable randevuTable) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public jScrollPane1() {
        }
    }

    private static class model {

        private static void addRow(Object[] object) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void setRowCount(int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public model() {
        }
    }

    public class PoliklinikSecimi extends javax.swing.JFrame {

    private javax.swing.JComboBox<String> poliklinikComboBox;

   public PoliklinikSecimi() {
    initComponents();
    poliklinikleriDoldur();
}

private void initComponents(JTable randevuTable) {
    
    randevuTable = new javax.swing.JTable();
    randevuTable.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Doktor Adı", "Poliklinik Adı", "Randevu Saati"
        }
    ) {
        Class[] types = new Class [] {
            java.lang.String.class, java.lang.String.class, java.lang.String.class
        };
        boolean[] canEdit = new boolean [] {
            false, false, false
        };

        @Override
        public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jScrollPane1.setViewportView(randevuTable);

}

private void poliklinikComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
    String secilenPoliklinik = (String) poliklinikComboBox.getSelectedItem();
    System.out.println("Seçilen Poliklinik: " + secilenPoliklinik);
    // Burada seçilen poliklinikle ilgili işlemleri yapabilirsiniz.
}

private void poliklinikleriDoldur() {
    // Poliklinik listesini oluştur
    String[] poliklinikler = {"Diş", "Anestezi", "Beslenme ve Diyetetik", "Beyin ve Sinir cerrahi", "Cildiye", "Genel Cerrahi", "Aile Hekimliği"};

    // ComboBox bileşenine poliklinikleri ekleyin
    poliklinikComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(poliklinikler));
}

        private void initComponents() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    
}
    private void poliklinikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poliklinikActionPerformed
        
        
    }//GEN-LAST:event_poliklinikActionPerformed

    
    public class Doktor_HastaListe {
    private ArrayList<KanTahlil> randevular;

    // Diğer kodlar...
}

    private void doktoradiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doktoradiActionPerformed
        
    
    }//GEN-LAST:event_doktoradiActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox doktoradi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_randevu;
    private javax.swing.JComboBox poliklinik;
    private javax.swing.JButton randevualbtn;
    private javax.swing.JButton randevulistele;
    private javax.swing.JComboBox randevusaati;
    // End of variables declaration//GEN-END:variables
}
