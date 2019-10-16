package modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * hijos!=null;
 */
public class Empleado
{
    String dni;
    private ArrayList<Hijo> hijos;    
    
    public Empleado(String dni)
    {
        this.dni = dni;
        hijos = new ArrayList<Hijo>();
    }
    
    /**
     * El sistema debe calcular el incremento de sueldo de acuerdo a la cantidad de hijos 
     * y sus edades. Por cada hijo menor de edad debe incrementar un 10% el sueldo base.
     * Por cada hijo entre 18 y 21 años de edad debe incrementar un 5% el sueldo base.
     * Si tiene más de 5 hijos debe incrementar un 5 el sueldo base.
     * Pre:
     *  sueldoBase > 0
     * @return
     */
    public double getIncremento(double sueldoBase)
    {
        int cantHijos = hijos.size();
        Iterator<Hijo> iter_hijos = hijos.iterator();
        double plus = 0.0;
        while(iter_hijos.hasNext())
        {
            Hijo unHijo = (Hijo)iter_hijos.next();
            if(unHijo.getEdad()<18)
            {
                plus = plus + sueldoBase*10/100;                
            }
            else if (unHijo.getEdad()<21)
            {
                plus = plus + sueldoBase*5/100;
            }
        }
        if (cantHijos  > 5)
        {
            plus = plus + sueldoBase*5/100;
        }
        return plus;
    }
    
    public void agregarHijo(Hijo hijo)
    {
        hijos.add(hijo);
    } 
}
