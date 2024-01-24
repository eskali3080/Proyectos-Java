/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;


/**
 *
 * @author Instructor
 */
public class Persona {
    
    private long cedula;
    private String primer_nombre;
    private String primer_apellido;
    private String correo;
    private long celular;
    
    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }
    
    public Persona (){}
    
    public Persona(long cedula, String primer_nombre, String primer_apellido, String correo, long celular) {
        this.cedula = cedula;
        this.primer_nombre = primer_nombre;
        this.primer_apellido = primer_apellido;
        this.correo = correo;
        this.celular = celular;
    }
    
 
    
    
    
    
    
        
        public static void main(String[] args){
        Persona p1=new Persona();
                p1.setCedula(109252);
        }
        
        
             }


   
    
    
    
    
    
    
    
    

