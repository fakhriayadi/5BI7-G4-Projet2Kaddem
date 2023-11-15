
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
import tn.esprit.spring.kaddem.entities.Equipe;
import tn.esprit.spring.kaddem.entities.Etudiant;
import tn.esprit.spring.kaddem.repositories.EquipeRepository;
import tn.esprit.spring.kaddem.repositories.EtudiantRepository;
import tn.esprit.spring.kaddem.services.EquipeServiceImpl;
import tn.esprit.spring.kaddem.services.EtudiantServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import tn.esprit.spring.kaddem.entities.Niveau;



@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(MockitoExtension.class)


public class EquipeImplMock {
    @Mock
    EquipeRepository equipeRepository;

    @InjectMocks
    EquipeServiceImpl equipeService;

    Equipe equipe = new Equipe(1, "f1", Niveau.EXPERT);
    List<Equipe> listEquipes = new ArrayList<Equipe>() {
        {
            add(new Equipe(3, "f2", Niveau.JUNIOR));
            add(new Equipe(4, "f3", Niveau.SENIOR));
        }
    };

    //
    @Test
    public void testAddEquipe() {
        Mockito.when(equipeRepository.save(Mockito.any(Equipe.class))).thenReturn(equipe);
        Equipe addedEquipe = equipeService.addEquipe(equipe);
        Assertions.assertNotNull(addedEquipe);
        Assertions.assertEquals(equipe.getIdEquipe(), addedEquipe.getIdEquipe());
        // Add more assertions based on your implementation

        Mockito.verify(equipeRepository, Mockito.times(1)).save(Mockito.any(Equipe.class));
    }
}





