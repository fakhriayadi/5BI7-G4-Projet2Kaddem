package tn.esprit.spring.kaddem;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.kaddem.entities.Etudiant;
import tn.esprit.spring.kaddem.services.IEtudiantService;

import java.util.List;
////
@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class EtudiantImplTest {

    @Autowired
    IEtudiantService etudiantService;
    @Test
    @Order(1)
    public void testRetrieveAllUsers() {
        List<Etudiant> listEtudiants = etudiantService.retrieveAllEtudiants();
        Assertions.assertEquals(0, listEtudiants.size());
    }
}
