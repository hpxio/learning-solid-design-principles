package io.appx.codelabs.soliddesign.srp;

public class SingleResponsibilityPrinciple {

    /**
     * MultiResponsibilityClass is intended to orchestrate 3 distinct functionalities,
     * it currently also assumes responsibility of validation, database operation and
     * a client call. This design introduces a risk of frequent changes due to the
     * class handling multiple responsibilities. This design violates the
     * Single Responsibility Principle (SRP) and may lead to increased complexity
     * and reduced maintainability over time.
     */
    static class MultiResponsibilityClass {
        private void doValidation() {
            /* does input validation */
            System.out.println("Validation done...by..." + this.getClass().getName());
        }

        private void doCallClients() {
            /* does API-calls to other services */
            System.out.println("API call done...by..." + this.getClass().getName());
        }

        private void doDatabaseLookup() {
            /* does db-connection and db-updates */
            System.out.println("Database Lookup done...by..." + this.getClass().getName());
        }

        void startService() {
            doValidation();
            doCallClients();
            doDatabaseLookup();
        }
    }

    interface ServiceExecutor {
        void execute();
    }

    static class ValidationExecutor implements ServiceExecutor {
        @Override
        public void execute() {
            System.out.println("Validation done...by..." + this.getClass().getName());
        }
    }

    static class ClientCallExecutor implements ServiceExecutor {
        @Override
        public void execute() {
            System.out.println("API call done...by..." + this.getClass().getName());
        }
    }

    static class LookupExecutor implements ServiceExecutor {
        @Override
        public void execute() {
            System.out.println("Database Lookup done...by..." + this.getClass().getName());
        }
    }

    static class SingleResponsibilityClass {
        ServiceExecutor validation = new ValidationExecutor();
        ServiceExecutor clientCall = new ClientCallExecutor();
        ServiceExecutor lookup = new LookupExecutor();

        void startService() {
            validation.execute();
            clientCall.execute();
            lookup.execute();
        }
    }


    public static void main(String[] args) {
        /* single class taking multiple responsibilities */
        MultiResponsibilityClass multiResponsibilityClass = new MultiResponsibilityClass();
        multiResponsibilityClass.startService();

        System.out.println("====================================");

        /* single class taking single responsibility : orchestrating */
        SingleResponsibilityClass singleResponsibilityClass = new SingleResponsibilityClass();
        singleResponsibilityClass.startService();
    }
}
