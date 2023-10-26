package tn.esprit.spring.kaddem;


import org.hibernate.type.BooleanType;
import org.hibernate.type.TrueFalseType;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.kaddem.entities.Contrat;
import tn.esprit.spring.kaddem.entities.Niveau;
import tn.esprit.spring.kaddem.entities.Specialite;
import tn.esprit.spring.kaddem.repositories.ContratRepository;
import tn.esprit.spring.kaddem.services.ContratServiceImpl;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
@ExtendWith(MockitoExtension.class)


public class ContratlmlpMock {

    @Mock
    ContratRepository contratRepository = Mockito.mock(ContratRepository.class);

    @InjectMocks
    ContratServiceImpl  contratService;
    Contrat contrat = new Contrat(1,new Date(), new Date(), Specialite.IA, Boolean.FALSE,100);
    List<Contrat> listContrats = new ArrayList<Contrat>(){

    {

        add(new Contrat(2,new Date(), new Date(), Specialite.RESEAUX, Boolean.FALSE,100));
        add(new Contrat(3,new Date(), new Date(), Specialite.CLOUD, Boolean.FALSE,100));
        add(new Contrat(4,new Date(), new Date(), Specialite.SECURITE, Boolean.FALSE,100));


    }
    };


}
