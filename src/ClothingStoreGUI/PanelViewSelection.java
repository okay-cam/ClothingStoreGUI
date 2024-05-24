package ClothingStoreGUI;


public class PanelViewSelection extends javax.swing.JPanel {

    /**
     * Creates new form UserPanel
     */
    public PanelViewSelection(Controller controller) {
        initComponents();
        initConnections(controller);
    }
    
    private void initConnections(Controller controller) {
        CustomerViewButton.addActionListener(e -> controller.customerViewButtonClicked());
        
        // !! add other connections in here
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WelcomeMessage = new javax.swing.JLabel();
        CustomerViewButton = new javax.swing.JButton();
        StaffViewButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(300, 200));
        setPreferredSize(new java.awt.Dimension(600, 400));

        WelcomeMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomeMessage.setText("Welcome to Object Oriented Outfits, an online shopping website for clothing and footwear.");

        CustomerViewButton.setText("Customer View");
        CustomerViewButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CustomerViewButton.setMaximumSize(new java.awt.Dimension(100, 25));
        CustomerViewButton.setMinimumSize(new java.awt.Dimension(100, 25));
        CustomerViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerViewButtonActionPerformed(evt);
            }
        });

        StaffViewButton.setText("Staff View");
        StaffViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaffViewButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(StaffViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CustomerViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(WelcomeMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(WelcomeMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StaffViewButton))
                .addContainerGap(182, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void StaffViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaffViewButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StaffViewButtonActionPerformed

    private void CustomerViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerViewButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerViewButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CustomerViewButton;
    private javax.swing.JButton StaffViewButton;
    private javax.swing.JLabel WelcomeMessage;
    // End of variables declaration//GEN-END:variables
}
