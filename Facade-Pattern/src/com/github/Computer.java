package com.github;

/**
 * @author HAN
 * @version 1.0
 * @create 2021/3/28
 */
public class Computer {

    private Cpu cpu;
    private Disk disk;
    private Memory memory;

    public Computer() {
        cpu = new Cpu();
        disk = new Disk();
        memory = new Memory();
    }

    public void startup() {
        cpu.startup();
        disk.startup();
        memory.startup();
    }

    public void shutdown() {
        cpu.shutdown();
        disk.shutdown();
        memory.shutdown();
    }
}
