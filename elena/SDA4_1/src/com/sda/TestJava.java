package com.sda;

public class TestJava {
    private Integer ceva;

public TestJava(){
    ceva = 0;
}

    private boolean testSetter(Integer ceva) {
        if (ceva % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void setCeva(Integer ceva) {
        if (testSetter(ceva) == true) {
            this.ceva = ceva;
        }
    }

    public Integer getCeva() {
        return this.ceva;
    }
}
