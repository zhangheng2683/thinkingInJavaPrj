package com.zh.containers;

import java.util.BitSet;
import java.util.Random;

/**
 * @see BitSet
 * Created by zh on 2017-04-25.
 */
public class Bits {
    public static void printBitSet(BitSet b) {
        System.out.println("bits: " + b);
        StringBuilder bbits = new StringBuilder();
        for(int j = 0; j < b.size(); j++)
            bbits.append(b.get(j)? "1": "0");
        System.out.println("bit pattern: " + bbits);
    }

    public static void main(String[] args) {
        Random random = new Random(47);
        byte bt = (byte) random.nextInt();
        BitSet bb = new BitSet();
        for (int i = 7; i >= 0; i--)
            if(((1 << i) & bt) != 0)
                bb.set(i);
            else
                bb.clear();
        System.out.println("byte value: " + bt);
        printBitSet(bb);

        short st = (short)random.nextInt();
        BitSet bs = new BitSet();
        for(int i = 15; i >= 0; i--)
            if(((1 << i) & st) != 0)
                bs.set(i);
            else
                bs.clear();
        System.out.println("short value: " + st);
        printBitSet(bs);

        int it = random.nextInt();
        BitSet bi = new BitSet();
        for (int i = 31; i >= 0; i--)
            if(((1<<i)&it) != 0)
                bi.set(i);
            else
                bi.clear();
        System.out.println("int value: " + it);
        printBitSet(bi);

        //Test bitsets >= 64 bits
        BitSet b127 = new BitSet();
        b127.set(127);
        System.out.println("set bit 127: " + b127);
        BitSet b255 = new BitSet(65);
        b255.set(255);
        System.out.println("set bit 255: " + b255);
        BitSet b1023 = new BitSet(512);
        b1023.set(1023);
        b1023.set(1024);
        System.out.println("set bit 1023: " + b1023);
    }
}
