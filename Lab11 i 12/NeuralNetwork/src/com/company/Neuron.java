package com.company;

import java.util.ArrayList;
import java.util.List;

public class Neuron implements ActivationFunctions {

    List<Double> weights;
    List<Double> inputs;
    Double bias;

    public Neuron(List<Double> inputs, Double Bias) {
        this.inputs = inputs;
        this.bias = Bias;
        this.weights = new ArrayList<>();
        for (int i = 0; i < inputs.size(); i++) {
            weights.add(Math.random() * 2 - 1);
        }
    }
    public Neuron(List<Double> inputs, List<Double> weights, Double Bias) {
        this.inputs = inputs;
        this.bias = Bias;
        this.weights =weights;
    }

    public double getSum() {
        Double sum = bias;
        for (int i = 0; i < inputs.size(); i++) {
            sum += inputs.get(i) * weights.get(i);
        }
        return sum;
    }


    @Override
    public Double activation(Double sum) {
        return sum > 0 ? 1.0 : 0.0;
    }

    public void showInfo() {
        System.out.println("Lista wejść: " + inputs);
        System.out.println("Lista wagi wejść: " + weights);
        System.out.println("Bias: " + bias);
        System.out.println("Wartość sumy ważonej wejść: " + (getSum()-bias));
        System.out.println("Stan neuronu: " + state() + "\n----------------");
    }

    public String state() {
        if(activation(getSum()) == 1.0) {
            return "wzbudzony";
        } else
            return "niewzbudzony";
    }

    public List<Double> getWeights() {
        return weights;
    }

    public void setWeights(List<Double> weights) {
        this.weights = weights;
    }

    public List<Double> getInputs() {
        return inputs;
    }

    public void setInputs(List<Double> inputs) {
        this.inputs = inputs;
    }

    public Double getBias() {
        return bias;
    }

    public void setBias(Double bias) {
        this.bias = bias;
    }
}




