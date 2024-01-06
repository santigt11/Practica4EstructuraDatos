/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.dao;

import controlador.listas.DynamicList;

/**
 *
 * @author Santiago
 */
public interface DaoInterface<T> {
    public Boolean persist(T data);
    public Boolean merge(T data,Integer index);
    public DynamicList<T> all();
    public T get(Integer id);
}
