class Carro extends Automovel {
    private String quantidadePortas;
    private String tipoCarro; // Hatch, Sedan, SUV, Picape...
    private String cambio; // Manual ou Automático
    private int numeroPortas;
    Carro(String placa, String cor, String modelo, String marca, String quantidadePortas) {
            super(placa,cor,modelo,marca);
            this.quantidadePortas = quantidadePortas;
    }

    String getQuantidadePortas(){
       return this.quantidadePortas;
    }

    void setQuantidadePortas(String quantidadePortas){
       this.quantidadePortas = quantidadePortas;
    }

    void MostrarCarro() {
        System.out.println("---Carro---");
        System.out.println("placa:" + this.getPlaca());
        System.out.println("quantidadePortas:" + this.quantidadePortas);
        System.out.println("cor:" + this.getCor());
        System.out.println("modelo:" + this.getModelo());
        System.out.println("marca:" + this.getMarca());
    }
}
