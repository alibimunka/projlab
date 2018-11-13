package pl;

//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableCellRenderer;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StackedXYBarRenderer;
import org.jfree.data.xy.CategoryTableXYDataset;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Alibimunka
 */
public class Menu1 extends javax.swing.JFrame {

    
    ArrayList<Integer[]> myList = new ArrayList<>();
        
    /**
     * Creates new form Menu1
     */
    public Menu1() throws FileNotFoundException, IOException {
        initComponents();
        File file = new File("be.txt"); 
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        String s;
        while ((s = br.readLine()) != null){
            String[] parts = s.split("\t");
            ComboBoxA.addItem(parts[0]);
            ComboBoxB.addItem(parts[0]);
            Integer[] szamok = new Integer[15];
            for (Integer i=0;i<15;i++){
                szamok[i]=Integer.parseInt(parts[i+1]);
            }
            myList.add(szamok);
        }
        br.close();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        for (Integer i=0;i<4;i++){
            TableAdok.getColumnModel().getColumn(i).setCellRenderer( centerRenderer );
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ExitButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        ComboBoxA = new javax.swing.JComboBox<>();
        ComboBoxB = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAdok = new javax.swing.JTable();
        CompareButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        AdoekA = new javax.swing.JTextField();
        AdoekB = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Adoek_btn = new javax.swing.JButton();
        Bevetel_btn = new javax.swing.JButton();
        DiagButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adórendszerek összehasonlítása");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        ComboBoxA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxAActionPerformed(evt);
            }
        });

        TableAdok.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TableAdok.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Ország", null, null, null},
                {"Társasági adó", null, null, null},
                {"Maximális jövedelem adó", null, null, null},
                {"Normál ÁFA kulcs", null, null, null},
                {"Személyi jövedelemadó", null, null, null},
                {"Nyugdíjjárulék", null, null, null},
                {"Egészségbizotsítási és munkaerőpiaci járulék", null, null, null},
                {"Szociális hozzájárulási adó", null, null, null},
                {"Szakképzési hozzájárulás", null, null, null},
                {"Keresőképes lakosok száma(MFő)", null, null, null},
                {"Keresőképes lakosok átlagkeresete", null, null, null},
                {"Társasági adót fizető vállalkozások átlagos adózás előtti eredménye (MFt)", null, null, null},
                {"Jövedéki adóból származó bevétel (MFt)", null, null, null},
                {"27%-os ÁFÁ-ból származó bevétel(MFt)", null, null, null},
                {"18%-os ÁFÁ-ból származó bevétel(tej, terjtermékek,pékáru,cukrászsütemény,szolgáltatás,stb.)(MFt)", null, null, null},
                {"5%-os ÁFÁ-ból származó bevétel(humán gyógyszerek, napilapok,könyv,folyóirat,szolgáltatás,stb)(MFt)", null, null, null}
            },
            new String [] {
                "Értékek", "Adórendszer1", "", "Adórendszer2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableAdok.setAlignmentX(0.7F);
        TableAdok.setAlignmentY(0.7F);
        TableAdok.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TableAdok.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(TableAdok);
        if (TableAdok.getColumnModel().getColumnCount() > 0) {
            TableAdok.getColumnModel().getColumn(0).setMaxWidth(600);
            TableAdok.getColumnModel().getColumn(1).setMaxWidth(150);
            TableAdok.getColumnModel().getColumn(2).setMaxWidth(150);
            TableAdok.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        CompareButton.setText("Összehasonlít");
        CompareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompareButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Adóék:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Az értékek %-ban értetendők!");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Válassza ki a kívánt adórendszer!");

        jLabel4.setText("Munkavállaló által fizetendő:");

        jLabel5.setText("%");

        jLabel6.setText("Munkáltató által fizetendő:");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel7.setText("%");

        jLabel8.setText("%");

        jLabel9.setText("%");

        jLabel10.setText("%");

        jLabel11.setText("%");

        jLabel13.setText("Adórendszerenkénti összes bevétel:");

        jLabel14.setText("M Ft");

        jLabel15.setText("M Ft");

        Adoek_btn.setText("Adóék grafikon");
        Adoek_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Adoek_btnActionPerformed(evt);
            }
        });

        Bevetel_btn.setText("Bevétel grafikon");
        Bevetel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bevetel_btnActionPerformed(evt);
            }
        });

        DiagButton.setText("Adókat összehasonlító diagram");
        DiagButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(520, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BackButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(322, 322, 322)
                        .addComponent(ExitButton)))
                .addGap(78, 78, 78))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 686, Short.MAX_VALUE)
                .addComponent(ComboBoxA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190)
                .addComponent(ComboBoxB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(281, 281, 281))
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Adoek_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bevetel_btn)
                        .addGap(140, 140, 140))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(213, 213, 213)
                                        .addComponent(CompareButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel1)
                                                    .addComponent(jLabel13)
                                                    .addComponent(jLabel6))
                                                .addGap(3, 3, 3)))))
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(AdoekA, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(DiagButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(AdoekB, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel8))))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1052, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExitButton)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BackButton)
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AdoekA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdoekB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13))
                        .addGap(14, 14, 14)
                        .addComponent(CompareButton)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bevetel_btn)
                            .addComponent(Adoek_btn))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(136, 136, 136)))
                .addComponent(DiagButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void CompareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompareButtonActionPerformed
        // TODO add your handling code here:
        
        //függvényesíteni kéne
        Integer orszag1 = ComboBoxA.getSelectedIndex();
        Integer orszag2 = ComboBoxB.getSelectedIndex();
        TableAdok.setValueAt(ComboBoxA.getItemAt(orszag1), 0, 1);
        TableAdok.setValueAt(ComboBoxB.getItemAt(orszag2), 0, 3);
        for (Integer i=0;i<15;i++){
                TableAdok.setValueAt(myList.get(orszag1)[i], i+1, 1);
                TableAdok.setValueAt(myList.get(orszag2)[i], i+1, 3);
              
                if (myList.get(orszag1)[i] > myList.get(orszag2)[i]){
                    String s=">";
                    Integer o1=myList.get(orszag1)[i];
                    Integer o2=myList.get(orszag2)[i];
                    o1-=o2;
                    for (Integer j=0;j<2;j++) if (o1>o2){
                        s+=">";
                        o1-=o2;
                    }
                    TableAdok.setValueAt(s, i+1, 2);
                }
                else if (myList.get(orszag1)[i] < myList.get(orszag2)[i]){
                    String s="<";
                    Integer o1=myList.get(orszag2)[i];
                    Integer o2=myList.get(orszag1)[i];
                    o1-=o2;
                    for (Integer j=0;j<2;j++) if (o1>o2){
                        s+="<";
                        o1-=o2;
                    }
                    TableAdok.setValueAt(s, i+1, 2);
                }
                else TableAdok.setValueAt("=", i+1, 2);
            }
        
      Integer munkavallalo= myList.get(orszag1)[3]+myList.get(orszag1)[4]+myList.get(orszag1)[5];
      jTextField1.setText(Integer.toString(munkavallalo));
      
      Integer munkaltato= myList.get(orszag1)[6]+myList.get(orszag1)[7];
      jTextField3.setText(Integer.toString(munkaltato));
      
      Integer munkaval= myList.get(orszag2)[3]+myList.get(orszag2)[4]+myList.get(orszag2)[5];
      jTextField2.setText(Integer.toString(munkaval));
      
      Integer munkaltat= myList.get(orszag2)[6]+myList.get(orszag2)[7];
      jTextField4.setText(Integer.toString(munkaltat));
     
      double adoek_egy=(double)((100000-(100000*(munkavallalo/100.00)+(100000*(munkaltato/100.00))))/100000)*100.00;
      String ad_egy =Double.toString(adoek_egy);
      AdoekA.setText(ad_egy.substring(0, 4));
      
      double adoek_ketto=(double)((100000-(100000*((double)munkaval/100.00)+(100000*((double)munkaltat/100.00))))/100000)*100.00;
      String ad_ketto =Double.toString(adoek_ketto);
      AdoekB.setText(ad_ketto.substring(0, 4));
      
      double munkavallalobol1=(myList.get(orszag1)[8]*((myList.get(orszag1)[9])/1000000.00))*(1-(munkavallalo/100.00));
       
      double munkaltatobol1=((((myList.get(orszag1)[8]*myList.get(orszag1)[9])/1000000.00)*((munkaltato/100.00)+1))-(myList.get(orszag1)[8]*(myList.get(orszag1)[9])/1000000.00));
      
      double munkavallalobol2=(myList.get(orszag2)[8]*(myList.get(orszag2)[9])/1000000.00)*(1-(munkaval/100.00));
       
      double munkaltatobol2=(((myList.get(orszag2)[8]*(myList.get(orszag2)[9])/1000000.00)*((munkaltat/100.00)+1))-(myList.get(orszag2)[8]*(myList.get(orszag2)[9])/1000000.00));
      
     double BevetelOrszag1=munkavallalobol1+munkaltatobol1+(myList.get(orszag1)[10]*(myList.get(orszag1)[0]/100.00))+myList.get(orszag1)[11]+myList.get(orszag1)[12]+myList.get(orszag1)[13]+myList.get(orszag1)[14];
     String b_double =Double.toString(BevetelOrszag1);
     jTextField8.setText(b_double.substring(0, 4));
      
      
     double BevetelOrszag2=munkavallalobol2+munkaltatobol2+(myList.get(orszag2)[10]*(myList.get(orszag2)[0]/100.00))+myList.get(orszag2)[11]+myList.get(orszag2)[12]+myList.get(orszag2)[13]+myList.get(orszag2)[14];
     String b2_double =Double.toString(BevetelOrszag2);
     jTextField9.setText(b2_double.substring(0, 4));
  
    }//GEN-LAST:event_CompareButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
          
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void Bevetel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bevetel_btnActionPerformed
        // TODO add your handling code here:
        Integer orszag1 = ComboBoxA.getSelectedIndex();
        Integer orszag2 = ComboBoxB.getSelectedIndex();
        CategoryTableXYDataset dataset = new CategoryTableXYDataset();
        //OrszágA
        int orszagAbevetellakos=myList.get(orszag1)[11]; // IDE KELL BERNI AZ ELSŐ ORSZÁG BEVÉTELE LAKOSOKBÓL
        int orszagAbevetelvallalt=myList.get(orszag1)[9]; // IDE KELL BERNI AZ ELSŐ ORSZÁG BEVÉTELE VÁLLALATOKBÓL
        dataset.add(1.0,orszagAbevetellakos,"Lakosságon beszedett adó");
        dataset.add(1.0,orszagAbevetelvallalt,"Vállalatokon beszedett adó");
        //OrszágB
        int orszagBbevetellakos=myList.get(orszag2)[11]; // IDE KELL BERNI A MÁSODIK ORSZÁG BEVÉTELE LAKOSOKBÓL
        int orszagBbevetelvallalt=myList.get(orszag2)[9]; // IDE KELL BERNI A MÁSODIK ORSZÁG BEVÉTELE VÁLLALATOKBÓL
        dataset.add(2.5,orszagBbevetellakos,"Lakosságon beszedett adó");
        dataset.add(2.5,orszagBbevetelvallalt,"Vállalatokon beszedett adó");
        XYPlot plot = new XYPlot(dataset,new NumberAxis(ComboBoxA.getItemAt(orszag1)+'-'+ComboBoxB.getItemAt(orszag2)), new NumberAxis("%"),new StackedXYBarRenderer());
        JFreeChart chart = new JFreeChart(plot);
        ChartPanel chartPanel = new ChartPanel(chart);
        JFrame frame = new JFrame("Bevételeket összehasonlító diagramm");
        frame.setContentPane(chartPanel);
        frame.pack();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        JButton ki = new JButton();
