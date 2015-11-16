
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private NumberDisplay horas;
    private NumberDisplay minutos;
    private String horaActual;

  /**
   * Constructor que fija la hora a "00:00" 
   */
  public ClockDisplay()
  {
     // Inicializar variables
     int horas = 00;
     int minutos = 00;
     horaActual = "0" + horas + ":0" + minutos;
       
  }

  /**
   * Constructor que representa las horas y los minutos a los que fijar la hora actual.
   */
  public ClockDisplay (int hours, int minutes)
  
  {
        int horas = hours;
        int minutos = minutes;
      
            if (hours < 10 && minutes < 10)
        {
            horaActual ="0" + horas + ":0" + minutos;
        }
        
        else if (hours > 10 && minutes > 10)
        {
            horaActual = horas + ":" + minutos;
        }
        
        else if (hours < 10 && minutes > 10)
        {
            horaActual = "0" + horas + ":" + minutos;
        }
        else if (hours > 10 && minutes < 10)
        {
            horaActual = horas + ":0" + minutos;
        }
    
  }
    /**
     * Método set time que acepte dos parámetros de tipo int, que representan horas y minutos,
     * y que fije dichos valores como el tiempo actual del reloj.
     */
    public void setTime (int hours, int minutes)
    
  {
       if (hours < 10 && minutes < 10)
        {
            horaActual ="0" + horas + ":0" + minutos;
        }
        
        else if (hours > 10 && minutes > 10)
        { 
            horaActual = horas + ":" + minutos;
        }
        
        else if (hours < 10 && minutes > 10)
        {
            horaActual = "0" + horas + ":" + minutos;
        }
        else if (hours > 10 && minutes < 10)
        {
            horaActual = horas + ":0" + minutos;
        } 
        
  }
   /**
   *  Método getTime que devuelva la hora como String de 5 caracteres.
   */
   public String getTime ()
   {
      return horaActual;
   }
   
    /**
    * Método timeTick, que permite hacer avanzar un minuto el tiempo fijado.
    */
   public void timeTick()
    {
        int minutos = 0;
        int horas = 0;
       
       minutos = minutos + 1;
       if (minutos > 59)
       {
           minutos = 0;
           horas = horas + 1;
       }
       horas = horas;
       if (horas > 23)
       {
           minutos = 0;
           horas = 0;
       }
   
  }
}