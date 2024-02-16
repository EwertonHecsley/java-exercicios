package exercicio_01;

public class ControleLampada {
    public boolean lampadaLigada;

    public ControleLampada(){
        this.lampadaLigada = false;
    }

    public void ligarLampada(){
        this.lampadaLigada = true;
    }

    public void  desligarLampada(){
        this.lampadaLigada = false;
    }

    public boolean isLampadaLigada(){
        return this.lampadaLigada;
    }

}
