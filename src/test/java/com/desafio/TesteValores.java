package com.desafio;

import com.desafio.Services.ServiceValores;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class TesteValores {
    ServiceValores serviceValores = new ServiceValores();
    List<Double>valores = new ArrayList<>();


    @Test
    public void calculoMedia(){
        for(int i = 1; i<21; i++){
            valores.add((double) i);

        }
        Assertions.assertEquals(10.5, serviceValores.calcMedia(valores));

    }
    @Test
    public void calcMediana(){
        for(int i = 1; i<21; i++){
            valores.add((double) i);
        }
        Assertions.assertEquals(10.5, serviceValores.calcMediana(valores));
    }
    @Test
    public void testValorMax(){
        for(int i = 1; i <= 20 ; i++){
            valores.add((double) i);
        }
        Assertions.assertEquals(20.0, serviceValores.Maximo(valores));
    }
    @Test
    public void testValorMin(){
        for(int i = 1; i <= 20 ; i++){
            valores.add((double) i);
        }
        Assertions.assertEquals(1.0, serviceValores.Minimo(valores));
    }
    @Test
    public void testSoma(){
        for(int i = 1; i <= 20 ; i++){
            valores.add((double) i);
        }
        Assertions.assertEquals(210, serviceValores.Soma(valores));
    }
    @Test
    public void CalcDesvPadrao(){
        for(int i = 1; i <= 20 ; i++){
            valores.add((double) i);
        }
        Assertions.assertEquals(5.766281297335398, serviceValores.calcDesvPadrao(valores));
    }
}

