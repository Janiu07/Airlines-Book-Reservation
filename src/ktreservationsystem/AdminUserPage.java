
package ktreservationsystem;


import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


   public class AdminUserPage extends javax.swing.JFrame {

     private static final String username = "root";
     private static final String password = "";
     private static final String dataConn = "jdbc:mysql://localhost:3306/adminapplication";
     
     private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    
     Connection sqlConn = null;
     PreparedStatement preparedStatement = null;
     ResultSet resultSet = null;
    
     int q, i;
    
     public AdminUserPage() {
        initComponents();
     }
    
    
     private void adminapplication() throws ClassNotFoundException, SQLException
     {
        
            try {
            //To connect my admin application database
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminapplication", "root", "");
            preparedStatement = sqlConn.prepareStatement("SELECT * FROM adminapplication");
            
            resultSet = preparedStatement.executeQuery();
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            
            q = resultSetMetaData.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)adminapplication.getModel();
                    RecordTable.setRowCount(0);
              
             while (resultSet.next()){
                 Vector columnData = new Vector();
                 
                 for ( i = 1; i <= q; i++)//column data equation
             {
                 

            // to get data from JTextField 
        columnData.add(resultSet.getString("Firstname"));
        columnData.add(resultSet.getString("Middlename"));
        columnData.add(resultSet.getString("Lastname"));
        columnData.add(resultSet.getString("Age"));
        columnData.add(resultSet.getString("Sex"));
        columnData.add(resultSet.getString("Occupation"));
        columnData.add(resultSet.getString("Address"));
        columnData.add(resultSet.getString("Nationality"));
        columnData.add(resultSet.getString("Destination"));
        columnData.add(resultSet.getString("DepartureDate"));
        columnData.add(resultSet.getString("SeatClass"));
            
        }
             RecordTable.addRow(columnData);
        }
    } catch (ClassNotFoundException | SQLException ex) { 
        JOptionPane.showMessageDialog(null, ex.getMessage()); 
    } finally {
                
      }
    }
            
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Firstname = new javax.swing.JTextField();
        Middlename = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Age = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Lastname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Sex = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        DepartureDate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        SeatClass = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Destination = new javax.swing.JTextField();
        Nationality = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Occupation = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        adminapplication = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        AddNewButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        RefreshButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        PendingApplicationButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 8));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 8));

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel2.setText("Firstname:");

        Firstname.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        Firstname.setPreferredSize(new java.awt.Dimension(200, 34));
        Firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstnameActionPerformed(evt);
            }
        });

        Middlename.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        Middlename.setPreferredSize(new java.awt.Dimension(200, 34));
        Middlename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiddlenameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel3.setText("Middlename:");

        Age.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        Age.setPreferredSize(new java.awt.Dimension(200, 34));
        Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel4.setText("Lastname:");

        Lastname.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        Lastname.setPreferredSize(new java.awt.Dimension(200, 34));
        Lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastnameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel5.setText("Age:");

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel6.setText("Sex:");

        Sex.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        Sex.setPreferredSize(new java.awt.Dimension(200, 34));
        Sex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel8.setText("Departure Date:");

        DepartureDate.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        DepartureDate.setMinimumSize(new java.awt.Dimension(200, 34));
        DepartureDate.setPreferredSize(new java.awt.Dimension(200, 34));
        DepartureDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartureDateActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel9.setText("Seat Class:");

        SeatClass.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        SeatClass.setMinimumSize(new java.awt.Dimension(200, 34));
        SeatClass.setPreferredSize(new java.awt.Dimension(200, 34));
        SeatClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeatClassActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel10.setText("Destination:");

        Destination.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        Destination.setMinimumSize(new java.awt.Dimension(200, 34));
        Destination.setPreferredSize(new java.awt.Dimension(200, 34));
        Destination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestinationActionPerformed(evt);
            }
        });

        Nationality.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        Nationality.setMinimumSize(new java.awt.Dimension(200, 34));
        Nationality.setPreferredSize(new java.awt.Dimension(200, 34));
        Nationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NationalityActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel11.setText("Nationality:");

        jLabel12.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel12.setText("Address:");

        jLabel13.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel13.setText("Occupation:");

        Occupation.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        Occupation.setMinimumSize(new java.awt.Dimension(200, 34));
        Occupation.setPreferredSize(new java.awt.Dimension(200, 34));
        Occupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OccupationActionPerformed(evt);
            }
        });

        Address.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        Address.setMinimumSize(new java.awt.Dimension(200, 34));
        Address.setPreferredSize(new java.awt.Dimension(200, 34));
        Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressActionPerformed(evt);
            }
        });

        adminapplication.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adminapplication.setFont(new java.awt.Font("Palatino Linotype", 1, 15)); // NOI18N
        adminapplication.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Firstname", "Middlename", "Lastname", "Age", "Sex", "Occupation", "Address", "Nationality", "Destination", "DepartureDate", "SeatClass"
            }
        ));
        adminapplication.setShowVerticalLines(true);
        adminapplication.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminapplicationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(adminapplication);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 8));

        AddNewButton.setText("Add New");
        AddNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewButtonActionPerformed(evt);
            }
        });

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        RefreshButton.setText("Refresh");
        RefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BackButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddNewButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(RefreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddNewButton)
                .addGap(18, 18, 18)
                .addComponent(UpdateButton)
                .addGap(18, 18, 18)
                .addComponent(RefreshButton)
                .addGap(18, 18, 18)
                .addComponent(DeleteButton)
                .addGap(18, 18, 18)
                .addComponent(BackButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PendingApplicationButton.setText("Pending Application");
        PendingApplicationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PendingApplicationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Middlename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(DepartureDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Occupation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Destination, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(SeatClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PendingApplicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(213, 213, 213))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(Occupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Middlename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel12)
                            .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(Nationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(Destination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(DepartureDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(SeatClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(PendingApplicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 40)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin User");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
           UserLoginPage userLoginPage = new UserLoginPage();
           userLoginPage.setVisible(true);
           this.dispose();
    
    }//GEN-LAST:event_BackButtonActionPerformed

    private void FirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstnameActionPerformed
    
    }//GEN-LAST:event_FirstnameActionPerformed

    private void MiddlenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiddlenameActionPerformed
     
    }//GEN-LAST:event_MiddlenameActionPerformed

    private void AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeActionPerformed
      
    }//GEN-LAST:event_AgeActionPerformed

    private void LastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastnameActionPerformed
       
    }//GEN-LAST:event_LastnameActionPerformed

    private void SexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexActionPerformed
      
    }//GEN-LAST:event_SexActionPerformed

    private void DepartureDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartureDateActionPerformed
   
    }//GEN-LAST:event_DepartureDateActionPerformed

    private void SeatClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeatClassActionPerformed
      
    }//GEN-LAST:event_SeatClassActionPerformed

    private void DestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestinationActionPerformed
     
    }//GEN-LAST:event_DestinationActionPerformed

    private void NationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NationalityActionPerformed
     
    }//GEN-LAST:event_NationalityActionPerformed

    private void OccupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OccupationActionPerformed
       
    }//GEN-LAST:event_OccupationActionPerformed

    private void AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressActionPerformed
       
    }//GEN-LAST:event_AddressActionPerformed

    private static final int FIRST_CLASS_LIMIT = 12;
    private static final int ECONOMY_CLASS_LIMIT = 12;

    private boolean isWithinLimit(int firstClassCount, int economyClassCount) {
    return firstClassCount < FIRST_CLASS_LIMIT || economyClassCount < ECONOMY_CLASS_LIMIT;

}
    private void AddNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewButtonActionPerformed
         
        try {
        // Check class limits before adding new data
        int firstClassCount = countRowsWithClass("First Class");
        int economyClassCount = countRowsWithClass("Economy Class");

        if (isWithinLimit(firstClassCount, economyClassCount)) {
        
        // Connect with the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminapplication", "root", "");
            preparedStatement = sqlConn.prepareStatement("INSERT INTO adminapplication(Firstname, Middlename, Lastname, Age, Sex, Occupation, Address, Nationality, Destination, DepartureDate, SeatClass) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            preparedStatement.setString(1, Firstname.getText());
            preparedStatement.setString(2, Middlename.getText());
            preparedStatement.setString(3, Lastname.getText());
            preparedStatement.setString(4, Age.getText());
            preparedStatement.setString(5, Sex.getText());
            preparedStatement.setString(6, Occupation.getText());
            preparedStatement.setString(7, Address.getText());
            preparedStatement.setString(8, Nationality.getText());
            preparedStatement.setString(9, Destination.getText());
            preparedStatement.setString(10, DepartureDate.getText());
            preparedStatement.setString(11, SeatClass.getText());

            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(this, "Added Successfully!");
            adminapplication(); // Refresh the data in your application
        } else {
            // Display a message to the user or handle the case when the limit is reached
            JOptionPane.showMessageDialog(this, "Class limit reached.");
        }
    } catch (ClassNotFoundException | SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error adding record: " + ex.getMessage());
    }
}


