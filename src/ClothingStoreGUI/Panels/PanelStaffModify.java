/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ClothingStoreGUI.Panels;

import ClothingStoreGUI.Controller;
import ClothingStoreGUI.InteractivePanel;

/**
 *
 * @author annek
 */
public class PanelStaffModify extends javax.swing.JPanel implements InteractivePanel {

    /**
     * Creates new form PanelStaffModify
     */
    public PanelStaffModify(Controller controller) {
        initComponents();
        initConnections(controller);
        NameErrorLabel.setVisible(false);
        PriceErrorLabel.setVisible(false);
        DiscountErrorLabel.setVisible(false);
    }
    
    @Override
    public void initConnections(Controller controller) {
        BackButton.addActionListener(e -> controller.backButtonClicked());
        SaveButton.addActionListener(e -> controller.staffSaveProductButtonClicked());
        // !! a dozen connections need to be made for each field OR its all read at once when saved
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        Message = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        PriceLabel = new javax.swing.JLabel();
        DiscountDropdown = new javax.swing.JComboBox<>();
        CategoryLabel = new javax.swing.JLabel();
        GenderLabel = new javax.swing.JLabel();
        AvailableLabel = new javax.swing.JLabel();
        DiscountTypeLabel = new javax.swing.JLabel();
        DiscountAmountLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        PriceTextField = new javax.swing.JTextField();
        DiscountTextField = new javax.swing.JTextField();
        CategoryDropdown = new javax.swing.JComboBox<>();
        GenderDropdown = new javax.swing.JComboBox<>();
        AvailableDropdown = new javax.swing.JComboBox<>();
        SaveButton = new javax.swing.JButton();
        PriceErrorLabel = new javax.swing.JLabel();
        NameErrorLabel = new javax.swing.JLabel();
        DiscountErrorLabel = new javax.swing.JLabel();

        BackButton.setText("Back");
        BackButton.setInheritsPopupMenu(true);

        Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Title.setText("Modifying product");

        Message.setText("You are modifying/adding a product.");

        NameLabel.setText("Name:");

        PriceLabel.setText("Price:");

        DiscountDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CategoryLabel.setText("Category:");

        GenderLabel.setText("Gender:");

        AvailableLabel.setText("Available:");

        DiscountTypeLabel.setText("Discount type:");

        DiscountAmountLabel.setText("Discount amount:");

        NameTextField.setText("Enter product name...");

        PriceTextField.setText("$");

        DiscountTextField.setText("$");

        CategoryDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        GenderDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        AvailableDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        SaveButton.setText("Save and return");

        PriceErrorLabel.setBackground(new java.awt.Color(255, 51, 51));
        PriceErrorLabel.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        PriceErrorLabel.setText("Error: Please enter a valid price");

        NameErrorLabel.setBackground(new java.awt.Color(255, 51, 51));
        NameErrorLabel.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        NameErrorLabel.setText("Error: Please enter a valid name");

        DiscountErrorLabel.setBackground(new java.awt.Color(255, 51, 51));
        DiscountErrorLabel.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        DiscountErrorLabel.setText("Error: Please enter a valid discount amount");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackButton)
                        .addGap(36, 36, 36)
                        .addComponent(Title)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(DiscountTypeLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(DiscountDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(AvailableLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(AvailableDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(GenderLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(GenderDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(CategoryLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(CategoryDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(PriceLabel)
                                                .addGap(87, 87, 87)
                                                .addComponent(PriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(PriceErrorLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DiscountAmountLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(DiscountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(DiscountErrorLabel))
                                    .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(SaveButton))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(NameErrorLabel)))
                        .addContainerGap(40, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton)
                    .addComponent(Title))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Message)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameErrorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriceLabel)
                    .addComponent(PriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PriceErrorLabel))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CategoryLabel)
                    .addComponent(CategoryDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenderLabel)
                    .addComponent(GenderDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AvailableLabel)
                    .addComponent(AvailableDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiscountTypeLabel)
                    .addComponent(DiscountDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiscountAmountLabel)
                    .addComponent(DiscountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DiscountErrorLabel))
                .addGap(18, 18, 18)
                .addComponent(SaveButton)
                .addContainerGap(159, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AvailableDropdown;
    private javax.swing.JLabel AvailableLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox<String> CategoryDropdown;
    private javax.swing.JLabel CategoryLabel;
    private javax.swing.JLabel DiscountAmountLabel;
    private javax.swing.JComboBox<String> DiscountDropdown;
    private javax.swing.JLabel DiscountErrorLabel;
    private javax.swing.JTextField DiscountTextField;
    private javax.swing.JLabel DiscountTypeLabel;
    private javax.swing.JComboBox<String> GenderDropdown;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JLabel Message;
    private javax.swing.JLabel NameErrorLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel PriceErrorLabel;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JTextField PriceTextField;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables

}
