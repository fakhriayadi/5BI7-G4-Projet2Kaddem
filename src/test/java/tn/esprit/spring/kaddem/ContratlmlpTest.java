package tn.esprit.spring.kaddem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.kaddem.entities.Contrat;
import tn.esprit.spring.kaddem.services.IContratService;

import java.util.List;
import java.util.Set;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)

public class ContratlmlpTest {

    @Autowired
    IContratService cs;


    @Test
    @Order(1)
    public void testRetrieveAllContrats() {
       List<Contrat> listContrats = cs.retrieveAllContrats();
        Assertions.assertEquals(0,listContrats.size());
    }

}
