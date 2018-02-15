package com.cip.prog;

public class Libro {
	//Atributos
	private String libro;
	private String autor;
	private int ejemplaresLibro;
	private int ejemplaresPrestados;
	
	//Constructor por defecto
	public Libro() {
        this.libro = "Libro por defecto";
        this.autor = "Autor por defecto";
        this.ejemplaresLibro = 0;
        this.ejemplaresPrestados = 0;	
	}
	
    // Constructor con parámetros
    public Libro(String libro, String autor, int ejemplaresLibro, int ejemplaresPrestados) {
        this.libro = libro;
        this.autor = autor;
        this.ejemplaresLibro = ejemplaresLibro;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }
    public boolean prestamo() {
    	if(this.ejemplaresLibro>0) {
    		this.ejemplaresPrestados++;
    		this.ejemplaresLibro--;
    		
    		return true;
    	}else {
    		return false;
    	}
    }
    
    public boolean devolucion() {
       	if(this.ejemplaresPrestados>0) {
       		this.ejemplaresLibro++;
       		this.ejemplaresPrestados--;
    		return true;
       	}else {
    		return false;
       	}
    }

    //Método que muestra los datos
    public String toString (){
        String mensaje = "Nombre del libro: " + libro +
        				"\nAutor: " + autor + 
        				"\nEjemplares en Stock: " +ejemplaresLibro+ 
                        " | Ejemplares Prestados: " + ejemplaresPrestados + "\n";
        return mensaje;
    }

}

