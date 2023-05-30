/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static java.lang.Integer.getInteger;
import static javax.swing.UIManager.get;
import static javax.swing.UIManager.getString;


/**
 *
 * @author Lab Informatika
 */
public class modeltabeldataperpus {
   String id = getString("id");
   String judul = getString("judul");
   String gender = getString("gender");;
   String penulis = getString("penulis");
   String penerbit = getString("penerbit");
   String lokasi = getString("lokasi");
   Integer stok = getInteger("stok");
    private void Jtabel (java.awt.event.ActionEvent evt) {                                       
       
    }  

    private String getstring(String judul) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
