/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import userinterface.CommonPanels.*;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.HeadquarterOrganization;
import Business.People.PatientDirectory;
import Business.Requests.PatientRequest;
import Business.Statuses.BloodRequestStatuses.RequestStatus;
import Business.UserAccount.UserAccount;
import Magic.Design.MyTableFormat;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class TrackBloodRequestsListJPanel extends javax.swing.JPanel {

    EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    boolean a = true;
    private UserAccount userAccount;
    HeadquarterOrganization bloodBankOrganization;
    Enterprise enterprise;
    PatientDirectory patientDirectory;
    private Network network;
    JPanel userProcessContainer;

    public TrackBloodRequestsListJPanel(EcoSystem system, JPanel userProcessContainer) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        tblBloodRequests.getTableHeader().setDefaultRenderer(new MyTableFormat());
        populatePatientRequestsTable();
        // populateStatusCombo();

    }

    private void populatePatientRequestsTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblBloodRequests.getModel();

        dtm.setRowCount(0);

        for (PatientRequest patient : system.getPatientRequestDirectory().getPatientRequestList()) {
            Object row[] = new Object[5];
            row[0] = patient;
            row[1] = patient.getName();
            row[2] = patient.getContact();
            row[3] = patient.getBloodType();
            row[4] = patient.getStatus();

            dtm.addRow(row);
        }
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tblBloodRequests = new javax.swing.JTable();
        btnPrepareOrder = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        titlePanel = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setForeground(new java.awt.Color(204, 255, 204));
        setMinimumSize(new java.awt.Dimension(1100, 720));
        setPreferredSize(new java.awt.Dimension(1150, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblBloodRequests.setBackground(new java.awt.Color(0, 102, 102));
        tblBloodRequests.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblBloodRequests.setForeground(new java.awt.Color(255, 255, 255));
        tblBloodRequests.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Patient ID", "Name", "Contact", "Blood Type", "Status"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblBloodRequests.setFocusable(false);
        tblBloodRequests.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tblBloodRequests);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 1150, 410));

        btnPrepareOrder.setBackground(new java.awt.Color(0, 102, 102));
        btnPrepareOrder.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnPrepareOrder.setForeground(new java.awt.Color(204, 255, 204));
        btnPrepareOrder.setText("View Details");
        btnPrepareOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPrepareOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrepareOrderActionPerformed(evt);
            }
        });
        add(btnPrepareOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 540, 170, 40));

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnBack.setForeground(new java.awt.Color(204, 255, 204));
        btnBack.setText("<< Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 170, 40));

        titlePanel.setBackground(new java.awt.Color(0, 102, 102));
        titlePanel.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Blood Requests Tracking");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
                titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(titlePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 1273,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(521, Short.MAX_VALUE)));
        titlePanelLayout.setVerticalGroup(
                titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                                .addGap(0, 12, Short.MAX_VALUE)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 58,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));

        add(titlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrepareOrderActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnPrepareOrderActionPerformed

        int selectedRow = tblBloodRequests.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, new JLabel("Select a blood request to view"), "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        PatientRequest selectedRequest = (PatientRequest) tblBloodRequests.getValueAt(selectedRow, 0);

        ViewBloodRequestJPanel panel = new ViewBloodRequestJPanel(system, selectedRequest, userProcessContainer);
        userProcessContainer.add("ViewBloodRequestJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }// GEN-LAST:event_btnPrepareOrderActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer); // TODO add your handling code here:
    }// GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPrepareOrder;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblBloodRequests;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables

}
