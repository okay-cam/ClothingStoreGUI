package ClothingStoreGUI;

import ClothingStoreGUI.Enums.Category;
import ClothingStoreGUI.Enums.Gender;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * CONTROLLER:
 *
 * Handles user input from view. This includes: - Retrieving data from input
 * boxes - Validating / Cleaning input
 *
 * Updates model depending on input. This may include: - Performing calculations
 * in model based on inputs from view
 *
 * Navigates the application. This includes: - Switching between different
 * views/screens based on user input or application logic.
 *
 */
public class Controller {

    View view;
    Model model;

    // used to go to the previous panel when pressing the back button
    JPanel previousPanel;

    public void setView(View view) {
        this.view = view;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    // set the previous panel
    public void setPreviousPanel(JPanel panel) {
        previousPanel = panel;
    }

    // get the previous panel
    public JPanel getPreviousPanel() {
        return previousPanel;
    }

    // USER PANEL methods:
    // View selection:
    public void customerViewButtonClicked() {

        // SETUP customer view functions
        // Add the list selection listener to the view's JList
        view.customerProductPanel.addProductListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    model.setSelectedProductFromIndex(view.customerProductPanel.getSelectedProductIndex());
                }
            }
        });

        // show only 'Available' products
        model.processAvailableProducts();

        // go from initial screen to customer product view
        view.switchPanel(view.customerProductPanel);
    }

//    public void productSelected() {
//        String selectedItem = view.customerProductPanel.getSelectedProduct();
//        if (selectedItem != null) {
//            System.out.println("Selected: " + selectedItem);
//        }
//    }
    public void staffViewButtonClicked() {

        // SETUP staff view functions
        model.processAllProducts();
        // go from initial screen to staff product view
        view.switchPanel(view.staffProductPanel);
    }

    // GENERIC BACK BUTTON
    public void backButtonClicked() {
        // go back to the previous panel
        view.switchPanel(previousPanel);
    }

    // CUSTOMER VIEW BUTTONS
    // Customer product view:
    public void customerSelectButtonClicked() {
        setPreviousPanel(view.customerProductPanel);
        // go to customer selection
        view.switchPanel(view.customerSelectionPanel);
    }

    public void cartButtonClicked() {
        setPreviousPanel(view.customerProductPanel);
        // go to cart from customer product view
        view.switchPanel(view.cartPanel);
    }

    // Customer selection view:
    public void addToCartButtonClicked() {
        // !! add customised selected product to cart
        // save and return to customer product view
        view.switchPanel(view.customerProductPanel);
    }

    // Customer cart view:
    public void customerModifyButtonClicked() {
        setPreviousPanel(view.cartPanel);
        // go to customer selection
        view.switchPanel(view.customerSelectionPanel);
    }

    public void customerRemoveButtonClicked() {
        // remove selected product from cart
        System.out.println("Customer remove button clicked. Not coded yet.");
        // !! need a parameter for product they selected
    }

    public void customerConfirmButtonClicked() {
        // go to checkout from customer cart view
        view.switchPanel(view.checkoutPanel);
    }

    // Customer checkout view
    public void resetButtonClicked() {
        // restart program
        view.switchPanel(view.userPanel);
        // !! add reset button to staff product view?
    }

    // Product view filters (both staff and customer):
    public void categoryButtonClicked(int value) {
        // set category filter
        // !! might need to pass in parameter for the product list display
        Category category = Category.intToCategory(value);
        System.out.println("Category filter to change to "+category+". Not coded yet.");
        // !! insert code
    }

    public void genderButtonClicked(int value) {
        // set gender filter
        // !! might need to pass in parameter for the product list display
        Gender gender = Gender.intToGender(value);
        System.out.println("Gender filter to change to "+gender+". Not coded yet.");
        // !! insert code
    }

    // STAFF VIEW BUTTONS
    // Staff product view
    public void staffEditButtonClicked() {
        setPreviousPanel(view.staffProductPanel);
        // move to staff modify panel from product view
        view.switchPanel(view.staffEditPanel);
        // modify: need to read and LOAD name price category gender avaliability discount type/amount from the selected product
        // add: just load placeholders
    }

    public void staffRemoveButtonClicked() {
        // need to remove selected product from database
        System.out.println("Product remove from database button clicked. Not coded yet.");
    }

    // Staff edit panel
    public void staffSaveProductButtonClicked() {
        // saves and returns to product view
        view.switchPanel(view.staffProductPanel);
        // need to read and SAVE name price category gender avaliability discount type/amount to product list
    }
}
