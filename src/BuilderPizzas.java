public class BuilderPizzas {

    /**
     * Declaro un objeto de tipo Pizzas
     */
    private Pizzas _pizza;

    /**
     * Método que me va a construir la pizza y devolver el objeto anteriormente declarado
     */
    public Pizzas build() {
        return this._pizza;
    }

    /**
     * Método que crea la pizza para configurarla
     */
    public BuilderPizzas() {
        _pizza = new Pizzas();
    }


    /**
     * Método que personaliza el tipo de masa
     *
     * @param tipoMasa
     * @return BuilderPizzas
     */
    public BuilderPizzas setTipoMasa(int tipoMasa) {
        _pizza.setTipoMasa(tipoMasa);
        return this;
    }

    /**
     * Método que personaliza si va rellena o no
     *
     * @param relleno
     * @return BuilderPizzas
     */
    public BuilderPizzas setRelleno(boolean relleno) {
        _pizza.setRelleno(relleno);
        return this;
    }

    /**
     * Método que personaliza el tamaño de la pizza
     *
     * @param tamanho
     * @return BuilderPizzas
     */
    public BuilderPizzas setTamanho(int tamanho) {
        _pizza.setTamanho(tamanho);
        return this;
    }

    /**
     * Método que personaliza si lleva salsa o no
     *
     * @param salsa
     * @return BuilderPizzas
     */
    public BuilderPizzas setSalsa(boolean salsa) {
        _pizza.setSalsa(salsa);
        return this;
    }

    /**
     * Método que personaliza el tipo de salsa
     *
     * @param tipoSalsa
     * @return BuilderPizzas
     */
    public BuilderPizzas setTipoSalsa(int tipoSalsa) {
        _pizza.setTipoSalsa(tipoSalsa);
        return this;
    }

    /**
     * Método que personaliza si lleva cebolla o no
     *
     * @param cebolla
     * @return BuilderPizzas
     */
    public BuilderPizzas setCebolla(boolean cebolla) {
        _pizza.setCebolla(cebolla);
        return this;
    }

    /**
     * Método que personaliza si es sin gluten o no
     *
     * @param sinGluten
     * @return BuilderPizzas
     */
    public BuilderPizzas setSinGluten(boolean sinGluten) {
        _pizza.setSinGluten(sinGluten);
        return this;
    }

    /**
     * Método que personaliza si lleva extra de queso o no
     *
     * @param extraQueso
     * @return BuilderPizzas
     */
    public BuilderPizzas setExtraQueso(boolean extraQueso) {
        _pizza.setExtraQueso(extraQueso);
        return this;
    }

    /**
     * Método que personaliza si lleva piña o no
     *
     * @param pinha
     * @return BuilderPizzas
     */
    public BuilderPizzas setPinha(boolean pinha) {
        _pizza.setPinha(pinha);
        return this;
    }

    /**
     * Método que personaliza si lleva champiñones o no
     *
     * @param champinhones
     * @return BuilderPizzas
     */
    public BuilderPizzas setChampinhones(boolean champinhones) {
        _pizza.setChampinhones(champinhones);
        return this;
    }

    /**
     * Método que personaliza si lleva jamón o no
     *
     * @param jamon
     * @return BuilderPizzas
     */
    public BuilderPizzas setJamon(boolean jamon) {
        _pizza.setJamon(jamon);
        return this;
    }


    @Override
    public String toString() {
        return "BuilderPizzas{" +
                "_pizza=" + _pizza +
                '}';
    }
}

