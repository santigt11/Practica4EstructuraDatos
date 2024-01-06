/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.dao;

import controlador.listas.DynamicList;

import com.thoughtworks.xstream.XStream;
import controlador.excepciones.EmptyException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Santiago
 */
public class DaoImplement<T> implements DaoInterface<T> {

    private Class<T> clazz;
    private XStream conection;
    private String URL;

    public DaoImplement(Class<T> clazz) {
        this.clazz = clazz;
        conection = Bridge.getConection();
        URL = Bridge.URL + clazz.getSimpleName() + ".json";

    }

    @Override
    public Boolean persist(T data) {
        DynamicList<T> Id = all();
        Id.add(data);
        try {
            conection.toXML(Id, new FileWriter(URL));
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public Boolean merge(T data, Integer index) {
        DynamicList<T> Id = all();

        try {
            Id.getInfo(index);

        } catch (Exception e) {
        }
        try {
            conection.toXML(Id, new FileWriter(URL));
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public DynamicList<T> all() {
        DynamicList<T> dl = new DynamicList<>();
        try {
            dl = (DynamicList<T>) conection.fromXML(new FileReader(URL));
        } catch (Exception e) {

        }
        return dl;
    }

    @Override
    public T get(Integer id) {
        DynamicList<T> ld = all();
        try {
            return ld.getInfo(id);
        } catch (EmptyException ex) {
            Logger.getLogger(DaoImplement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
