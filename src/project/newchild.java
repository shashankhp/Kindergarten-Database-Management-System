/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;


import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Shashank HP
 */
public class newchild extends javax.swing.JFrame {

    /**
     * Creates new form newchild
     */
    public newchild() {
        initComponents();
        
        bgImage();
        table_update();
        
    }

    public void bgImage() {
    
       ImageIcon icon = new ImageIcon("bg.jpg");
       
       Image img = icon.getImage();
       Image imgScale = img.getScaledInstance(bglabel.getWidth(), bglabel.getHeight(), Image.SCALE_SMOOTH);
       ImageIcon scaledIcon = new ImageIcon(imgScale); 
       bglabel.setIcon(scaledIcon);
      
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtdob = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaddr = new javax.swing.JTextArea();
        txtano = new javax.swing.JTextField();
        txtlevel = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bglabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 474, 105, 31));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cid", "cname", "cdob", "a_no", "caddr"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 127, 506, 378));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Child Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 158, 131, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Register/Update child details");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 27, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Date of Birth");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 198, 131, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 238, 131, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Admission no.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 324, 131, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Kindergarten Level");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 364, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Registeration Date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 404, -1, -1));

        txtname.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 160, 276, -1));

        txtdob.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 200, 276, -1));

        txtaddr.setColumns(20);
        txtaddr.setRows(5);
        jScrollPane2.setViewportView(txtaddr);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 238, 276, 68));
        getContentPane().add(txtano, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 326, 276, -1));
        getContentPane().add(txtlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 366, 276, -1));
        getContentPane().add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 406, 276, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 540, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 474, 104, 31));
        getContentPane().add(bglabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
      Connection con1;
      PreparedStatement insert;
      
      
      private void table_update(){
      
       int c;
          try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/kindergarten?useSSL=false","root","Shashank-ssk");
                    
                    insert = con1.prepareStatement("select * from child");
                    ResultSet rs = insert.executeQuery();
                    
                    ResultSetMetaData Rss = (ResultSetMetaData) rs.getMetaData();
                    c = Rss.getColumnCount();
                    
                    DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
                    Df.setRowCount(0);
                    
                    while(rs.next()) {
                    
                        Vector v = new Vector();
                    
                        for(int a = 1; a<=c; a++){
                            
                            v.add(rs.getString("cid"));
                            v.add(rs.getString("cname"));
                            v.add(rs.getString("cdob"));
                            v.add(rs.getString("a_no"));
                            v.add(rs.getString("caddr"));
                                
                        }
                    
                        Df.addRow(v);
  
                    } 
          }
            catch (ClassNotFoundException ex) {
                    Logger.getLogger(newchild.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (SQLException ex) {
                    Logger.getLogger(newchild.class.getName()).log(Level.SEVERE, null, ex);
            }
      
      }
 
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

                
                String name = txtname.getText();
                String dob = txtdob.getText();
                String ano = txtano.getText();
                String addr = txtaddr.getText();
                String klevel = txtlevel.getText();
                String adate = txtdate.getText();
                
                if(name.isEmpty() || dob.isEmpty() || ano.isEmpty() || addr.isEmpty() || klevel.isEmpty() || adate.isEmpty())
                    JOptionPane.showMessageDialog(this,"Fill all the details");

                else{
            try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/kindergarten?useSSL=false","root","Shashank-ssk");
                    
                    insert = con1.prepareStatement("insert into admission(adm_no, a_date, K_level)values(?,?,?)");
                    insert.setString(1,ano);
                    insert.setString(2,adate);
                    insert.setString(3,klevel);
                    insert.executeUpdate();
                    
                    insert = con1.prepareStatement("insert into child( cname, cdob, a_no, caddr)values(?,?,?,?)");
                    insert.setString(1,name);
                    insert.setString(2,dob);
                    insert.setString(3,ano);
                    insert.setString(4,addr);
                    insert.executeUpdate();
                    
                    JOptionPane.showMessageDialog(this,"Record Added");
                    table_update();

                    
                    txtname.setText("");
                    txtdob.setText("");
                    txtano.setText("");
                    txtlevel.setText("");
                    txtdate.setText("");
                    txtaddr.setText("");
                    txtname.requestFocus();
                            

            } 
            catch (ClassNotFoundException ex) {
                    Logger.getLogger(newchild.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (SQLException ex) {
                    Logger.getLogger(newchild.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                        }    

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        childinfo s = new childinfo();
        s.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        if(txtname.getText().isEmpty() && txtdob.getText().isEmpty() &&  txtaddr.getText().isEmpty() )
                    JOptionPane.showMessageDialog(this,"Select a child to update");
        
        DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
         
        int id = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());
                String name = txtname.getText();
                String dob = txtdob.getText();
                String addr = txtaddr.getText();
        
        if(name.isEmpty() || dob.isEmpty() ||  addr.isEmpty() )
                    JOptionPane.showMessageDialog(this,"Fill all the details");

                else{
         try {
                Class.forName("com.mysql.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/kindergarten?useSSL=false","root","Shashank-ssk");
                    
                insert = con1.prepareStatement("update child set cname = ?, cdob =?, caddr = ? where cid=?");
                insert.setString(1,name);
                insert.setString(2,dob);
                insert.setString(3,addr);
                insert.setInt(4,id);
                
                insert.executeUpdate();
                
                JOptionPane.showMessageDialog(this,"Record Updated");
                table_update();
  
                txtname.setText("");
                txtdob.setText("");
                txtano.setText("");
                txtlevel.setText("");
                txtdate.setText("");
                txtaddr.setText("");
                txtname.requestFocus();
                    

            } 
            catch (ClassNotFoundException ex) {
                    Logger.getLogger(newchild.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (SQLException ex) {
                    Logger.getLogger(newchild.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();

       txtname.setText(Df.getValueAt(selectedIndex , 1).toString());
       txtdob.setText(Df.getValueAt(selectedIndex , 2).toString());
       txtaddr.setText(Df.getValueAt(selectedIndex , 4).toString());
       
        
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(newchild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newchild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newchild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newchild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newchild().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bglabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtaddr;
    private javax.swing.JTextField txtano;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtlevel;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
