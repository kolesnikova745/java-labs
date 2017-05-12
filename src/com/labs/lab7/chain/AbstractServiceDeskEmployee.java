package com.labs.lab7.chain;

import javax.lang.model.element.NestingKind;

/**
 * Created on: 05/12/2017
 *
 * @author Anna Kolesnikova
 */
public abstract class AbstractServiceDeskEmployee {
    enum Alert {
        QUESTION(1),
        WARNING(2),
        BUG(3),
        ERROR(4),
        DISASTER(5);

        private int code;

        Alert(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }
    }

    protected Alert alertLevel;
    protected AbstractServiceDeskEmployee nextServiceDeskEmployee;

    public void setNextEmployee(AbstractServiceDeskEmployee employee) {
        this.nextServiceDeskEmployee = employee;
    }

    public void responseToClient(Alert alertLevel) {
        if (alertLevel.getCode() <= this.alertLevel.getCode()) {
            greetClient();
        } else if (nextServiceDeskEmployee != null) {
            nextServiceDeskEmployee.responseToClient(alertLevel);
        }
    }

    protected abstract void greetClient();
}
