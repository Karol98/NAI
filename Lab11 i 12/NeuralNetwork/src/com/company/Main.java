package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Double> inputs = new ArrayList<>();
        inputs.add(1.0);
        inputs.add(2.0);
        inputs.add(2.0);
        inputs.add(2.0);

        Neuron neuron1 = new Neuron(inputs, 0.2);
        Neuron neuron2 = new Neuron(inputs, 1.0);

        neuron1.showInfo();

        List<Double> firstLayerOutput = new ArrayList<>();

        firstLayerOutput.add(neuron1.activation(neuron1.getSum()));
        firstLayerOutput.add(neuron2.activation(neuron2.getSum()));

        Neuron neuron3 = new Neuron(firstLayerOutput, 0.0);

        System.out.println(neuron3.activation(neuron3.getSum()));
    }
}