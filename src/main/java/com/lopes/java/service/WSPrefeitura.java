package com.lopes.java.service;

import com.lopes.java.model.NF;

public class WSPrefeitura {
    public static void emit(NF nf) {
        try {
            System.out.println("emitindo...");
            Thread.sleep(5000);
            System.out.println("emitido!");
        } catch (Exception e) {
            System.out.println("falha ao emitir a nf");
        }
    }
}
