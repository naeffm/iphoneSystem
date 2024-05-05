package iphone;

import aparelhoTelefonico.telefone;
import navegadorInternet.navegador;
import reprodutorMusical.imusic;

public class ios implements telefone, navegador, imusic{

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Atendendo chamada");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        System.out.println("Abrindo correio de voz");
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        System.out.println("abrindo discador");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("atualizando pagina");
    }

    @Override
    public void exibirPagina() {
        // TODO Auto-generated method stub
        System.out.println("abrindo navegador");
    }

    @Override
    public void novaAba() {
        // TODO Auto-generated method stub
        System.out.println("abrindo nova aba");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("pausando");
    }

    @Override
    public void selecionarMusica() {
        // TODO Auto-generated method stub
        System.out.println("selecionando musica");
    }

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("tocando musica");
    }
    
    
}