//        ki.setText("V");
//        ki.setFont(new Font("Arial", Font.PLAIN, 10));
//        ki.setBounds(0, 330, 15, 15);
//        ki.setSize(40,40);
//        ki.setLayout(null);
//        frame.add(ki);
//        ki.addActionListener(new ActionListener() {
//            @Override public void actionPerformed (ActionEvent e) {
//                frame.dispose();
//            }
//        });
//        ki.setVisible(true);
        frame.setVisible(true);
    }//GEN-LAST:event_Bevetel_btnActionPerformed

    private void DiagButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagButtonActionPerformed
        // TODO add your handling code here:
        Integer orszag1 = ComboBoxA.getSelectedIndex();
        Integer orszag2 = ComboBoxB.getSelectedIndex();
        CategoryTableXYDataset dataset = new CategoryTableXYDataset();
        //OrszágA
        dataset.add(1.0,myList.get(orszag1)[0],"Társasági adó");
        dataset.add(1.0,myList.get(orszag1)[1],"Maximális jövedelem adó");
        dataset.add(1.0,myList.get(orszag1)[2],"Normál ÁFA kulcs");
        dataset.add(1.0,myList.get(orszag1)[3],"Személyi jövedelemadó");
        dataset.add(1.0,myList.get(orszag1)[4],"Nyugdíjjárulék");
        dataset.add(1.0,myList.get(orszag1)[5],"Egészségbiztosítási és munkaerőpiaci járulék");
        dataset.add(1.0,myList.get(orszag1)[6],"SZOCHO");
        dataset.add(1.0,myList.get(orszag1)[7],"Szakképzési hozzájárulás");
        //OrszágB
        dataset.add(2.5,myList.get(orszag2)[0],"Társasági adó");
        dataset.add(2.5,myList.get(orszag2)[1],"Maximális jövedelem adó");
        dataset.add(2.5,myList.get(orszag2)[2],"Normál ÁFA kulcs");
        dataset.add(2.5,myList.get(orszag2)[3],"Személyi jövedelemadó");
        dataset.add(2.5,myList.get(orszag2)[4],"Nyugdíjjárulék");
        dataset.add(2.5,myList.get(orszag2)[5],"Egészségbiztosítási és munkaerőpiaci járulék");
        dataset.add(2.5,myList.get(orszag2)[6],"SZOCHO");
        dataset.add(2.5,myList.get(orszag2)[7],"Szakképzési hozzájárulás");
        XYPlot plot = new XYPlot(dataset,new NumberAxis(ComboBoxA.getItemAt(orszag1)+'-'+ComboBoxB.getItemAt(orszag2)), new NumberAxis("%"),new StackedXYBarRenderer());
        JFreeChart chart = new JFreeChart(plot);
        ChartPanel chartPanel = new ChartPanel(chart);
        JFrame frame = new JFrame("Adókat összehasonlító diagramm");
        frame.setContentPane(chartPanel);
        frame.pack();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        JButton ki = new JButton();
