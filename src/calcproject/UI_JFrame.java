
package calcproject;
import UI_Custom.RoundButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;


public class UI_JFrame extends javax.swing.JFrame {

    public UI_JFrame() {
        initComponents();
        getContentPane().setBackground(Color.BLACK);
        jTextField2.setHorizontalAlignment(jTextField2.RIGHT);
        jTextField2.setBorder(BorderFactory.createEmptyBorder());
        
    }
    
    RoundButton button1 = new RoundButton();

    public JButton getroundButton22(){
        return roundButton22;
    }
    public JButton getroundButton6(){
        return roundButton6;
    }
    public JButton getroundButton21(){
        return roundButton21;
    }
    public JButton getroundButton16(){
        return roundButton16;
    }
    public JButton getroundButton4(){
        return roundButton4;
    }
    public JButton getroundButton19(){
        return roundButton19;
    }
    public JButton getroundButton14(){
        return roundButton14;
    }
    public JButton getroundButton8(){
        return roundButton8;
    }
    public JButton getroundButton23(){
        return roundButton23;
    }
    public JButton getroundButton18(){
        return roundButton18;
    }
    public JButton getroundButton17(){
        return roundButton17;
    }
    public JButton getroundButton5(){
        return roundButton5;
    }
    public JTextField getjTextField2(){
        return jTextField2;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundButton4 = new UI_Custom.RoundButton();
        roundButton5 = new UI_Custom.RoundButton();
        roundButton6 = new UI_Custom.RoundButton();
        roundButton7 = new UI_Custom.RoundButton();
        roundButton8 = new UI_Custom.RoundButton();
        roundButton9 = new UI_Custom.RoundButton();
        roundButton10 = new UI_Custom.RoundButton();
        roundButton11 = new UI_Custom.RoundButton();
        roundButton12 = new UI_Custom.RoundButton();
        roundButton13 = new UI_Custom.RoundButton();
        roundButton14 = new UI_Custom.RoundButton();
        roundButton15 = new UI_Custom.RoundButton();
        roundButton16 = new UI_Custom.RoundButton();
        roundButton17 = new UI_Custom.RoundButton();
        roundButton18 = new UI_Custom.RoundButton();
        roundButton19 = new UI_Custom.RoundButton();
        roundButton20 = new UI_Custom.RoundButton();
        roundButton21 = new UI_Custom.RoundButton();
        roundButton22 = new UI_Custom.RoundButton();
        roundButton23 = new UI_Custom.RoundButton();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setSize(new java.awt.Dimension(50, 60));

        roundButton4.setBackground(new java.awt.Color(42, 42, 44));
        roundButton4.setForeground(new java.awt.Color(255, 255, 255));
        roundButton4.setText("4");
        roundButton4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        roundButton4.setPreferredSize(new java.awt.Dimension(66, 66));
        roundButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton4ActionPerformed(evt);
            }
        });

        roundButton5.setBackground(new java.awt.Color(92, 92, 94));
        roundButton5.setForeground(new java.awt.Color(255, 255, 255));
        roundButton5.setText("AC");
        roundButton5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        roundButton5.setPreferredSize(new java.awt.Dimension(66, 66));
        roundButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton5ActionPerformed(evt);
            }
        });

        roundButton6.setBackground(new java.awt.Color(42, 42, 44));
        roundButton6.setForeground(new java.awt.Color(255, 255, 255));
        roundButton6.setText("1");
        roundButton6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        roundButton6.setPreferredSize(new java.awt.Dimension(66, 66));
        roundButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton6ActionPerformed(evt);
            }
        });

        roundButton7.setBackground(new java.awt.Color(42, 42, 44));
        roundButton7.setBorder(null);
        roundButton7.setForeground(new java.awt.Color(255, 255, 255));
        roundButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Symb.png"))); // NOI18N
        roundButton7.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        roundButton7.setPreferredSize(new java.awt.Dimension(66, 66));
        roundButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton7ActionPerformed(evt);
            }
        });

        roundButton8.setBackground(new java.awt.Color(42, 42, 44));
        roundButton8.setForeground(new java.awt.Color(255, 255, 255));
        roundButton8.setText("7");
        roundButton8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        roundButton8.setPreferredSize(new java.awt.Dimension(66, 66));
        roundButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton8ActionPerformed(evt);
            }
        });

        roundButton9.setBackground(new java.awt.Color(255, 159, 10));
        roundButton9.setForeground(new java.awt.Color(255, 255, 255));
        roundButton9.setText("-");
        roundButton9.setFont(new java.awt.Font("Arial", 0, 38)); // NOI18N
        roundButton9.setPreferredSize(new java.awt.Dimension(66, 66));

        roundButton10.setBackground(new java.awt.Color(255, 159, 10));
        roundButton10.setForeground(new java.awt.Color(255, 255, 255));
        roundButton10.setText("÷");
        roundButton10.setFont(new java.awt.Font("Arial", 0, 38)); // NOI18N
        roundButton10.setPreferredSize(new java.awt.Dimension(66, 66));

        roundButton11.setBackground(new java.awt.Color(255, 159, 10));
        roundButton11.setForeground(new java.awt.Color(255, 255, 255));
        roundButton11.setText("×");
        roundButton11.setFont(new java.awt.Font("Arial", 0, 38)); // NOI18N
        roundButton11.setPreferredSize(new java.awt.Dimension(66, 66));

        roundButton12.setBackground(new java.awt.Color(255, 159, 10));
        roundButton12.setForeground(new java.awt.Color(255, 255, 255));
        roundButton12.setText("+");
        roundButton12.setFont(new java.awt.Font("Arial", 0, 38)); // NOI18N
        roundButton12.setPreferredSize(new java.awt.Dimension(66, 66));

        roundButton13.setBackground(new java.awt.Color(255, 159, 10));
        roundButton13.setBorder(null);
        roundButton13.setForeground(new java.awt.Color(255, 255, 255));
        roundButton13.setText("=");
        roundButton13.setFont(new java.awt.Font("Arial", 0, 38)); // NOI18N
        roundButton13.setPreferredSize(new java.awt.Dimension(66, 66));
        roundButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton13ActionPerformed(evt);
            }
        });

        roundButton14.setBackground(new java.awt.Color(42, 42, 44));
        roundButton14.setForeground(new java.awt.Color(255, 255, 255));
        roundButton14.setText("6");
        roundButton14.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        roundButton14.setPreferredSize(new java.awt.Dimension(66, 66));
        roundButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton14ActionPerformed(evt);
            }
        });

        roundButton15.setBackground(new java.awt.Color(92, 92, 94));
        roundButton15.setForeground(new java.awt.Color(255, 255, 255));
        roundButton15.setText("%");
        roundButton15.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        roundButton15.setPreferredSize(new java.awt.Dimension(66, 66));

        roundButton16.setBackground(new java.awt.Color(42, 42, 44));
        roundButton16.setForeground(new java.awt.Color(255, 255, 255));
        roundButton16.setText("3");
        roundButton16.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        roundButton16.setPreferredSize(new java.awt.Dimension(66, 66));
        roundButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton16ActionPerformed(evt);
            }
        });

        roundButton17.setBackground(new java.awt.Color(42, 42, 44));
        roundButton17.setBorder(null);
        roundButton17.setForeground(new java.awt.Color(255, 255, 255));
        roundButton17.setText(".");
        roundButton17.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        roundButton17.setPreferredSize(new java.awt.Dimension(66, 66));
        roundButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton17ActionPerformed(evt);
            }
        });

        roundButton18.setBackground(new java.awt.Color(42, 42, 44));
        roundButton18.setForeground(new java.awt.Color(255, 255, 255));
        roundButton18.setText("9");
        roundButton18.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        roundButton18.setPreferredSize(new java.awt.Dimension(66, 66));
        roundButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton18ActionPerformed(evt);
            }
        });

        roundButton19.setBackground(new java.awt.Color(42, 42, 44));
        roundButton19.setForeground(new java.awt.Color(255, 255, 255));
        roundButton19.setText("5");
        roundButton19.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        roundButton19.setPreferredSize(new java.awt.Dimension(66, 66));
        roundButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton19ActionPerformed(evt);
            }
        });

        roundButton20.setBackground(new java.awt.Color(92, 92, 94));
        roundButton20.setForeground(new java.awt.Color(255, 255, 255));
        roundButton20.setText("+/-");
        roundButton20.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        roundButton20.setPreferredSize(new java.awt.Dimension(66, 66));

        roundButton21.setBackground(new java.awt.Color(42, 42, 44));
        roundButton21.setForeground(new java.awt.Color(255, 255, 255));
        roundButton21.setText("2");
        roundButton21.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        roundButton21.setPreferredSize(new java.awt.Dimension(66, 66));
        roundButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton21ActionPerformed(evt);
            }
        });

        roundButton22.setBackground(new java.awt.Color(42, 42, 44));
        roundButton22.setBorder(null);
        roundButton22.setForeground(new java.awt.Color(255, 255, 255));
        roundButton22.setText("0");
        roundButton22.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        roundButton22.setPreferredSize(new java.awt.Dimension(66, 66));
        roundButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton22ActionPerformed(evt);
            }
        });

        roundButton23.setBackground(new java.awt.Color(42, 42, 44));
        roundButton23.setForeground(new java.awt.Color(255, 255, 255));
        roundButton23.setText("8");
        roundButton23.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        roundButton23.setPreferredSize(new java.awt.Dimension(66, 66));
        roundButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton23ActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("0");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(roundButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roundButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roundButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roundButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(roundButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(roundButton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(roundButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(roundButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(roundButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(roundButton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(roundButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(roundButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(roundButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(roundButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(roundButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(roundButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(roundButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(roundButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(roundButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(roundButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(roundButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(roundButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(roundButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(roundButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(roundButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(roundButton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(roundButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(roundButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(roundButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(roundButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(roundButton19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(roundButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(roundButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roundButton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roundButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(roundButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roundButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton7ActionPerformed

    private void roundButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton13ActionPerformed

    private void roundButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton17ActionPerformed

    private void roundButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton22ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_roundButton22ActionPerformed

    private void roundButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton5ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void roundButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton8ActionPerformed

    private void roundButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton6ActionPerformed

    private void roundButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton21ActionPerformed

    private void roundButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton16ActionPerformed

    private void roundButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton4ActionPerformed

    private void roundButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton19ActionPerformed

    private void roundButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton14ActionPerformed

    private void roundButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton23ActionPerformed

    private void roundButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton18ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField2;
    private UI_Custom.RoundButton roundButton10;
    private UI_Custom.RoundButton roundButton11;
    private UI_Custom.RoundButton roundButton12;
    private UI_Custom.RoundButton roundButton13;
    private UI_Custom.RoundButton roundButton14;
    private UI_Custom.RoundButton roundButton15;
    private UI_Custom.RoundButton roundButton16;
    private UI_Custom.RoundButton roundButton17;
    private UI_Custom.RoundButton roundButton18;
    private UI_Custom.RoundButton roundButton19;
    private UI_Custom.RoundButton roundButton20;
    private UI_Custom.RoundButton roundButton21;
    private UI_Custom.RoundButton roundButton22;
    private UI_Custom.RoundButton roundButton23;
    private UI_Custom.RoundButton roundButton4;
    private UI_Custom.RoundButton roundButton5;
    private UI_Custom.RoundButton roundButton6;
    private UI_Custom.RoundButton roundButton7;
    private UI_Custom.RoundButton roundButton8;
    private UI_Custom.RoundButton roundButton9;
    // End of variables declaration//GEN-END:variables
}
