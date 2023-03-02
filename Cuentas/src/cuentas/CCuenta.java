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
    private double tipoInterés;

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
     * Metado estado
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
	 * Metodos getters/setters para acceso a los atributos de la clase
	 */
	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInterés() {
		return tipoInterés;
	}

	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
