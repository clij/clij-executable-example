package net.haesleinhuepf.clij.executable;

import net.haesleinhuepf.clij.CLIJ;
import net.haesleinhuepf.clij.utilities.CLInfo;

import java.util.Arrays;

/**
 *
 *
 * Author: @haesleinhuepf
 * Jan 2019
 */
public class MainExecutable  {

    public static void main(String... args) {
        System.out.print("Arguments: " + Arrays.toString(args));

        CLIJ clij = CLIJ.getInstance();
        System.out.print("Using GPU: " + clij.getGPUName() );

        System.out.print(CLInfo.clinfo());

        System.out.print("Bye!");

        System.exit(0);
    }

}