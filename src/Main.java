public class Main {

    public static void main(String[] args) {

        //Sintaxis no reducida
        BuilderPizzas miBuilder = new BuilderPizzas();
        Pizzas pizzaDefault = new Pizzas();
        pizzaDefault = miBuilder.build();
        System.out.println(pizzaDefault.toString());


        //Sintaxis reducida pero poco legible
        Pizzas pizzaPersonalizada = new BuilderPizzas().setJamon(true).setExtraQueso(false).setPinha(true).build();
        System.out.println(pizzaPersonalizada.toString());

        //Sintaxis reducida legible
        Pizzas pizzaPersonalizada2 = new BuilderPizzas()
                .setTamanho(Pizzas.FAMILIAR)
                .setTipoSalsa(Pizzas.BARBACOA)
                .setSinGluten(true)
                .build();
        System.out.println(pizzaPersonalizada2.toString());

        

    }
}

