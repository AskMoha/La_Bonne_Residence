/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_ibd_la_bonne_résidence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author mido1
 */
public class Annonces extends javax.swing.JFrame {

    /**
     * Creates new form Annonces
     */
    Statement statement;
    Statement stmnt;
    Statement stmnt2;
    Connexion maConnexion = new Connexion();
    ResultSet resultat;
    ResultSet resultatcontact;
    ResultSet resultatutilisateur;
    ResultSet resultatuti;

    public Annonces(int id_cli) {
        initComponents();
        ID_Client = id_cli; // id de la personne connectée 
        jButton1.doClick();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nom_Offre = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Mail_offre = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Num_offre = new javax.swing.JLabel();
        Prix_offre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Etat_offre = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Type_offre_offre = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Ville_offre_txt = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CP_Offre = new javax.swing.JLabel();
        Bouton_post = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(911, 483));
        setSize(new java.awt.Dimension(911, 483));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("La bonne residence ");

        jPanel1.setBackground(new java.awt.Color(250, 200, 200));

        jLabel2.setText("Objet :");

        jLabel3.setText("Prix :");

        Nom_Offre.setText("                 ");

        jLabel5.setText("Contact");

        jLabel6.setText("Mail :");

        Mail_offre.setText("            ");

        jLabel7.setText("Numero de telephone:");

        Num_offre.setText("                           ");

        Prix_offre.setText("                          ");

        jLabel4.setText("Etat:");

        Etat_offre.setText("                     ");

        jLabel8.setText("Type d'offre:");

        Type_offre_offre.setText("                        ");

        jButton1.setText("Annonce suivante");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Ville:");

        Ville_offre_txt.setText("                           ");

        jLabel11.setText("Code Postal:");

