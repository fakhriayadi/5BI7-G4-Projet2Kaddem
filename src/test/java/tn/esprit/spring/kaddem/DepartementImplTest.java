package tn.esprit.spring.kaddem;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.kaddem.entities.Departement;
import tn.esprit.spring.kaddem.entities.Etudiant;
import tn.esprit.spring.kaddem.services.IDepartementService;
import tn.esprit.spring.kaddem.services.IEtudiantService;

import java.util.List;



    @SpringBootTest
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    public class DepartementImplTest {

        @Autowired
        IDepartementService departementService;

        @Test
        @Order(1)
        public void testRetrieveAllDepartements() {
            List<Departement> listDepartements = departementService.retrieveAllDepartements();
            Assertions.assertEquals(0, listDepartements.size());
        }
    }
////////////////zghd


