/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CommonPanels;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.HeadquarterOrganization;
import Business.Requests.DonorRequest;
import Business.People.PatientDirectory;
import Business.Statuses.BloodRequestStatuses;
import Business.Statuses.DonorApplicationStatuses;
import Business.UserAccount.UserAccount;
import Magic.Design.MyTableFormat;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author siddh
 */
public class DonorApplicationListJPanel extends javax.swing.JPanel {

    EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    boolean a = true;
    private UserAccount userAccount;
    HeadquarterOrganization bloodBankOrganization;
    Enterprise enterprise;
    PatientDirectory patientDirectory;
    private Network network;
    JPanel userProcessContainer;

    public DonorApplicationListJPanel(EcoSystem system, UserAccount userAccount, Network network, JPanel userProcessContainer) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        tblDonorApplications.getTableHeader().setDefaultRenderer(new MyTableFormat());
        populateStatusCombo();
        populateDonorApplicationTable();

    }

    private void populateDonorApplicationTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblDonorApplications.getModel();

        dtm.setRowCount(0);

        for (DonorRequest donor : system.getDonorRequestDirectory().getDonorRequestList()) {
            Object row[] = new Object[5];
            row[0] = donor;
            row[1] = donor.getName();
            row[2] = donor.getContact();
            row[3] = donor.getBloodType().toString();
            row[4] = donor.getStatus();

            dtm.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblDonorApplications = new javax.swing.JTable();
        btnPrepareOrder = new javax.swing.JButton();
        titlePanel = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        cmbStatusChange = new javax.swing.JComboBox<>();
        btnStatusChange = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setForeground(new java.awt.Color(204, 255, 204));
        setMinimumSize(new java.awt.Dimension(1100, 720));
        setPreferredSize(new java.awt.Dimension(1150, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDonorApplications.setBackground(new java.awt.Color(0, 102, 102));
        tblDonorApplications.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblDonorApplications.setForeground(new java.awt.Color(255, 255, 255));
        tblDonorApplications.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Name", "Contact", "Blood Type", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDonorApplications.setFocusable(false);
        tblDonorApplications.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tblDonorApplications);

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

        titlePanel.setBackground(new java.awt.Color(0, 102, 102));
        titlePanel.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel26.setBackground(new java.awt.Color(0, 102, 102));
        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 255, 204));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Donor Application List");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 1273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(521, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(titlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, -1));

        cmbStatusChange.setBackground(new java.awt.Color(0, 102, 102));
        cmbStatusChange.setForeground(new java.awt.Color(204, 255, 204));
        cmbStatusChange.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbStatusChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 160, 30));

        btnStatusChange.setBackground(new java.awt.Color(0, 102, 102));
        btnStatusChange.setForeground(new java.awt.Color(204, 255, 204));
        btnStatusChange.setText("Change Status");
        btnStatusChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusChangeActionPerformed(evt);
            }
        });
        add(btnStatusChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 150, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrepareOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrepareOrderActionPerformed

        int selectedRow = tblDonorApplications.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, new JLabel("Select a blood request to view") , "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        DonorRequest selectedRequest = (DonorRequest) tblDonorApplications.getValueAt(selectedRow, 0);
        if (selectedRequest == null) return;
        
        ViewDonorApplicationJPanel panel = new ViewDonorApplicationJPanel(system, selectedRequest, userProcessContainer);
        userProcessContainer.add("ViewRequestJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnPrepareOrderActionPerformed

    private void btnStatusChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusChangeActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDonorApplications.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, new JLabel("Select a blood request to change status"), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        DonorRequest selectedRequest = (DonorRequest) tblDonorApplications.getValueAt(selectedRow, 0);
        if (selectedRequest != null) {
            selectedRequest.setStatus(cmbStatusChange.getSelectedItem().toString());
        }
        populateDonorApplicationTable();

    }//GEN-LAST:event_btnStatusChangeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrepareOrder;
    private javax.swing.JButton btnStatusChange;
    private javax.swing.JComboBox<String> cmbStatusChange;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDonorApplications;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables

    
private void populateStatusCombo() {
        cmbStatusChange.removeAllItems();
        for (DonorApplicationStatuses.RequestStatus da : system.getDonorApplicationStatus().getDonorApplicationStatusList()) {
            cmbStatusChange.addItem(da.toString());
        }
        cmbStatusChange.setSelectedIndex(-1);
    }

}