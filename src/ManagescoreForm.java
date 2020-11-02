
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lenovo
 */
public class ManagescoreForm extends javax.swing.JFrame {

    /**
     * Creates new form ManagescoreForm
     */
    Score so=new Score();
    Course c=new Course();
    public ManagescoreForm() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(102,102,102));
        so.jtableFilledStudent(jTable1, "");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton_remove = new javax.swing.JButton();
        jButton_add = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_studentId = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_score = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_remarks = new javax.swing.JTextArea();
        jButton_edit = new javax.swing.JButton();
        jTextField_courseID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/miscellaneous.png"))); // NOI18N
        jLabel1.setText("MANAGE SCORE");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Course ID", "Score", "Remarks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 51, 102));

        jButton_remove.setBackground(new java.awt.Color(153, 153, 153));
        jButton_remove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_remove.setForeground(new java.awt.Color(0, 102, 153));
        jButton_remove.setText("REMOVE");
        jButton_remove.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_remove.setPreferredSize(new java.awt.Dimension(113, 39));
        jButton_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_removeActionPerformed(evt);
            }
        });
        jButton_remove.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton_removeKeyReleased(evt);
            }
        });

        jButton_add.setBackground(new java.awt.Color(153, 153, 153));
        jButton_add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_add.setForeground(new java.awt.Color(0, 102, 153));
        jButton_add.setText("ADD");
        jButton_add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_add.setPreferredSize(new java.awt.Dimension(113, 39));
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
            }
        });
        jButton_add.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton_addKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Remarks:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Course ID:");

        jTextField_studentId.setEditable(false);
        jTextField_studentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_studentIdActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText(" Student ID:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Score:");

        jTextArea_remarks.setColumns(20);
        jTextArea_remarks.setRows(5);
        jScrollPane2.setViewportView(jTextArea_remarks);

        jButton_edit.setBackground(new java.awt.Color(153, 153, 153));
        jButton_edit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_edit.setForeground(new java.awt.Color(0, 102, 153));
        jButton_edit.setText("EDIT");
        jButton_edit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_edit.setPreferredSize(new java.awt.Dimension(113, 39));
        jButton_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editActionPerformed(evt);
            }
        });
        jButton_edit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton_editKeyReleased(evt);
            }
        });

        jTextField_courseID.setEditable(false);
        jTextField_courseID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_courseIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel13)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(jTextField_studentId)
                            .addComponent(jTextField_score)
                            .addComponent(jTextField_courseID))
                        .addGap(76, 76, 76))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_studentId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_courseID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_score, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/240_F_252771705_7XGMeMJ5aN2xRr3aBQ5QaPpfIxObxnDu.jpg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGap(431, 431, 431)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_removeActionPerformed
        if(jTextField_studentId.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Select details To Remove");
        }else{
            Integer id=Integer.valueOf(jTextField_studentId.getText());
         
            so.insertUpdateDeleteStudent('r',id,null,null,null);
            jTable1.setModel(new DefaultTableModel(null, new Object[]{"Student Id","Course Id","Score","Remarks"}));
            so.jtableFilledStudent(jTable1, "");
           
        }
    }//GEN-LAST:event_jButton_removeActionPerformed

    private void jButton_removeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_removeKeyReleased
        // TODO add your handling code here:
               if(evt.getKeyCode()==KeyEvent.VK_ENTER){
                   if(jTextField_studentId.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Select details To Remove");
        }else{
            Integer id=Integer.valueOf(jTextField_studentId.getText());
         
            so.insertUpdateDeleteStudent('r',id,null,null,null);
            jTable1.setModel(new DefaultTableModel(null, new Object[]{"Student Id","Course Id","Score","Remarks"}));
            so.jtableFilledStudent(jTable1, "");
           
        }
            
                 }
    }//GEN-LAST:event_jButton_removeKeyReleased

    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed
        // TODO add your handling code here:
        AddScore asf= new AddScore();
        asf.setVisible(true);
        asf.pack();
        

    }//GEN-LAST:event_jButton_addActionPerformed

    private void jButton_addKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_addKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            AddScore asf= new AddScore();
            asf.setVisible(true);
            asf.pack();

        }
    }//GEN-LAST:event_jButton_addKeyReleased

    private void jTextField_studentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_studentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_studentIdActionPerformed

    private void jButton_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editActionPerformed
        // TODO add your handling code here:
        if(jTextField_studentId.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Select Course");
        }
        else{
        Integer sid=Integer.valueOf(jTextField_studentId.getText());
        Integer cid= Integer.valueOf(jTextField_courseID.getText());
        
        Double score =Double.valueOf(jTextField_score.getText());
        String remarks=jTextArea_remarks.getText();
        
        so.insertUpdateDeleteStudent('u',sid,cid,score,remarks);
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Student Id","Course Id","Score","Remarks"}));
        so.jtableFilledStudent(jTable1,"");
                }
    }//GEN-LAST:event_jButton_editActionPerformed

    private void jButton_editKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_editKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(jTextField_studentId.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Select Course");
        }
        else{
        Integer sid=Integer.valueOf(jTextField_studentId.getText());
        Integer cid= Integer.valueOf(jTextField_courseID.getText());
        
        Double score =Double.valueOf(jTextField_score.getText());
        String remarks=jTextArea_remarks.getText();
        
        so.insertUpdateDeleteStudent('u',sid,cid,score,remarks);
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Student Id","Course Id","Score","Remarks"}));
        so.jtableFilledStudent(jTable1,"");
                }
        }
    }//GEN-LAST:event_jButton_editKeyReleased

    private void jTextField_courseIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_courseIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_courseIDActionPerformed
int row;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        row = jTable1.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        jTextField_studentId.setText(dtm.getValueAt(row,0).toString());
        jTextField_courseID.setText(dtm.getValueAt(row,1).toString());
         jTextField_score.setText(dtm.getValueAt(row,2).toString());
          jTextArea_remarks.setText(dtm.getValueAt(row,3).toString());
        
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
            java.util.logging.Logger.getLogger(ManagescoreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagescoreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagescoreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagescoreForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagescoreForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_edit;
    private javax.swing.JButton jButton_remove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea_remarks;
    private javax.swing.JTextField jTextField_courseID;
    private javax.swing.JTextField jTextField_score;
    private javax.swing.JTextField jTextField_studentId;
    // End of variables declaration//GEN-END:variables
}