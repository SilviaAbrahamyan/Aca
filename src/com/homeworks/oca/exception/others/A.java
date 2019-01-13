package com.homeworks.oca.exception.others;

/**
 * Created by home on 11/22/2018.
 */
public enum A {
    Thanksgiving {
        @Override
        void foo() {

        }
    }, PresidentsDay {
        @Override
        void foo() {

        }
    }, ValentinesDay {
        @Override
        void foo() {

        }
    };

    abstract void foo();
    }


