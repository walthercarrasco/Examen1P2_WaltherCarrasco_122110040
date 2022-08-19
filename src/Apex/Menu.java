
package Apex;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Walther Carrasco
 */
public class Menu extends javax.swing.JFrame {

    public Menu(ArrayList<Usuario> usuarios, ArrayList<Arma> armas, ArrayList<Personajes> personajes, Usuario jugador) {
        this.jugador = jugador;
        this.personajes = personajes;
        this.armas = armas;
        this.usuarios = usuarios;
        initComponents();
        this.setLocationRelativeTo(null);
        cb_personajes.removeAllItems();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_personajes.getModel();
        for (Personajes personaje : personajes) {
            modelo.addElement(personaje);
        }
        cb_personajes.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tp_menu = new javax.swing.JTabbedPane();
        p_seleccionar = new javax.swing.JPanel();
        cb_personajes = new javax.swing.JComboBox<>();
        b_seleccionar = new javax.swing.JButton();
        lb_usuario = new javax.swing.JLabel();
        tf_mostrarusuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        p_jugar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        b_comenzar = new javax.swing.JButton();
        tf_atacar = new javax.swing.JTextField();
        b_atacar = new javax.swing.JButton();
        p_crear = new javax.swing.JPanel();
        lb_nombre = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        lb_vida = new javax.swing.JLabel();
        tf_vida = new javax.swing.JTextField();
        lb_tipo = new javax.swing.JLabel();
        cb_tipo = new javax.swing.JComboBox<>();
        lb_escudo = new javax.swing.JLabel();
        tf_escudo = new javax.swing.JTextField();
        lb_arma = new javax.swing.JLabel();
        cb_arma = new javax.swing.JComboBox<>();
        lb_crear = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tf_nombrearma = new javax.swing.JTextField();
        lb_presicion = new javax.swing.JLabel();
        tf_presicion = new javax.swing.JTextField();
        tf_dano = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        b_creararma = new javax.swing.JButton();
        b_crear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");

        tp_menu.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        tp_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tp_menuMouseClicked(evt);
            }
        });

        cb_personajes.setBackground(new java.awt.Color(204, 204, 204));
        cb_personajes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cb_personajes.setForeground(new java.awt.Color(0, 0, 0));

        b_seleccionar.setBackground(new java.awt.Color(0, 153, 153));
        b_seleccionar.setForeground(new java.awt.Color(0, 0, 0));
        b_seleccionar.setText("Selecionar Personaje");
        b_seleccionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_seleccionarMouseClicked(evt);
            }
        });

        lb_usuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lb_usuario.setText("Usuario: ");

        tf_mostrarusuario.setForeground(new java.awt.Color(0, 0, 0));
        tf_mostrarusuario.setText(""+jugador.getNombre());

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("UserID:");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setText(""+jugador.getID());

        javax.swing.GroupLayout p_seleccionarLayout = new javax.swing.GroupLayout(p_seleccionar);
        p_seleccionar.setLayout(p_seleccionarLayout);
        p_seleccionarLayout.setHorizontalGroup(
            p_seleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_seleccionarLayout.createSequentialGroup()
                .addGroup(p_seleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_seleccionarLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(p_seleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_personajes, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(p_seleccionarLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(p_seleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(p_seleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_mostrarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        p_seleccionarLayout.setVerticalGroup(
            p_seleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_seleccionarLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(cb_personajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(b_seleccionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addGroup(p_seleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_mostrarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p_seleccionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        tp_menu.addTab("Seleccionar", p_seleccionar);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        b_comenzar.setText("Comenzar");

        b_atacar.setText("Atacar");

        javax.swing.GroupLayout p_jugarLayout = new javax.swing.GroupLayout(p_jugar);
        p_jugar.setLayout(p_jugarLayout);
        p_jugarLayout.setHorizontalGroup(
            p_jugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_jugarLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(p_jugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_comenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p_jugarLayout.createSequentialGroup()
                        .addComponent(tf_atacar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_atacar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        p_jugarLayout.setVerticalGroup(
            p_jugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_jugarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(b_comenzar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p_jugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_atacar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_atacar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        tp_menu.addTab("Jugar", p_jugar);

        p_crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_crearMouseClicked(evt);
            }
        });

        lb_nombre.setText("Nombre");

        lb_vida.setText("Vida");

        lb_tipo.setText("Tipo");

        lb_escudo.setText("Escudo");

        lb_arma.setText("Arma");

        lb_crear.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lb_crear.setForeground(new java.awt.Color(0, 0, 0));
        lb_crear.setText("Crear Arma");

        jLabel1.setText("Nombre");

        lb_presicion.setText("Presicion");

        tf_dano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_danoActionPerformed(evt);
            }
        });

        jLabel2.setText("Daño");

        b_creararma.setBackground(new java.awt.Color(0, 153, 153));
        b_creararma.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        b_creararma.setForeground(new java.awt.Color(0, 0, 0));
        b_creararma.setText("Crear Arma");

        b_crear.setBackground(new java.awt.Color(0, 153, 153));
        b_crear.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        b_crear.setForeground(new java.awt.Color(0, 0, 0));
        b_crear.setText("Crear Personaje");

        javax.swing.GroupLayout p_crearLayout = new javax.swing.GroupLayout(p_crear);
        p_crear.setLayout(p_crearLayout);
        p_crearLayout.setHorizontalGroup(
            p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_crearLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tf_escudo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                        .addComponent(lb_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_nombre, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(lb_escudo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p_crearLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lb_crear, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_nombrearma))
                            .addComponent(tf_dano, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_crearLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(b_creararma, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p_crearLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(p_crearLayout.createSequentialGroup()
                                .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_vida, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_vida, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(p_crearLayout.createSequentialGroup()
                                .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_arma, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_arma, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_presicion, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_presicion, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b_crear)))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        p_crearLayout.setVerticalGroup(
            p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_crearLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nombre)
                    .addComponent(lb_vida)
                    .addComponent(lb_tipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_vida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_escudo)
                    .addComponent(lb_arma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_escudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_arma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_crear))
                .addGap(44, 44, 44)
                .addComponent(lb_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lb_presicion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombrearma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_presicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_dano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_creararma))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        tp_menu.addTab("Crear", p_crear);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(tp_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(tp_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_seleccionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_seleccionarMouseClicked
        
    }//GEN-LAST:event_b_seleccionarMouseClicked

    private void tf_danoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_danoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_danoActionPerformed

    private void p_crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_crearMouseClicked

    }//GEN-LAST:event_p_crearMouseClicked

    private void tp_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tp_menuMouseClicked
        cb_arma.removeAllItems();
        DefaultComboBoxModel modeloarma = (DefaultComboBoxModel) cb_arma.getModel();
        for (Arma arma : armas) {
            modeloarma.addElement(arma.getNombre());
        }
        cb_arma.setModel(modeloarma);        
    }//GEN-LAST:event_tp_menuMouseClicked


    ArrayList<Usuario> usuarios = new ArrayList<>();
    ArrayList<Arma> armas = new ArrayList<>();
    ArrayList<Personajes> personajes = new ArrayList<>(); 
    Usuario jugador;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_atacar;
    private javax.swing.JButton b_comenzar;
    private javax.swing.JButton b_crear;
    private javax.swing.JButton b_creararma;
    private javax.swing.JButton b_seleccionar;
    private javax.swing.JComboBox<String> cb_arma;
    private javax.swing.JComboBox<String> cb_personajes;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lb_arma;
    private javax.swing.JLabel lb_crear;
    private javax.swing.JLabel lb_escudo;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_presicion;
    private javax.swing.JLabel lb_tipo;
    private javax.swing.JLabel lb_usuario;
    private javax.swing.JLabel lb_vida;
    private javax.swing.JPanel p_crear;
    private javax.swing.JPanel p_jugar;
    private javax.swing.JPanel p_seleccionar;
    private javax.swing.JTextField tf_atacar;
    private javax.swing.JTextField tf_dano;
    private javax.swing.JTextField tf_escudo;
    private javax.swing.JLabel tf_mostrarusuario;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombrearma;
    private javax.swing.JTextField tf_presicion;
    private javax.swing.JTextField tf_vida;
    private javax.swing.JTabbedPane tp_menu;
    // End of variables declaration//GEN-END:variables
}
