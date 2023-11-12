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
import tn.esprit.spring.kaddem.entities.Universite;
import tn.esprit.spring.kaddem.repositories.EtudiantRepository;
import tn.esprit.spring.kaddem.repositories.UniversiteRepository;
import tn.esprit.spring.kaddem.services.UniversiteServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
@ExtendWith(MockitoExtension.class)

public class UniversiteImplMock {



    @Mock
    UniversiteRepository universiteRepository;
    @InjectMocks
    UniversiteServiceImpl universiteService;
    Universite universite = new Universite(3, "l1");
    List<Universite> listUniversite= new ArrayList<Universite>() {
        {
            add(new Universite(1, "l2"));
            add(new Universite(2, "l3"));
        }
    };

    @Test
    public void testRetrieveUniversite() {
        Mockito.when(universiteRepository.findById(Mockito.anyInt())).thenReturn(Optional.of(universite));
        Universite universite1 = universiteService.retrieveUniversite(2);
        Assertions.assertNotNull(universite1);
    }

}
