package com.models;

public class Pedido extends Atendimento{
    private Filme filmeSelecionado;
    private String lugarSelecionado;
    private Sala salaSelecionada;
    public static int numeroPedido = 0;
    private int idPedido;
    private Double total;

    public Pedido() {
        numeroPedido++;
        this.idPedido = numeroPedido;

    }

    public void setLugarSelecionado(String lugar) {
        this.lugarSelecionado = lugar;
        calcularValor();
        
    }

    public double getValorTotal() {
        return total;
    }

    public String getLugarSelecionado() {
        return lugarSelecionado;
    }

    public void setSalaSelecionada(Sala sala) {
        this.filmeSelecionado = sala.getFilme();
        this.salaSelecionada = sala;
    }

    public Sala getSalaSelecionada() {
        return salaSelecionada;
    }

    public Filme getFilmeSelecionado() {
        return filmeSelecionado;
    }

    public int getNumeroPedido() {
        return idPedido;
    }

    @Override
    public void calcularValor() {
        if (lugarSelecionado == null || lugarSelecionado.isEmpty()) {
            this.total = 0.0;
            return;
        }

        double VALOR_INGRESSO = 15;
        String[] lugares = lugarSelecionado.split(",");
        this.total = lugares.length * VALOR_INGRESSO;
    }

}
