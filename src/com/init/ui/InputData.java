/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.init.ui;

import com.init.biara.Biara;
import com.init.tools.DaoFactory;
import com.init.tools.Session;
import com.ypii.suster.Suster;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import com.init.ui.AggotaKeluargaUI;
import java.util.List;

/**
 *
 * @author laravel
 */
public class InputData extends javax.swing.JFrame {

    /**
     * Creates new form InputData
     */
    public InputData() {
        initComponents();
        setLocationRelativeTo(null);
        initApp();
    }

    private void initApp() {
        combobiara.removeAllItems();
        List<Biara> b = DaoFactory.getBiaraDao().getAllBiara();
        for (Biara biara : b) {
            combobiara.addItem(biara.getNamaBiara());
        }
        if (Session.getSuster() == null) {
            Date now = (Date) GregorianCalendar.getInstance().getTime();
            tglBaptisDate.setDate(now);
            tglKaulKekalDate.setDate(now);
            tglKaulSementaraDate.setDate(now);
            tglKeluarDate.setDate(null);
            tglKrismaDate.setDate(now);
            tglLahirDate.setDate(now);
            tglMasukBiaraDate.setDate(now);
            tglMasukLagiDate.setDate(null);
            tglMasukNovisiatDate.setDate(now);
            tglMasukPostulatdate.setDate(now);
            tglWafatDate.setDate(null);
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Suster suster = Session.getSuster();
            System.out.println(suster.getNamaSuster());
            txtInduk.setText(suster.getNoInduk());
            txtNamaSuster.setText(suster.getNamaSuster());
            txtNamaAsli.setText(suster.getNamaAsli());
            txtNamaBaru.setText(suster.getNamaBaru());
            txtTempatLahir.setText(suster.getTempatLahir());
            try {
                tglLahirDate.setDate(sdf.parse(suster.getTglLahir()));
            } catch (ParseException ex) {
                Logger.getLogger(InputData.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtNamaBaptis.setText(suster.getNamaBaptis());
            txtTempatBaptis.setText(suster.getTempatBaptis());
            try {
                tglBaptisDate.setDate(sdf.parse(suster.getTglBaptis()));
            } catch (ParseException ex) {
                Logger.getLogger(InputData.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtNoSuratBaptis.setText(suster.getNoSuratBaptis());
            txtTempatKrisma.setText(suster.getTempatKrisma());
            try {
                tglKrismaDate.setDate(sdf.parse(suster.getTglKrisma()));
            } catch (ParseException ex) {
                Logger.getLogger(InputData.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtNoSuratKrisma.setText(suster.getNoSuratKrisma());
            txtSuratKelahiran.setText(suster.getTtsSuratKelahiran());
            txtSuratWNI.setText(suster.getTtsSuratWNI());
            txtGantiNama.setText(suster.getTtsGantiNama());
            try {
                tglMasukBiaraDate.setDate(sdf.parse(suster.getTglMasukBiara()));
                tglMasukPostulatdate.setDate(sdf.parse(suster.getTglMasukPostulat()));
                tglMasukNovisiatDate.setDate(sdf.parse(suster.getTglMasukNovisiat()));
                tglKaulSementaraDate.setDate(sdf.parse(suster.getTglKaulSementara()));
                tglKaulKekalDate.setDate(sdf.parse(suster.getTglKaulKekal()));
                tglKeluarDate.setDate(sdf.parse(suster.getTglKeluar()));
                tglMasukLagiDate.setDate(sdf.parse(suster.getTglMasukKembali()));
                tglWafatDate.setDate(sdf.parse(suster.getTglWafat()));
            } catch (ParseException ex) {
                Logger.getLogger(InputData.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtFoto.setText(suster.getFoto());
            txtRiwayatSebelum.setText(suster.getRiwayatSebelumMembiara());
            txtLain.setText(suster.getLainLain());
            txtkmb.setText(suster.getKotamasukbiara());
            txtkmp.setText(suster.getKotapostulat());
            txtkmn.setText(suster.getKotanovisiat());
            txtkks.setText(suster.getKotasementara());
            txtkkk.setText(suster.getKotakaulkekal());
            combobiara.setSelectedItem(suster.getBiara().getNamaBiara().toString());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLain = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtInduk = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNamaSuster = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNamaAsli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNamaBaru = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTempatLahir = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tglLahirDate = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txtSuratKelahiran = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNamaBaptis = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTempatBaptis = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNoSuratBaptis = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtTempatKrisma = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tglKrismaDate = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        txtNoSuratKrisma = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtSuratWNI = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtGantiNama = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tglMasukBiaraDate = new com.toedter.calendar.JDateChooser();
        tglMasukPostulatdate = new com.toedter.calendar.JDateChooser();
        tglMasukNovisiatDate = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        tglKaulSementaraDate = new com.toedter.calendar.JDateChooser();
        jLabel22 = new javax.swing.JLabel();
        tglKaulKekalDate = new com.toedter.calendar.JDateChooser();
        jLabel23 = new javax.swing.JLabel();
        tglKeluarDate = new com.toedter.calendar.JDateChooser();
        jLabel24 = new javax.swing.JLabel();
        tglMasukLagiDate = new com.toedter.calendar.JDateChooser();
        jLabel25 = new javax.swing.JLabel();
        tglWafatDate = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRiwayatSebelum = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tglBaptisDate = new com.toedter.calendar.JDateChooser();
        jLabel28 = new javax.swing.JLabel();
        txtFoto = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        combobiara = new javax.swing.JComboBox<>();
        txtkmb = new javax.swing.JTextField();
        txtkmp = new javax.swing.JTextField();
        txtkmn = new javax.swing.JTextField();
        txtkks = new javax.swing.JTextField();
        txtkkk = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENAMBAH DATA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Isian"));

        txtLain.setColumns(20);
        txtLain.setLineWrap(true);
        txtLain.setRows(5);
        jScrollPane2.setViewportView(txtLain);

        jLabel2.setText("No. Induk");

        jLabel3.setText("Nama Suster");

        jLabel4.setText("Nama Asli");

        jLabel5.setText("Nama Baru");

        jLabel6.setText("Tempat Lahir");

        jLabel7.setText("Tanggal Lahir");

        jLabel8.setText("Tempat, Tgl, No Surat Kelahiran ");

        jLabel9.setText("Nama Baptis");

        jLabel10.setText("Tempat Baptis");

        jLabel11.setText("No. Srt. Baptis");

        jLabel13.setText("Tempat Krisma");

        jLabel14.setText("Tgl. Krisma");

        jLabel15.setText("No. Srt. Krisma");

        jLabel16.setText("Tempat, Tgl, No. Surat WNI");

        jLabel17.setText("Tempat, Tgl, No. Surat Ganti Nama");

        jLabel18.setText("Masuk Biara");

        jLabel19.setText("Masuk Postulat");

        jLabel20.setText("Masuk Novisiat");

        jLabel21.setText("Kaul Sementara");

        jLabel22.setText("Kaul Kekal");

        jLabel23.setText("Keluar");

        jLabel24.setText("Masuk Kembali");

        jLabel25.setText("Wafat");

        jLabel26.setText("Foto");

        txtRiwayatSebelum.setColumns(20);
        txtRiwayatSebelum.setLineWrap(true);
        txtRiwayatSebelum.setRows(5);
        jScrollPane1.setViewportView(txtRiwayatSebelum);

        jLabel27.setText("Lain-lain");

        jLabel12.setText("Tanggal Baptis");

        jLabel28.setText("Riwayat Hidup Sebelum di Biara");

        txtFoto.setEditable(false);

        jButton7.setText("File");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel29.setText("Biara");

        combobiara.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(29, 29, 29))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel27))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(46, 46, 46)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tglBaptisDate, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tglKrismaDate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamaBaptis, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                            .addComponent(tglLahirDate, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtInduk, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(combobiara, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtNamaSuster)
                            .addComponent(txtNamaAsli)
                            .addComponent(txtNamaBaru)
                            .addComponent(txtTempatLahir)
                            .addComponent(txtNoSuratKrisma)
                            .addComponent(txtTempatKrisma)
                            .addComponent(txtNoSuratBaptis)
                            .addComponent(txtTempatBaptis)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26))
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtkmb, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtkmn)
                                            .addComponent(txtkmp)
                                            .addComponent(txtkks)
                                            .addComponent(txtkkk))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtFoto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tglWafatDate, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tglMasukLagiDate, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tglKeluarDate, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tglKaulKekalDate, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tglKaulSementaraDate, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tglMasukNovisiatDate, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tglMasukPostulatdate, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtSuratKelahiran, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSuratWNI, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGantiNama, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tglMasukBiaraDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)))))
                    .addComponent(jLabel28)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tglBaptisDate, tglKrismaDate, tglLahirDate});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtkkk, txtkks, txtkmb, txtkmn, txtkmp});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(txtInduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtSuratKelahiran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(combobiara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(txtNamaSuster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtSuratWNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(txtNamaAsli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtGantiNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(txtNamaBaru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(tglMasukBiaraDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(txtTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(tglMasukPostulatdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(tglLahirDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(tglMasukNovisiatDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkmn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9)
                    .addComponent(txtNamaBaptis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(tglKaulSementaraDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10)
                    .addComponent(txtTempatBaptis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(tglKaulKekalDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkkk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel11)
                    .addComponent(txtNoSuratBaptis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(tglKeluarDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel24)
                    .addComponent(tglMasukLagiDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(tglBaptisDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel25)
                    .addComponent(tglWafatDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTempatKrisma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel14)
                    .addComponent(tglKrismaDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(txtFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel15)
                    .addComponent(txtNoSuratKrisma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton7, txtFoto});

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Riwayat Pendidikan Formal");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Riwayat Pendidikan Non Formal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Riwayat Kerja");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Data Keluarga");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Suster cek = DaoFactory.getSusterDao().getSusterByInduk(txtInduk.getText());
        if (cek == null) {
            if (!"".equals(txtInduk.getText()) && !"".equals(txtNamaSuster.getText())) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String noInduk = txtInduk.getText(); //2
            String namaSuster = txtNamaSuster.getText(); //3
            String namaAsli = txtNamaAsli.getText(); //4
            String namaBaru = txtNamaBaru.getText(); //5
            String tempatLahir = txtTempatLahir.getText(); //6
            String tglLahir;
            if (tglLahirDate.getDate() != null) {
                tglLahir = sdf.format(tglLahirDate.getDate()); //7   
            } else {
                tglLahir = "9999-99-99";
            }
            String namaBaptis = txtNamaBaptis.getText(); //8
            String tempatBpatis = txtTempatBaptis.getText(); //9
            String tglBaptis;
            if (tglBaptisDate.getDate() != null) {
                tglBaptis = sdf.format(tglBaptisDate.getDate()); //10    
            } else {
                tglBaptis = "9999-99-99";
            }
            String noSuratBaptis = txtNoSuratBaptis.getText(); //11
            String tempatKrisma = txtTempatKrisma.getText();//12
            String tglKrisma = sdf.format(tglKrismaDate.getDate()); //13
            String noSuratKrisma = txtNoSuratKrisma.getText(); //14
            String suratKelahiran = txtSuratKelahiran.getText(); //15
            String suratwni = txtSuratWNI.getText(); //16
            String suratGantiNama = txtGantiNama.getText(); //17
            String tglMasukBiara = sdf.format(tglMasukBiaraDate.getDate()); //18
            String tglMasukPostulat = sdf.format(tglMasukPostulatdate.getDate()); //19
            String tglMasukNovisiat = sdf.format(tglMasukNovisiatDate.getDate()); //20
            String tglKaulSementara = sdf.format(tglKaulSementaraDate.getDate()); //21
            String tglkaulKekal = sdf.format(tglKaulKekalDate.getDate()); //22
            String tglKeluar;
            if (tglKeluarDate.getDate() != null) {
                tglKeluar = sdf.format(tglKeluarDate.getDate()); //23
            } else {
                tglKeluar = "1111-11-11";
            }
            String tglKembali;
            if (tglMasukLagiDate.getDate() != null) {
                tglKembali = sdf.format(tglMasukLagiDate.getDate()); //24
            } else {
                tglKembali = "1111-11-11";
            }
            String tglWafat;
            if (tglWafatDate.getDate() != null) {
                tglWafat = sdf.format(tglWafatDate.getDate()); //25
            } else {
                tglWafat = "1111-11-11";
            }
            String riwayat = txtRiwayatSebelum.getText(); //26
            String lainnya = txtLain.getText(); //27
            String foto = txtFoto.getText(); //28
            Suster suster = new Suster();
            suster.setNoInduk(noInduk);
            suster.setNamaSuster(namaSuster);
            suster.setNamaAsli(namaAsli);
            suster.setNamaBaru(namaBaru);
            suster.setTempatLahir(tempatLahir);
            suster.setTglLahir(tglLahir);
            suster.setNamaBaptis(namaBaptis);
            suster.setTempatBaptis(tempatBpatis);
            suster.setTglBaptis(tglBaptis);
            suster.setNoSuratBaptis(noSuratBaptis);
            suster.setTempatKrisma(tempatKrisma);
            suster.setTglKrisma(tglKrisma);
            suster.setNoSuratKrisma(noSuratKrisma);
            suster.setTtsSuratKelahiran(suratKelahiran);
            suster.setTtsSuratWNI(suratwni);
            suster.setTtsGantiNama(suratGantiNama);
            suster.setTglMasukBiara(tglMasukBiara);
            suster.setTglMasukPostulat(tglMasukPostulat);
            suster.setTglMasukNovisiat(tglMasukNovisiat);
            suster.setTglKaulSementara(tglKaulSementara);
            suster.setTglKaulKekal(tglkaulKekal);
            suster.setTglKeluar(tglKeluar);
            suster.setTglMasukKembali(tglKembali);
            suster.setTglWafat(tglWafat);
            suster.setRiwayatSebelumMembiara(riwayat);
            suster.setLainLain(lainnya);
            suster.setFoto(foto);
            suster.setBiara(DaoFactory.getBiaraDao().getBiaraByNama(combobiara.getSelectedItem().toString()));
            suster.setKotamasukbiara(txtkmb.getText());
            suster.setKotapostulat(txtkmp.getText());
            suster.setKotanovisiat(txtkmn.getText());
            suster.setKotasementara(txtkks.getText());
            suster.setKotakaulkekal(txtkks.getText());
            DaoFactory.getSusterDao().InsertSuster(suster);
            }else{
                JOptionPane.showMessageDialog(null, "GAGAL MENYIMPAN \nCek kelengkapan data");                
            }            
        } else {
            //JOptionPane.showMessageDialog(null, "mari kita update");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String noInduk = txtInduk.getText(); //2
            String namaSuster = txtNamaSuster.getText(); //3
            String namaAsli = txtNamaAsli.getText(); //4
            String namaBaru = txtNamaBaru.getText(); //5
            String tempatLahir = txtTempatLahir.getText(); //6
            String tglLahir = sdf.format(tglLahirDate.getDate()); //7
            String namaBaptis = txtNamaBaptis.getText(); //8
            String tempatBpatis = txtTempatBaptis.getText(); //9
            String tglBaptis = sdf.format(tglBaptisDate.getDate()); //10
            String noSuratBaptis = txtNoSuratBaptis.getText(); //11
            String tempatKrisma = txtTempatKrisma.getText();//12
            String tglKrisma = sdf.format(tglKrismaDate.getDate()); //13
            String noSuratKrisma = txtNoSuratKrisma.getText(); //14
            String suratKelahiran = txtSuratKelahiran.getText(); //15
            String suratwni = txtSuratWNI.getText(); //16
            String suratGantiNama = txtGantiNama.getText(); //17
            String tglMasukBiara = sdf.format(tglMasukBiaraDate.getDate()); //18
            String tglMasukPostulat = sdf.format(tglMasukPostulatdate.getDate()); //19
            String tglMasukNovisiat = sdf.format(tglMasukNovisiatDate.getDate()); //20
            String tglKaulSementara = sdf.format(tglKaulSementaraDate.getDate()); //21
            String tglkaulKekal = sdf.format(tglKaulKekalDate.getDate()); //22
            String tglKeluar;
            if (tglKeluarDate.getDate() != null) {
                tglKeluar = sdf.format(tglKeluarDate.getDate()); //23
            } else {
                tglKeluar = "1111-11-11";
            }
            String tglKembali;
            if (tglMasukLagiDate.getDate() != null) {
                tglKembali = sdf.format(tglMasukLagiDate.getDate()); //24
            } else {
                tglKembali = "1111-11-11";
            }
            String tglWafat;
            if (tglWafatDate.getDate() != null) {
                tglWafat = sdf.format(tglWafatDate.getDate()); //25
            } else {
                tglWafat = "1111-11-11";
            }
            String riwayat = txtRiwayatSebelum.getText(); //26
            String lainnya = txtLain.getText(); //27
            String foto = txtFoto.getText(); //28
            Suster suster = new Suster();
            suster.setNoInduk(noInduk);
            suster.setNamaSuster(namaSuster);
            suster.setNamaAsli(namaAsli);
            suster.setNamaBaru(namaBaru);
            suster.setTempatLahir(tempatLahir);
            suster.setTglLahir(tglLahir);
            suster.setNamaBaptis(namaBaptis);
            suster.setTempatBaptis(tempatBpatis);
            suster.setTglBaptis(tglBaptis);
            suster.setNoSuratBaptis(noSuratBaptis);
            suster.setTempatKrisma(tempatKrisma);
            suster.setTglKrisma(tglKrisma);
            suster.setNoSuratKrisma(noSuratKrisma);
            suster.setTtsSuratKelahiran(suratKelahiran);
            suster.setTtsSuratWNI(suratwni);
            suster.setTtsGantiNama(suratGantiNama);
            suster.setTglMasukBiara(tglMasukBiara);
            suster.setTglMasukPostulat(tglMasukPostulat);
            suster.setTglMasukNovisiat(tglMasukNovisiat);
            suster.setTglKaulSementara(tglKaulSementara);
            suster.setTglKaulKekal(tglkaulKekal);
            suster.setTglKeluar(tglKeluar);
            suster.setTglMasukKembali(tglKembali);
            suster.setTglWafat(tglWafat);
            suster.setRiwayatSebelumMembiara(riwayat);
            suster.setLainLain(lainnya);
            suster.setFoto(foto);
            suster.setID(cek.getID());
            suster.setBiara(DaoFactory.getBiaraDao().getBiaraByNama(combobiara.getSelectedItem().toString()));
            suster.setKotamasukbiara(txtkmb.getText());
            suster.setKotapostulat(txtkmp.getText());
            suster.setKotanovisiat(txtkmn.getText());
            suster.setKotasementara(txtkks.getText());
            suster.setKotakaulkekal(txtkks.getText());
            DaoFactory.getSusterDao().UpdateSuster(suster);
        }
        this.dispose();
        InputUI.load_table();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            txtFoto.setText(file.getName());
            Path to = Paths.get("report/" + file.getName());
            System.out.println(file.toPath());
            //jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("emp.jpg"))); // NOI18N
            CopyOption[] options = new CopyOption[]{
                StandardCopyOption.REPLACE_EXISTING,
                StandardCopyOption.COPY_ATTRIBUTES
            };
            try {
                Files.copy(file.toPath(), to, options);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            ImageIcon imageIcon = new ImageIcon(file.getAbsolutePath());
            Image image = imageIcon.getImage(); // transform it 
            Image newimg = image.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way 
            //displayPhotoTxt.setIcon(imageIcon);
            //txtFotoDisplay.setIcon(new ImageIcon(newimg));
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        PendidikanFormalUI formalUI = new PendidikanFormalUI();
        formalUI.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        PendidikanNonFormalUI pnfui = new PendidikanNonFormalUI();
        pnfui.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        AggotaKeluargaUI akui = new AggotaKeluargaUI();
        akui.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        RiwayatKerjaUI kerjaUI = new RiwayatKerjaUI();
        kerjaUI.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(InputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combobiara;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser tglBaptisDate;
    private com.toedter.calendar.JDateChooser tglKaulKekalDate;
    private com.toedter.calendar.JDateChooser tglKaulSementaraDate;
    private com.toedter.calendar.JDateChooser tglKeluarDate;
    private com.toedter.calendar.JDateChooser tglKrismaDate;
    private com.toedter.calendar.JDateChooser tglLahirDate;
    private com.toedter.calendar.JDateChooser tglMasukBiaraDate;
    private com.toedter.calendar.JDateChooser tglMasukLagiDate;
    private com.toedter.calendar.JDateChooser tglMasukNovisiatDate;
    private com.toedter.calendar.JDateChooser tglMasukPostulatdate;
    private com.toedter.calendar.JDateChooser tglWafatDate;
    private javax.swing.JTextField txtFoto;
    private javax.swing.JTextField txtGantiNama;
    private javax.swing.JTextField txtInduk;
    private javax.swing.JTextArea txtLain;
    private javax.swing.JTextField txtNamaAsli;
    private javax.swing.JTextField txtNamaBaptis;
    private javax.swing.JTextField txtNamaBaru;
    private javax.swing.JTextField txtNamaSuster;
    private javax.swing.JTextField txtNoSuratBaptis;
    private javax.swing.JTextField txtNoSuratKrisma;
    private javax.swing.JTextArea txtRiwayatSebelum;
    private javax.swing.JTextField txtSuratKelahiran;
    private javax.swing.JTextField txtSuratWNI;
    private javax.swing.JTextField txtTempatBaptis;
    private javax.swing.JTextField txtTempatKrisma;
    private javax.swing.JTextField txtTempatLahir;
    private javax.swing.JTextField txtkkk;
    private javax.swing.JTextField txtkks;
    private javax.swing.JTextField txtkmb;
    private javax.swing.JTextField txtkmn;
    private javax.swing.JTextField txtkmp;
    // End of variables declaration//GEN-END:variables
}
