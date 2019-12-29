
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class PatientAdmit_Ward extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    
    public PatientAdmit_Ward() {
        initComponents();
        setLocationRelativeTo(null);
        fillcombo();
        cmbWardName.setSelectedIndex(-1);
        cmbWardName1.setVisible(false);
        txtAdmitID.setVisible(false);
         Get_Data1();
         GetRecord();
    }
private void fillcombo()
{
     try{
      
   con=Connect.ConnectDB();
      String sql= "select distinct Wardname from Ward order by Wardname";
      pst=con.prepareStatement(sql);
      rs=pst.executeQuery();
      while(rs.next()){
          String add=rs.getString("Wardname");
          cmbWardName.addItem(add);
          
         }
        }catch(HeadlessException | SQLException ex){
           JOptionPane.showMessageDialog(this,ex); 
        }
}
 private void GetRecord(){
        String sql="select DoctorID as 'Doctor ID', DoctorName as 'Doctor Name' from Doctor order by DoctorName";
          try{
              con=Connect.ConnectDB();
         pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
         jTable2.setModel(DbUtils.resultSetToTableModel(rs));
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
          
}
    }
  private void Get_Data1(){
        String sql="select PatientID as 'Patient ID', PatientName as 'Patient Name',Gen as 'Gender',BG as 'Blood Group' from Patientregistration order by PatientName";
          try{
         con=Connect.ConnectDB();
         pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
         jTable1.setModel(DbUtils.resultSetToTableModel(rs));
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
          
}
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PatientID = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        txtAdmitDate = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        txtBloodGroup = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtDisease = new javax.swing.JTextField();
        txtDoctorID = new javax.swing.JTextField();
        txtDoctorName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRemarks = new javax.swing.JTextArea();
        cmbWardName = new javax.swing.JComboBox();
        cmbWardName1 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnGetData = new javax.swing.JButton();
        txtAdmitID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admit Patient");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Patient Admit Info"));

        jLabel1.setText("Patient ID");

        jLabel2.setText("Patient Name");

        jLabel9.setText("Blood Group");

        jLabel10.setText("Remarks");

        PatientID.setEditable(false);

        txtPatientName.setEditable(false);

        txtAdmitDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        jLabel11.setText("Gender");

        jLabel22.setText("(DD/MM/YYYY)");

        txtGender.setEditable(false);

        txtBloodGroup.setEditable(false);

        jLabel12.setText("Disease");

        jLabel13.setText("Admit Date");

        jLabel14.setText("Ward Name");

        jLabel16.setText("Doctor ID");

        jLabel17.setText("Doctor Name");

        txtDoctorID.setEditable(false);

        txtDoctorName.setEditable(false);

        txtRemarks.setColumns(20);
        txtRemarks.setRows(5);
        jScrollPane1.setViewportView(txtRemarks);

        cmbWardName.setEditable(true);
        cmbWardName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbWardNameItemStateChanged(evt);
            }
        });
        cmbWardName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbWardNameActionPerformed(evt);
            }
        });

        cmbWardName1.setEditable(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel10))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtAdmitDate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22))
                    .addComponent(PatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBloodGroup)
                    .addComponent(txtGender)
                    .addComponent(txtDisease)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbWardName, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbWardName1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDoctorName)
                    .addComponent(txtDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(PatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDisease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtAdmitDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cmbWardName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbWardName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnGetData.setText("Get Data");
        btnGetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGetData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGetData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtAdmitID.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAdmitID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAdmitID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbWardNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbWardNameActionPerformed
  
    }//GEN-LAST:event_cmbWardNameActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
          try{
            con=Connect.ConnectDB();
            int row= jTable1.getSelectedRow();
            String table_click= jTable1.getModel().getValueAt(row, 0).toString();
            String sql= "select * from PatientRegistration where PatientID = '" + table_click + "'";
            pst=con.prepareStatement(sql);
            rs=  pst.executeQuery();
            if(rs.next()){
       
                String add1=rs.getString("PatientID");
                PatientID.setText(add1);
                String add2=rs.getString("Patientname");
                txtPatientName.setText(add2);
                String add9=rs.getString("BG");
                txtBloodGroup.setText(add9);
                String add11=rs.getString("Gen");
                txtGender.setText(add11);
                         
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        try{
            con=Connect.ConnectDB();
            int row= jTable2.getSelectedRow();
            String table_click= jTable2.getModel().getValueAt(row, 0).toString();
            String sql= "select * from Doctor where DoctorID = '" + table_click + "'";
            pst=con.prepareStatement(sql);
            rs=  pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("DoctorID");
                txtDoctorID.setText(add1);
                String add2=rs.getString("Doctorname");
                txtDoctorName.setText(add2);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
    Reset();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
      try{
            con=Connect.ConnectDB();
              if (PatientID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve Patient ID","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtPatientName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve Patient Name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           if (txtGender.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve Gender","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         
            if (txtBloodGroup.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve blood group","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtDisease.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter disease","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
             if (txtAdmitDate.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter admit date","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cmbWardName.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog( this, "Please select ward name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
  
            if (txtDoctorID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve doctor id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtDoctorName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter retrieve doctor name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
             Statement stmt1;
       stmt1= con.createStatement();
       String sql2="Select Wardname from Ward where Wardname= '" + cmbWardName.getSelectedItem()+ "' and NoOfbeds<=0";
      rs=stmt1.executeQuery(sql2);
      if(rs.next()){
        JOptionPane.showMessageDialog( this, "Beds are not available","Error", JOptionPane.ERROR_MESSAGE);
        cmbWardName.setSelectedItem("");
        cmbWardName.requestDefaultFocus();
       return;
      }
       Statement stmt;
       stmt= con.createStatement();
       String sql1="Select PatientID,AdmitDate from AdmitPatient_Room where PatientID= '" + PatientID.getText() + "' and AdmitDate='" + txtAdmitDate + "'";
      rs=stmt.executeQuery(sql1);
      if(rs.next()){
        JOptionPane.showMessageDialog( this, "Record already exists","Error", JOptionPane.ERROR_MESSAGE);
        return;
      }
     
            String sql= "insert into AdmitPatient_Ward(PatientID,Disease,AdmitDate,Wardname,DoctorID,AP_Remarks)values('"+ PatientID.getText() + "','"+ txtDisease.getText() + "','"+ txtAdmitDate.getText() + "','"+ cmbWardName.getSelectedItem()+ "','" + txtDoctorID.getText() + "','"+ txtRemarks.getText() + "')";

            pst=con.prepareStatement(sql);
            pst.execute();
            String sql3= "update Ward set NoOfBeds=NoOfBeds - 1 where Wardname='" + cmbWardName.getSelectedItem() + "'";
            pst=con.prepareStatement(sql3);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully admitted","Patient",JOptionPane.INFORMATION_MESSAGE);
            btnSave.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cmbWardNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbWardNameItemStateChanged
     
    }//GEN-LAST:event_cmbWardNameItemStateChanged

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       try{
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=Connect.ConnectDB();
                String sql= "delete from AdmitPatient_Ward where AdmitID = " + txtAdmitID.getText() + "";
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);

                Reset();
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnGetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDataActionPerformed
  this.hide();
  PatientAdmit_WardRecord frm= new PatientAdmit_WardRecord();
  frm.setVisible(true);
    }//GEN-LAST:event_btnGetDataActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    try{
       
            con=Connect.ConnectDB();
      
       Statement stmt1;
       stmt1= con.createStatement();
       String s= cmbWardName.getSelectedItem().toString();
       String t= cmbWardName1.getSelectedItem().toString();
       if (!t.equals(s))
       {
       String sql2="Select Wardname from Ward where Wardname= '" + cmbWardName.getSelectedItem()+ "' and NoOfbeds<=0";
       rs=stmt1.executeQuery(sql2);
       if(rs.next()){
        JOptionPane.showMessageDialog( this, "beds are not available","Error", JOptionPane.ERROR_MESSAGE);
        cmbWardName.setSelectedItem("");
        cmbWardName.requestDefaultFocus();
       return;
      }
      }
      
            String sql= " update AdmitPatient_Ward set PatientID='"+ PatientID.getText() + "',Disease='"+ txtDisease.getText() + "',AdmitDate='"+ txtAdmitDate.getText() + "',Wardname='"+ cmbWardName.getSelectedItem()+ "',DoctorID='" + txtDoctorID.getText() + "',AP_Remarks='"+ txtRemarks.getText() + "' where AdmitID= " + txtAdmitID.getText() + "";
            pst=con.prepareStatement(sql);
            pst.execute();
           if (!t.equals(s))
       {
             String sql3= "update Ward set NoOfBeds=NoOfBeds - 1 where Wardname='" + cmbWardName.getSelectedItem() + "'";
           pst=con.prepareStatement(sql3);
            pst.execute();
       }
            if (!t.equals(s))
       {
             String sql4= "update Ward set NoOfBeds=NoOfBeds + 1 where Wardname='" + cmbWardName1.getSelectedItem() + "'";
             pst=con.prepareStatement(sql4);
            pst.execute();
       }
            JOptionPane.showMessageDialog(this,"Successfully updated","Patient Record",JOptionPane.INFORMATION_MESSAGE);
            btnUpdate.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed
private void Reset()
{
    txtDoctorID.setText("");
    txtDoctorName.setText("");
    PatientID.setText("");
    txtPatientName.setText("");
    txtBloodGroup.setText("");
    txtGender.setText("");
    txtDisease.setText("");
    txtAdmitDate.setText("");
    
    txtRemarks.setText("");
    cmbWardName.setSelectedIndex(-1);
    btnSave.setEnabled(true);
    btnUpdate.setEnabled(false);
    btnDelete.setEnabled(false);
    }
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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PatientAdmit_Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientAdmit_Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientAdmit_Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientAdmit_Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientAdmit_Room().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField PatientID;
    public javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGetData;
    private javax.swing.JButton btnNew;
    public javax.swing.JButton btnSave;
    public javax.swing.JButton btnUpdate;
    public javax.swing.JComboBox cmbWardName;
    public javax.swing.JComboBox cmbWardName1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    public javax.swing.JFormattedTextField txtAdmitDate;
    public javax.swing.JTextField txtAdmitID;
    public javax.swing.JTextField txtBloodGroup;
    public javax.swing.JTextField txtDisease;
    public javax.swing.JTextField txtDoctorID;
    public javax.swing.JTextField txtDoctorName;
    public javax.swing.JTextField txtGender;
    public javax.swing.JTextField txtPatientName;
    public javax.swing.JTextArea txtRemarks;
    // End of variables declaration//GEN-END:variables
}