/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.CustomerRole;

import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.CommonPanels.BloodRequestsListJPanel;

/**
 *
 * @author User
 */
public class TrackStatusJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PickCustomerActionJPanel
     */

    EcoSystem system;
    JPanel customerProcessContainer;

    public TrackStatusJPanel(EcoSystem system, JPanel customerProcessContainer) {
        initComponents();
        this.system = system;
        this.customerProcessContainer = customerProcessContainer;

        this.setSize(1280, 760);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        btnTrackRequests = new javax.swing.JButton();
        btnTrackApplications = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(204, 255, 204));
        btnBack.setText("<< Back");
        btnBack.setBorder(new javax.swing.border.MatteBorder(null));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnTrackRequests.setBackground(new java.awt.Color(0, 102, 102));
        btnTrackRequests.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTrackRequests.setForeground(new java.awt.Color(204, 255, 204));
        btnTrackRequests.setText("Track Blood Requests");
        btnTrackRequests.setBorder(new javax.swing.border.MatteBorder(null));
        btnTrackRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrackRequestsActionPerformed(evt);
            }
        });

        btnTrackApplications.setBackground(new java.awt.Color(0, 102, 102));
        btnTrackApplications.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTrackApplications.setForeground(new java.awt.Color(204, 255, 204));
        btnTrackApplications.setText("Track Donor Applications");
        btnTrackApplications.setBorder(new javax.swing.border.MatteBorder(null));
        btnTrackApplications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrackApplicationsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 113,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(1129, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTrackApplications, javax.swing.GroupLayout.PREFERRED_SIZE, 336,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(btnTrackRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 336,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(314, 314, 314)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnTrackRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnTrackApplications, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(282, 282, 282)));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBackActionPerformed
        customerProcessContainer.remove(this);
        CardLayout layout = (CardLayout) customerProcessContainer.getLayout();
        layout.previous(customerProcessContainer);
    }// GEN-LAST:event_btnBackActionPerformed

    private void btnTrackRequestsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTrackRequestsActionPerformed
        customerProcessContainer.add("BloodRequest",
                new TrackBloodRequestsListJPanel(system, customerProcessContainer));
        CardLayout layout = (CardLayout) customerProcessContainer.getLayout();
        layout.next(customerProcessContainer);
    }// GEN-LAST:event_btnTrackRequestsActionPerformed

    private void btnTrackApplicationsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTrackApplicationsActionPerformed
        // TODO add your handling code here:
        customerProcessContainer.add("BloodRequest",
                new TrackingDonorApplicationListJPanel(system, customerProcessContainer));
        CardLayout layout = (CardLayout) customerProcessContainer.getLayout();
        layout.next(customerProcessContainer);

    }// GEN-LAST:event_btnTrackApplicationsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnTrackApplications;
    private javax.swing.JButton btnTrackRequests;
    // End of variables declaration//GEN-END:variables
}
