
package calculadora;


public class presentacion extends javax.swing.JFrame {
Calculadora miCalculadora= new Calculadora();
    
    public presentacion() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UNO = new javax.swing.JTextField();
        sen = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        tangente = new javax.swing.JButton();
        RESUL = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cot = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sen.setText("seno");
        sen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                senMouseClicked(evt);
            }
        });

        cos.setText("coseno");
        cos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cosMouseClicked(evt);
            }
        });

        tangente.setText("tangente");
        tangente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tangenteMouseClicked(evt);
            }
        });

        jLabel1.setText("NUMERO 1");

        jLabel3.setText("RESULTADO");

        cot.setText("cotangente");

        jButton2.setText("secante");

        jButton3.setText("cosecante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RESUL, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel3)))
                        .addGap(55, 55, 55)
                        .addComponent(UNO, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(tangente)
                            .addComponent(cos)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sen)
                                .addGap(47, 47, 47)
                                .addComponent(jButton3))
                            .addComponent(cot))))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sen)
                    .addComponent(jLabel1)
                    .addComponent(jButton3))
                .addGap(20, 20, 20)
                .addComponent(cos)
                .addGap(18, 18, 18)
                .addComponent(tangente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cot)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(RESUL, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(33, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void senMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_senMouseClicked
        miCalculadora.num1=Double.parseDouble(UNO.getText());
     RESUL.setText(miCalculadora.seno()+"");
    }//GEN-LAST:event_senMouseClicked

    private void cosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cosMouseClicked
          miCalculadora.num1=Double.parseDouble(UNO.getText());
     RESUL.setText(miCalculadora.coseno()+"");
    }//GEN-LAST:event_cosMouseClicked

    private void tangenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tangenteMouseClicked
          miCalculadora.num1=Double.parseDouble(UNO.getText());
     RESUL.setText(miCalculadora.tangente()+"");
    }//GEN-LAST:event_tangenteMouseClicked

    
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new presentacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RESUL;
    private javax.swing.JTextField UNO;
    private javax.swing.JButton cos;
    private javax.swing.JButton cot;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton sen;
    private javax.swing.JButton tangente;
    // End of variables declaration//GEN-END:variables
}
