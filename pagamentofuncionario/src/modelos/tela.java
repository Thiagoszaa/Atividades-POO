/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modelos;

import visao.Pagamento;

/**
 *
 * @author Thiago
 */
public class tela extends javax.swing.JFrame {

    /**
     * Creates new form tela
     */
    public tela() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5nomeCompleto = new javax.swing.JLabel();
        jLabel6salarioBase = new javax.swing.JLabel();
        jLabel7numeroDependentes = new javax.swing.JLabel();
        jLabel8matriculaFuncionario = new javax.swing.JLabel();
        jLabel9produçao = new javax.swing.JLabel();
        jTextField1nomeCompleto = new javax.swing.JTextField();
        jTextField2salarioBase = new javax.swing.JTextField();
        jTextField3matricula = new javax.swing.JTextField();
        jTextField4producao = new javax.swing.JTextField();
        jTextField5numerodependentes = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1calcularSalario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1resultados = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("___________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Pagamentos TTG Online");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-pagamento-50.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Informações Funcionarios");

        jLabel5nomeCompleto.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel5nomeCompleto.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5nomeCompleto.setText("Nome Completo:");

        jLabel6salarioBase.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel6salarioBase.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6salarioBase.setText("Salário Base:");

        jLabel7numeroDependentes.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel7numeroDependentes.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7numeroDependentes.setText("Número Dependentes:");

        jLabel8matriculaFuncionario.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel8matriculaFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8matriculaFuncionario.setText("Matricula Funcionario:");

        jLabel9produçao.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel9produçao.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9produçao.setText("Produção:");

        jTextField1nomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1nomeCompletoActionPerformed(evt);
            }
        });

        jTextField3matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3matriculaActionPerformed(evt);
            }
        });

        jTextField5numerodependentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5numerodependentesActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-businesswoman-94.png"))); // NOI18N

        jButton1calcularSalario.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jButton1calcularSalario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-moedas-64.png"))); // NOI18N
        jButton1calcularSalario.setText("Calcular ");
        jButton1calcularSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1calcularSalarioActionPerformed(evt);
            }
        });

        jTextArea1resultados.setColumns(20);
        jTextArea1resultados.setRows(5);
        jScrollPane1.setViewportView(jTextArea1resultados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(568, 568, 568)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(432, 432, 432)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7numeroDependentes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5numerodependentes, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6salarioBase)
                                    .addComponent(jLabel5nomeCompleto)
                                    .addComponent(jLabel8matriculaFuncionario)
                                    .addComponent(jLabel9produçao))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2salarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4producao, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1nomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(83, 83, 83)
                                .addComponent(jButton1calcularSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(462, 462, 462)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5nomeCompleto)
                            .addComponent(jTextField1nomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8matriculaFuncionario)
                            .addComponent(jTextField3matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6salarioBase)
                            .addComponent(jTextField2salarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9produçao)
                            .addComponent(jTextField4producao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1calcularSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7numeroDependentes)
                    .addComponent(jTextField5numerodependentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1nomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1nomeCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1nomeCompletoActionPerformed

    private void jTextField3matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3matriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3matriculaActionPerformed

    private void jTextField5numerodependentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5numerodependentesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5numerodependentesActionPerformed

    private void jButton1calcularSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1calcularSalarioActionPerformed
        // TODO add your handling code here:
        
        try{
            String nome = jTextField1nomeCompleto.getText();
            int matricula  = Integer.parseInt(jTextField3matricula.getText());
            int numeroDependentes = Integer.parseInt(jTextField5numerodependentes.getText());
            float salarioBase = Float.parseFloat(jTextField2salarioBase.getText());
            int producaoItem = Integer.parseInt(jTextField4producao.getText());
            
            Pagamento funcionario = new Pagamento (nome, matricula, numeroDependentes , salarioBase, producaoItem);
            
            funcionario.setNomeFuncionario(nome);
            funcionario.setMatriculaFuncionario(matricula);        
            funcionario.setNumeroDependentes(numeroDependentes);
            funcionario.setSalarioBase(salarioBase);
            funcionario.setProducaoItem(producaoItem);
            
            
            String saida = "Pagamento GYN ALIMENTOS \n";
            saida += "DADOS DE PAGAMENTO \n";
            saida += "Nome funcionário: " + funcionario.getNomeFuncionario() + "\n";
            saida += "Matrícula funcionário: " + funcionario.getMatriculaFuncionario() + "\n";
            saida += "Número de dependentes: " + funcionario.getNumeroDependentes() + "\n";
            saida += "Salário Base: " + String.format("%.2f", funcionario.getSalarioBase()) + "\n";
            saida += "Valor gratificação: " + String.format("%.2f", funcionario.calcularGratificacao()) + "\n";
            saida += "Salário bruto: " + String.format("%.2f", funcionario.calcularSalarioBruto()) + "\n";
            saida += "Valor desconto por filhos: " + String.format("%.2f", funcionario.calcularDescontoDependentes()) + "\n";
            saida += "Valor desconto do INSS: " + String.format("%.2f", funcionario.calcularDescontoInss()) + "\n";
            saida += "Valor desconto IRPF: " + String.format("%.2f", funcionario.calcularDescontoIrpf()) + "\n";
            saida += "Salário líquido: " + String.format("%.2f", funcionario.calcularSalarioLiquido()) + "\n";
            
             jTextArea1resultados.setText(saida);
                    
            } catch (Exception e) {
                
            }
       
    }//GEN-LAST:event_jButton1calcularSalarioActionPerformed

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
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1calcularSalario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel5nomeCompleto;
    private javax.swing.JLabel jLabel6salarioBase;
    private javax.swing.JLabel jLabel7numeroDependentes;
    private javax.swing.JLabel jLabel8matriculaFuncionario;
    private javax.swing.JLabel jLabel9produçao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1resultados;
    private javax.swing.JTextField jTextField1nomeCompleto;
    private javax.swing.JTextField jTextField2salarioBase;
    private javax.swing.JTextField jTextField3matricula;
    private javax.swing.JTextField jTextField4producao;
    private javax.swing.JTextField jTextField5numerodependentes;
    // End of variables declaration//GEN-END:variables
}
