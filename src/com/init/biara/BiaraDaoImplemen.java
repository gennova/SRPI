/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.init.biara;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author laravel
 */
public class BiaraDaoImplemen implements BiaraDao {

    private final Connection connection;
    private final String getAllBiara = "select * from biara";

    public BiaraDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Biara> getAllBiara() {
        PreparedStatement ps;
        ResultSet rs;
        List<Biara> biaras = null;
        try {
            ps = connection.prepareStatement(getAllBiara);
            rs = ps.executeQuery();
            biaras = new ArrayList<>();
            while (rs.next()) {
                Biara biara = new Biara();
                biara.setID(rs.getInt("id"));
                biara.setNamaBiara(rs.getString("namabiara"));
                biara.setAlamatbiara(rs.getString("alamatbiara"));
                biaras.add(biara);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BiaraDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return biaras;
    }

    @Override
    public Biara getBiaraByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Biara getBiaraByKode(String kode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Biara getBiaraByNama(String nama) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InsertBiara(Biara biara) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void UpdateBiaraByID(Biara biara) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DeleteBiaraByID(Biara biara) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
