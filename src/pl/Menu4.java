/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alibimunka
 */
public class Menu4 extends javax.swing.JFrame {
   
    ArrayList<Integer[]> lista = new ArrayList<>();
    Integer potlek=0;
    String gyerekSzam;
    String fizetes;
    Boolean kitolt=false;
    double netto=0.0;
    Integer hazas=0;
     
   
    /**
     * Creates new form Menu3
     */
    public Menu4() throws FileNotFoundException, IOException {
        initComponents();
        File file = new File("szemelyi.txt"); 
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        String s=br.readLine();
        while ((s = br.readLine()) != null){
            String[] parts = s.split("\t");
            jComboBox1.addItem(parts[0]);
            Integer[] szamok = new Integer[3];
            for (Integer i=0;i<3;i++){
                szamok[i]=Integer.parseInt(parts[i+1]);
            }
            lista.add(szamok);
           
        }
        br.close();
        jRadioButton1.addActionListener(new ActionListener() {
            @Override public void actionPerformed (ActionEvent e) {
                jTextField2.setVisible(false);
            }
        });
        jRadioButton2.addActionListener(new ActionListener() {
            @Override public void actionPerformed (ActionEvent e) {
                jTextField2.setVisible(false);
            }
        });
        jRadioButton3.addActionListener(new ActionListener() {
            @Override public void actionPerformed (ActionEvent e) {
                jTextField2.setVisible(false);
            }
        });
        jRadioButton4.addActionListener(new ActionListener() {
            @Override public void actionPerformed (ActionEvent e) {
                jTextField2.setVisible(false);
            }  
        });
        
        RadioButton3Plusz.addActionListener(new ActionListener() {
            @Override public void actionPerformed (ActionEvent e) {
                jTextField2.setVisible(true);
            }  
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        ExitButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Szamol = new javax.swing.JButton();
        RadioButton3Plusz = new javax.swing.JRadioButton();
        LabelHiba = new javax.swing.JLabel();
        Kiir = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        KiirKedvMarad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Személyi adózás kalkulátor");

        ExitButton.setText("Kilépés");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Vissza");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Adja meg a havi bruttó keresetét!");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Ft");

        jLabel3.setText("Van családi pótlékra jogosult gyermeke? ");

        jLabel4.setText("Gyermekét/gyermekeit egyedül neveli?");

        buttonGroup2.add(jCheckBox5);
        jCheckBox5.setText("igen");

        buttonGroup2.add(jCheckBox6);
        jCheckBox6.setText("nem");

        jLabel5.setText("Első házas? (max 24 hónapig)");

        buttonGroup3.add(jCheckBox7);
        jCheckBox7.setText("igen");

        buttonGroup3.add(jCheckBox8);
        jCheckBox8.setText("nem");

        jLabel6.setText("Válassza ki az országot!");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("nincs");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("1");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("2");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("3 ");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel7.setText("vagyis:");

        Szamol.setText("Számol");
        Szamol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SzamolMouseClicked(evt);
            }
        });
        Szamol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SzamolActionPerformed(evt);
            }
        });

        buttonGroup1.add(RadioButton3Plusz);
        RadioButton3Plusz.setText("3+");

        LabelHiba.setEnabled(false);

        jLabel8.setText("A nettó bér:");

        jLabel9.setText("Ft");

        jLabel10.setText("Nem felhasznált adókedvezmény:");

        jLabel11.setText("Ft");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(LabelHiba)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(412, 412, 412))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox7)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jCheckBox5)
                                                        .addGap(34, 34, 34)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jCheckBox6)
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(jRadioButton2)
                                                                    .addGap(38, 38, 38)
                                                                    .addComponent(jRadioButton3)
                                                                    .addGap(35, 35, 35)
                                                                    .addComponent(jRadioButton4))
                                                                .addComponent(jCheckBox8)
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addGap(25, 25, 25)
                                                                    .addComponent(Szamol)))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(KiirKedvMarad, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jLabel11))
                                                                    .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(Kiir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jLabel9)))
                                                                .addGap(24, 24, 24))))
                                                    .addComponent(jRadioButton1))
                                                .addGap(18, 18, 18)
                                                .addComponent(RadioButton3Plusz)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(412, 412, 412)))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ExitButton)
                    .addComponent(BackButton))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(ExitButton)
                        .addGap(27, 27, 27)
                        .addComponent(BackButton)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(RadioButton3Plusz))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox6))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jCheckBox7)
                            .addComponent(jCheckBox8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Szamol)
                        .addGap(45, 45, 45)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(LabelHiba, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Kiir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(KiirKedvMarad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        PLFrame pl = new PLFrame();
        pl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        potlek=17500*2;
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void SzamolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SzamolActionPerformed
        // TODO add your handling code here:
    try{
    if (Integer.parseInt(jTextField1.getText())!=0){
        Integer orszag = jComboBox1.getSelectedIndex();
        fizetes=jTextField1.getText();
    }else{
        LabelHiba.setEnabled(true);
        LabelHiba.setText("Nem adtál meg mindenhova adatot");
        throw new NumberFormatException();
    }
    } catch (NumberFormatException e) {
                    Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, e);
    }    
    
    
    Integer csaladiadokedvezmeny=0;
    
    
    if (jCheckBox5.getModel().isSelected()){
        if (buttonGroup1.isSelected(RadioButton3Plusz.getModel())){
            gyerekSzam=jTextField2.getText();
            potlek=17000*(Integer.parseInt(gyerekSzam));
        }else if (buttonGroup1.isSelected(jRadioButton1.getModel())){
            potlek=0;
        }else if (buttonGroup1.isSelected(jRadioButton2.getModel())){
            potlek=13700;
        }else if (buttonGroup1.isSelected(jRadioButton3.getModel())){
            potlek=14800*2;
        }else{
            potlek=17000*3;
        }
    }else{
        if (buttonGroup1.isSelected(RadioButton3Plusz.getModel())){
            gyerekSzam=jTextField2.getText();
            potlek=16000*(Integer.parseInt(gyerekSzam));
        }else if (buttonGroup1.isSelected(jRadioButton1.getModel())){
            potlek=0;
        }else if (buttonGroup1.isSelected(jRadioButton2.getModel())){
            potlek=12200;
        }else if (buttonGroup1.isSelected(jRadioButton3.getModel())){
            potlek=13300*2;
        }else{
            potlek=16000*3;
        }
    }
    if (jCheckBox7.getModel().isSelected()){
        hazas=5000;
    }
    else{
        hazas=0;
    }
    
    
    if (buttonGroup1.isSelected(RadioButton3Plusz.getModel())){
        gyerekSzam=jTextField2.getText();
        csaladiadokedvezmeny=33000*(Integer.parseInt(gyerekSzam));
    }else if (buttonGroup1.isSelected(jRadioButton1.getModel())){
        csaladiadokedvezmeny=0;
    }else if (buttonGroup1.isSelected(jRadioButton2.getModel())){
        csaladiadokedvezmeny=10000;
    }else if (buttonGroup1.isSelected(jRadioButton3.getModel())){
        csaladiadokedvezmeny=17500;
    }else{
        csaladiadokedvezmeny=33000*3;
    }
    
    double fiz=Double.parseDouble(fizetes);
    double szja=fiz * lista.get(jComboBox1.getSelectedIndex())[0]/100.0;
    double nyugdij=fiz * lista.get(jComboBox1.getSelectedIndex())[1]/100.0;
    double eu=fiz * lista.get(jComboBox1.getSelectedIndex())[2]/100.0;
    double munk= fiz * 0.015;
    
    double osszado = szja+nyugdij+eu;
    
    double osszadokedv = Double.parseDouble(hazas.toString()) + csaladiadokedvezmeny;
    
    if (osszado-osszadokedv<=munk){
        Double seged=osszadokedv-(osszado-munk);
        KiirKedvMarad.setText(seged.toString());
        osszado=munk;
    }else{
        KiirKedvMarad.setText("0");
        osszado = osszado-osszadokedv;
    }
    
    netto=fiz-osszado+potlek;
    Kiir.setText(Double.toString(netto)); 
    
    //System.out.println(netto);
  
    
    }//GEN-LAST:event_SzamolActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void SzamolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SzamolMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SzamolMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws FileNotFoundException, IOException {
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
            java.util.logging.Logger.getLogger(Menu4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Menu4().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField Kiir;
    private javax.swing.JTextField KiirKedvMarad;
    private javax.swing.JLabel LabelHiba;
    private javax.swing.JRadioButton RadioButton3Plusz;
    private javax.swing.JButton Szamol;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
