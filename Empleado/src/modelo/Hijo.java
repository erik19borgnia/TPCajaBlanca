package modelo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Hijo
{
    private String dni;
    private int anio;
    private int mes;
    private int dia;


    public Hijo(String dni)
    {
        this.dni = dni;
    }


    public Hijo(String dni, int anio, int mes, int dia)
    {
        this.dni = dni;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public void setAnio(int anio)
    {
        this.anio = anio;
    }

    public int getAnio()
    {
        return anio;
    }

    public void setMes(int mes)
    {
        this.mes = mes;
    }

    public int getMes()
    {
        return mes;
    }

    public void setDia(int dia)
    {
        this.dia = dia;
    }

    public int getDia()
    {
        return dia;
    }


    public int getEdad()
    {
        Calendar cal= Calendar.getInstance();
        int year= cal.get(Calendar.YEAR);
        int edad_anios = year-this.getAnio();
        return edad_anios;
    }

}
