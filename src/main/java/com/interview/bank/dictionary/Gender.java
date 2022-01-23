package com.interview.bank.dictionary;

public enum Gender {
    MAN {
        @Override
        public String gender() {
            // TODO Auto-generated method stub
            return "man";
        }
    },
    FEMALE {
        @Override
        public String gender() {
            // TODO Auto-generated method stub
            return "female";
        }
    };

    public abstract String gender();
}
