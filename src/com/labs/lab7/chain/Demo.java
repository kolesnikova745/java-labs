package com.labs.lab7.chain;

import com.labs.lab7.chain.AbstractServiceDeskEmployee.Alert;

/**
 * Created on: 05/12/2017
 *
 * @author Anna Kolesnikova
 */
public class Demo {
    public static void main(String[] args) {
        AbstractServiceDeskEmployee serviceDeskEmployee = new ServiceDeskEngineer(Alert.QUESTION);
        AbstractServiceDeskEmployee serviceDeskManager = new ServiceDeskManager(Alert.WARNING);
        AbstractServiceDeskEmployee developer = new Developer(Alert.BUG);
        AbstractServiceDeskEmployee seniorDeveloper = new SeniorDeveloper(Alert.ERROR);
        AbstractServiceDeskEmployee chiefTechnologyOfficer = new ChiefTechnologyOfficer(Alert.DISASTER);

        serviceDeskEmployee.setNextEmployee(serviceDeskManager);
        serviceDeskManager.setNextEmployee(developer);
        developer.setNextEmployee(seniorDeveloper);
        seniorDeveloper.setNextEmployee(chiefTechnologyOfficer);

        serviceDeskEmployee.responseToClient(Alert.QUESTION);
        serviceDeskEmployee.responseToClient(Alert.ERROR);

        developer.responseToClient(Alert.ERROR);

        seniorDeveloper.responseToClient(Alert.DISASTER);
    }
}
