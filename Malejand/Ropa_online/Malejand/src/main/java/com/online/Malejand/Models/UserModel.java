package com.online.Malejand.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity /*esta notacion hace es mapear para que no moleste cuando se este haciendo los datos */
@Table (name="usuario") /*esto es para crear la tabla en mysql http://localhost/phpmyadmin */
public class UserModel {
    public UserModel(){
        
    }
    @Id /*el id de la tabla y le agregamos abajo el autocremento actumaticamente  */
    @GeneratedValue(strategy = GenerationType.IDENTITY)/*AUTOCREMENTA EL ID */
    @Column(unique = true,nullable=false)/*que se autocremente el id pero el campo q se autocremente no sea nulo osea q siemre tenga un numero*/

    private Long id;
    private Long cedula;
    private String nombre;
    private String email;
    private String numero_celular;/*se crean las columnas de la tabla de la BD */
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getCedula() {
        return cedula;
    }
    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNumero_celular() {
        return numero_celular;
    }
    public void setNumero_celular(String numero_celular) {
        this.numero_celular = numero_celular;
    }

}
