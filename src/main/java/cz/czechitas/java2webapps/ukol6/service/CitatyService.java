package cz.czechitas.java2webapps.ukol6.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitatyService {

    private final CitatyRepository citatyRepository;
    private final NahodneCisloService cisloService;

    @Autowired
    public CitatyService(CitatyRepository citatyRepository, NahodneCisloService cisloService) {
        this.citatyRepository = citatyRepository;
        this.cisloService = cisloService;
    }

    public String nahodnyCitat() {
        int poradi = cisloService.dejNahodneCislo(citatyRepository.pocet());

        return citatyRepository.citat(poradi);
    }

    public String konkretniCitat(int cislo) {
        return citatyRepository.seznamCitatu.get(cislo);
    }
}
