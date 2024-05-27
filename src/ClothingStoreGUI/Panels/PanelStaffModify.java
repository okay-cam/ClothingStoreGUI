/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ClothingStoreGUI.Panels;

import ClothingStoreGUI.Controller;
import ClothingStoreGUI.InteractivePanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
        DiscountDropdown.addActionListener(e -> controller.discountTypeModified());
        // !! a dozen connections need to be made for each field OR its all read at once when saved
    }

    public JComboBox<String> getAvailableDropdown() {
        return AvailableDropdown;
    }
    
    public JComboBox<String> getItemTypeDropdown() {
        return ItemTypeDropdown;
    }

    public JComboBox<String> getCategoryDropdown() {
        return CategoryDropdown;
    }

    public JComboBox<String> getDiscountDropdown() {
        return DiscountDropdown;
    }

    public JLabel getDiscountErrorLabel() {
        return DiscountErrorLabel;
    }

    public JTextField getDiscountTextField() {
        return DiscountTextField;
    }

    public JComboBox<String> getGenderDropdown() {
        return GenderDropdown;
    }

    public JLabel getMessage() {
        return Message;
    }

    public JLabel getNameErrorLabel() {
        return NameErrorLabel;
    }

    public JTextField getNameTextField() {
        return NameTextField;
    }

    public JLabel getPriceErrorLabel() {
        return PriceErrorLabel;
    }

    public JTextField getPriceTextField() {
        return PriceTextField;
    }

    public JLabel getTitle() {
        return Title;
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
        ItemTypeLabel = new javax.swing.JLabel();
        ItemTypeDropdown = new javax.swing.JComboBox<>();

        BackButton.setText("Back");
        BackButton.setInheritsPopupMenu(true);

        Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Title.setText("Product editor");

        Message.setText("You are modifying/adding a product.");

        NameLabel.setText("Name:");
        NameLabel.setPreferredSize(new java.awt.Dimension(35, 22));
        NameLabel.setRequestFocusEnabled(false);

        PriceLabel.setText("Price:");
        PriceLabel.setPreferredSize(new java.awt.Dimension(100, 22));

        DiscountDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CategoryLabel.setText("Category:");
        CategoryLabel.setPreferredSize(new java.awt.Dimension(100, 22));

        GenderLabel.setText("Gender:");
        GenderLabel.setPreferredSize(new java.awt.Dimension(100, 22));

        AvailableLabel.setText("Available:");
        AvailableLabel.setPreferredSize(new java.awt.Dimension(100, 22));

        DiscountTypeLabel.setText("Discount type:");
        DiscountTypeLabel.setPreferredSize(new java.awt.Dimension(100, 22));

        DiscountAmountLabel.setText("Discount amount:");
        DiscountAmountLabel.setPreferredSize(new java.awt.Dimension(100, 22));
        DiscountAmountLabel.setRequestFocusEnabled(false);

        NameTextField.setText("Enter new product name...");

        PriceTextField.setText("$20.00");

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

        ItemTypeLabel.setText("Item type:");
        ItemTypeLabel.setPreferredSize(new java.awt.Dimension(100, 22));

        ItemTypeDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackButton)
                        .addGap(36, 36, 36)
                        .addComponent(Title)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(SaveButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(CategoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(61, 61, 61))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(ItemTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(DiscountTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(AvailableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(GenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(DiscountAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(ItemTypeDropdown, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(DiscountDropdown, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(AvailableDropdown, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(GenderDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CategoryDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(161, 161, 161)
                                                .addComponent(DiscountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(PriceTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(PriceErrorLabel))
                                            .addComponent(NameErrorLabel)
                                            .addComponent(DiscountErrorLabel)))
                                    .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton)
                    .addComponent(Title))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Message)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(PriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NameErrorLabel)
                        .addGap(12, 12, 12)
                        .addComponent(PriceErrorLabel)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ItemTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(CategoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(GenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(AvailableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(DiscountTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ItemTypeDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(CategoryDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(GenderDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(AvailableDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(DiscountDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DiscountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DiscountErrorLabel))
                    .addComponent(DiscountAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SaveButton)
                .addContainerGap(23, Short.MAX_VALUE))
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
    private javax.swing.JComboBox<String> ItemTypeDropdown;
    private javax.swing.JLabel ItemTypeLabel;
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
