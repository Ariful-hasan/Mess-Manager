
package com.manager.LogIn;

import com.manager.deposite.DepositeWithdraw;
import com.manager.expenditure.Expenditure;
import com.manager.member.AddMember;
import com.manager.member.ShowMembers;

public class StartPage extends javax.swing.JFrame {

    public StartPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuMember = new javax.swing.JMenu();
        menuViewmember = new javax.swing.JMenuItem();
        menuFinance = new javax.swing.JMenu();
        menuAdmin = new javax.swing.JMenu();
        subMenAddMember = new javax.swing.JMenuItem();
        subMenDeposite = new javax.swing.JMenuItem();
        subMenExpenditure = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar1.setBorder(new javax.swing.border.MatteBorder(null));

        menuMember.setText("member");

        menuViewmember.setText("View Member");
        menuViewmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuViewmemberActionPerformed(evt);
            }
        });
        menuMember.add(menuViewmember);

        jMenuBar1.add(menuMember);

        menuFinance.setText("Finance");
        menuFinance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFinanceActionPerformed(evt);
            }
        });
        menuFinance.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                menuFinanceAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jMenuBar1.add(menuFinance);

        menuAdmin.setText("admin");

        subMenAddMember.setText("Add Member");
        subMenAddMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenAddMemberActionPerformed(evt);
            }
        });
        menuAdmin.add(subMenAddMember);

        subMenDeposite.setText("Money(deposite/withdraw)");
        subMenDeposite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenDepositeActionPerformed(evt);
            }
        });
        menuAdmin.add(subMenDeposite);

        subMenExpenditure.setText("Expenditure");
        subMenExpenditure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenExpenditureActionPerformed(evt);
            }
        });
        menuAdmin.add(subMenExpenditure);

        jMenuItem4.setText("meal management");
        menuAdmin.add(jMenuItem4);

        jMenuBar1.add(menuAdmin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuViewmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuViewmemberActionPerformed
        // TODO add your handling code here:
        ShowMembers sec=new ShowMembers();
        this.hide();
        sec.show();
    }//GEN-LAST:event_menuViewmemberActionPerformed

    private void subMenAddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenAddMemberActionPerformed
    AddMember fir=new AddMember();
    this.hide();
    fir.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_subMenAddMemberActionPerformed

    private void subMenExpenditureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenExpenditureActionPerformed
        // TODO add your handling code here:
        Expenditure exp=new Expenditure();
        exp.show();
    }//GEN-LAST:event_subMenExpenditureActionPerformed

    private void subMenDepositeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenDepositeActionPerformed
        // TODO add your handling code here:
        DepositeWithdraw dpo=new DepositeWithdraw();
        dpo.show();
    }//GEN-LAST:event_subMenDepositeActionPerformed

    private void menuFinanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFinanceActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuFinanceActionPerformed

    private void menuFinanceAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_menuFinanceAncestorAdded
        // TODO add your handling code here:
        //Expenditure exp=new Expenditure();
        //exp.show();
        //this.hide();
    }//GEN-LAST:event_menuFinanceAncestorAdded

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
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu menuAdmin;
    private javax.swing.JMenu menuFinance;
    private javax.swing.JMenu menuMember;
    private javax.swing.JMenuItem menuViewmember;
    private javax.swing.JMenuItem subMenAddMember;
    private javax.swing.JMenuItem subMenDeposite;
    private javax.swing.JMenuItem subMenExpenditure;
    // End of variables declaration//GEN-END:variables
}
