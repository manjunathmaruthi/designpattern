package com.manjunath.dotikol.designpattern.creational.builder;

public class Computer {

    private int ram;
    private String os;
    private String hardDisk;

    private boolean graphics;
    private boolean bluetooth;

    private Computer(){

    }

    public Computer(Builder builder) {
        this.ram = builder.ram;
        this.os = builder.os;
        this.hardDisk =builder.hardDisk;
        this.graphics = builder.graphics;
        this.bluetooth = builder.bluetooth;
    }

    public int getRam() {
        return ram;
    }

    public String getOs() {
        return os;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public boolean isGraphics() {
        return graphics;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public static class  Builder {
        private int ram;
        private String os;
        private String hardDisk;

        private boolean graphics;
        private boolean bluetooth;

        public Builder(int ram,String os,String hardDisk){
            this.ram = ram;
            this.os = os;
            this.hardDisk = hardDisk;
        }

        public Builder setGraphics(boolean graphics) {
            this.graphics = graphics;
            return this;
        }

        public Builder setBluetooth(boolean bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", os='" + os + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", graphics=" + graphics +
                ", bluetooth=" + bluetooth +
                '}';
    }
}
