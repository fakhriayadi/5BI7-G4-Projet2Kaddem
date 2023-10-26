package tn.esprit.spring.kaddem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.kaddem.entities.Equipe;
import tn.esprit.spring.kaddem.services.IEquipeService;


import java.util.List;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)

public class EquipeImplTest {
    @Autowired
    IEquipeService equipeService;
    @Test
    @Order(1)
    public void testRetrieveAllEquipes() {
        List<Equipe> listEquipes = equipeService.retrieveAllEquipes();
        Assertions.assertEquals(0, listEquipes.size());
    }
}
