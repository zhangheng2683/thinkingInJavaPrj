package com.zh.exceptions;

/**
 * Created by zh on 2017-03-26.
 */
public class Cleanup {
    public static void main(String[] args) {
        try {
            InputFile in = new InputFile("Cleanup.java");
            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null);
            } catch (Exception e) {
                System.out.println("Caught Exception in main");
                e.printStackTrace(System.out);
            } finally {
                in.dispose();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("InputFile construction failed");
        }
    }
}
