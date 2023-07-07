package com.nlea.observability.demo.icecreation;

import com.autometrics.bindings.Autometrics;
import io.micrometer.observation.annotation.Observed;
import org.springframework.stereotype.Service;

@Observed(name = "MixtureService")
@Service
public class MixtureService {
    public void addIngredient() {

    }


   @Autometrics
    public Boolean heatMixture(){

        return Boolean.TRUE;
    }
}
