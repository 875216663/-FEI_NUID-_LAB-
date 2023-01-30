/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package lab_cao2;

import Model.Customer;
import Model.DeliveryPackage;
import Model.Product;
import javax.swing.JOptionPane;
/**
 *
 * @author caofei
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    private DeliveryPackage delPackage;
    
    private Boolean validate = false;
    private Boolean pvalidate = false;
    public CreateJPanel() {
        initComponents();
    }
    CreateJPanel(DeliveryPackage deliveryPackage) {
        initComponents();

        this.delPackage = deliveryPackage;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        packageId = new javax.swing.JTextField();
        packageWt = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        custName1 = new javax.swing.JTextField();
        custId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        productId1 = new javax.swing.JTextField();
        productName1 = new javax.swing.JTextField();
        productPrice1 = new javax.swing.JTextField();
        saveProductbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Weight");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel2.setText("Package Id");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        packageId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                packageIdFocusLost(evt);
            }
        });
        add(packageId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 120, 30));

        packageWt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                packageWtFocusLost(evt);
            }
        });
        add(packageWt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 120, 30));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        jLabel7.setText("Customer name");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, 20));

        custName1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                custName1FocusLost(evt);
            }
        });
        add(custName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 120, 30));

        custId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                custIdFocusLost(evt);
            }
        });
        add(custId, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 120, 30));

        jLabel1.setText("ID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, 20));

        jLabel4.setText("ProdId");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 20));

        jLabel5.setText("ProdName");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, 20));

        jLabel6.setText("ProdPrice");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 20));

        productId1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                productId1FocusLost(evt);
            }
        });
        add(productId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 120, 30));

        productName1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                productName1FocusLost(evt);
            }
        });
        add(productName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 120, 30));

        productPrice1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                productPrice1FocusLost(evt);
            }
        });
        add(productPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 120, 30));

        saveProductbtn.setText("Save Product");
        saveProductbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveProductbtnActionPerformed(evt);
            }
        });
        add(saveProductbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 140, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(validate) {
            JOptionPane.showMessageDialog(null, "Pleae fill all fields");
        } else {
            JOptionPane.showMessageDialog(null, "Saved!");
        }
        String id = packageId.getText();
        String weight = packageWt.getText();
        String customerId = custId.getText();
        String customername = custName1.getText();

        this.delPackage.setPackageId(Integer.valueOf(id));
        this.delPackage.setPackageWeight(Double.valueOf(weight));

        Customer customer = this.delPackage.getCustomer();
        customer.setCustomerId(Integer.valueOf(customerId));
        customer.setFullName(customername);

        

    }//GEN-LAST:event_btnSaveActionPerformed

    private void custName1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_custName1FocusLost

        System.out.println(custName1.getText() + " -- the customer name");
        String name = custName1.getText();

        if(name.isEmpty()) {
            this.validate = true;
        } else {
            this.validate = false;
        }
    }//GEN-LAST:event_custName1FocusLost

    private void saveProductbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveProductbtnActionPerformed
        if(pvalidate) {
            JOptionPane.showMessageDialog(null, "Pleae fill all product fields");
        } else {
            JOptionPane.showMessageDialog(null, "Added product!");
        }
        String productId = productId1.getText();
        String productName = productName1.getText();
        String productPrice = productPrice1.getText();
        
        
        Product product = this.delPackage.createProduct(Integer.valueOf(productId), productName, Double.valueOf(productPrice));

        JOptionPane.showMessageDialog(null, "Added Product");
    }//GEN-LAST:event_saveProductbtnActionPerformed

    private void packageIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_packageIdFocusLost
        // TODO add your handling code here:
        System.out.println(packageId.getText());
        String name = packageId.getText();

        if(name.isEmpty()) {
            this.validate = true;
        } else {
            this.validate = false;
        }
    }//GEN-LAST:event_packageIdFocusLost

    private void packageWtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_packageWtFocusLost
        // TODO add your handling code here:
        System.out.println(packageWt.getText());
        String name =packageWt.getText();

        if(name.isEmpty()) {
            this.validate = true;
        } else {
            this.validate = false;
        }
        
    }//GEN-LAST:event_packageWtFocusLost

    private void custIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_custIdFocusLost
        // TODO add your handling code here:
        System.out.println(custId.getText());
        String name =custId.getText();

        if(name.isEmpty()) {
            this.validate = true;
        } else {
            this.validate = false;
        }
        
    }//GEN-LAST:event_custIdFocusLost

    private void productId1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productId1FocusLost
        // TODO add your handling code here:
        System.out.println(productId1.getText());
        String name =productId1.getText();

        if(name.isEmpty()) {
            this.pvalidate = true;
        } else {
            this.pvalidate = false;
        }
    }//GEN-LAST:event_productId1FocusLost

    private void productName1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productName1FocusLost
        // TODO add your handling code here:
        System.out.println(productName1.getText());
        String name =productName1.getText();

        if(name.isEmpty()) {
            this.pvalidate = true;
        } else {
            this.pvalidate = false;
        }
    }//GEN-LAST:event_productName1FocusLost

    private void productPrice1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productPrice1FocusLost
        // TODO add your handling code here:
        System.out.println(productPrice1.getText());
        String name =productPrice1.getText();

        if(name.isEmpty()) {
            this.pvalidate = true;
        } else {
            this.pvalidate = false;
        }
    }//GEN-LAST:event_productPrice1FocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField custId;
    private javax.swing.JTextField custName1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField packageId;
    private javax.swing.JTextField packageWt;
    private javax.swing.JTextField productId1;
    private javax.swing.JTextField productName1;
    private javax.swing.JTextField productPrice1;
    private javax.swing.JButton saveProductbtn;
    // End of variables declaration//GEN-END:variables
}