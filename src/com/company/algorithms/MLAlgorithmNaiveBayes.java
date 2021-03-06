package com.company.algorithms;

import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

public class MLAlgorithmNaiveBayes {
    public MLAlgorithmNaiveBayes(String filepath) {
        Instances data;
        try {
            data = ConverterUtils.DataSource.read(filepath);
            if (data.classIndex() == -1)
                data.setClassIndex(data.numAttributes() - 1);
            data.setClassIndex(3);
            NaiveBayes reg = new NaiveBayes();
            reg.buildClassifier(data);
            System.out.println(reg.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
