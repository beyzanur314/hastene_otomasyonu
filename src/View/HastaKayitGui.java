
package View;

import Model.DBConnection;
import java.sql.SQLException;
import java.sql.Statement;


public class HastaKayitGui extends javax.swing.JFrame {

  
    public HastaKayitGui() {
        initComponents();
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        w_paneKayit = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_hastaKayit = new javax.swing.JButton();
        kayitadsoyad = new javax.swing.JTextField();
        kayittcno = new javax.swing.JTextField();
        kayitsifre = new javax.swing.JTextField();
        lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        w_paneKayit.setBackground(new java.awt.Color(255, 255, 255));
        w_paneKayit.setPreferredSize(new java.awt.Dimension(500, 420));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Kayıt Ol");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel2.setText("Kayıt Olmak İçin Aşağıdaki Alanları Lütfen Eksiksiz Doldurunuz!");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("*T.C No Giriniz:");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("*Ad/Soyad:");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("*Şifre:");

        btn_hastaKayit.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btn_hastaKayit.setForeground(new java.awt.Color(255, 51, 51));
        btn_hastaKayit.setText("KAYDOL");
        btn_hastaKayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hastaKayitActionPerformed(evt);
            }
        });

        kayitadsoyad.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 11)); // NOI18N

        kayittcno.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 11)); // NOI18N

        kayitsifre.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 11)); // NOI18N

        javax.swing.GroupLayout w_paneKayitLayout = new javax.swing.GroupLayout(w_paneKayit);
        w_paneKayit.setLayout(w_paneKayitLayout);
        w_paneKayitLayout.setHorizontalGroup(
            w_paneKayitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, w_paneKayitLayout.createSequentialGroup()
                .addContainerGap(296, Short.MAX_VALUE)
                .addComponent(lbl_logo)
                .addGap(204, 204, 204))
            .addGroup(w_paneKayitLayout.createSequentialGroup()
                .addGroup(w_paneKayitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(w_paneKayitLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(w_paneKayitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(w_paneKayitLayout.createSequentialGroup()
                                .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_hastaKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(w_paneKayitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(w_paneKayitLayout.createSequentialGroup()
                                    .addGroup(w_paneKayitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(w_paneKayitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(kayittcno, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(kayitadsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(kayitsifre, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(w_paneKayitLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        w_paneKayitLayout.setVerticalGroup(
            w_paneKayitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(w_paneKayitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(55, 55, 55)
                .addGroup(w_paneKayitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(kayittcno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(w_paneKayitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(kayitadsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(w_paneKayitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(kayitsifre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(w_paneKayitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_hastaKayit)
                    .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(w_paneKayit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(w_paneKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_hastaKayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hastaKayitActionPerformed
      lbl.setText("Kayıt başarılı bir şekilde gerçekleşti..");
      
    try {
        Statement st = this.getDb().connect().createStatement();
        
        
        String tcNo = kayittcno.getText();
        String adSoyad = kayitadsoyad.getText();
        String sifre = kayitsifre.getText();
        
        
        String sqlQuery = "INSERT INTO hasta(tc, adisoyadi, sifre) VALUES ('"
    + kayittcno.getText()+ "','"
    + kayitadsoyad.getText() + "','"
    + kayitsifre.getText() + "')";
        
        st.executeUpdate("INSERT INTO hasta(tc, adisoyadi, sifre) VALUES ('"
    + kayittcno.getText()+ "','"
    + kayitadsoyad.getText() + "','"
    + kayitsifre.getText() + "')");
        
        
        int executeUpdate = st.executeUpdate(sqlQuery);
        if (executeUpdate > 0) {
            System.out.println("Kayıt başarıyla eklendi.");
        } else {
            System.out.println("Kayıt eklenirken bir hata oluştu.");
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_btn_hastaKayitActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hastaKayit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField kayitadsoyad;
    private javax.swing.JTextField kayitsifre;
    private javax.swing.JTextField kayittcno;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JPanel w_paneKayit;
    // End of variables declaration//GEN-END:variables
}