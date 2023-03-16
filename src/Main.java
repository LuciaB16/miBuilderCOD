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



        //Sintaxis no reducida
        BuilderPizzas miNuevoBuilder = new BuilderPizzas();
        Pizzas nuevaPizzaDefault = new Pizzas();
        nuevaPizzaDefault = miBuilder.build();
        System.out.println(nuevaPizzaDefault.toString());


        //Sintaxis reducida pero poco legible
        Pizzas nuevaPizzaPersonalizada = new BuilderPizzas().setTipoMasa(Pizzas.INTEGRAL).setChampinhones(true).setSinGluten(true).build();
        System.out.println(nuevaPizzaPersonalizada.toString());

        //Sintaxis reducida legible
        Pizzas nuevaPizzaPersonalizada2 = new BuilderPizzas()
                .setTipoMasa(Pizzas.PEQUEÑA)
                .setRelleno(true)
                .setJamon(true)
                .build();
        System.out.println(nuevaPizzaPersonalizada2.toString());

    }
}

