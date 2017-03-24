
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
        DOS = new javax.swing.JTextField();
        SUMA = new javax.swing.JButton();
        RESTA = new javax.swing.JButton();
        MULTIPLICACION = new javax.swing.JButton();
        DIVISION = new javax.swing.JButton();
        RESUL = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SUMA.setText("+");
        SUMA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SUMAMouseClicked(evt);
            }
        });

        RESTA.setText("-");
        RESTA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RESTAMouseClicked(evt);
            }
        });

        MULTIPLICACION.setText("*");
        MULTIPLICACION.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MULTIPLICACIONMouseClicked(evt);
            }
        });

        DIVISION.setText("/");
        DIVISION.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DIVISIONMouseClicked(evt);
            }
        });

        jLabel1.setText("NUMERO 1");

        jLabel2.setText("NUMERO 2");

        jLabel3.setText("RESULTADO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UNO, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(DOS))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DIVISION)
                            .addComponent(MULTIPLICACION)
                            .addComponent(RESTA)
                            .addComponent(SUMA)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(RESUL, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SUMA)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(RESTA)))
                .addGap(18, 18, 18)
                .addComponent(MULTIPLICACION)
                .addGap(18, 18, 18)
                .addComponent(DIVISION)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RESUL, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SUMAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SUMAMouseClicked
        miCalculadora.num1=Double.parseDouble(UNO.getText());
     miCalculadora.num2=Double.parseDouble(DOS.getText());
     RESUL.setText(miCalculadora.sumar()+"");
    }//GEN-LAST:event_SUMAMouseClicked

    private void RESTAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RESTAMouseClicked
          miCalculadora.num1=Double.parseDouble(UNO.getText());
     miCalculadora.num2=Double.parseDouble(DOS.getText());
     RESUL.setText(miCalculadora.restar()+"");
    }//GEN-LAST:event_RESTAMouseClicked

    private void MULTIPLICACIONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MULTIPLICACIONMouseClicked
          miCalculadora.num1=Double.parseDouble(UNO.getText());
     miCalculadora.num2=Double.parseDouble(DOS.getText());
     RESUL.setText(miCalculadora.multiplicar()+"");
    }//GEN-LAST:event_MULTIPLICACIONMouseClicked

    private void DIVISIONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DIVISIONMouseClicked
         miCalculadora.num1=Double.parseDouble(UNO.getText());
     miCalculadora.num2=Double.parseDouble(DOS.getText());
     RESUL.setText(miCalculadora.dividir()+"");
    }//GEN-LAST:event_DIVISIONMouseClicked

    
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new presentacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DIVISION;
    private javax.swing.JTextField DOS;
    private javax.swing.JButton MULTIPLICACION;
    private javax.swing.JButton RESTA;
    private javax.swing.JTextField RESUL;
    private javax.swing.JButton SUMA;
    private javax.swing.JTextField UNO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
