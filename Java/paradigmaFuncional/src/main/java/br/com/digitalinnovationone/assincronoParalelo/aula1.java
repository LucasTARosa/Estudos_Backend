package br.com.digitalinnovationone.assincronoParalelo;

public class aula1 {
    public static void main(String[] args){
        GerarPDF iniciarGeradorPdf = new GerarPDF();
        BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGeradorPdf);

        iniciarGeradorPdf.start();
        iniciarBarraDeCarregamento.start();
    }

}

class GerarPDF extends Thread{
    @Override
    public void run(){
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("O PDF foi gerado");
    }
}

class BarraDeCarregamento extends Thread{
    private Thread iniciarGeradorPdf;

    public BarraDeCarregamento(GerarPDF iniciarGeradorPdf){
        this.iniciarGeradorPdf = iniciarGeradorPdf;
    }
    @Override
    public void run(){
        try {
            while (true) {
                Thread.sleep(500);
                if (!iniciarGeradorPdf.isAlive()){
                    break;
                }
                System.out.println("Loading");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class BarraDeCarregamento2 extends Thread{
    @Override
    public void run() {
        super.run();


        try {
            Thread.sleep(3000);
            System.out.println("rodei! " + this.getName());
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class BarraDeCarregamento3 extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("rodei! " + this.getName());

        try {
            Thread.sleep(10000);
            System.out.println("rodei! " + this.getName());
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}