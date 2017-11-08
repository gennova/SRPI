/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ypii.suster;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author laravel
 */
public class SusterDaoImplemen implements SusterDao {

    private final Connection connection;
    private final String sqlInsertSuster = "call spInsertSuster(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    private final String sqlUpdateSuster = "call spUpdateSuster(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    private final String sqlGetAllSuster = "select * from suster";
    private final String sqlGetAllSusterByID = "select * from suster where id=?";
    private final String sqlGetAllSusterByInduk = "select * from suster where noinduk=?";

    public SusterDaoImplemen(Connection c) {
        this.connection = c;
    }

    @Override
    public void InsertSuster(Suster suster) {
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(sqlInsertSuster);
            statement.setString(1, suster.getNoInduk());
            statement.setString(2, suster.getNamaSuster());
            statement.setString(3, suster.getNamaAsli());
            statement.setString(4, suster.getNamaBaru());
            statement.setString(5, suster.getTempatLahir());
            statement.setString(6, suster.getTglLahir());
            statement.setString(7, suster.getNamaBaptis());
            statement.setString(8, suster.getNamaBaptis());
            statement.setString(9, suster.getTglBaptis());
            statement.setString(10, suster.getNoSuratBaptis());
            statement.setString(11, suster.getTempatKrisma());
            statement.setString(12, suster.getTglKrisma());
            statement.setString(13, suster.getNoSuratKrisma());
            statement.setString(14, suster.getTtsSuratKelahiran());
            statement.setString(15, suster.getTtsSuratWNI());
            statement.setString(16, suster.getTtsGantiNama());
            statement.setString(17, suster.getTglMasukBiara());
            statement.setString(18, suster.getTglMasukPostulat());
            statement.setString(19, suster.getTglMasukNovisiat());
            statement.setString(20, suster.getTglKaulSementara());
            statement.setString(21, suster.getTglKaulKekal());
            statement.setString(22, suster.getTglKeluar());
            statement.setString(23, suster.getTglMasukKembali());
            statement.setString(24, suster.getTglWafat());
            statement.setString(25, suster.getRiwayatSebelumMembiara());
            statement.setString(26, suster.getLainLain());
            statement.setString(27, suster.getFoto());
            int status = statement.executeUpdate();
            if (status == 0) {
                JOptionPane.showMessageDialog(null, "DATA BERHASIL DITAMBAHKAN");
            } else {
                JOptionPane.showMessageDialog(null, "DATA GAGAL DITAMBAHKAN");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SusterDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void UpdateSuster(Suster suster) {
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(sqlUpdateSuster);
            statement.setString(1, suster.getNoInduk());
            statement.setString(2, suster.getNamaSuster());
            statement.setString(3, suster.getNamaAsli());
            statement.setString(4, suster.getNamaBaru());
            statement.setString(5, suster.getTempatLahir());
            statement.setString(6, suster.getTglLahir());
            statement.setString(7, suster.getNamaBaptis());
            statement.setString(8, suster.getNamaBaptis());
            statement.setString(9, suster.getTglBaptis());
            statement.setString(10, suster.getNoSuratBaptis());
            statement.setString(11, suster.getTempatKrisma());
            statement.setString(12, suster.getTglKrisma());
            statement.setString(13, suster.getNoSuratKrisma());
            statement.setString(14, suster.getTtsSuratKelahiran());
            statement.setString(15, suster.getTtsSuratWNI());
            statement.setString(16, suster.getTtsGantiNama());
            statement.setString(17, suster.getTglMasukBiara());
            statement.setString(18, suster.getTglMasukPostulat());
            statement.setString(19, suster.getTglMasukNovisiat());
            statement.setString(20, suster.getTglKaulSementara());
            statement.setString(21, suster.getTglKaulKekal());
            statement.setString(22, suster.getTglKeluar());
            statement.setString(23, suster.getTglMasukKembali());
            statement.setString(24, suster.getTglWafat());
            statement.setString(25, suster.getRiwayatSebelumMembiara());
            statement.setString(26, suster.getLainLain());
            statement.setString(27, suster.getFoto());
            statement.setInt(28, suster.getID());
            int status = statement.executeUpdate();
            if (status == 0) {
                JOptionPane.showMessageDialog(null, "DATA BERHASIL DIUPDATE");
            } else {
                JOptionPane.showMessageDialog(null, "DATA GAGAL DIUPDATE");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SusterDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void DeleteSuster(Suster suster) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Suster> getAllSuster() {
        PreparedStatement ps;
        ResultSet rs;
        List<Suster> list = null;
        try {
            ps = connection.prepareStatement(sqlGetAllSuster);
            rs = ps.executeQuery();
            list = new ArrayList();
            while (rs.next()) {
                Suster s = new Suster();
                s.setID(rs.getInt("id"));
                s.setNoInduk(rs.getString("noinduk"));
                s.setNamaSuster(rs.getString("namasuster"));
                s.setNamaAsli(rs.getString("namaasli"));
                s.setNamaBaru(rs.getString("namabaru"));
                s.setTempatLahir(rs.getString("tempatlahir"));
                s.setTglLahir(rs.getString("tgllahir"));
                s.setNamaBaptis(rs.getString("namabaptis"));
                s.setTempatBaptis(rs.getString("tempatbaptis"));
                s.setTglBaptis(rs.getString("tglbaptis"));
                s.setNoSuratBaptis(rs.getString("nosuratbaptis"));
                s.setTempatKrisma(rs.getString("tempatkrisma"));
                s.setTglKrisma(rs.getString("tglkrisma"));
                s.setNoSuratKrisma(rs.getString("nosuratkrisma"));
                s.setTtsSuratKelahiran(rs.getString("suratkelahiran"));
                s.setTtsSuratWNI(rs.getString("suratwni"));
                s.setTtsGantiNama(rs.getString("gantinama"));
                s.setTglMasukBiara(rs.getString("tglmasukbiara"));
                s.setTglMasukPostulat(rs.getString("tglmasukpostulat"));
                s.setTglMasukNovisiat(rs.getString("tglmasuknovisiat"));
                s.setTglKaulSementara(rs.getString("tglkaulsementara"));
                s.setTglKaulKekal(rs.getString("tglkaulkekal"));
                s.setTglKeluar(rs.getString("tglkeluar"));
                s.setTglMasukKembali(rs.getString("tglmasuklagi"));
                s.setTglWafat(rs.getString("tglwafat"));
                s.setRiwayatSebelumMembiara(rs.getString("riwayatsebelumbiara"));
                s.setLainLain(rs.getString("lainlain"));
                s.setFoto(rs.getString("foto"));
                list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SusterDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Suster getSusterByID(int ID) {
        PreparedStatement ps;
        ResultSet rs;
        Suster s = null;
        try {
            ps = connection.prepareStatement(sqlGetAllSusterByID);
            ps.setInt(1, ID);
            rs = ps.executeQuery();
            while (rs.next()) {
                s = new Suster();
                s.setID(rs.getInt("id"));
                s.setNoInduk(rs.getString("noinduk"));
                s.setNamaSuster(rs.getString("namasuster"));
                s.setNamaAsli(rs.getString("namaasli"));
                s.setNamaBaru(rs.getString("namabaru"));
                s.setTempatLahir(rs.getString("tempatlahir"));
                s.setTglLahir(rs.getString("tgllahir"));
                s.setNamaBaptis(rs.getString("namabaptis"));
                s.setTempatBaptis(rs.getString("tempatbaptis"));
                s.setTglBaptis(rs.getString("tglbaptis"));
                s.setNoSuratBaptis(rs.getString("nosuratbaptis"));
                s.setTempatKrisma(rs.getString("tempatkrisma"));
                s.setTglKrisma(rs.getString("tglkrisma"));
                s.setNoSuratKrisma(rs.getString("nosuratkrisma"));
                s.setTtsSuratKelahiran(rs.getString("suratkelahiran"));
                s.setTtsSuratWNI(rs.getString("suratwni"));
                s.setTtsGantiNama(rs.getString("gantinama"));
                s.setTglMasukBiara(rs.getString("tglmasukbiara"));
                s.setTglMasukPostulat(rs.getString("tglmasukpostulat"));
                s.setTglMasukNovisiat(rs.getString("tglmasuknovisiat"));
                s.setTglKaulSementara(rs.getString("tglkaulsementara"));
                s.setTglKaulKekal(rs.getString("tglkaulkekal"));
                s.setTglKeluar(rs.getString("tglkeluar"));
                s.setTglMasukKembali(rs.getString("tglmasuklagi"));
                s.setTglWafat(rs.getString("tglwafat"));
                s.setRiwayatSebelumMembiara(rs.getString("riwayatsebelumbiara"));
                s.setLainLain(rs.getString("lainlain"));
                s.setFoto(rs.getString("foto"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SusterDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }

    @Override
    public Suster getSusterByInduk(String noInduk) {
        PreparedStatement ps;
        ResultSet rs;
        Suster s = null;
        try {
            ps = connection.prepareStatement(sqlGetAllSusterByInduk);
            ps.setString(1, noInduk);
            rs = ps.executeQuery();
            while (rs.next()) {
                s = new Suster();
                s.setID(rs.getInt("id"));
                s.setNoInduk(rs.getString("noinduk"));
                s.setNamaSuster(rs.getString("namasuster"));
                s.setNamaAsli(rs.getString("namaasli"));
                s.setNamaBaru(rs.getString("namabaru"));
                s.setTempatLahir(rs.getString("tempatlahir"));
                s.setTglLahir(rs.getString("tgllahir"));
                s.setNamaBaptis(rs.getString("namabaptis"));
                s.setTempatBaptis(rs.getString("tempatbaptis"));
                s.setTglBaptis(rs.getString("tglbaptis"));
                s.setNoSuratBaptis(rs.getString("nosuratbaptis"));
                s.setTempatKrisma(rs.getString("tempatkrisma"));
                s.setTglKrisma(rs.getString("tglkrisma"));
                s.setNoSuratKrisma(rs.getString("nosuratkrisma"));
                s.setTtsSuratKelahiran(rs.getString("suratkelahiran"));
                s.setTtsSuratWNI(rs.getString("suratwni"));
                s.setTtsGantiNama(rs.getString("gantinama"));
                s.setTglMasukBiara(rs.getString("tglmasukbiara"));
                s.setTglMasukPostulat(rs.getString("tglmasukpostulat"));
                s.setTglMasukNovisiat(rs.getString("tglmasuknovisiat"));
                s.setTglKaulSementara(rs.getString("tglkaulsementara"));
                s.setTglKaulKekal(rs.getString("tglkaulkekal"));
                s.setTglKeluar(rs.getString("tglkeluar"));
                s.setTglMasukKembali(rs.getString("tglmasuklagi"));
                s.setTglWafat(rs.getString("tglwafat"));
                s.setRiwayatSebelumMembiara(rs.getString("riwayatsebelumbiara"));
                s.setLainLain(rs.getString("lainlain"));
                s.setFoto(rs.getString("foto"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SusterDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }

}
