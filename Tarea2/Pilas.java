package Tarea2;

public class Pilas {

   
    Pila p	=   new	Pila(); 
    int	x	=	4,	y;
     p.insertar(x); 
     System.out.println("\n	"	+	p.cimaPila());
      y	=	p.quitar(); 
      p.insertar(32); 
      p.insertar(p.quitar()); 
      do	{ 
        System.out.println("\n	"	+	p.quitar()); 
    }while	(!p.pilaVacia());
    
}