        CP_Offre.setText("             ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4)
                        .addGap(56, 56, 56)
                        .addComponent(Etat_offre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(33, 33, 33)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nom_Offre)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(Type_offre_offre)
                                            .addGap(183, 183, 183)
                                            .addComponent(jLabel7))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Prix_offre)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6))))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Ville_offre_txt)
                                    .addComponent(Num_offre)
                                    .addComponent(Mail_offre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(67, 67, 67)
                        .addComponent(CP_Offre)
                        .addGap(157, 157, 157))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Nom_Offre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mail_offre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6)
                        .addComponent(Prix_offre)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Num_offre)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Type_offre_offre))))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Etat_offre)
                    .addComponent(jLabel10)
                    .addComponent(Ville_offre_txt))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(CP_Offre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        Bouton_post.setText("Poster une annonce");
        Bouton_post.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton_postActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Cette annonce n'est pas disponible dans votre résidence, cliquez le sur bouton annonce suivante pour voir les autres annonces");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(Bouton_post))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(Bouton_post)
                .addGap(36, 36, 36)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String requete = "SELECT * FROM Offre";
        String requeteadres = "SELECT * FROM adresse";
        String requeteuti = "SELECT * FROM utilisateurs";
        try {
            statement = maConnexion.ObtenirConnexion().createStatement();
            resultatcontact = statement.executeQuery(requeteadres);
            ID_utilis = 0;
            while (ID_utilis != ID_Client) {
                resultatcontact.next();
                ID_utilis = resultatcontact.getInt("ID_Utilisateur");
            }
            Nom_Rue = resultatcontact.getString("Nom_Rue");//
            code_postal_utilis = resultatcontact.getInt("CP");
        } catch (SQLException ex) {
            System.out.println("Erreur : " + ex);
        }

        try {
            // la même chose qu'en haut pour l'offre cette fois ci puis on compare si c'est la meme rue on affiche l'annonce sinon non
            //on commence par recuprer l'id du client qui a mit l'offre
            statement = maConnexion.ObtenirConnexion().createStatement();
            resultatuti = statement.executeQuery(requete);
            execution2++;
            for (int i = 0; i < execution2; i++) {
                resultatuti.next();
                ID_offre = resultatuti.getInt("ID_Utilisateur");// on a recuperer l'id du gars qui a mis l'offre on va chercher l'adresse dans la table adresse}
            }
            if (resultatuti.next() == false) { // permet de retourner au debut quand on arrive a la dernere annonce
                execution2 = 0;
                prochain = 1;
            }
            stmnt = maConnexion.ObtenirConnexion().createStatement();
            resultatutilisateur = stmnt.executeQuery(requeteadres);
            resultatutilisateur.next();
            ID_utilis = resultatutilisateur.getInt("ID_Utilisateur");
            while (ID_utilis != ID_offre) {
                resultatutilisateur.next();
                ID_utilis = resultatutilisateur.getInt("ID_Utilisateur");
            }
            Nom_Rue_Utilis = resultatutilisateur.getString("Nom_Rue");
            code_postal_offre2 = resultatutilisateur.getInt("CP");
        } catch (SQLException ex) {
            System.out.println("z : " + ex);
        }
        execution++;
        if (Nom_Rue.equalsIgnoreCase(Nom_Rue_Utilis) && code_postal_offre2 == code_postal_utilis) {
            try {
                statement = maConnexion.ObtenirConnexion().createStatement();
                stmnt = maConnexion.ObtenirConnexion().createStatement();
                stmnt2 = maConnexion.ObtenirConnexion().createStatement();
                resultat = statement.executeQuery(requete);
                resultatuti = stmnt.executeQuery(requeteadres);
                resultatutilisateur = stmnt2.executeQuery(requeteuti);

                for (int i = 0; i < execution; i++) {
                    resultat.next();
                }
                Titre = resultat.getString("Titre");
                type_offre = resultat.getInt("type_offre");
                prix = resultat.getInt("Prix");
                etat = resultat.getInt("Etat");
                ID_offre = resultat.getInt("ID_Utilisateur");
                id_offre_actuelle = resultat.getInt("id_offre");
                Nom_Offre.setText(Titre);
                resultatuti.next();
                resultatutilisateur.next();
                ID_utilis = resultatuti.getInt("ID_Utilisateur");
                while (ID_utilis != ID_offre) {
                    resultatuti.next();
                    resultatutilisateur.next();
                    ID_utilis = resultatuti.getInt("ID_Utilisateur");
                }
                Mail_offre.setText(resultatutilisateur.getString("mail"));
                Num_offre.setText(String.valueOf("0" + resultatutilisateur.getInt("Numero_tele")));
                CP_Offre.setText(String.valueOf(resultatuti.getInt("CP")));
                Ville_offre_txt.setText(resultatuti.getString("ville"));
                jLabel9.setVisible(false);
                if (resultat.next() == false) { // permet de retourner au debut quand on arrive a la dernere annonce
                    execution = 0;
                }
                if (type_offre == 1) {
                    Type_offre_offre.setText("Bien");
                } else {
                    Type_offre_offre.setText("Service");
                }
                Prix_offre.setText(String.valueOf(prix) + " €");
                if (etat > 75) {
                    Etat_offre.setText("Neuf ou quasiment neuf");
                }
                if (etat <= 75 && etat > 50) {
                    Etat_offre.setText("Bon état");
                }
                if (etat <= 50 && etat > 25) {
                    Etat_offre.setText("Bof");
                }
                if (etat <= 25) {
                    Etat_offre.setText("Pas ouf");
                }
            } catch (SQLException ex) {
                System.out.println("Erreur annonce : " + ex);
            }
        } else {
            jLabel9.setVisible(true);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void Bouton_postActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton_postActionPerformed
        new Ajout_annonce(ID_Client).setVisible(true);
    }//GEN-LAST:event_Bouton_postActionPerformed

    /**
     * @param args the command line arguments
     */
    int ID_Client;
    String Titre;
    int type_offre;
    int prix;
    int etat;
    String Nom_Rue = " ";
    String Nom_Rue_Utilis = "dif";
    int ID_utilis;
    int execution = 0;
    int ID_offre;
    int Code_Postal_Offre;
    String ville_offre;
    int execution2 = 0;
    int code_postal_utilis = 0;
    int code_postal_offre2 = 0;
    int prochain = 0;
    int id_derniere_offre = 0;
    int id_offre_actuelle = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bouton_post;
    private javax.swing.JLabel CP_Offre;
    private javax.swing.JLabel Etat_offre;
    private javax.swing.JLabel Mail_offre;
    private javax.swing.JLabel Nom_Offre;
    private javax.swing.JLabel Num_offre;
    private javax.swing.JLabel Prix_offre;
    private javax.swing.JLabel Type_offre_offre;
    private javax.swing.JLabel Ville_offre_txt;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
