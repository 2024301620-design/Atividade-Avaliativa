    public static void main(String[] args ){
    Lampada lampada = new Lampada(false, 123123);    //definicao de um novo objeto
    lampada.interruptor(lampada.getEstado());   //metodo do objeto para alterar o estado

        /*
        * Saida:
        * Acesa
        * Watts: 1000
        * */
}