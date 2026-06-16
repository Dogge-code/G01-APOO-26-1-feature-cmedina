package com.example.tutoria03.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Docente")
public class Docente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 50)
    private String nombres;
    @Column(unique = true, nullable = false, length = 50)
    private String correo;
    @Column(unique = true, nullable = false, length = 30)
    private String numeroDocumento;
    @Column(unique = true, nullable = false, length = 10)
    private String tipoDocumento;
    @Column(nullable = false, length = 30)
    private String numeroTelefono;
    @Column(nullable = false, length = 60)
    private String carrera;
    @Column(nullable = false, length = 70)
    private String direccion;


    // methods 

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getNumeroDocumento() {
        return numeroDocumento;
    }
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    public String getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public String getNumeroTelefono() {
        return numeroTelefono;
    }
    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    

}

//encuentre Id, numeroDocumento y tipoDocumento
