class Lampada {
    private boolean estado; //Atributo do estado (Acesa ou Apagada)
    private int watts;

    //Construtor com valor default de watts
    Lampada( boolean estado) {
        this.estado = estado;
        this.watts = 60;
    }

    //Construtor que recebe estado e watts
    Lampada( boolean estado, int watts) {
        this.estado = estado;
        this.watts = watts;
        setWatts(watts); //Garante que o valor fique entre 1 e 1000
    }
//Metodo para apagar/acender a lampada (altera o valor do estado)
        public void interruptor(boolean estado){
        if (estado){    //Se o estado for true, ele entra nesse caso e recebe false (apagando a lampada)
            setEstado(false);
            System.out.println("Apagada");
        }
        else {  //Caso o contrário, obrigatoriamente sendo falso, recebe true (acendendo a lampada)
            setEstado(true);
            System.out.println("Acesa");
        }
        System.out.println("Watts: " + this.watts);
        }

    public void teste(boolean estado){
        // Mesma coisa do metodo interruptor, exceto que não altera os valores
        if (estado){
            System.out.println("Acesa");
        }
        else {
            System.out.println("Apagada");
        }
        System.out.println("Watts: " + this.watts);

    }
    //Metodo para resgatar a var estado
    public boolean getEstado (){ return estado; }
    //Metodo para resgatar a var watts
    public int getWatts () { return watts; }
    //Metodo para alterar o valor de Watts
    public void setWatts(int watts){
        this.watts = watts;
        if(watts > 1000){   //Caso watts for maior que 1000, ele recebe 1000
            this.watts = 1000;
        }
        else if (watts < 1){        //Caso for menor que 1, ele recebe 1
            this.watts = 1;
        }
    }
    //Metodo para alterar o valor de estado
    public void setEstado (boolean estado){
        this.estado = estado;
    }


}