package tn.esprit.spring.kaddem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.kaddem.entities.Departement;
import tn.esprit.spring.kaddem.repositories.DepartementRepository;
import tn.esprit.spring.kaddem.services.DepartementServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
////////////
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(MockitoExtension.class)
public class DepartementImplMock {
    @Mock
    DepartementRepository departementRepository;

    @InjectMocks
    DepartementServiceImpl departementService;
    Departement departement = new Departement( "l1");
    List<Departement> listDepartements = new ArrayList<Departement>() {
        {
            add(new Departement( "l2"));
            add(new Departement("l3"));
        }
    };

    @Test
    public void testRetrieveDepartement() {
        Mockito.when(departementRepository.findById(Mockito.anyInt())).thenReturn(Optional.of(departement));
        Departement departement1 = departementService.retrieveDepartement(2);
        Assertions.assertNotNull(departement1);
    }
}