//        ki.setText("V");
//        ki.setFont(new Font("Arial", Font.PLAIN, 10));
//        ki.setBounds(0, 330, 15, 15);
//        ki.setSize(40,40);
//        ki.setLayout(null);
//        frame.add(ki);
//        ki.addActionListener(new ActionListener() {
//            @Override public void actionPerformed (ActionEvent e) {
//                frame.dispose();
//            }
//        });
//        ki.setVisible(true);
        frame.setVisible(true);
    }//GEN-LAST:event_DiagButtonActionPerformed

    private void ComboBoxAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxAActionPerformed

    private void Adoek_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Adoek_btnActionPerformed
        // TODO add your handling code here:
        Integer orszag1 = ComboBoxA.getSelectedIndex();
        Integer orszag2 = ComboBoxB.getSelectedIndex();
        CategoryTableXYDataset dataset = new CategoryTableXYDataset();
        //OrszágA
        dataset.add(1.0,Float.parseFloat(AdoekA.getText()),ComboBoxA.getItemAt(orszag1)+" adóék");
        //OrszágB
        dataset.add(2.5,Float.parseFloat(AdoekB.getText()),ComboBoxB.getItemAt(orszag2)+" adóék");
        XYPlot plot = new XYPlot(dataset,new NumberAxis(), new NumberAxis("%"),new StackedXYBarRenderer());
        JFreeChart chart = new JFreeChart(plot);
        ChartPanel chartPanel = new ChartPanel(chart);
        JFrame frame = new JFrame("Adóékek");
        frame.setContentPane(chartPanel);
        frame.pack();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        JButton ki = new JButton();
//        ki.setText("V");
//        ki.setFont(new Font("Arial", Font.PLAIN, 10));
//        ki.setBounds(0, 330, 15, 15);
//        ki.setSize(40,40);
//        ki.setLayout(null);
//        frame.add(ki);
//        ki.addActionListener(new ActionListener() {
//            @Override public void actionPerformed (ActionEvent e) {
//                frame.dispose();
//            }
//        });
//        ki.setVisible(true);
        frame.setVisible(true);
    }//GEN-LAST:event_Adoek_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException, IOException {
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
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Menu1().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdoekA;
    private javax.swing.JTextField AdoekB;
    private javax.swing.JButton Adoek_btn;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton Bevetel_btn;
    private javax.swing.JComboBox<String> ComboBoxA;
    private javax.swing.JComboBox<String> ComboBoxB;
    private javax.swing.JButton CompareButton;
    private javax.swing.JButton DiagButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTable TableAdok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
