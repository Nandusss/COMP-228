/**
 * Nandagopan Dilip
 * 301166925
 */

package com.example.nandagopan_018_lab4;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML public RadioButton rdoPickup;
    @FXML public RadioButton rdoDelivery;
    private ToggleGroup rdoDeliverySelectionGroup;
    @FXML public ComboBox cmbItems;
    @FXML public ComboBox cmbQuantity;
    @FXML private Label cart;
    @FXML private Label orderInfo;
    @FXML public TextField customerName;
    @FXML public TextField customerPhone;
    @FXML public TextField customerAddress;

    private String selectedItem = "";
    private int selectedQuantity = 0;
    private String deliveryMode = "";
    private String cartString = "";
    private ArrayList<String > selectedItemArray = new ArrayList<>();
    private ArrayList<Integer> selectedQuantityArray = new ArrayList<>();


    private ObservableList<String> itemsList = FXCollections.observableArrayList("Milk", "Eggs", "Cheese", "Rice", "Bread", "Noodles", "Oil");
    private ObservableList<Integer> quantityList = FXCollections.observableArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    // returns the price of an item
    private double calculatePrice(String item) {
        switch (item.toLowerCase()) {
            case "milk":
                return 4.99;
            case "eggs":
                return 3.99;
            case "cheese":
                return 5.49;
            case "rice":
                return 6.89;
            case "bread":
                return 2.99;
            case "noodles":
                return 1.99;
            case "oil":
                return 7.00;
            default:
                return 0.0;
        }
    }

    // create a string consisting of the item name, quantity, and price
    private String createItemList(ArrayList<String> itemArray, ArrayList<Integer> quantityArray) {
        String str = "";
        for(int i=0; i < itemArray.size(); i++) {
            try {
                str += "Item " + (i+1) + ": " + itemArray.get(i) + " x" + quantityArray.get(i) + String.format("%26s", " Price: $" + String.format("%.2f",calculatePrice(itemArray.get(i)) * quantityArray.get(i))) + "\n";
            } catch (IndexOutOfBoundsException ioobe) {
                System.out.println("Index out of bound " + ioobe);
            } catch (Exception e) {
                System.out.println("Exception " + e);
            }
        }
        return str;
    }

    // calculate the total price of items
    private double calculateTotalOfIntArrayList(ArrayList<String> itemArray, ArrayList<Integer> quantityArray) {
        double total = 0.0;
        for (int i=0; i < itemArray.size(); i++) {
            total += (calculatePrice(itemArray.get(i)) * quantityArray.get(i));
        }
        return total;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        rdoDeliverySelectionGroup = new ToggleGroup();
        rdoPickup.setToggleGroup(rdoDeliverySelectionGroup);
        rdoDelivery.setToggleGroup(rdoDeliverySelectionGroup);

        // default radio button
        rdoPickup.setSelected(true);

        cmbItems.setItems(itemsList);
        cmbQuantity.setItems(quantityList);
    }

    // combo box for items
    @FXML
    public void onItemsSelected(ActionEvent actionEvent) {
        if (cmbItems.getValue() != null && !cmbItems.getValue().toString().isEmpty()){
            selectedItem = cmbItems.getValue().toString();
        }
    }

    // combo box for quantity
    @FXML
    public void onItemQuantitySelected(ActionEvent actionEvent) {
        if(cmbQuantity.getValue() != null && !cmbQuantity.getValue().toString().isEmpty()) {
            selectedQuantity = Integer.parseInt(cmbQuantity.getValue().toString());
        }
    }

    // displays each selected items
    @FXML
    public void addToCart() {
        selectedItemArray.add(selectedItem);
        selectedQuantityArray.add(selectedQuantity);
        cartString = createItemList(selectedItemArray, selectedQuantityArray);
        cart.setText(cartString);
    }

    // radio buttons
    @FXML
    public void onDeliverySelection(ActionEvent actionEvent) {
        RadioButton selectedRadioButton = (RadioButton) actionEvent.getSource();
        deliveryMode = selectedRadioButton.getText();
    }

    // displays order details
    @FXML
    public void onPlaceOrderClick(ActionEvent actionEvent) {
        double total = calculateTotalOfIntArrayList(selectedItemArray, selectedQuantityArray);
        double TAX_PERCENT = 10;
        double tax = ((total * TAX_PERCENT)/100);
        double deliveryCharges = deliveryMode.equals("Delivery") ? 5.0 : 0.0;
        String outputMessage = "";

        outputMessage += "\nName : " + customerName.getText();
        outputMessage += "\nPhone : " + customerPhone.getText();
        outputMessage += "\nAddress : " + customerAddress.getText();
        outputMessage += "\n\n\t\t\tItems\n" + createItemList(selectedItemArray, selectedQuantityArray);
        outputMessage += String.format("\nOrder Total : %.2f", total);
        outputMessage += String.format("\nTax Amount : %.2f", tax);
        outputMessage += String.format("\nShipping : %.2f", deliveryCharges);
        outputMessage += String.format("\nFinal Cost : %.2f", (total + tax + deliveryCharges));

        orderInfo.setText(outputMessage);
    }
}