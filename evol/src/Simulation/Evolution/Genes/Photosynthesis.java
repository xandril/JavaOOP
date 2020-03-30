package Simulation.Evolution.Genes;

import Simulation.System.Command;
import Simulation.System.Host;

import java.io.*;

public class Photosynthesis implements Command {



    @Override
    public void doStuff(Host host) {
        host.changeEnergy((int) (Math.random() * 10));
        System.out.println("energy increase");
        System.out.println(host.getEnergy());


    }


}
