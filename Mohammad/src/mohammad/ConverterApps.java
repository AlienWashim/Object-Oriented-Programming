
package mohammad;
public class ConverterApps extends javax.swing.JFrame {

   
    public ConverterApps() {
        initComponents();
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        inputtextfield = new javax.swing.JTextField();
        Celciuslebel = new javax.swing.JLabel();
        farhenheitlabel = new javax.swing.JLabel();
        convertbutton = new javax.swing.JButton();
        convertbutton1 = new javax.swing.JButton();
        farhenheitlabel1 = new javax.swing.JLabel();
        convertbutton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Celciuslebel.setText("Celcius");

        farhenheitlabel.setText("Fahrenheit");

        convertbutton.setText("convert Cel to Fer");
        convertbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertbuttonActionPerformed(evt);
            }
        });

        convertbutton1.setText("convert LBS to KG");
        convertbutton1.setActionCommand("convert 2");
        convertbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertbutton1ActionPerformed(evt);
            }
        });

        farhenheitlabel1.setText("KG");

        convertbutton2.setText("convert Cm to Inch");
        convertbutton2.setActionCommand("convert 2");
        convertbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertbutton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Inch");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(convertbutton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputtextfield)
                    .addComponent(convertbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(convertbutton1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 315, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(farhenheitlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Celciuslebel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(farhenheitlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Celciuslebel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(convertbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(farhenheitlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(convertbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(farhenheitlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convertbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void convertbuttonActionPerformed(java.awt.event.ActionEvent evt) { 
        String s=evt.getActionCommand();
        System.out.println(s);
         int tempFahr = (int)((Double.parseDouble(inputtextfield.getText()))*1.8 + 32);
     farhenheitlabel.setText(tempFahr + " Fahrenheit");

    }                                             

    private void convertbutton1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        double calKG =  ((Double.parseDouble(inputtextfield.getText()))/2.2046);
        
        farhenheitlabel1.setText(calKG + "");
    }                                              

    private void convertbutton2ActionPerformed(java.awt.event.ActionEvent evt) {                                               
       
        double calInch=  ((Double.parseDouble(inputtextfield.getText()))*0.39370);
        
        jLabel1.setText(calInch + "");
    }                                              

     
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConverterApps().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Celciuslebel;
    private javax.swing.JButton convertbutton;
    private javax.swing.JButton convertbutton1;
    private javax.swing.JButton convertbutton2;
    private javax.swing.JLabel farhenheitlabel;
    private javax.swing.JLabel farhenheitlabel1;
    private javax.swing.JTextField inputtextfield;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}

