package com.hypnoticocelot.pdw;

import io.dropwizard.Application;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.SubstitutingSourceProvider;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class PersonalDataWarehouseApplication extends Application<PersonalDataWarehouseConfiguration> {
    public static void main(String[] args) throws Exception {
        new PersonalDataWarehouseApplication().run(args);
    }

    @Override
    public String getName() {
        return "pdw";
    }

    @Override
    public void initialize(Bootstrap<PersonalDataWarehouseConfiguration> bootstrap) {
        bootstrap.setConfigurationSourceProvider(new SubstitutingSourceProvider(
                bootstrap.getConfigurationSourceProvider(),
                new EnvironmentVariableSubstitutor(false)));
    }

    @Override
    public void run(PersonalDataWarehouseConfiguration personalDataWarehouseConfiguration, Environment environment) {

    }
}
