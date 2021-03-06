/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.consultas;

/**
 *
 * @author luansinh0
 */
public class FrmPets extends javax.swing.JFrame {

    /**
     * Creates new form FrmPets
     */
    public FrmPets() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpnId = new javax.swing.JPanel();
        JtfId = new javax.swing.JTextField();
        JpnDono = new javax.swing.JPanel();
        JcmbDono = new javax.swing.JComboBox<>();
        JpnNomeDoPet = new javax.swing.JPanel();
        JtfNomeDoPet = new javax.swing.JTextField();
        JpnEspecie = new javax.swing.JPanel();
        JcmbEspecie = new javax.swing.JComboBox<>();
        JpnSexo = new javax.swing.JPanel();
        JcmbSexo = new javax.swing.JComboBox<>();
        JpnDtNascimento = new javax.swing.JPanel();
        JtfDtNascimento = new javax.swing.JTextField();
        JbtnListar = new javax.swing.JButton();
        JbtnSair = new javax.swing.JButton();
        JbtnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JpnId.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));

        javax.swing.GroupLayout JpnIdLayout = new javax.swing.GroupLayout(JpnId);
        JpnId.setLayout(JpnIdLayout);
        JpnIdLayout.setHorizontalGroup(
            JpnIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnIdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfId)
                .addContainerGap())
        );
        JpnIdLayout.setVerticalGroup(
            JpnIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnIdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JpnDono.setBorder(javax.swing.BorderFactory.createTitledBorder("Dono"));

        javax.swing.GroupLayout JpnDonoLayout = new javax.swing.GroupLayout(JpnDono);
        JpnDono.setLayout(JpnDonoLayout);
        JpnDonoLayout.setHorizontalGroup(
            JpnDonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnDonoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JcmbDono, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JpnDonoLayout.setVerticalGroup(
            JpnDonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpnDonoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JcmbDono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JpnNomeDoPet.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome do pet"));

        javax.swing.GroupLayout JpnNomeDoPetLayout = new javax.swing.GroupLayout(JpnNomeDoPet);
        JpnNomeDoPet.setLayout(JpnNomeDoPetLayout);
        JpnNomeDoPetLayout.setHorizontalGroup(
            JpnNomeDoPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnNomeDoPetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfNomeDoPet)
                .addContainerGap())
        );
        JpnNomeDoPetLayout.setVerticalGroup(
            JpnNomeDoPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnNomeDoPetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfNomeDoPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JpnEspecie.setBorder(javax.swing.BorderFactory.createTitledBorder("Esp??cie"));

        javax.swing.GroupLayout JpnEspecieLayout = new javax.swing.GroupLayout(JpnEspecie);
        JpnEspecie.setLayout(JpnEspecieLayout);
        JpnEspecieLayout.setHorizontalGroup(
            JpnEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnEspecieLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JcmbEspecie, 0, 366, Short.MAX_VALUE)
                .addContainerGap())
        );
        JpnEspecieLayout.setVerticalGroup(
            JpnEspecieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpnEspecieLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JcmbEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JpnSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        JcmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Macho", "F??mea" }));

        javax.swing.GroupLayout JpnSexoLayout = new javax.swing.GroupLayout(JpnSexo);
        JpnSexo.setLayout(JpnSexoLayout);
        JpnSexoLayout.setHorizontalGroup(
            JpnSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnSexoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JcmbSexo, 0, 366, Short.MAX_VALUE)
                .addContainerGap())
        );
        JpnSexoLayout.setVerticalGroup(
            JpnSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpnSexoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JcmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JpnDtNascimento.setBorder(javax.swing.BorderFactory.createTitledBorder("Dt. de nascimento"));

        javax.swing.GroupLayout JpnDtNascimentoLayout = new javax.swing.GroupLayout(JpnDtNascimento);
        JpnDtNascimento.setLayout(JpnDtNascimentoLayout);
        JpnDtNascimentoLayout.setHorizontalGroup(
            JpnDtNascimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnDtNascimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfDtNascimento)
                .addContainerGap())
        );
        JpnDtNascimentoLayout.setVerticalGroup(
            JpnDtNascimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnDtNascimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JtfDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JbtnListar.setText("Listar");

        JbtnSair.setText("Sair");
        JbtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnSairActionPerformed(evt);
            }
        });

        JbtnLimpar.setText("Limpar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JpnId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpnDono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpnNomeDoPet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpnEspecie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpnSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpnDtNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JbtnListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JbtnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JbtnSair)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JpnId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpnDono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpnNomeDoPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpnEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpnSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpnDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbtnSair)
                    .addComponent(JbtnLimpar)
                    .addComponent(JbtnListar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnSairActionPerformed
        dispose();
    }//GEN-LAST:event_JbtnSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced iJpnDono SE 6) is not available, stay with the default look and feel.
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
            java.util.logging.Logger.getLogger(FrmPets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnLimpar;
    private javax.swing.JButton JbtnListar;
    private javax.swing.JButton JbtnSair;
    private javax.swing.JComboBox<String> JcmbDono;
    private javax.swing.JComboBox<String> JcmbEspecie;
    private javax.swing.JComboBox<String> JcmbSexo;
    private javax.swing.JPanel JpnDono;
    private javax.swing.JPanel JpnDtNascimento;
    private javax.swing.JPanel JpnEspecie;
    private javax.swing.JPanel JpnId;
    private javax.swing.JPanel JpnNomeDoPet;
    private javax.swing.JPanel JpnSexo;
    private javax.swing.JTextField JtfDtNascimento;
    private javax.swing.JTextField JtfId;
    private javax.swing.JTextField JtfNomeDoPet;
    // End of variables declaration//GEN-END:variables
}
