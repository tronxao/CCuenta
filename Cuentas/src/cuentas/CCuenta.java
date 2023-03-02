package cuentas;



/**
 * Esta clase define los atributos y los metodos de la CCuenta
 * @author ivan.garcia
 * @version 1.0
 */
public class CCuenta {

	

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     *  Constructor vacio de CCuenta
     */
    public CCuenta()
    
    
    {
    }

    /**
     * Constructor con valores de CCuenta
     * @param nom - Nombre que le asignamos a la cuenta
     * @param cue - Nº que le asignamos a la cuenta
     * @param sal - Saldo que le asignamos a la cuenta
     * @param tipo - Nº de Tipo de interés de la cuena
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Metodo para consultar el saldo de la cuenta
     * @return - Devuelve el saldo actual de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método para ingresar saldo en la cuenta
     * @param cantidad - Cantidad que queremos ingresar en la cuenta
     * @throws Exception - Control de excepciones por si se intenta ingresar saldo en negativo.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Metodo para retirar saldo de la cuenta
     * @param cantidad - Cantidad que deseamos retirar de la cuenta
     * @throws Exception - Control de excepciones por si no hay saldo en cuenta
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }


	/**
	 * Metodo para obtener el nombre de la cuenta
	 * @return Devuelve el nombre de la cuenta
	 */
	private String getNombre() {
		return nombre;
	}

	/** Método para establecer el nombre de la cuenta
	 * @param nombre Recibe el nombre de la cuenta
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método para obtener el número de la cuenta
	 * @return Devuelve el número de la cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * Método para establecer el nº de la cuenta
	 * @param cuenta  Recibe el nº de la cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Método para obtener el saldo de la cuenta
	 * @return Devuelve el saldo de la cuenta
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * Método para establecer el saldo de la cuenta
	 * @param saldo Recibe el valor del saldo a establecer en la cuenta
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/** Método para obtener el tipo de interés de la cuenta
	 * @return Devuelve el tipo de interes de la cuenta
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Metodo para establecer el tipo de interés de la cueta
	 * @param tipoInteres Recibe el valor del tipo de interes de la cuenta
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
