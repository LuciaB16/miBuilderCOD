public class BuilderPizzas {

    // este es el objeto que va a construir nuestro Builder
    // utilizamos el guion bajo para remarcar que es un objeto de esta clase
    protected Pizzas _pizza;

    // metodo que devuelve el objeto terminado
    public Pizzas build() {
        return this._pizza;
    }

    // crea la pizza para configurarla
    public BuilderPizzas() {
        _pizza = new Pizzas();
    }

    // metodos para la personalizacion de la pizza
    public BuilderPizzas setTipoMasa(int tipoMasa) {
        _pizza.setTipoMasa(tipoMasa);
        return this;
    }

    public BuilderPizzas setRelleno(boolean relleno) {
        _pizza.setRelleno(relleno);
        return this;
    }

    public BuilderPizzas setTamanho(int tamanho) {
        _pizza.setTamanho(tamanho);
        return this;
    }

    public BuilderPizzas setSalsa(boolean salsa){
        _pizza.setSalsa(salsa);
        return this;
    }

    public BuilderPizzas setTipoSalsa(int tipoSalsa){
        _pizza.setTipoSalsa(tipoSalsa);
        return this;
    }

    public BuilderPizzas setCebolla(boolean cebolla) {
        _pizza.setCebolla(cebolla);
        return this;
    }

    public BuilderPizzas setSinGluten(boolean sinGluten){
        _pizza.setSinGluten(sinGluten);
        return this;
    }

    public BuilderPizzas setExtraQueso (boolean extraQueso){
        _pizza.setExtraQueso(extraQueso);
        return this;
    }

    public BuilderPizzas setPinha (boolean pinha){
        _pizza.setPinha(pinha);
        return this;
    }

    public BuilderPizzas setChampinhones (boolean champinhones){
        _pizza.setChampinhones(champinhones);
        return this;
    }

    public BuilderPizzas setJamon (boolean jamon){
        _pizza.setJamon(jamon);
        return this;
    }

    /*public BuilderPizzas setRecogida(int recogida) {
        _pizza.setRecogida(recogida);
        return this;
    }*/


    @Override
    public String toString() {
        return "BuilderPizzas{" +
                "_pizza=" + _pizza +
                '}';
    }
}

