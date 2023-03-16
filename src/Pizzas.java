public class Pizzas {

    private int tipoMasa;
    private boolean relleno;
    private int tamanho;
    private boolean salsa;
    private int tipoSalsa;
    private boolean cebolla;
    private boolean sinGluten;
    private boolean extraQueso;
    private boolean pinha;
    private boolean champinhones;
    private boolean jamon;

    //private int recogida;


    // tipo de masa
    public static final int FINA = 0;
    public static final int PAN = 1;
    public static final int INTEGRAL = 2;
    public static final int NORMAL = 3;

    // tamaño de la pizza
    public static final int FAMILIAR = 1;
    public static final int MEDIANA = 2;
    public static final int PEQUEÑA = 3;

    //tipoSalsa
    public static final int BARBACOA = 1 ;
    public static final int SOLOTOMATE = 2;
    public static final int SALSASINGLUTEN = 3;

    /* recogida
    public static final int TIENDA = 0;
    public static final int PARALLEVAR = 1; */

    public Pizzas(){
        this.tipoMasa = NORMAL;
        this.relleno = false;
        this.tamanho = MEDIANA;
        this.salsa = true;
        this.tipoSalsa = SOLOTOMATE;
        this.extraQueso = true;

    }

    /**
     * Constructor con todoa los parametros
     * @param tipoMasa espesor de la masa
     * @param tamanho tamaño de la pizza
     * @param relleno si el borde esta relleno de queso
     * @param cebolla lleva o no lleva
     * @param sinGluten para celíacos
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
        return  "tipoMasa=" + tipoMasa +
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

