
public class starter extends javax.swing.JFrame {

    /**
     * Creates new form starter
     */
    public starter() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        CheesyNachos = new javax.swing.JCheckBox();
        NachoswithBeef = new javax.swing.JCheckBox();
        chipsprice = new javax.swing.JLabel();
        creamypotatoprice = new javax.swing.JLabel();
        garlicpizzabreadprice = new javax.swing.JLabel();
        crispypotatoprice = new javax.swing.JLabel();
        chickenwingsprice = new javax.swing.JLabel();
        cheesynachosprice = new javax.swing.JLabel();
        nachoswithbeefprice = new javax.swing.JLabel();
        BeefTacos = new javax.swing.JCheckBox();
        Chips = new javax.swing.JCheckBox();
        CreamyPotatoSoup = new javax.swing.JCheckBox();
        GarlicPizzaBread = new javax.swing.JCheckBox();
        CrispyPotatoWedges = new javax.swing.JCheckBox();
        ChickenWings = new javax.swing.JCheckBox();
        OnionRings = new javax.swing.JCheckBox();
        RoastChickenTacos = new javax.swing.JCheckBox();
        beeftacosprice = new javax.swing.JLabel();
        onionringsprice = new javax.swing.JLabel();
        roastchickentacosprice = new javax.swing.JLabel();
        pcs = new javax.swing.JLabel();
        numberofpcsstarters = new javax.swing.JTextField();
        donestarter = new javax.swing.JButton();
        areaTxt = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        begin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        jLabel1.setText("Starters");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        CheesyNachos.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        CheesyNachos.setText("Cheesy Nachos");
        CheesyNachos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheesyNachosActionPerformed(evt);
            }
        });

        NachoswithBeef.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        NachoswithBeef.setText("Nachos with Beef");
        NachoswithBeef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NachoswithBeefActionPerformed(evt);
            }
        });

        chipsprice.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        chipsprice.setText("PhP 99.99");

        creamypotatoprice.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        creamypotatoprice.setText("PhP 99.99");

        garlicpizzabreadprice.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        garlicpizzabreadprice.setText("PhP 129.99");

        crispypotatoprice.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        crispypotatoprice.setText("PhP 139.99");

        chickenwingsprice.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        chickenwingsprice.setText("PhP 159.99");

        cheesynachosprice.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        cheesynachosprice.setText("PhP 159.99");

        nachoswithbeefprice.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        nachoswithbeefprice.setText("PhP 169.99");

        BeefTacos.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        BeefTacos.setText("Beef Tacos");
        BeefTacos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeefTacosActionPerformed(evt);
            }
        });

        Chips.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        Chips.setText("Chips");
        Chips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChipsActionPerformed(evt);
            }
        });

        CreamyPotatoSoup.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        CreamyPotatoSoup.setText("Creamy Potato Soup");
        CreamyPotatoSoup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreamyPotatoSoupActionPerformed(evt);
            }
        });

        GarlicPizzaBread.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        GarlicPizzaBread.setText("Garlic Pizza Bread");
        GarlicPizzaBread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GarlicPizzaBreadActionPerformed(evt);
            }
        });

        CrispyPotatoWedges.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        CrispyPotatoWedges.setText("Crispy Potato Wedges");
        CrispyPotatoWedges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrispyPotatoWedgesActionPerformed(evt);
            }
        });

        ChickenWings.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        ChickenWings.setText("Chicken Wings");
        ChickenWings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChickenWingsActionPerformed(evt);
            }
        });

        OnionRings.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        OnionRings.setText("Onion Rings");
        OnionRings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnionRingsActionPerformed(evt);
            }
        });

        RoastChickenTacos.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        RoastChickenTacos.setText("Roast Chicken Tacos");
        RoastChickenTacos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoastChickenTacosActionPerformed(evt);
            }
        });

        beeftacosprice.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        beeftacosprice.setText("PhP 189.99");

        onionringsprice.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        onionringsprice.setText("PhP 129.99");

        roastchickentacosprice.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        roastchickentacosprice.setText("PhP 179.99");

        pcs.setFont(new java.awt.Font("Serif", 3, 12)); // NOI18N
        pcs.setText("pcs:");

        donestarter.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        donestarter.setText("Done");
        donestarter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donestarterActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        areaTxt.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Chips)
                        .addGap(147, 147, 147)
                        .addComponent(chipsprice, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(CheesyNachos)
                                .addGap(92, 92, 92))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(GarlicPizzaBread)
                                    .addComponent(CreamyPotatoSoup, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CrispyPotatoWedges, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ChickenWings)
                                    .addComponent(NachoswithBeef, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(creamypotatoprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(crispypotatoprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(chickenwingsprice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(garlicpizzabreadprice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cheesynachosprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nachoswithbeefprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(areaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OnionRings)
                            .addComponent(RoastChickenTacos)
                            .addComponent(BeefTacos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(beeftacosprice, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(onionringsprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roastchickentacosprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(276, 276, 276))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pcs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numberofpcsstarters, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178)
                        .addComponent(donestarter)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Chips)
                            .addComponent(chipsprice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(creamypotatoprice)
                            .addComponent(CreamyPotatoSoup))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(garlicpizzabreadprice)
                            .addComponent(GarlicPizzaBread)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BeefTacos)
                            .addComponent(beeftacosprice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OnionRings)
                            .addComponent(onionringsprice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RoastChickenTacos)
                            .addComponent(roastchickentacosprice))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crispypotatoprice)
                    .addComponent(CrispyPotatoWedges))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chickenwingsprice)
                    .addComponent(ChickenWings))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CheesyNachos)
                            .addComponent(cheesynachosprice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nachoswithbeefprice)
                            .addComponent(NachoswithBeef)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numberofpcsstarters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pcs)
                            .addComponent(donestarter))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(areaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        begin.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        begin.setText("Begin your Threeptionist journey with these treats!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(begin, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 696, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(begin)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheesyNachosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheesyNachosActionPerformed

    }//GEN-LAST:event_CheesyNachosActionPerformed

    private void NachoswithBeefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NachoswithBeefActionPerformed

    }//GEN-LAST:event_NachoswithBeefActionPerformed

    private void BeefTacosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeefTacosActionPerformed

    }//GEN-LAST:event_BeefTacosActionPerformed

    private void ChipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChipsActionPerformed

    }//GEN-LAST:event_ChipsActionPerformed

    private void CreamyPotatoSoupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreamyPotatoSoupActionPerformed

    }//GEN-LAST:event_CreamyPotatoSoupActionPerformed

    private void GarlicPizzaBreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GarlicPizzaBreadActionPerformed

    }//GEN-LAST:event_GarlicPizzaBreadActionPerformed

    private void CrispyPotatoWedgesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrispyPotatoWedgesActionPerformed

    }//GEN-LAST:event_CrispyPotatoWedgesActionPerformed

    private void ChickenWingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChickenWingsActionPerformed

    }//GEN-LAST:event_ChickenWingsActionPerformed

    private void OnionRingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnionRingsActionPerformed

    }//GEN-LAST:event_OnionRingsActionPerformed

    private void RoastChickenTacosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoastChickenTacosActionPerformed

    }//GEN-LAST:event_RoastChickenTacosActionPerformed

    private void donestarterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donestarterActionPerformed
                                           
    StringBuilder summary = new StringBuilder();
    int total = 0;

    // Get the number of pieces entered
    int pcs;
    try {
        pcs = Integer.parseInt(numberofpcsstarters.getText());
    } catch (NumberFormatException e) {
        pcs = 0; // Default to 0 if input is invalid
    }

    // Check which items are selected and build the summary
    if (Chips.isSelected()) {
        summary.append("Chips: ").append(pcs).append(" pcs at ₱ 99.99 each\n");
        total += pcs * 99.99;
    }
    if (CreamyPotatoSoup.isSelected()) {
        summary.append("Creamy Potato Soup: ").append(pcs).append(" pcs at ₱ 99.99 each\n");
        total += pcs * 99.99;
    }
    if (GarlicPizzaBread.isSelected()) {
        summary.append("Garlic Pizza Bread: ").append(pcs).append(" pcs at ₱ 129.99 each\n");
        total += pcs * 129.99;
    }
    if (CrispyPotatoWedges.isSelected()) {
        summary.append("Crispy Potato Wedges: ").append(pcs).append(" pcs at ₱ 139.99 each\n");
        total += pcs * 139.99;
    }
    if (ChickenWings.isSelected()) {
        summary.append("Chicken Wings: ").append(pcs).append(" pcs at ₱ 159.99 each\n");
        total += pcs * 159.99;
    }
    if (CheesyNachos.isSelected()) {
        summary.append("Cheesy Nachos: ").append(pcs).append(" pcs at ₱ 159.99 each\n");
        total += pcs * 159.99;
    }
    if (NachoswithBeef.isSelected()) {
        summary.append("Nachos with Beef: ").append(pcs).append(" pcs at ₱ 169.99 each\n");
        total += pcs * 169.99;
    }
    if (BeefTacos.isSelected()) {
        summary.append("Beef Tacos: ").append(pcs).append(" pcs at ₱ 189.99 each\n");
        total += pcs * 189.99;
    }
    if (OnionRings.isSelected()) {
        summary.append("Onion Rings: ").append(pcs).append(" pcs at ₱ 129.99 each\n");
        total += pcs * 129.99;
    }
    if (RoastChickenTacos.isSelected()) {
        summary.append("Roast Chicken Tacos: ").append(pcs).append(" pcs at ₱ 179.99 each\n");
        total += pcs * 179.99;
    }

    // Append the total to the summary
    summary.append("===================\n");
    summary.append("Total:₱ ").append(total).append("\n");

    // Display the summary in the JTextArea
    jTextArea1.setText(summary.toString());

    }//GEN-LAST:event_donestarterActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(starter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(starter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(starter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(starter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new starter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox BeefTacos;
    private javax.swing.JCheckBox CheesyNachos;
    private javax.swing.JCheckBox ChickenWings;
    private javax.swing.JCheckBox Chips;
    private javax.swing.JCheckBox CreamyPotatoSoup;
    private javax.swing.JCheckBox CrispyPotatoWedges;
    private javax.swing.JCheckBox GarlicPizzaBread;
    private javax.swing.JCheckBox NachoswithBeef;
    private javax.swing.JCheckBox OnionRings;
    private javax.swing.JCheckBox RoastChickenTacos;
    private javax.swing.JScrollPane areaTxt;
    private javax.swing.JLabel beeftacosprice;
    private javax.swing.JLabel begin;
    private javax.swing.JLabel cheesynachosprice;
    private javax.swing.JLabel chickenwingsprice;
    private javax.swing.JLabel chipsprice;
    private javax.swing.JLabel creamypotatoprice;
    private javax.swing.JLabel crispypotatoprice;
    private javax.swing.JButton donestarter;
    private javax.swing.JLabel garlicpizzabreadprice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel nachoswithbeefprice;
    private javax.swing.JTextField numberofpcsstarters;
    private javax.swing.JLabel onionringsprice;
    private javax.swing.JLabel pcs;
    private javax.swing.JLabel roastchickentacosprice;
    // End of variables declaration//GEN-END:variables
}
