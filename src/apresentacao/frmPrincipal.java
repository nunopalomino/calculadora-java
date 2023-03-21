package apresentacao;

import modelo.Controle;


public class frmPrincipal extends javax.swing.JDialog
{

    public frmPrincipal(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblPrimeiroNumero = new javax.swing.JLabel();
        lblSegundoNumero = new javax.swing.JLabel();
        txfPrimeiroNumero = new javax.swing.JTextField();
        txfSegundoNumero = new javax.swing.JTextField();
        btnSomar = new javax.swing.JButton();
        btnSubtrair = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblPrimeiroNumero.setText("Digite o primeiro número:");

        lblSegundoNumero.setText("Digite o segundo número:");

        btnSomar.setText("Somar");
        btnSomar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSomarActionPerformed(evt);
            }
        });

        btnSubtrair.setText("Subtrair");
        btnSubtrair.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSubtrairActionPerformed(evt);
            }
        });

        btnMultiplicar.setText("Multiplicar");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnDividir.setText("Dividir");
        btnDividir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDividirActionPerformed(evt);
            }
        });

        lblResultado.setText("Resultado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSomar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPrimeiroNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfPrimeiroNumero))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSegundoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfSegundoNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                    .addComponent(btnSubtrair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrimeiroNumero)
                    .addComponent(txfPrimeiroNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfSegundoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSegundoNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSomar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubtrair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMultiplicar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDividir)
                .addGap(18, 18, 18)
                .addComponent(lblResultado)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSomarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSomarActionPerformed
    {//GEN-HEADEREND:event_btnSomarActionPerformed
        calcular("+");
    }//GEN-LAST:event_btnSomarActionPerformed

    private void btnSubtrairActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSubtrairActionPerformed
    {//GEN-HEADEREND:event_btnSubtrairActionPerformed
        calcular("-");
    }//GEN-LAST:event_btnSubtrairActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMultiplicarActionPerformed
    {//GEN-HEADEREND:event_btnMultiplicarActionPerformed
        calcular("*");
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDividirActionPerformed
    {//GEN-HEADEREND:event_btnDividirActionPerformed
        calcular("/");
    }//GEN-LAST:event_btnDividirActionPerformed

    private void calcular(String operacao)
    {
        Controle controle = new Controle();
        controle.numero1 = txfPrimeiroNumero.getText();
        controle.numero2 = txfSegundoNumero.getText();
        controle.operacao = operacao;
        controle.executar();
        lblResultado.setText("Resultado: " + controle.resultado);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmPrincipal dialog = new frmPrincipal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnSomar;
    private javax.swing.JButton btnSubtrair;
    private javax.swing.JLabel lblPrimeiroNumero;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSegundoNumero;
    private javax.swing.JTextField txfPrimeiroNumero;
    private javax.swing.JTextField txfSegundoNumero;
    // End of variables declaration//GEN-END:variables
}
