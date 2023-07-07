package com.nlea.observability.demo.icecreation;

import org.springframework.stereotype.Service;


import io.micrometer.observation.annotation.Observed;

@Observed(name = "IceCreationService")
@Service
public class IceCreationService {
    private final MixtureService mixtureService;

    public IceCreationService(MixtureService mixtureService) {
        this.mixtureService = mixtureService;
    }

    public String freeze() {
        return "Icecream gets frozen";
    }

    public Boolean createMixture() {

        Boolean heatedMixture = mixtureService.heatMixture();
        return heatedMixture;
    }

}