
package ktreservationsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

  public class PendingApplication extends javax.swing.JFrame {
    
    private Connection sqlConn;
    private PreparedStatement preparedStatement;
    private List<PendingApplicationData> pendingApplications = new ArrayList<>();

    public PendingApplication() {
        initComponents();
        populatePendingApplications();
    }
    
    private void populatePendingApplications() {
        
        DefaultTableModel model = (DefaultTableModel) pendingapplication.getModel();
        model.setRowCount(0); 
        pendingApplications.clear(); // Clear existing data in the list

        try {
            // To Connect my pending application Database
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pendingapplication", "root", "");
            String query = "SELECT Firstname, Middlename, Lastname, Age, Sex, Occupation, Address, Nationality, Destination, DepartureDate, SeatClass FROM pendingapplication";
            PreparedStatement statement = sqlConn.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) { 
                // To show my pending application to the table
                PendingApplicationData applicationData = new PendingApplicationData(
                resultSet.getString("Firstname"),
                resultSet.getString("Middlename"),
                resultSet.getString("Lastname"),
                resultSet.getInt("Age"),
                resultSet.getString("Sex"),
                resultSet.getString("Occupation"),
                resultSet.getString("Address"),
                resultSet.getString("Nationality"),
                resultSet.getString("Destination"),
                resultSet.getString("DepartureDate"),
                resultSet.getString("SeatClass")
                );
                
                // Add data to the list
                pendingApplications.add(applicationData); 
                Object[] rowData = applicationData.toRowData();
                model.addRow(rowData);
            }

                resultSet.close();
                statement.close();
                
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error retrieving pending applications.");
        }

     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pendingapplication = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        AcceptApplication = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        DeleteApplication = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 10));

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pending Application");

        pendingapplication.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Firstname", "Middlename", "Lastname", "Age", "Sex", "Occupation", "Address", "Nationality", "Destination", "DepartureDate", "SeatClass"
            }
        ));
        jScrollPane1.setViewportView(pendingapplication);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setMinimumSize(new java.awt.Dimension(100, 5));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AcceptApplication.setBackground(new java.awt.Color(51, 51, 51));
        AcceptApplication.setFont(new java.awt.Font("Palatino Linotype", 1, 15)); // NOI18N
        AcceptApplication.setForeground(new java.awt.Color(204, 204, 204));
        AcceptApplication.setText("Accept Application");
        AcceptApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptApplicationActionPerformed(evt);
            }
        });

        Refresh.setBackground(new java.awt.Color(51, 51, 51));
        Refresh.setFont(new java.awt.Font("Palatino Linotype", 1, 15)); // NOI18N
        Refresh.setForeground(new java.awt.Color(204, 204, 204));
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(51, 51, 51));
        Back.setFont(new java.awt.Font("Palatino Linotype", 1, 15)); // NOI18N
        Back.setForeground(new java.awt.Color(204, 204, 204));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        DeleteApplication.setBackground(new java.awt.Color(51, 51, 51));
        DeleteApplication.setFont(new java.awt.Font("Palatino Linotype", 1, 15)); // NOI18N
        DeleteApplication.setForeground(new java.awt.Color(204, 204, 204));
        DeleteApplication.setText("Delete Application");
        DeleteApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteApplicationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(Back)
                .addGap(18, 18, 18)
                .addComponent(AcceptApplication)
                .addGap(18, 18, 18)
                .addComponent(DeleteApplication)
                .addGap(18, 18, 18)
                .addComponent(Refresh)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(AcceptApplication)
                    .addComponent(Refresh)
                    .addComponent(DeleteApplication))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    

     private void insertIntoAdminApplication(Object[] rowData) {
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminapplication", "root", "");
        preparedStatement = sqlConn.prepareStatement("INSERT INTO adminapplication (Firstname, Middlename, Lastname, Age, Sex, Occupation, Address, Nationality, Destination, DepartureDate, SeatClass) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        for (int i = 0; i < rowData.length; i++) {
            preparedStatement.setObject(i + 1, rowData[i]);
        }

        preparedStatement.executeUpdate();
        JOptionPane.showMessageDialog(this, "Application accepted and added to adminapplication database.");

        // After successful insertion into adminapplication, delete the record from pendingapplication
        deleteRecordFromPendingApplication(rowData);
        
    } catch (ClassNotFoundException | SQLException ex) {
        java.util.logging.Logger.getLogger(PendingApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
  }

     private void deleteRecordFromPendingApplication(Object[] rowData) {
       try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pendingapplication", "root", "");
        preparedStatement = sqlConn.prepareStatement("DELETE FROM pendingapplication WHERE Firstname = ? AND Middlename = ? AND Lastname = ? AND Age = ? AND Sex = ? AND Occupation = ? AND Address = ? AND Nationality = ? AND Destination = ? AND DepartureDate = ? AND SeatClass = ?");

        for (int i = 0; i < rowData.length; i++) {
            preparedStatement.setObject(i + 1, rowData[i]);
        }

        preparedStatement.executeUpdate();
    } catch (ClassNotFoundException | SQLException ex) {
        java.util.logging.Logger.getLogger(PendingApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
  }
     
     private static final int FIRST_CLASS_LIMIT = 12;
     private static final int ECONOMY_CLASS_LIMIT = 12;

    private boolean isWithinLimit(int firstClassCount, int economyClassCount) {
    return firstClassCount < FIRST_CLASS_LIMIT || economyClassCount < ECONOMY_CLASS_LIMIT;
    }
    
    private void AcceptApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptApplicationActionPerformed
                                                                                                                                              
    DefaultTableModel model = (DefaultTableModel) pendingapplication.getModel();
        int selectedRowIndex = pendingapplication.getSelectedRow();
        if (selectedRowIndex != -1) {
            
            // Get data from the selected row
            Object[] rowData = new Object[model.getColumnCount()];
            for (int i = 0; i < rowData.length; i++) {
                rowData[i] = model.getValueAt(selectedRowIndex, i);
            }
            
            // Insert the data into the adminapplication database
            insertIntoAdminApplication(rowData);
            
            // Remove the selected row from the pendingapplication table
            model.removeRow(selectedRowIndex);
            
        } else {
            JOptionPane.showMessageDialog(this, "Select a row to accept application.");              
        }
    }//GEN-LAST:event_AcceptApplicationActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        AdminUserPage adminUserPage = new AdminUserPage();
        adminUserPage.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BackActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
       
        // Refresh the table data                                   
        populatePendingApplications(); 
    }//GEN-LAST:event_RefreshActionPerformed
 
    private void DeleteApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteApplicationActionPerformed
                                        
        DefaultTableModel model = (DefaultTableModel) pendingapplication.getModel();
        int selectedRowIndex = pendingapplication.getSelectedRow();

       if (selectedRowIndex != -1) {
           // Get the data from the selected row
           String Firstname = model.getValueAt(selectedRowIndex, 0).toString();
           String Middlename = model.getValueAt(selectedRowIndex, 1).toString();
           String Lastname = model.getValueAt(selectedRowIndex, 2).toString();
           String Age = model.getValueAt(selectedRowIndex, 3).toString();
           String Sex = model.getValueAt(selectedRowIndex, 4).toString();
           String Occupation = model.getValueAt(selectedRowIndex, 5).toString();
           String Address = model.getValueAt(selectedRowIndex, 6).toString();
           String Nationality = model.getValueAt(selectedRowIndex, 7).toString();
           String Destination = model.getValueAt(selectedRowIndex, 8).toString();
           String DepartureDate = model.getValueAt(selectedRowIndex, 9).toString();
           String SeatClass = model.getValueAt(selectedRowIndex, 10).toString();

           // Attempt to delete the record from the database
       if (deleteRecordFromDatabase(
           Firstname, Middlename, Lastname, Age, Sex,
           Occupation, Address, Nationality, Destination, DepartureDate, SeatClass)) {
           
           // Record deleted successfully and Remove the row from the JTable
           model.removeRow(selectedRowIndex);
           
     } else {
            JOptionPane.showMessageDialog(this, "Failed to delete the record.");
            }
     } else {
            JOptionPane.showMessageDialog(this, "Select a row to delete application.");
      }
    }//GEN-LAST:event_DeleteApplicationActionPerformed

    private boolean deleteRecordFromDatabase(
        String Firstname, String Middlename, String Lastname, String Age, 
        String Sex, String Occupation, String Address, 
        String Nationality, String Destination, String DepartureDate, String SeatClass) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            // Replace with my database connection details
            String jdbcUrl = "jdbc:mysql://localhost:3306/pendingapplication";
            String dbUsername = "root";
            String dbPassword = "";

            // Establish a database connection
            conn = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);

            // Define the SQL DELETE statement
            String sql = "DELETE FROM pendingapplication WHERE Firstname = ? AND Middlename = ? AND Lastname = ? AND Age = ? AND Sex = ? AND Occupation = ? AND Address = ? AND Nationality = ? AND Destination = ? AND DepartureDate = ? AND SeatClass = ?";

            // Create a PreparedStatement
            stmt = conn.prepareStatement(sql);
            
            // Set parameters for the PreparedStatement
            stmt.setString(1, Firstname);
            stmt.setString(2, Middlename);
            stmt.setString(3, Lastname);
            stmt.setString(4, Age);
            stmt.setString(5, Sex);
            stmt.setString(6, Occupation);
            stmt.setString(7, Address);
            stmt.setString(8, Nationality);
            stmt.setString(9, Destination);
            stmt.setString(10, DepartureDate);
            stmt.setString(11, SeatClass);

            // Execute the DELETE statement
            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {

                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

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
            java.util.logging.Logger.getLogger(PendingApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PendingApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PendingApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PendingApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PendingApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptApplication;
    private javax.swing.JButton Back;
    private javax.swing.JButton DeleteApplication;
    private javax.swing.JButton Refresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pendingapplication;
    // End of variables declaration//GEN-END:variables

    private int countRowsWithClass(String first_Class) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
