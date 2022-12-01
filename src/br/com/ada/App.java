package br.com.ada;

import br.com.ada.domain.*;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Produto> produtoList = new ArrayList<>();


        Album album = new Album();
        album.setId(1);
        album.setNome("Album1");



        List<String> generoAlbum = new ArrayList<>();
        generoAlbum.add("Rock");
        generoAlbum.add("Soul");

        String[] generos = {"Rock", "Soul"};
        String[] bandas = {"foo Fihters", "Top"};
        String[] musicos = {"Musico 1", "Musico 2"};
        String[] selos = {"selos 1", "selo 2"};

        album.setGeneros(generos);
        album.setBandas(bandas);
        album.setPreco(10.20);
        album.setMusicos(musicos);
        album.setSelos(selos);

        produtoList.add(album);


        Brinquedo brinquedo = new Brinquedo();
        brinquedo.setNome("brinquedo1");
        brinquedo.setPreco(20.00);
        brinquedo.setTipo("X");

        produtoList.add(brinquedo);

        Filme filme = new Filme();
        filme.setId(1);
        filme.setNome("O preco do vento");

        String[] diretores = {"diretor 1", "diretor 2"};
        String[] produtores = {"produtor 1", "produtor 2"};
        filme.setDiretores(diretores);
        filme.setProdutores(produtores);

        produtoList.add(filme);


        Jogo jogo = new Jogo();
        jogo.setId(1);
        jogo.setDistribuidora("dist 1");
        jogo.setNome("jogo 1");
        jogo.setPreco(23.00);
        jogo.setGenero("corrida");
        jogo.setEstudio("estudio 1");

        produtoList.add(jogo);


        Estoque  estoque = new Estoque();

        estoque.setProdutos(produtoList);


    }
}
