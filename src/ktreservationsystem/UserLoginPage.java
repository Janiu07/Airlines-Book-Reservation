package ktreservationsystem;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

    public final class UserLoginPage extends javax.swing.JFrame {

      public UserLoginPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanelUserLogin = new javax.swing.JPanel();
        UserTitle = new javax.swing.JLabel();
        jPanelTAUser = new javax.swing.JPanel();
        jLabelAdminUser = new javax.swing.JLabel();
        AdminUserTextField = new javax.swing.JTextField();
        AdminPassTextField = new javax.swing.JPasswordField();
        TravelersUser = new javax.swing.JButton();
        AdminLoginButton = new javax.swing.JButton();
        jLabelUsername = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelClickHere = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jTextField2.setText("Password");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jPanelUserLogin.setBackground(new java.awt.Color(102, 102, 102));
        jPanelUserLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelUserLogin.setForeground(new java.awt.Color(51, 51, 51));

        UserTitle.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        UserTitle.setForeground(new java.awt.Color(204, 204, 204));
        UserTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserTitle.setText("USER LOGIN");

        javax.swing.GroupLayout jPanelUserLoginLayout = new javax.swing.GroupLayout(jPanelUserLogin);
        jPanelUserLogin.setLayout(jPanelUserLoginLayout);
        jPanelUserLoginLayout.setHorizontalGroup(
            jPanelUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
            .addGroup(jPanelUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUserLoginLayout.createSequentialGroup()
                    .addContainerGap(88, Short.MAX_VALUE)
                    .addComponent(UserTitle)
                    .addContainerGap(88, Short.MAX_VALUE)))
        );
        jPanelUserLoginLayout.setVerticalGroup(
            jPanelUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
            .addGroup(jPanelUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUserLoginLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UserTitle)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanelTAUser.setBackground(new java.awt.Color(102, 102, 102));
        jPanelTAUser.setForeground(new java.awt.Color(102, 102, 102));

        jLabelAdminUser.setBackground(new java.awt.Color(102, 102, 102));
        jLabelAdminUser.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabelAdminUser.setForeground(new java.awt.Color(204, 204, 204));
        jLabelAdminUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAdminUser.setText("Admin User");

        AdminUserTextField.setBackground(new java.awt.Color(204, 204, 204));
        AdminUserTextField.setFont(new java.awt.Font("Palatino Linotype", 1, 15)); // NOI18N
        AdminUserTextField.setForeground(new java.awt.Color(102, 102, 102));

        AdminPassTextField.setBackground(new java.awt.Color(204, 204, 204));
        AdminPassTextField.setFont(new java.awt.Font("Palatino Linotype", 1, 15)); // NOI18N
        AdminPassTextField.setForeground(new java.awt.Color(102, 102, 102));

        TravelersUser.setBackground(new java.awt.Color(204, 204, 204));
        TravelersUser.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        TravelersUser.setForeground(new java.awt.Color(102, 102, 102));
        TravelersUser.setText("Travelers User");
        TravelersUser.setOpaque(true);
        TravelersUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TravelersUserMouseClicked(evt);
            }
        });
        TravelersUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TravelersUserActionPerformed(evt);
            }
        });

        AdminLoginButton.setBackground(new java.awt.Color(204, 204, 204));
        AdminLoginButton.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        AdminLoginButton.setForeground(new java.awt.Color(102, 102, 102));
        AdminLoginButton.setText("Login");
        AdminLoginButton.setOpaque(true);
        AdminLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLoginButtonActionPerformed(evt);
            }
        });

        jLabelUsername.setFont(new java.awt.Font("Palatino Linotype", 1, 15)); // NOI18N
        jLabelUsername.setForeground(new java.awt.Color(204, 204, 204));
        jLabelUsername.setText("Username:");

        jLabelPassword.setFont(new java.awt.Font("Palatino Linotype", 1, 15)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(204, 204, 204));
        jLabelPassword.setText("Password:");

        jLabelClickHere.setFont(new java.awt.Font("Palatino Linotype", 3, 12)); // NOI18N
        jLabelClickHere.setForeground(new java.awt.Color(204, 204, 204));
        jLabelClickHere.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClickHere.setLabelFor(TravelersUser);
        jLabelClickHere.setText("(Click here)");
        jLabelClickHere.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("(For Registration and Application Checking)");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/AdminIcon.png"))); // NOI18N

        javax.swing.GroupLayout jPanelTAUserLayout = new javax.swing.GroupLayout(jPanelTAUser);
        jPanelTAUser.setLayout(jPanelTAUserLayout);
        jPanelTAUserLayout.setHorizontalGroup(
            jPanelTAUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTAUserLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanelTAUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(jPanelTAUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AdminUserTextField)
                    .addComponent(AdminPassTextField))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTAUserLayout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addGroup(jPanelTAUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTAUserLayout.createSequentialGroup()
                        .addComponent(TravelersUser, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTAUserLayout.createSequentialGroup()
                        .addComponent(AdminLoginButton)
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTAUserLayout.createSequentialGroup()
                        .addComponent(jLabelClickHere)
                        .addGap(180, 180, 180))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTAUserLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTAUserLayout.createSequentialGroup()
                        .addComponent(jLabelAdminUser, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTAUserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTAUserLayout.setVerticalGroup(
            jPanelTAUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTAUserLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabelClickHere)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TravelersUser, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAdminUser)
                .addGap(18, 18, 18)
                .addGroup(jPanelTAUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsername))
                .addGap(29, 29, 29)
                .addGroup(jPanelTAUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminPassTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPassword))
                .addGap(18, 18, 18)
                .addComponent(AdminLoginButton)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(jPanelUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanelTAUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanelUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jPanelTAUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(67, 67, 67))
        );

        setSize(new java.awt.Dimension(552, 683));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TravelersUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TravelersUserActionPerformed
    TravelersUserPage travelersUserPage = new TravelersUserPage();//To Connect with Travelers User Page
    travelersUserPage.setVisible(true);
    this.dispose();           
    
    }//GEN-LAST:event_TravelersUserActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void TravelersUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TravelersUserMouseClicked

    }//GEN-LAST:event_TravelersUserMouseClicked

    private void AdminLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLoginButtonActionPerformed

        String username = AdminUserTextField.getText();
        String password = new String(AdminPassTextField.getPassword());

        if (username.equals("admin") && password.equals("admin123")) {
            // If username and password are correct, open the AdminUserPage.java
            AdminUserPage adminUserPage = new AdminUserPage();
            adminUserPage.setVisible(true);
            this.dispose(); // Close the current login page
            
        } else {
            // If username and/or password are incorrect, show an error message
            JOptionPane.showMessageDialog(this, "Incorrect Username or Password", "Login Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AdminLoginButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new UserLoginPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminLoginButton;
    private javax.swing.JPasswordField AdminPassTextField;
    private javax.swing.JTextField AdminUserTextField;
    private javax.swing.JButton TravelersUser;
    private javax.swing.JLabel UserTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAdminUser;
    private javax.swing.JLabel jLabelClickHere;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanelTAUser;
    private javax.swing.JPanel jPanelUserLogin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
