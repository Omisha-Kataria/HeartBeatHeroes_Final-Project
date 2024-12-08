/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CaseManagerRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Magic.Design.*;
import Magic.Design.MyJLabel;
import Magic.Design.MyJButton;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LogisticsOrganization;
import Business.Organization.Organization;
import Business.People.Patient;
import Business.People.PatientDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.System_Coordinator_Test_WorkRequest;
import Business.WorkQueue.WorkRequest;
import Magic.Design.MyTableFormat;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author krish19
 */
public class CreatePatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePatientJPanel
     */
     //private JPanel userProcessContainerJPanel;
     //private PatientDirectory patientDirectory;
    private  EcoSystem system;
     private UserAccount userAccount;
     private Network network;
     private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    CreatePatientJPanel(EcoSystem system, UserAccount userAccount, Network network) {
        initComponents();
        //this.patientDirectory = patientDirectory;
       
        this.system = system;
        this.userAccount = userAccount;
        this.network = network;
        populateTable();
        populatePatientTable();
        
        tblPatient.getTableHeader().setDefaultRenderer(new MyTableFormat());
        tblRequest.getTableHeader().setDefaultRenderer(new MyTableFormat());
        
    }
    
    private void populatePatientTable(){
    DefaultTableModel dtmA = (DefaultTableModel)tblPatient.getModel();
      dtmA.setRowCount(0);
      Object row[] = new Object[5];
       String line = "";  
       String splitBy = ",";  
        try   
        {  
            //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader("PatientsRecord.csv"));  
            while ((line = br.readLine()) != null)   //returns a Boolean value  
            {
            String[] csv = line.split(splitBy);    // use comma as separator 
            row[0]= csv[0];
            row[1]= csv[1];
            row[2]= csv[2];
            row[3]= csv[3];
            row[4]= csv[4];
            
            dtmA.addRow(row);
        }   }
            catch (IOException e)   
            {  e.printStackTrace(); }   
    
    
    }
    
     private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblRequest.getModel();
        
        dtm.setRowCount(0);
        

        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[6];
            row[0] = request;
            
            row[1] = request.getSummary();
            row[2] = request.getPatient();
            row[3] = request.getPatient().getEmailID();
            row[4] = request.getStatus();
            row[5] = request.getActionDate();
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        uidTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        btnCreateReceiver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRequest = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        chkEmergency = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        HLATypesTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 153, 153));
        setForeground(new java.awt.Color(204, 255, 204));
        setMinimumSize(new java.awt.Dimension(1150, 720));
        setPreferredSize(new java.awt.Dimension(1150, 820));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("UID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 204));
        jLabel3.setText("Email");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        uidTextField.setBackground(new java.awt.Color(0, 153, 153));
        uidTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        uidTextField.setForeground(new java.awt.Color(255, 255, 255));
        uidTextField.setEnabled(false);
        add(uidTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 212, -1));

        emailTextField.setBackground(new java.awt.Color(0, 153, 153));
        emailTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        emailTextField.setForeground(new java.awt.Color(255, 255, 255));
        emailTextField.setEnabled(false);
        add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 212, -1));

        btnCreateReceiver.setBackground(new java.awt.Color(0, 102, 102));
        btnCreateReceiver.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnCreateReceiver.setForeground(new java.awt.Color(204, 255, 204));
        btnCreateReceiver.setText("Create Patient");
        btnCreateReceiver.setBorder(new javax.swing.border.MatteBorder(null));
        btnCreateReceiver.setEnabled(false);
        btnCreateReceiver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateReceiverActionPerformed(evt);
            }
        });
        add(btnCreateReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 250, 40));

        tblPatient.setBackground(new java.awt.Color(0, 102, 102));
        tblPatient.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        tblPatient.setForeground(new java.awt.Color(255, 255, 255));
        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UID", "Name", "Email", "Blood Transfusion Date", "Blood Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPatient.setFocusable(false);
        tblPatient.setGridColor(new java.awt.Color(0, 0, 0));
        tblPatient.setRowHeight(30);
        tblPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPatientMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblPatient);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 890, 210));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("List Of Patients Which Requires Blood In The Network Area Of The Coordinator");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 153, 153));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("List Of Patients");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, -1, -1));

        tblRequest.setBackground(new java.awt.Color(0, 102, 102));
        tblRequest.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        tblRequest.setForeground(new java.awt.Color(255, 255, 255));
        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Number", "Summary", "Patient Name", "Email ID", "Status", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRequest.setFocusable(false);
        tblRequest.setGridColor(new java.awt.Color(0, 0, 0));
        tblRequest.setRowHeight(30);
        jScrollPane2.setViewportView(tblRequest);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 900, 220));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setBackground(new java.awt.Color(0, 153, 153));
        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 255, 204));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Create Patient Profile");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 11, 890, 48));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, -1));

        chkEmergency.setBackground(new java.awt.Color(0, 153, 153));
        chkEmergency.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        chkEmergency.setForeground(new java.awt.Color(204, 255, 204));
        chkEmergency.setText("Emergency");
        chkEmergency.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chkEmergency.setEnabled(false);
        chkEmergency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEmergencyActionPerformed(evt);
            }
        });
        add(chkEmergency, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 153, 153));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 204));
        jLabel6.setText("Name");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, -1, -1));

        nameTextField.setBackground(new java.awt.Color(0, 153, 153));
        nameTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        nameTextField.setForeground(new java.awt.Color(255, 255, 255));
        nameTextField.setEnabled(false);
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 380, 212, -1));

        jLabel8.setBackground(new java.awt.Color(0, 153, 153));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 204));
        jLabel8.setText("Blood Type");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, -1, -1));

        HLATypesTextField.setBackground(new java.awt.Color(0, 153, 153));
        HLATypesTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        HLATypesTextField.setForeground(new java.awt.Color(255, 255, 255));
        HLATypesTextField.setEnabled(false);
        HLATypesTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HLATypesTextFieldActionPerformed(evt);
            }
        });
        add(HLATypesTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 420, 210, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateReceiverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateReceiverActionPerformed
        // TODO add your handling code here:
        Patient patient = new Patient();
//        Patient patient = system.getPatientDirectory().addPatient();
        
        patient.setReceiverID(uidTextField.getText());
        patient.setName(nameTextField.getText());
        patient.setEmailID((emailTextField.getText()));
        patient.setBloodType(system.getPersonBloodTypes().findBloodType(HLATypesTextField.getText()));
        patient.setEmergencyStatus(chkEmergency.isSelected());
        patient.setStatus("Centre Approved");
        
        system.getPatientDirectory().addPatient(patient);
        
        populateTable();
         JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>A new Patinet has been added</b></html>"));
           
        //JOptionPane.showMessageDialog(null,"New patient has been added!");
        
        WorkRequest request = new System_Coordinator_Test_WorkRequest();
        
        request.setPatient(patient);
        request.setActionDate(new Date());
        request.setAssigned("Legal Department");
        request.setSummary("Requested for BoneMarrow Reception");
        request.setStatus("Assigned to Legal Department");
        
        request.setUserAccount(userAccount);
       
        Enterprise ent = null;
        Organization org = null;
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getEnterpriseType().toString().equals("Legal")) {
            
                ent = enterprise;
                System.out.println(enterprise);
                break;
            }
        }
        
        if(ent == null) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><b>There is no Legal Enterprize!!<br>Request cannot be sent for Legal Approval!"
                    + "<br>Patient cannot be created</b></html>"),
            "Error",
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        
       
        for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
            if(organization instanceof LogisticsOrganization) {
                org = organization;
                break;
            }
        }
        
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            System.out.println(org.getName());
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            
            dB4OUtil.storeSystem(system);
            populateTable();
             JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Request has been sent for Legal Approval!</b></html>"));         
            
        } else {
        
         JOptionPane.showMessageDialog(null, "No organization present", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        chkEmergency.setEnabled(false);
        btnCreateReceiver.setEnabled(false);
        
        uidTextField.setText("");
        nameTextField.setText("");
        emailTextField.setText("");
        HLATypesTextField.setText("");
    }//GEN-LAST:event_btnCreateReceiverActionPerformed

    private void tblPatientMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientMousePressed
        // TODO add your handling code here:
        int selectedRow = tblPatient.getSelectedRow();
        
        if(selectedRow < 0){
            
            //JOptionPane.showMessageDialog(null,"Please select a row from the table first to View Details!","Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else{

            //String.valueOf(tblGoogleSheet.getValueAt(selectedRow, 0));

            uidTextField.setText( String.valueOf(tblPatient.getValueAt(selectedRow, 0)));
             nameTextField.setText( String.valueOf(tblPatient.getValueAt(selectedRow, 1)));
            emailTextField.setText( String.valueOf(tblPatient.getValueAt(selectedRow, 2)));
            
            HLATypesTextField.setText( String.valueOf(tblPatient.getValueAt(selectedRow, 4)));
            
            
            btnCreateReceiver.setEnabled(true);
            chkEmergency.setEnabled(true);
            

        }
    }//GEN-LAST:event_tblPatientMousePressed

    private void HLATypesTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HLATypesTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HLATypesTextFieldActionPerformed

    private void chkEmergencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEmergencyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkEmergencyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HLATypesTextField;
    private javax.swing.JButton btnCreateReceiver;
    private javax.swing.JCheckBox chkEmergency;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTable tblPatient;
    private javax.swing.JTable tblRequest;
    private javax.swing.JTextField uidTextField;
    // End of variables declaration//GEN-END:variables
}
