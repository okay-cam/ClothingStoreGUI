/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ClothingStoreGUI.Panels;

import ClothingStoreGUI.Controller;
import ClothingStoreGUI.InteractivePanel;
import javax.swing.JLabel;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author annek
 */
public class PanelStaffProductView extends javax.swing.JPanel implements InteractivePanel {

    /**
     * Creates new form CustomerProductView
     */
    public PanelStaffProductView(Controller controller) {
        initComponents();
        initConnections(controller);
        ErrorLabel.setVisible(false);
    }
    
    public void initConnections(Controller controller) {
         ItemModifyButton.addActionListener(e -> controller.staffModifyButtonClicked());
         AddButton.addActionListener(e -> controller.staffAddButtonClicked());
         RemoveButton.addActionListener(e -> controller.staffRemoveButtonClicked());
         CasualButton.addActionListener(e -> controller.categoryButtonClicked(0));
         SportsButton.addActionListener(e -> controller.categoryButtonClicked(1));
         FormalButton.addActionListener(e -> controller.categoryButtonClicked(2));
         SleepButton.addActionListener(e -> controller.categoryButtonClicked(3));
         NoPurposeButton.addActionListener(e -> controller.categoryButtonClicked(4));
         UnisexButton.addActionListener(e -> controller.genderButtonClicked(0));
         MaleButton.addActionListener(e -> controller.genderButtonClicked(1));
         FemaleButton.addActionListener(e -> controller.genderButtonClicked(2));
         NoGenderButton.addActionListener(e -> controller.genderButtonClicked(3));
         ResetButton.addActionListener(e -> controller.resetButtonClicked());

    }

    public void addProductListSelectionListener(ListSelectionListener listener) {
        ProductList.addListSelectionListener(listener);
    }

    public int getSelectedProductIndex() {
        return ProductList.getSelectedIndex();
    }
    
    public void updateProductTable(String[] newData) {
        ProductList.setListData(newData);
    }

    public JLabel getErrorLabel() {
        return ErrorLabel;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PurposeButtonGroup = new javax.swing.ButtonGroup();
        GenderButtonGroup = new javax.swing.ButtonGroup();
        PurposeLabel = new javax.swing.JLabel();
        GenderLabel = new javax.swing.JLabel();
        CasualButton = new javax.swing.JRadioButton();
        FormalButton = new javax.swing.JRadioButton();
        SportsButton = new javax.swing.JRadioButton();
        SleepButton = new javax.swing.JRadioButton();
        MaleButton = new javax.swing.JRadioButton();
        FemaleButton = new javax.swing.JRadioButton();
        UnisexButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductList = new javax.swing.JList<>();
        RemoveButton = new javax.swing.JButton();
        ItemModifyButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        NoPurposeButton = new javax.swing.JRadioButton();
        NoGenderButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        ResetButton = new javax.swing.JButton();
        ErrorLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 400));

        PurposeLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PurposeLabel.setText("Filter by category:");

        GenderLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GenderLabel.setText("Filter by gender:");

        PurposeButtonGroup.add(CasualButton);
        CasualButton.setText("Casual");

        PurposeButtonGroup.add(FormalButton);
        FormalButton.setText("Formal");

        PurposeButtonGroup.add(SportsButton);
        SportsButton.setText("Sports");

        PurposeButtonGroup.add(SleepButton);
        SleepButton.setText("Sleep");

        GenderButtonGroup.add(MaleButton);
        MaleButton.setText("Male");

        GenderButtonGroup.add(FemaleButton);
        FemaleButton.setText("Female");

        GenderButtonGroup.add(UnisexButton);
        UnisexButton.setText("Unisex");

        ProductList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ProductList);

        RemoveButton.setText("Remove item");
        RemoveButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RemoveButton.setOpaque(true);

        ItemModifyButton.setText("Modify item");

        AddButton.setText("Add new item");

        PurposeButtonGroup.add(NoPurposeButton);
        NoPurposeButton.setSelected(true);
        NoPurposeButton.setText("None");

        GenderButtonGroup.add(NoGenderButton);
        NoGenderButton.setSelected(true);
        NoGenderButton.setText("None");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Product menu - Staff");

        ResetButton.setText("Reset");
        ResetButton.setInheritsPopupMenu(true);

        ErrorLabel.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        ErrorLabel.setText("ERROR: Please select a product");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addComponent(SleepButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(NoPurposeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(CasualButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(FormalButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(SportsButton)))
                                        .addGap(57, 57, 57))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PurposeLabel)
                                        .addGap(98, 98, 98)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(MaleButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(FemaleButton))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(UnisexButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(NoGenderButton))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(GenderLabel)))
                                .addGap(95, 95, 95))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ResetButton))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ItemModifyButton)
                        .addGap(18, 18, 18)
                        .addComponent(RemoveButton)
                        .addGap(18, 18, 18)
                        .addComponent(AddButton)
                        .addGap(99, 99, 99)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ErrorLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ResetButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenderLabel)
                    .addComponent(PurposeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CasualButton)
                    .addComponent(FormalButton)
                    .addComponent(SportsButton)
                    .addComponent(MaleButton)
                    .addComponent(FemaleButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SleepButton)
                    .addComponent(NoPurposeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NoGenderButton)
                    .addComponent(UnisexButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RemoveButton)
                    .addComponent(ItemModifyButton)
                    .addComponent(AddButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ErrorLabel)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JRadioButton CasualButton;
    private javax.swing.JLabel ErrorLabel;
    private javax.swing.JRadioButton FemaleButton;
    private javax.swing.JRadioButton FormalButton;
    private javax.swing.ButtonGroup GenderButtonGroup;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JButton ItemModifyButton;
    private javax.swing.JRadioButton MaleButton;
    private javax.swing.JRadioButton NoGenderButton;
    private javax.swing.JRadioButton NoPurposeButton;
    private javax.swing.JList<String> ProductList;
    private javax.swing.ButtonGroup PurposeButtonGroup;
    private javax.swing.JLabel PurposeLabel;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JButton ResetButton;
    private javax.swing.JRadioButton SleepButton;
    private javax.swing.JRadioButton SportsButton;
    private javax.swing.JRadioButton UnisexButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
