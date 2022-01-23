package com.interview.bank.dictionary;

public enum Gender {
    MAN {
        @Override
        public String gender() {
            return "man";
        }
    },
    FEMALE {
        @Override
        public String gender() {
            return "female";
        }
    };

    public abstract String gender();
}
