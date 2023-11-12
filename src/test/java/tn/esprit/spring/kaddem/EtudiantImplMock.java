package tn.esprit.spring.kaddem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.kaddem.entities.Etudiant;
import tn.esprit.spring.kaddem.repositories.EtudiantRepository;
import tn.esprit.spring.kaddem.services.EtudiantServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
@ExtendWith(MockitoExtension.class)
public class EtudiantImplMock {
    @Mock
    EtudiantRepository etudiantRepository;

    @InjectMocks
    EtudiantServiceImpl etudiantService;
    Etudiant etudiant = new Etudiant("f1", "l1");
    List<Etudiant> listEtudiants = new ArrayList<Etudiant>() {
        {
            add(new Etudiant("f2", "l2"));
            add(new Etudiant("f3", "l3"));
        }
    };

    @Test
    public void testRetrieveUser() {
        Mockito.when(etudiantRepository.findById(Mockito.anyInt())).thenReturn(Optional.of(etudiant));
        Etudiant etudiant1 = etudiantService.retrieveEtudiant(2);
        Assertions.assertNotNull(etudiant1);
    }


}
