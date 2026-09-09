public class Automovel {
    private String placa;
    private String cor;
    private String marca;
    private String modelo;

    Automovel(String placa, String cor, String modelo, String marca) {
            this.placa = placa;
            this.cor = cor;
            this.marca = marca;
            this.modelo = modelo;
    }

    String getPlaca(){
       return this.placa;
    }

    void setPlaca(String placa){
       this.placa = placa;
    }

    String getCor(){
       return this.cor;
    }

    void setCor(String cor){
       this.cor = cor;
    }

    String getMarca(){
       return this.marca;
    }

    void setMarca(String marca){
       this.marca = marca;
    }

    String getModelo(){
       return this.modelo;
    }

    void setModelo(String modelo){
       this.modelo = modelo;
    }

}
