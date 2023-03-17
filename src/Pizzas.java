/**
 * @author Lucía Balsa
 * version 16.03.2023
 */


public class Pizzas {

    /**
     * Declaro el atributo de tipo int que indica el tipo de masa
     */
    private int tipoMasa;
    /**
     * Declaro el atributo de tipo boolean que indica si tendrá relleno
     */
    private boolean relleno;
    /**
     * Declaro el atributo de tipo int que indica el tamaño de la pizza
     */
    private int tamanho;
    /**
     * Declaro el atributo de tipo boolean que indica si llevará salsa o no
     */
    private boolean salsa;
    /**
     * Declaro el atributo de tipo int que indica el tipo de salsa
     */
    private int tipoSalsa;
    /**
     * Declaro el atributo de tipo boolean que indica si llevará cebolla o no
     */
    private boolean cebolla;
    /**
     * Declaro el atributo de tipo boolean que indica si es sin gluten o no
     */
    private boolean sinGluten;
    /**
     * Declaro el atributo de tipo boolean que indica si lleva extra de queso o no
     */
    private boolean extraQueso;
    /**
     * Declaro el atributo de tipo boolean que indica si lleva piña o no
     */
    private boolean pinha;
    /**
     * Declaro el atributo de tipo boolean que indica si lleva champiñones o no
     */
    private boolean champinhones;
    /**
     * Declaro el atributo de tipo boolean que indica si llevará jamón o no
     */
    private boolean jamon;


    /**
     * Declaro la constante literal que indica que el tipo de masa es fina
     */
    public static final int FINA = 0;
    /**
     * Declaro la constante literal que indica que el tipo de masa es pan
     */
    public static final int PAN = 1;
    /**
     * Declaro la constante literal que indica que el tipo de masa es integral
     */
    public static final int INTEGRAL = 2;
    /**
     * Declaro la constante literal que indica que el tipo de masa es normal
     */
    public static final int NORMAL = 3;


    /**
     * Declaro la constante literal que indica que el tamaño de la pizza es familiar
     */
    public static final int FAMILIAR = 1;
    /**
     * Declaro la constante literal que indica que el tamaño de la pizza es mediana
     */
    public static final int MEDIANA = 2;
    /**
     * Declaro la constante literal que indica que el tamaño de la pizza es pequeña
     */
    public static final int PEQUEÑA = 3;


    /**
     * Declaro la constante literal que indica que la salsa es barbacoa
     */
    public static final int BARBACOA = 1;
    /**
     * Declaro la constante literal que indica que la salsa es solo tomate
     */
    public static final int SOLOTOMATE = 2;
    /**
     * Declaro la constante literal que indica que la salsa es salsa sin gluten
     */
    public static final int SALSASINGLUTEN = 3;


    /**
     * Constructor para la pizza por defecto
     */
    public Pizzas() {
        this.tipoMasa = NORMAL;
        this.relleno = false;
        this.tamanho = MEDIANA;
        this.salsa = true;
        this.tipoSalsa = SOLOTOMATE;
        this.extraQueso = true;

    }

    /**
     * Constructor con todos los parámetros
     *
     * @param tipoMasa     tipo de la masa
     * @param relleno      si es rellena o no
     * @param tamanho      tamaño de la pizza
     * @param salsa        si lleva salsa o no
     * @param tipoSalsa    tipo de salsa que lleva
     * @param cebolla      si lleva o no
     * @param sinGluten    si es con gluten o no
     * @param extraQueso   si lleva extra de queso no
     * @param pinha        si lleva piña o no
     * @param champinhones si lleva chanpiñones o no
     * @param jamon        si lleva jamón o no
     */
    public Pizzas(int tipoMasa, boolean relleno, int tamanho, boolean salsa, int tipoSalsa, boolean cebolla, boolean sinGluten, boolean extraQueso, boolean pinha, boolean champinhones, boolean jamon) {
        this.tipoMasa = tipoMasa;
        this.relleno = relleno;
        this.tamanho = tamanho;
        this.salsa = salsa;
        this.tipoSalsa = tipoSalsa;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.extraQueso = extraQueso;
        this.pinha = pinha;
        this.champinhones = champinhones;
        this.jamon = jamon;
    }


    public int getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(int tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isSalsa() {
        return salsa;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public int getTipoSalsa() {
        return tipoSalsa;
    }

    public void setTipoSalsa(int tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public boolean isPinha() {
        return pinha;
    }

    public void setPinha(boolean pinha) {
        this.pinha = pinha;
    }

    public boolean isChampinhones() {
        return champinhones;
    }

    public void setChampinhones(boolean champinhones) {
        this.champinhones = champinhones;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

    @Override
    public String toString() {
        return "tipoMasa=" + tipoMasa +
                ", relleno=" + relleno +
                ", tamanho=" + tamanho +
                ", salsa=" + salsa +
                ", tipoSalsa=" + tipoSalsa +
                ", cebolla=" + cebolla +
                ", sinGluten=" + sinGluten +
                ", extraQueso=" + extraQueso +
                ", pinha=" + pinha +
                ", champinhones=" + champinhones +
                ", jamon=" + jamon;
    }
}