private int countRowsWithClass(String passengerClass) throws ClassNotFoundException, SQLException {
    int count = 0;

    try (Connection connection = DriverManager.getConnection(dataConn, username, password);
         Statement statement = connection.createStatement()) {
        String query = "SELECT COUNT(*) FROM adminapplication WHERE SeatClass = '" + passengerClass + "'";
        try (ResultSet resultSet = statement.executeQuery(query)) {
            if (resultSet.next()) {
                count = resultSet.getInt(1);
            }
        }
    }
    return count;


    }//GEN-LAST:event_AddNewButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
    
 try {
        // Check class limits before updating data
        int firstClassCount = countRowsWithClass("First Class");
        int economyClassCount = countRowsWithClass("Economy Class");

        if (isWithinLimit(firstClassCount, economyClassCount)) {
            // Connect with the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminapplication", "root", "");

            // Prepare the SQL statement for updating
            preparedStatement = sqlConn.prepareStatement("UPDATE adminapplication SET Middlename = ?, Lastname = ?, Age = ?, Sex = ?, Occupation = ?, Address = ?, Nationality = ?, Destination = ?, DepartureDate = ?, SeatClass = ? WHERE Firstname = ?");

            // Set the parameters for the update statement
            preparedStatement.setString(1, Middlename.getText());
            preparedStatement.setString(2, Lastname.getText());
            preparedStatement.setString(3, Age.getText());
            preparedStatement.setString(4, Sex.getText());
            preparedStatement.setString(5, Occupation.getText());
            preparedStatement.setString(6, Address.getText());
            preparedStatement.setString(7, Nationality.getText());
            preparedStatement.setString(8, Destination.getText());
            preparedStatement.setString(9, DepartureDate.getText());
            preparedStatement.setString(10, SeatClass.getText());
            preparedStatement.setString(11, Firstname.getText());

            // Execute the updat e statement
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                // If one or more rows were updated
                JOptionPane.showMessageDialog(this, "Record Updated");
                adminapplication(); // Refresh the data in your application
            } else {
                // If no rows were updated
                JOptionPane.showMessageDialog(this, "No record were updated");
            }
        } else {
            // Display a message to the user or handle the case when the limit is reached
            JOptionPane.showMessageDialog(this, "Class limit reached.");
        }
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error updating record: " + e.getMessage());
    } finally {
        try {
            // Close resources in the finally block
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (sqlConn != null) {
                sqlConn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshButtonActionPerformed
                                                                                     
    // Reset all input in the textfields
    clearTextFields();

    // Refresh the data in the JTable
    refreshJTable();
}

private void refreshJTable() {
    try {
        // To connect with the database
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminapplication", "root", "");

        // Execute a query to fetch data from the database
        String query = "SELECT * FROM adminapplication";
        Statement statement = sqlConn.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        // Populate the JTable with the retrieved data
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Firstname");
        model.addColumn("Middlename");
        model.addColumn("Lastname");
        model.addColumn("Age");
        model.addColumn("Sex");
        model.addColumn("Occupation");
        model.addColumn("Address");
        model.addColumn("Nationality");
        model.addColumn("Destination");
        model.addColumn("DepartureDate");
        model.addColumn("SeatClass");

        while (resultSet.next()) {
            model.addRow(new Object[]{
                    resultSet.getString("Firstname"),
                    resultSet.getString("Middlename"),
                    resultSet.getString("Lastname"),
                    resultSet.getString("Age"),
                    resultSet.getString("Sex"),
                    resultSet.getString("Occupation"),
                    resultSet.getString("Address"),
                    resultSet.getString("Nationality"),
                    resultSet.getString("Destination"),
                    resultSet.getString("DepartureDate"),
                    resultSet.getString("SeatClass")
            });
        }
        adminapplication.setModel(model);

        // Debug print to check if it reaches here
        System.out.println("JTable refreshed successfully!");

    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error refreshing JTable: " + e.getMessage());
    } finally {
        try {
            if (sqlConn != null) {
                sqlConn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

    private void sortTable(javax.swing.JTable table) {
    DefaultTableModel model = (DefaultTableModel) table.getModel();

    model.getDataVector().sort(Comparator.comparing(row -> {
        try {
            Vector<Object> rowData = (Vector<Object>) row;
            String seatClass = (String) rowData.get(model.findColumn("SeatClass"));
            return (seatClass != null) ? seatClass : "";
        } catch (ClassCastException e) {
            e.printStackTrace();
            return "";
        }
    }));

    // Remove all rows from the table
    model.setRowCount(0);

    // Add the sorted rows back to the table
    model.getDataVector().forEach(rowData -> {
        Vector<Object> newRow = new Vector<>();
        newRow.addAll((Collection<? extends Object>) rowData);
        model.addRow(newRow);
    });

    // Notify the table that the data has changed
    model.fireTableDataChanged();

    }//GEN-LAST:event_RefreshButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
       DefaultTableModel recordTable = (DefaultTableModel) adminapplication.getModel();//admin table row function
    int selectedRow = adminapplication.getSelectedRow();
    
    if (selectedRow >= 0 && selectedRow < recordTable.getRowCount()) {
        Firstname.setText(recordTable.getValueAt(selectedRow, 0).toString());
        Middlename.setText(recordTable.getValueAt(selectedRow, 1).toString());
        Lastname.setText(recordTable.getValueAt(selectedRow, 2).toString());
        Age.setText(recordTable.getValueAt(selectedRow, 3).toString());
        Sex.setText(recordTable.getValueAt(selectedRow, 4).toString());
        Occupation.setText(recordTable.getValueAt(selectedRow, 5).toString());
        Address.setText(recordTable.getValueAt(selectedRow, 6).toString());
        Nationality.setText(recordTable.getValueAt(selectedRow, 7).toString());
        Destination.setText(recordTable.getValueAt(selectedRow, 8).toString());
        DepartureDate.setText(recordTable.getValueAt(selectedRow, 9).toString());
        SeatClass.setText(recordTable.getValueAt(selectedRow, 10).toString());
    
        
         // Attempt to delete the record from the database 
         if (deleteRecordFromDatabase(    
        Firstname.getText(),
        Middlename.getText(),
        Lastname.getText(),
        Age.getText(),
        Sex.getText(),
        Occupation.getText(),
        Address.getText(),
        Nationality.getText(),
        Destination.getText(),
        DepartureDate.getText(),
        SeatClass.getText()
    )) {
             
    // Record deleted successfully
    // Remove the row from the JTable
    recordTable.removeRow(selectedRow);

    // Clear the text fields 
    clearTextFields();
    
      }
    }
  }  

    // Define a method to delete the record from the database
    private boolean deleteRecordFromDatabase(String Firstname, String Middlename, String Lastname,String  Age,String Sex, String Occupation,String Address,String Nationality, String Destination,String DepartureDate,String SeatClass) {
    Connection conn = null;
    PreparedStatement stmt = null;
    
    try {
        // Replace with my database connection details
        String jdbcUrl = "jdbc:mysql://localhost:3306/adminapplication";
        String dbUsername = "root";
        String dbPassword = "";

        // Establish a database connection
        conn = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);

    // Define the SQL DELETE statement
    String sql = "DELETE FROM adminapplication WHERE Firstname = ? AND Middlename = ? AND Lastname = ? AND Age = ? AND Sex = ? AND Occupation = ? AND Address = ? AND Nationality = ? AND Destination = ? AND DepartureDate = ? AND SeatClass = ?";

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
        // Handle any database-related exceptions here
        return false;
    } finally {
        try {
            // Close the PreparedStatement and the database connection
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

    //Method to clear the textfield in the admin 
    private void clearTextFields() {
    Firstname.setText("");
    Middlename.setText("");
    Lastname.setText("");
    Age.setText("");
    Sex.setText("");
    Occupation.setText("");
    Address.setText("");
    Nationality.setText("");
    Destination.setText("");
    DepartureDate.setText("");
    SeatClass.setText("");
    
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void PendingApplicationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PendingApplicationButtonActionPerformed
    PendingApplication pendingApplication = new PendingApplication();
            pendingApplication.setVisible(true);
            this.dispose(); 
    }//GEN-LAST:event_PendingApplicationButtonActionPerformed

    private void adminapplicationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminapplicationMouseClicked
      
    DefaultTableModel recordTable = (DefaultTableModel) adminapplication.getModel();//admin table row function
    int selectedRow = adminapplication.getSelectedRow();
    
    if (selectedRow >= 0 && selectedRow < recordTable.getRowCount()) {
        Firstname.setText(recordTable.getValueAt(selectedRow, 0).toString());
        Middlename.setText(recordTable.getValueAt(selectedRow, 1).toString());
        Lastname.setText(recordTable.getValueAt(selectedRow, 2).toString());
        Age.setText(recordTable.getValueAt(selectedRow, 3).toString());
        Sex.setText(recordTable.getValueAt(selectedRow, 4).toString());
        Occupation.setText(recordTable.getValueAt(selectedRow, 5).toString());
        Address.setText(recordTable.getValueAt(selectedRow, 6).toString());
        Nationality.setText(recordTable.getValueAt(selectedRow, 7).toString());
        Destination.setText(recordTable.getValueAt(selectedRow, 8).toString());
        DepartureDate.setText(recordTable.getValueAt(selectedRow, 9).toString());
        SeatClass.setText(recordTable.getValueAt(selectedRow, 10).toString());
   
    }           
    
    }//GEN-LAST:event_adminapplicationMouseClicked

   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminUserPage().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewButton;
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Age;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField DepartureDate;
    private javax.swing.JTextField Destination;
    private javax.swing.JTextField Firstname;
    private javax.swing.JTextField Lastname;
    private javax.swing.JTextField Middlename;
    private javax.swing.JTextField Nationality;
    private javax.swing.JTextField Occupation;
    private javax.swing.JButton PendingApplicationButton;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JTextField SeatClass;
    private javax.swing.JTextField Sex;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JTable adminapplication;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

  
}
