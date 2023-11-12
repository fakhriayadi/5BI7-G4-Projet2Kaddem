package tn.esprit.spring.kaddem;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.kaddem.entities.Etudiant;
import tn.esprit.spring.kaddem.entities.Universite;
import tn.esprit.spring.kaddem.services.IEtudiantService;
import tn.esprit.spring.kaddem.services.IUniversiteService;

import java.util.List;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)

public class UniversiteImplTest {





    @Autowired
    IUniversiteService universiteService;
    @Test
    @Order(1)
    public void testRetrieveAllUniversite() {
        List<Universite> listUniversite = universiteService.retrieveAllUniversites();
        Assertions.assertEquals(0, listUniversite.size());
    }
}
